// Generated by jextract

package org.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface fuse_module_factory_t {

    MemoryAddress apply(MemoryAddress x0, MemoryAddress x1);
    static MemoryAddress allocate(fuse_module_factory_t fi) {
        return RuntimeHelper.upcallStub(fuse_module_factory_t.class, fi, constants$26.fuse_module_factory_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(fuse_module_factory_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(fuse_module_factory_t.class, fi, constants$26.fuse_module_factory_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static fuse_module_factory_t ofAddress(MemoryAddress addr) {
        return (MemoryAddress x0, MemoryAddress x1) -> {
            try {
                return (MemoryAddress)constants$26.fuse_module_factory_t$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


