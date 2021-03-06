// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$20 {

    static final FunctionDescriptor fuse_fs_link$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_link$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_link",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$20.fuse_fs_link$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_release$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_release$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_release",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$20.fuse_fs_release$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_open$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_open$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_open",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$20.fuse_fs_open$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_read$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_fs_read$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_read",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$20.fuse_fs_read$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_read_buf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_fs_read_buf$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_read_buf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$20.fuse_fs_read_buf$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_write$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_fs_write$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_write",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$20.fuse_fs_write$FUNC, false
    );
}


