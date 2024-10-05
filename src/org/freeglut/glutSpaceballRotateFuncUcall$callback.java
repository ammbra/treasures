// Generated by jextract

package org.freeglut;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * void (*callback)(int, int, int, void *)
 * }
 */
public class glutSpaceballRotateFuncUcall$callback {

    glutSpaceballRotateFuncUcall$callback() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        void apply(int _x0, int _x1, int _x2, MemorySegment _x3);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
        freeglut_h.C_INT,
        freeglut_h.C_INT,
        freeglut_h.C_INT,
        freeglut_h.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = freeglut_h.upcallHandle(glutSpaceballRotateFuncUcall$callback.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(glutSpaceballRotateFuncUcall$callback.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static void invoke(MemorySegment funcPtr,int _x0, int _x1, int _x2, MemorySegment _x3) {
        try {
             DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

