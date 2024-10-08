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
 * struct clockinfo {
 *     int hz;
 *     int tick;
 *     int tickadj;
 *     int stathz;
 *     int profhz;
 * }
 * }
 */
public class clockinfo {

    clockinfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Python_h.C_INT.withName("hz"),
        Python_h.C_INT.withName("tick"),
        Python_h.C_INT.withName("tickadj"),
        Python_h.C_INT.withName("stathz"),
        Python_h.C_INT.withName("profhz")
    ).withName("clockinfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt hz$LAYOUT = (OfInt)$LAYOUT.select(groupElement("hz"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int hz
     * }
     */
    public static final OfInt hz$layout() {
        return hz$LAYOUT;
    }

    private static final long hz$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int hz
     * }
     */
    public static final long hz$offset() {
        return hz$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int hz
     * }
     */
    public static int hz(MemorySegment struct) {
        return struct.get(hz$LAYOUT, hz$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int hz
     * }
     */
    public static void hz(MemorySegment struct, int fieldValue) {
        struct.set(hz$LAYOUT, hz$OFFSET, fieldValue);
    }

    private static final OfInt tick$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tick"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tick
     * }
     */
    public static final OfInt tick$layout() {
        return tick$LAYOUT;
    }

    private static final long tick$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tick
     * }
     */
    public static final long tick$offset() {
        return tick$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tick
     * }
     */
    public static int tick(MemorySegment struct) {
        return struct.get(tick$LAYOUT, tick$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tick
     * }
     */
    public static void tick(MemorySegment struct, int fieldValue) {
        struct.set(tick$LAYOUT, tick$OFFSET, fieldValue);
    }

    private static final OfInt tickadj$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tickadj"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int tickadj
     * }
     */
    public static final OfInt tickadj$layout() {
        return tickadj$LAYOUT;
    }

    private static final long tickadj$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int tickadj
     * }
     */
    public static final long tickadj$offset() {
        return tickadj$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int tickadj
     * }
     */
    public static int tickadj(MemorySegment struct) {
        return struct.get(tickadj$LAYOUT, tickadj$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int tickadj
     * }
     */
    public static void tickadj(MemorySegment struct, int fieldValue) {
        struct.set(tickadj$LAYOUT, tickadj$OFFSET, fieldValue);
    }

    private static final OfInt stathz$LAYOUT = (OfInt)$LAYOUT.select(groupElement("stathz"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int stathz
     * }
     */
    public static final OfInt stathz$layout() {
        return stathz$LAYOUT;
    }

    private static final long stathz$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int stathz
     * }
     */
    public static final long stathz$offset() {
        return stathz$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int stathz
     * }
     */
    public static int stathz(MemorySegment struct) {
        return struct.get(stathz$LAYOUT, stathz$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int stathz
     * }
     */
    public static void stathz(MemorySegment struct, int fieldValue) {
        struct.set(stathz$LAYOUT, stathz$OFFSET, fieldValue);
    }

    private static final OfInt profhz$LAYOUT = (OfInt)$LAYOUT.select(groupElement("profhz"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int profhz
     * }
     */
    public static final OfInt profhz$layout() {
        return profhz$LAYOUT;
    }

    private static final long profhz$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int profhz
     * }
     */
    public static final long profhz$offset() {
        return profhz$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int profhz
     * }
     */
    public static int profhz(MemorySegment struct) {
        return struct.get(profhz$LAYOUT, profhz$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int profhz
     * }
     */
    public static void profhz(MemorySegment struct, int fieldValue) {
        struct.set(profhz$LAYOUT, profhz$OFFSET, fieldValue);
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

