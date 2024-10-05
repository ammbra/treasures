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
 *     int ff_features;
 *     int ff_lineno;
 * }
 * }
 */
public class PyFutureFeatures {

    PyFutureFeatures() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_INT.withName("ff_features"),
        Python_h.C_INT.withName("ff_lineno")
    ).withName("$anon$36:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ff_features$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ff_features"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ff_features
     * }
     */
    public static final OfInt ff_features$layout() {
        return ff_features$LAYOUT;
    }

    private static final long ff_features$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ff_features
     * }
     */
    public static final long ff_features$offset() {
        return ff_features$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ff_features
     * }
     */
    public static int ff_features(MemorySegment struct) {
        return struct.get(ff_features$LAYOUT, ff_features$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ff_features
     * }
     */
    public static void ff_features(MemorySegment struct, int fieldValue) {
        struct.set(ff_features$LAYOUT, ff_features$OFFSET, fieldValue);
    }

    private static final OfInt ff_lineno$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ff_lineno"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int ff_lineno
     * }
     */
    public static final OfInt ff_lineno$layout() {
        return ff_lineno$LAYOUT;
    }

    private static final long ff_lineno$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int ff_lineno
     * }
     */
    public static final long ff_lineno$offset() {
        return ff_lineno$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int ff_lineno
     * }
     */
    public static int ff_lineno(MemorySegment struct) {
        return struct.get(ff_lineno$LAYOUT, ff_lineno$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int ff_lineno
     * }
     */
    public static void ff_lineno(MemorySegment struct, int fieldValue) {
        struct.set(ff_lineno$LAYOUT, ff_lineno$OFFSET, fieldValue);
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

