// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class fuse_context {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("fuse"),
        C_INT.withName("uid"),
        C_INT.withName("gid"),
        C_INT.withName("pid"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("private_data"),
        C_INT.withName("umask"),
        MemoryLayout.paddingLayout(32)
    ).withName("fuse_context");
    public static MemoryLayout $LAYOUT() {
        return fuse_context.$struct$LAYOUT;
    }
    static final VarHandle fuse$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("fuse")));
    public static VarHandle fuse$VH() {
        return fuse_context.fuse$VH;
    }
    public static MemoryAddress fuse$get(MemorySegment seg) {
        return (MemoryAddress)fuse_context.fuse$VH.get(seg);
    }
    public static void fuse$set( MemorySegment seg, MemoryAddress x) {
        fuse_context.fuse$VH.set(seg, x);
    }
    public static MemoryAddress fuse$get(MemorySegment seg, long index) {
        return (MemoryAddress)fuse_context.fuse$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fuse$set(MemorySegment seg, long index, MemoryAddress x) {
        fuse_context.fuse$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uid$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("uid"));
    public static VarHandle uid$VH() {
        return fuse_context.uid$VH;
    }
    public static int uid$get(MemorySegment seg) {
        return (int)fuse_context.uid$VH.get(seg);
    }
    public static void uid$set( MemorySegment seg, int x) {
        fuse_context.uid$VH.set(seg, x);
    }
    public static int uid$get(MemorySegment seg, long index) {
        return (int)fuse_context.uid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uid$set(MemorySegment seg, long index, int x) {
        fuse_context.uid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle gid$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("gid"));
    public static VarHandle gid$VH() {
        return fuse_context.gid$VH;
    }
    public static int gid$get(MemorySegment seg) {
        return (int)fuse_context.gid$VH.get(seg);
    }
    public static void gid$set( MemorySegment seg, int x) {
        fuse_context.gid$VH.set(seg, x);
    }
    public static int gid$get(MemorySegment seg, long index) {
        return (int)fuse_context.gid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void gid$set(MemorySegment seg, long index, int x) {
        fuse_context.gid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pid$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("pid"));
    public static VarHandle pid$VH() {
        return fuse_context.pid$VH;
    }
    public static int pid$get(MemorySegment seg) {
        return (int)fuse_context.pid$VH.get(seg);
    }
    public static void pid$set( MemorySegment seg, int x) {
        fuse_context.pid$VH.set(seg, x);
    }
    public static int pid$get(MemorySegment seg, long index) {
        return (int)fuse_context.pid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pid$set(MemorySegment seg, long index, int x) {
        fuse_context.pid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle private_data$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("private_data")));
    public static VarHandle private_data$VH() {
        return fuse_context.private_data$VH;
    }
    public static MemoryAddress private_data$get(MemorySegment seg) {
        return (MemoryAddress)fuse_context.private_data$VH.get(seg);
    }
    public static void private_data$set( MemorySegment seg, MemoryAddress x) {
        fuse_context.private_data$VH.set(seg, x);
    }
    public static MemoryAddress private_data$get(MemorySegment seg, long index) {
        return (MemoryAddress)fuse_context.private_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void private_data$set(MemorySegment seg, long index, MemoryAddress x) {
        fuse_context.private_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle umask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("umask"));
    public static VarHandle umask$VH() {
        return fuse_context.umask$VH;
    }
    public static int umask$get(MemorySegment seg) {
        return (int)fuse_context.umask$VH.get(seg);
    }
    public static void umask$set( MemorySegment seg, int x) {
        fuse_context.umask$VH.set(seg, x);
    }
    public static int umask$get(MemorySegment seg, long index) {
        return (int)fuse_context.umask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void umask$set(MemorySegment seg, long index, int x) {
        fuse_context.umask$VH.set(seg.asSlice(index*sizeof()), x);
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


