// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$21 {

    static final FunctionDescriptor fuse_fs_write_buf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_fs_write_buf$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_write_buf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$21.fuse_fs_write_buf$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_fsync$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle fuse_fs_fsync$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_fsync",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$21.fuse_fs_fsync$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_flush$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_flush$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_flush",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$21.fuse_fs_flush$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_statfs$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_statfs$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_statfs",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$21.fuse_fs_statfs$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_opendir$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_opendir$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_opendir",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$21.fuse_fs_opendir$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_readdir$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle fuse_fs_readdir$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_readdir",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;I)I",
        constants$21.fuse_fs_readdir$FUNC, false
    );
}

