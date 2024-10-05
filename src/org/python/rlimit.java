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
 * struct rlimit {
 *     rlim_t rlim_cur;
 *     rlim_t rlim_max;
 * }
 * }
 */
public class rlimit {

    rlimit() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_LONG_LONG.withName("rlim_cur"),
        Python_h.C_LONG_LONG.withName("rlim_max")
    ).withName("rlimit");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong rlim_cur$LAYOUT = (OfLong)$LAYOUT.select(groupElement("rlim_cur"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rlim_t rlim_cur
     * }
     */
    public static final OfLong rlim_cur$layout() {
        return rlim_cur$LAYOUT;
    }

    private static final long rlim_cur$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rlim_t rlim_cur
     * }
     */
    public static final long rlim_cur$offset() {
        return rlim_cur$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rlim_t rlim_cur
     * }
     */
    public static long rlim_cur(MemorySegment struct) {
        return struct.get(rlim_cur$LAYOUT, rlim_cur$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rlim_t rlim_cur
     * }
     */
    public static void rlim_cur(MemorySegment struct, long fieldValue) {
        struct.set(rlim_cur$LAYOUT, rlim_cur$OFFSET, fieldValue);
    }

    private static final OfLong rlim_max$LAYOUT = (OfLong)$LAYOUT.select(groupElement("rlim_max"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * rlim_t rlim_max
     * }
     */
    public static final OfLong rlim_max$layout() {
        return rlim_max$LAYOUT;
    }

    private static final long rlim_max$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * rlim_t rlim_max
     * }
     */
    public static final long rlim_max$offset() {
        return rlim_max$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * rlim_t rlim_max
     * }
     */
    public static long rlim_max(MemorySegment struct) {
        return struct.get(rlim_max$LAYOUT, rlim_max$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * rlim_t rlim_max
     * }
     */
    public static void rlim_max(MemorySegment struct, long fieldValue) {
        struct.set(rlim_max$LAYOUT, rlim_max$OFFSET, fieldValue);
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

