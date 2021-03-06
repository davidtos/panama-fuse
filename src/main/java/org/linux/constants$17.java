// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$17 {

    static final FunctionDescriptor fuse_unmount$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle fuse_unmount$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_unmount",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$17.fuse_unmount$FUNC, false
    );
    static final FunctionDescriptor fuse_destroy$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle fuse_destroy$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_destroy",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$17.fuse_destroy$FUNC, false
    );
    static final FunctionDescriptor fuse_loop$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle fuse_loop$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_loop",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$17.fuse_loop$FUNC, false
    );
    static final FunctionDescriptor fuse_exit$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle fuse_exit$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_exit",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$17.fuse_exit$FUNC, false
    );
    static final FunctionDescriptor fuse_loop_mt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_loop_mt$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_loop_mt",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$17.fuse_loop_mt$FUNC, false
    );
    static final FunctionDescriptor fuse_get_context$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle fuse_get_context$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_get_context",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$17.fuse_get_context$FUNC, false
    );
}


