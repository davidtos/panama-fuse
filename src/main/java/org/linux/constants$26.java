// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$26 {

    static final FunctionDescriptor fuse_fs_destroy$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle fuse_fs_destroy$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_destroy",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$26.fuse_fs_destroy$FUNC, false
    );
    static final FunctionDescriptor fuse_notify_poll$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle fuse_notify_poll$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_notify_poll",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$26.fuse_notify_poll$FUNC, false
    );
    static final FunctionDescriptor fuse_fs_new$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle fuse_fs_new$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_fs_new",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26.fuse_fs_new$FUNC, false
    );
    static final FunctionDescriptor fuse_module_factory_t$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_module_factory_t$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26.fuse_module_factory_t$FUNC, false
    );
    static final FunctionDescriptor fuse_get_session$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_get_session$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_get_session",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26.fuse_get_session$FUNC, false
    );
}


