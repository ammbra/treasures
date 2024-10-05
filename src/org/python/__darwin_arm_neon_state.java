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
 * struct __darwin_arm_neon_state {
 *     __uint128_t __v[16];
 *     __uint32_t __fpsr;
 *     __uint32_t __fpcr;
 * }
 * }
 */
public class __darwin_arm_neon_state {

    __darwin_arm_neon_state() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(256),
        Python_h.C_INT.withName("__fpsr"),
        Python_h.C_INT.withName("__fpcr"),
        MemoryLayout.paddingLayout(8)
    ).withName("__darwin_arm_neon_state");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt __fpsr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__fpsr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __fpsr
     * }
     */
    public static final OfInt __fpsr$layout() {
        return __fpsr$LAYOUT;
    }

    private static final long __fpsr$OFFSET = 256;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __fpsr
     * }
     */
    public static final long __fpsr$offset() {
        return __fpsr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __fpsr
     * }
     */
    public static int __fpsr(MemorySegment struct) {
        return struct.get(__fpsr$LAYOUT, __fpsr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __fpsr
     * }
     */
    public static void __fpsr(MemorySegment struct, int fieldValue) {
        struct.set(__fpsr$LAYOUT, __fpsr$OFFSET, fieldValue);
    }

    private static final OfInt __fpcr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("__fpcr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __uint32_t __fpcr
     * }
     */
    public static final OfInt __fpcr$layout() {
        return __fpcr$LAYOUT;
    }

    private static final long __fpcr$OFFSET = 260;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __uint32_t __fpcr
     * }
     */
    public static final long __fpcr$offset() {
        return __fpcr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __uint32_t __fpcr
     * }
     */
    public static int __fpcr(MemorySegment struct) {
        return struct.get(__fpcr$LAYOUT, __fpcr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __uint32_t __fpcr
     * }
     */
    public static void __fpcr(MemorySegment struct, int fieldValue) {
        struct.set(__fpcr$LAYOUT, __fpcr$OFFSET, fieldValue);
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

