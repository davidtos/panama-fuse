package tutorial;

import jdk.incubator.foreign.*;
import org.linux.*;

import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.*;


public class Main {

    static List<String> directories = new ArrayList<>();
    static List<String> files = new ArrayList<>();
    static Map<String, String> filesContent = new HashMap<>();

    static ResourceScope rsScope = null;

    public static void main(String... args) {

        System.load("/usr/lib64/libfuse3.so.3.10.5");

        // -f keep on foreground this makes printtf work
        // -s disable multithreading
        // -d show debug logging

        args = new String[]{"-f", "-d", "/mnt/test/"};

        try (var scope = ResourceScope.newSharedScope()) {
            rsScope = scope;
            var arguments = Arrays.stream(args).map(s -> CLinker.toCString(s, scope)).toArray(MemorySegment[]::new);
            var allocator = SegmentAllocator.ofScope(scope);
            var argumentCount = args.length;
            var argumentSpace = allocator.allocateArray(CLinker.C_POINTER, arguments);

            MemorySegment operationsMemorySegment = fuse_operations.allocate(scope);

            fuse_operations.getattr$set(operationsMemorySegment, fuse_operations.getattr.allocate((path, stat, fi) -> getAttr(path, stat), scope));
            fuse_operations.readdir$set(operationsMemorySegment, fuse_operations.readdir.allocate((path, buffer, filler, offset, fileInfo, i) -> readDir(path, buffer, filler, offset, fileInfo), scope));

            fuse_operations.read$set(operationsMemorySegment, fuse_operations.read.allocate((path, buffer, size, offset, fileInfo) -> read(path, buffer, size, offset, fileInfo), scope));

            fuse_operations.mkdir$set(operationsMemorySegment, fuse_operations.mkdir.allocate((MemoryAddress x0, int x1) -> doMkdir(x0, x1), scope));
            fuse_operations.mknod$set(operationsMemorySegment, fuse_operations.mknod.allocate((MemoryAddress x0, int x1, long x2) -> doMknod(x0, x1, x2), scope));
            fuse_operations.write$set(operationsMemorySegment, fuse_operations.write.allocate((MemoryAddress x0, MemoryAddress x1, long x2, long x3, MemoryAddress x4) -> doWrite(x0, x1, x2, x3, x4), scope));

            fuse_h.fuse_main_real(argumentCount, argumentSpace, operationsMemorySegment, operationsMemorySegment.byteSize(), MemoryAddress.NULL);
        }

    }

    public static int getAttr(MemoryAddress path, MemoryAddress mStat) {

        String sPath = CLinker.toJavaString(path);
        MemorySegment memorySegment = stat.ofAddress(mStat, rsScope);

        int S_IFDIR = 0040000; /* directory */
        int S_IFREG = 0100000; /* regular */

        // setting the stat atim (last access time)
        Instant now = Instant.now();
        timespec.tv_sec$set(stat.st_atim$slice(memorySegment), now.getEpochSecond());
        timespec.tv_nsec$set(stat.st_atim$slice(memorySegment), now.getNano());

        // setting the stat mtim (last modify time)
        now = Instant.now();
        timespec.tv_sec$set(stat.st_mtim$slice(memorySegment), now.getEpochSecond());
        timespec.tv_nsec$set(stat.st_mtim$slice(memorySegment), now.getNano());

        stat.st_uid$set(memorySegment, 1000);
        stat.st_gid$set(memorySegment, 1000);

        if ("/".equals(sPath) || isDir(sPath.substring(1))) {
            stat.st_mode$set(memorySegment, (short) (S_IFDIR | 0755));
            stat.st_nlink$set(memorySegment, 2);
        } else if (isFile(sPath.substring(1))) {
            stat.st_mode$set(memorySegment, (int) (S_IFREG | 0644));
            stat.st_nlink$set(memorySegment, 1);
            stat.st_size$set(memorySegment, filesContent.get(sPath.substring(1)).getBytes().length);
        } else {
            return -2;
        }

        return 0;
    }

    public static int readDir(MemoryAddress path, MemoryAddress buffer, MemoryAddress filler, long offset, MemoryAddress fileInfo) {

        String jPath = CLinker.toJavaString(path);
        fuse_fill_dir_t fuse_fill_dir_t = org.linux.fuse_fill_dir_t.ofAddress(filler);
        fuse_fill_dir_t.apply(buffer, CLinker.toCString(".", rsScope).address(), MemoryAddress.NULL, 0, 0);
        fuse_fill_dir_t.apply(buffer, CLinker.toCString("..", rsScope).address(), MemoryAddress.NULL, 0, 0);
        if ("/".equals(jPath)) {
            for (String p : directories) {
                fuse_fill_dir_t.apply(buffer, CLinker.toCString(p, rsScope).address(), MemoryAddress.NULL, 0, 0);
            }

            for (String p : files) {
                fuse_fill_dir_t.apply(buffer, CLinker.toCString(p, rsScope).address(), MemoryAddress.NULL, 0, 0);
            }
        }

        return 0;
    }

    public static int read(MemoryAddress path, MemoryAddress buffer, long size, long offset, MemoryAddress fileInfo) {
        String jPath = CLinker.toJavaString(path).substring(1);

        if (!isFile(jPath)) {
            return -1;
        }

        byte[] selected = filesContent.get(jPath).getBytes();

        ByteBuffer byteBuffer = buffer.asSegment(size, rsScope).asByteBuffer();

        byte[] src = Arrays.copyOfRange(selected, Math.toIntExact(offset), Math.toIntExact(size));
        byteBuffer.put(src);

        return src.length;
    }

    static boolean isDir(String path) {
        return directories.contains(path);
    }

    static void addFile(String filename) {
        files.add(filename);
        filesContent.put(filename, "");
    }

    static boolean isFile(String path) {
        return files.contains(path);
    }

    static int doMkdir(MemoryAddress path, int mode) {
        String jPath = CLinker.toJavaString(path);
        directories.add(jPath.substring(1));
        return 0;
    }

    static int doMknod(MemoryAddress path, int mode, long rdev) {
        String jPath = CLinker.toJavaString(path);
        addFile(jPath.substring(1));
        return 0;
    }

    static int doWrite(MemoryAddress path, MemoryAddress buffer, long size, long offset, MemoryAddress info) {
        byte[] array = buffer.asSegment(size, rsScope).toByteArray();
        String jPath = CLinker.toJavaString(path).substring(1);
        filesContent.put(jPath, new String(array, java.nio.charset.StandardCharsets.UTF_8));
        return Math.toIntExact(size);
    }
}
