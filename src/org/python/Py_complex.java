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
 * struct {
 *     double real;
 *     double imag;
 * }
 * }
 */
public class Py_complex {

    Py_complex() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_DOUBLE.withName("real"),
        Python_h.C_DOUBLE.withName("imag")
    ).withName("$anon$5:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfDouble real$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("real"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double real
     * }
     */
    public static final OfDouble real$layout() {
        return real$LAYOUT;
    }

    private static final long real$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double real
     * }
     */
    public static final long real$offset() {
        return real$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double real
     * }
     */
    public static double real(MemorySegment struct) {
        return struct.get(real$LAYOUT, real$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double real
     * }
     */
    public static void real(MemorySegment struct, double fieldValue) {
        struct.set(real$LAYOUT, real$OFFSET, fieldValue);
    }

    private static final OfDouble imag$LAYOUT = (OfDouble)$LAYOUT.select(groupElement("imag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * double imag
     * }
     */
    public static final OfDouble imag$layout() {
        return imag$LAYOUT;
    }

    private static final long imag$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * double imag
     * }
     */
    public static final long imag$offset() {
        return imag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * double imag
     * }
     */
    public static double imag(MemorySegment struct) {
        return struct.get(imag$LAYOUT, imag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * double imag
     * }
     */
    public static void imag(MemorySegment struct, double fieldValue) {
        struct.set(imag$LAYOUT, imag$OFFSET, fieldValue);
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

