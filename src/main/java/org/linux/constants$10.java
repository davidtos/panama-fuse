// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$10 {

    static final FunctionDescriptor timelocal$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle timelocal$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "timelocal",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$10.timelocal$FUNC, false
    );
    static final FunctionDescriptor dysize$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle dysize$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "dysize",
        "(I)I",
        constants$10.dysize$FUNC, false
    );
    static final FunctionDescriptor nanosleep$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle nanosleep$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "nanosleep",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$10.nanosleep$FUNC, false
    );
    static final FunctionDescriptor clock_getres$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle clock_getres$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "clock_getres",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$10.clock_getres$FUNC, false
    );
    static final FunctionDescriptor clock_gettime$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle clock_gettime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "clock_gettime",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$10.clock_gettime$FUNC, false
    );
    static final FunctionDescriptor clock_settime$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle clock_settime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "clock_settime",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$10.clock_settime$FUNC, false
    );
}


