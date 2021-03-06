// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$6 {

    static final FunctionDescriptor posix_fadvise$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_INT
    );
    static final MethodHandle posix_fadvise$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "posix_fadvise",
        "(IJJI)I",
        constants$6.posix_fadvise$FUNC, false
    );
    static final FunctionDescriptor posix_fallocate$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_LONG,
        C_LONG
    );
    static final MethodHandle posix_fallocate$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "posix_fallocate",
        "(IJJ)I",
        constants$6.posix_fallocate$FUNC, false
    );
    static final FunctionDescriptor clock$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle clock$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "clock",
        "()J",
        constants$6.clock$FUNC, false
    );
    static final FunctionDescriptor time$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle time$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "time",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$6.time$FUNC, false
    );
    static final FunctionDescriptor difftime$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_LONG,
        C_LONG
    );
    static final MethodHandle difftime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "difftime",
        "(JJ)D",
        constants$6.difftime$FUNC, false
    );
    static final FunctionDescriptor mktime$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle mktime$MH = RuntimeHelper.downcallHandle(
        fuse_h.LIBRARIES, "mktime",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$6.mktime$FUNC, false
    );
}


