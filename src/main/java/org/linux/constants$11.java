// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$11 {

    static final FunctionDescriptor clock_nanosleep$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle clock_nanosleep$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "clock_nanosleep",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.clock_nanosleep$FUNC, false
    );
    static final FunctionDescriptor clock_getcpuclockid$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle clock_getcpuclockid$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "clock_getcpuclockid",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$11.clock_getcpuclockid$FUNC, false
    );
    static final FunctionDescriptor timer_create$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle timer_create$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "timer_create",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.timer_create$FUNC, false
    );
    static final FunctionDescriptor timer_delete$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle timer_delete$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "timer_delete",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.timer_delete$FUNC, false
    );
    static final FunctionDescriptor timer_settime$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle timer_settime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "timer_settime",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.timer_settime$FUNC, false
    );
    static final FunctionDescriptor timer_gettime$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle timer_gettime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "timer_gettime",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.timer_gettime$FUNC, false
    );
}


