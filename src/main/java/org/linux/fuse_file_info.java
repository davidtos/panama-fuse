// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class fuse_file_info {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("flags"),
        MemoryLayout.structLayout(
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("writepage"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("direct_io"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("keep_cache"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("flush"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("nonseekable"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("flock_release"),
            MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("cache_readdir"),
            MemoryLayout.valueLayout(25, ByteOrder.nativeOrder()).withName("padding"),
            MemoryLayout.valueLayout(32, ByteOrder.nativeOrder()).withName("padding2"),
            MemoryLayout.paddingLayout(32)
        ),
        C_LONG.withName("fh"),
        C_LONG.withName("lock_owner"),
        C_INT.withName("poll_events"),
        MemoryLayout.paddingLayout(32)
    ).withName("fuse_file_info");
    public static MemoryLayout $LAYOUT() {
        return fuse_file_info.$struct$LAYOUT;
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return fuse_file_info.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)fuse_file_info.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        fuse_file_info.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)fuse_file_info.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        fuse_file_info.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fh$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("fh"));
    public static VarHandle fh$VH() {
        return fuse_file_info.fh$VH;
    }
    public static long fh$get(MemorySegment seg) {
        return (long)fuse_file_info.fh$VH.get(seg);
    }
    public static void fh$set( MemorySegment seg, long x) {
        fuse_file_info.fh$VH.set(seg, x);
    }
    public static long fh$get(MemorySegment seg, long index) {
        return (long)fuse_file_info.fh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fh$set(MemorySegment seg, long index, long x) {
        fuse_file_info.fh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lock_owner$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lock_owner"));
    public static VarHandle lock_owner$VH() {
        return fuse_file_info.lock_owner$VH;
    }
    public static long lock_owner$get(MemorySegment seg) {
        return (long)fuse_file_info.lock_owner$VH.get(seg);
    }
    public static void lock_owner$set( MemorySegment seg, long x) {
        fuse_file_info.lock_owner$VH.set(seg, x);
    }
    public static long lock_owner$get(MemorySegment seg, long index) {
        return (long)fuse_file_info.lock_owner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lock_owner$set(MemorySegment seg, long index, long x) {
        fuse_file_info.lock_owner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle poll_events$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("poll_events"));
    public static VarHandle poll_events$VH() {
        return fuse_file_info.poll_events$VH;
    }
    public static int poll_events$get(MemorySegment seg) {
        return (int)fuse_file_info.poll_events$VH.get(seg);
    }
    public static void poll_events$set( MemorySegment seg, int x) {
        fuse_file_info.poll_events$VH.set(seg, x);
    }
    public static int poll_events$get(MemorySegment seg, long index) {
        return (int)fuse_file_info.poll_events$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void poll_events$set(MemorySegment seg, long index, int x) {
        fuse_file_info.poll_events$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


