// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$7 {

    static final FunctionDescriptor strftime$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle strftime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "strftime",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$7.strftime$FUNC, false
    );
    static final FunctionDescriptor strftime_l$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle strftime_l$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "strftime_l",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$7.strftime_l$FUNC, false
    );
    static final FunctionDescriptor gmtime$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle gmtime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "gmtime",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.gmtime$FUNC, false
    );
    static final FunctionDescriptor localtime$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle localtime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "localtime",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.localtime$FUNC, false
    );
    static final FunctionDescriptor gmtime_r$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gmtime_r$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "gmtime_r",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.gmtime_r$FUNC, false
    );
    static final FunctionDescriptor localtime_r$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle localtime_r$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "localtime_r",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$7.localtime_r$FUNC, false
    );
}

