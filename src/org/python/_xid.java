// Generated by jextract

package org.python;

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
 * struct _xid {
 *     void *data;
 *     PyObject *obj;
 *     int64_t interp;
 *     PyObject *(*new_object)(_PyCrossInterpreterData *);
 *     void (*free)(void *);
 * }
 * }
 */
public class _xid {

    _xid() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_POINTER.withName("data"),
        Python_h.C_POINTER.withName("obj"),
        Python_h.C_LONG_LONG.withName("interp"),
        Python_h.C_POINTER.withName("new_object"),
        Python_h.C_POINTER.withName("free")
    ).withName("_xid");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final AddressLayout obj$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("obj"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *obj
     * }
     */
    public static final AddressLayout obj$layout() {
        return obj$LAYOUT;
    }

    private static final long obj$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *obj
     * }
     */
    public static final long obj$offset() {
        return obj$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *obj
     * }
     */
    public static MemorySegment obj(MemorySegment struct) {
        return struct.get(obj$LAYOUT, obj$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *obj
     * }
     */
    public static void obj(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(obj$LAYOUT, obj$OFFSET, fieldValue);
    }

    private static final OfLong interp$LAYOUT = (OfLong)$LAYOUT.select(groupElement("interp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int64_t interp
     * }
     */
    public static final OfLong interp$layout() {
        return interp$LAYOUT;
    }

    private static final long interp$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int64_t interp
     * }
     */
    public static final long interp$offset() {
        return interp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int64_t interp
     * }
     */
    public static long interp(MemorySegment struct) {
        return struct.get(interp$LAYOUT, interp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int64_t interp
     * }
     */
    public static void interp(MemorySegment struct, long fieldValue) {
        struct.set(interp$LAYOUT, interp$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * PyObject *(*new_object)(_PyCrossInterpreterData *)
     * }
     */
    public static class new_object {

        new_object() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            Python_h.C_POINTER,
            Python_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Python_h.upcallHandle(new_object.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(new_object.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout new_object$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("new_object"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *(*new_object)(_PyCrossInterpreterData *)
     * }
     */
    public static final AddressLayout new_object$layout() {
        return new_object$LAYOUT;
    }

    private static final long new_object$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *(*new_object)(_PyCrossInterpreterData *)
     * }
     */
    public static final long new_object$offset() {
        return new_object$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *(*new_object)(_PyCrossInterpreterData *)
     * }
     */
    public static MemorySegment new_object(MemorySegment struct) {
        return struct.get(new_object$LAYOUT, new_object$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *(*new_object)(_PyCrossInterpreterData *)
     * }
     */
    public static void new_object(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(new_object$LAYOUT, new_object$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static class free {

        free() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            Python_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = Python_h.upcallHandle(free.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(free.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout free$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("free"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static final AddressLayout free$layout() {
        return free$LAYOUT;
    }

    private static final long free$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static final long free$offset() {
        return free$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static MemorySegment free(MemorySegment struct) {
        return struct.get(free$LAYOUT, free$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*free)(void *)
     * }
     */
    public static void free(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(free$LAYOUT, free$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

