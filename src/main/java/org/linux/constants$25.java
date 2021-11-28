// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$25 {

    static final FunctionDescriptor fuse_fs_ioctl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle fuse_fs_ioctl$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_ioctl",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$25.fuse_fs_ioctl$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_poll$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_poll$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_poll",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$25.fuse_fs_poll$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_fallocate$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_fs_fallocate$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_fallocate",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IJJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$25.fuse_fs_fallocate$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_copy_file_range$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_INT
    );
    static final MethodHandle fuse_fs_copy_file_range$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_copy_file_range",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JJI)J",
        constants$25.fuse_fs_copy_file_range$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_lseek$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_POINTER
    );
    static final MethodHandle fuse_fs_lseek$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_lseek",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)J",
        constants$25.fuse_fs_lseek$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_init$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_fs_init$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_init",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$25.fuse_fs_init$FUNC, false
    );
}

