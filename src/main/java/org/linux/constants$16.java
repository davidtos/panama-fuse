// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$16 {

    static final FunctionDescriptor pwritev$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle pwritev$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "pwritev",
        "(ILjdk/incubator/foreign/MemoryAddress;IJ)J",
        constants$16.pwritev$FUNC, false
    );
    static final FunctionDescriptor fuse_fill_dir_t$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle fuse_fill_dir_t$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JI)I",
        constants$16.fuse_fill_dir_t$FUNC, false
    );
    static final FunctionDescriptor fuse_lib_help$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle fuse_lib_help$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_lib_help",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$16.fuse_lib_help$FUNC, false
    );
    static final FunctionDescriptor fuse_new$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_new$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_new",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$16.fuse_new$FUNC, false
    );
    static final FunctionDescriptor fuse_mount$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_mount$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_mount",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$16.fuse_mount$FUNC, false
    );
}


