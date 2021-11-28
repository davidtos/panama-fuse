// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$18 {

    static final FunctionDescriptor fuse_getgroups$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle fuse_getgroups$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_getgroups",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$18.fuse_getgroups$FUNC, false
    );
    static final FunctionDescriptor fuse_interrupted$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle fuse_interrupted$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_interrupted",
        "()I",
        constants$18.fuse_interrupted$FUNC, false
    );
    static final FunctionDescriptor fuse_invalidate_path$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_invalidate_path$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_invalidate_path",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$18.fuse_invalidate_path$FUNC, false
    );
    static final FunctionDescriptor fuse_main_real$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_main_real$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_main_real",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$18.fuse_main_real$FUNC, false
    );
    static final FunctionDescriptor fuse_start_cleanup_thread$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle fuse_start_cleanup_thread$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_start_cleanup_thread",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$18.fuse_start_cleanup_thread$FUNC, false
    );
    static final FunctionDescriptor fuse_stop_cleanup_thread$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle fuse_stop_cleanup_thread$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_stop_cleanup_thread",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$18.fuse_stop_cleanup_thread$FUNC, false
    );
}

