// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$3 {

    static final FunctionDescriptor __uint64_identity$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle __uint64_identity$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "__uint64_identity",
        "(J)J",
        constants$3.__uint64_identity$FUNC, false
    );
    static final FunctionDescriptor select$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle select$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "select",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$3.select$FUNC, false
    );
    static final FunctionDescriptor pselect$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle pselect$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "pselect",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$3.pselect$FUNC, false
    );
    static final FunctionDescriptor fuse_parse_conn_info_opts$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_parse_conn_info_opts$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_parse_conn_info_opts",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$3.fuse_parse_conn_info_opts$FUNC, false
    );
    static final FunctionDescriptor fuse_apply_conn_info_opts$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fuse_apply_conn_info_opts$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_apply_conn_info_opts",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$3.fuse_apply_conn_info_opts$FUNC, false
    );
    static final FunctionDescriptor fuse_daemonize$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle fuse_daemonize$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "fuse_daemonize",
        "(I)I",
        constants$3.fuse_daemonize$FUNC, false
    );
}

