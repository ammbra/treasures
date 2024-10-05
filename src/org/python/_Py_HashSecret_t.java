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
 * union {
 *     unsigned char uc[24];
 *     struct {
 *         Py_hash_t prefix;
 *         Py_hash_t suffix;
 *     } fnv;
 *     struct {
 *         uint64_t k0;
 *         uint64_t k1;
 *     } siphash;
 *     struct {
 *         unsigned char padding[16];
 *         Py_hash_t suffix;
 *     } djbx33a;
 *     struct {
 *         unsigned char padding[16];
 *         Py_hash_t hashsalt;
 *     } expat;
 * }
 * }
 */
public class _Py_HashSecret_t {

    _Py_HashSecret_t() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.sequenceLayout(24, Python_h.C_CHAR).withName("uc"),
        _Py_HashSecret_t.fnv.layout().withName("fnv"),
        _Py_HashSecret_t.siphash.layout().withName("siphash"),
        _Py_HashSecret_t.djbx33a.layout().withName("djbx33a"),
        _Py_HashSecret_t.expat.layout().withName("expat")
    ).withName("$anon$55:9");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout uc$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("uc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char uc[24]
     * }
     */
    public static final SequenceLayout uc$layout() {
        return uc$LAYOUT;
    }

    private static final long uc$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char uc[24]
     * }
     */
    public static final long uc$offset() {
        return uc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char uc[24]
     * }
     */
    public static MemorySegment uc(MemorySegment union) {
        return union.asSlice(uc$OFFSET, uc$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char uc[24]
     * }
     */
    public static void uc(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, uc$OFFSET, uc$LAYOUT.byteSize());
    }

    private static long[] uc$DIMS = { 24 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char uc[24]
     * }
     */
    public static long[] uc$dimensions() {
        return uc$DIMS;
    }
    private static final VarHandle uc$ELEM_HANDLE = uc$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char uc[24]
     * }
     */
    public static byte uc(MemorySegment union, long index0) {
        return (byte)uc$ELEM_HANDLE.get(union, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char uc[24]
     * }
     */
    public static void uc(MemorySegment union, long index0, byte fieldValue) {
        uc$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     Py_hash_t prefix;
     *     Py_hash_t suffix;
     * }
     * }
     */
    public static class fnv {

        fnv() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            Python_h.C_LONG.withName("prefix"),
            Python_h.C_LONG.withName("suffix")
        ).withName("$anon$59:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfLong prefix$LAYOUT = (OfLong)$LAYOUT.select(groupElement("prefix"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Py_hash_t prefix
         * }
         */
        public static final OfLong prefix$layout() {
            return prefix$LAYOUT;
        }

        private static final long prefix$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Py_hash_t prefix
         * }
         */
        public static final long prefix$offset() {
            return prefix$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Py_hash_t prefix
         * }
         */
        public static long prefix(MemorySegment struct) {
            return struct.get(prefix$LAYOUT, prefix$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Py_hash_t prefix
         * }
         */
        public static void prefix(MemorySegment struct, long fieldValue) {
            struct.set(prefix$LAYOUT, prefix$OFFSET, fieldValue);
        }

        private static final OfLong suffix$LAYOUT = (OfLong)$LAYOUT.select(groupElement("suffix"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static final OfLong suffix$layout() {
            return suffix$LAYOUT;
        }

        private static final long suffix$OFFSET = 8;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static final long suffix$offset() {
            return suffix$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static long suffix(MemorySegment struct) {
            return struct.get(suffix$LAYOUT, suffix$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static void suffix(MemorySegment struct, long fieldValue) {
            struct.set(suffix$LAYOUT, suffix$OFFSET, fieldValue);
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

    private static final GroupLayout fnv$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("fnv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     Py_hash_t prefix;
     *     Py_hash_t suffix;
     * } fnv
     * }
     */
    public static final GroupLayout fnv$layout() {
        return fnv$LAYOUT;
    }

    private static final long fnv$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     Py_hash_t prefix;
     *     Py_hash_t suffix;
     * } fnv
     * }
     */
    public static final long fnv$offset() {
        return fnv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     Py_hash_t prefix;
     *     Py_hash_t suffix;
     * } fnv
     * }
     */
    public static MemorySegment fnv(MemorySegment union) {
        return union.asSlice(fnv$OFFSET, fnv$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     Py_hash_t prefix;
     *     Py_hash_t suffix;
     * } fnv
     * }
     */
    public static void fnv(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, fnv$OFFSET, fnv$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     uint64_t k0;
     *     uint64_t k1;
     * }
     * }
     */
    public static class siphash {

        siphash() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            Python_h.C_LONG_LONG.withName("k0"),
            Python_h.C_LONG_LONG.withName("k1")
        ).withName("$anon$64:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfLong k0$LAYOUT = (OfLong)$LAYOUT.select(groupElement("k0"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * uint64_t k0
         * }
         */
        public static final OfLong k0$layout() {
            return k0$LAYOUT;
        }

        private static final long k0$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * uint64_t k0
         * }
         */
        public static final long k0$offset() {
            return k0$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * uint64_t k0
         * }
         */
        public static long k0(MemorySegment struct) {
            return struct.get(k0$LAYOUT, k0$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * uint64_t k0
         * }
         */
        public static void k0(MemorySegment struct, long fieldValue) {
            struct.set(k0$LAYOUT, k0$OFFSET, fieldValue);
        }

        private static final OfLong k1$LAYOUT = (OfLong)$LAYOUT.select(groupElement("k1"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * uint64_t k1
         * }
         */
        public static final OfLong k1$layout() {
            return k1$LAYOUT;
        }

        private static final long k1$OFFSET = 8;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * uint64_t k1
         * }
         */
        public static final long k1$offset() {
            return k1$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * uint64_t k1
         * }
         */
        public static long k1(MemorySegment struct) {
            return struct.get(k1$LAYOUT, k1$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * uint64_t k1
         * }
         */
        public static void k1(MemorySegment struct, long fieldValue) {
            struct.set(k1$LAYOUT, k1$OFFSET, fieldValue);
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

    private static final GroupLayout siphash$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("siphash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     uint64_t k0;
     *     uint64_t k1;
     * } siphash
     * }
     */
    public static final GroupLayout siphash$layout() {
        return siphash$LAYOUT;
    }

    private static final long siphash$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     uint64_t k0;
     *     uint64_t k1;
     * } siphash
     * }
     */
    public static final long siphash$offset() {
        return siphash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     uint64_t k0;
     *     uint64_t k1;
     * } siphash
     * }
     */
    public static MemorySegment siphash(MemorySegment union) {
        return union.asSlice(siphash$OFFSET, siphash$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     uint64_t k0;
     *     uint64_t k1;
     * } siphash
     * }
     */
    public static void siphash(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, siphash$OFFSET, siphash$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t suffix;
     * }
     * }
     */
    public static class djbx33a {

        djbx33a() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, Python_h.C_CHAR).withName("padding"),
            Python_h.C_LONG.withName("suffix")
        ).withName("$anon$69:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("padding"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static final SequenceLayout padding$layout() {
            return padding$LAYOUT;
        }

        private static final long padding$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static final long padding$offset() {
            return padding$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static MemorySegment padding(MemorySegment struct) {
            return struct.asSlice(padding$OFFSET, padding$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static void padding(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, padding$OFFSET, padding$LAYOUT.byteSize());
        }

        private static long[] padding$DIMS = { 16 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static long[] padding$dimensions() {
            return padding$DIMS;
        }
        private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static byte padding(MemorySegment struct, long index0) {
            return (byte)padding$ELEM_HANDLE.get(struct, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static void padding(MemorySegment struct, long index0, byte fieldValue) {
            padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
        }

        private static final OfLong suffix$LAYOUT = (OfLong)$LAYOUT.select(groupElement("suffix"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static final OfLong suffix$layout() {
            return suffix$LAYOUT;
        }

        private static final long suffix$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static final long suffix$offset() {
            return suffix$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static long suffix(MemorySegment struct) {
            return struct.get(suffix$LAYOUT, suffix$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Py_hash_t suffix
         * }
         */
        public static void suffix(MemorySegment struct, long fieldValue) {
            struct.set(suffix$LAYOUT, suffix$OFFSET, fieldValue);
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

    private static final GroupLayout djbx33a$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("djbx33a"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t suffix;
     * } djbx33a
     * }
     */
    public static final GroupLayout djbx33a$layout() {
        return djbx33a$LAYOUT;
    }

    private static final long djbx33a$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t suffix;
     * } djbx33a
     * }
     */
    public static final long djbx33a$offset() {
        return djbx33a$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t suffix;
     * } djbx33a
     * }
     */
    public static MemorySegment djbx33a(MemorySegment union) {
        return union.asSlice(djbx33a$OFFSET, djbx33a$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t suffix;
     * } djbx33a
     * }
     */
    public static void djbx33a(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, djbx33a$OFFSET, djbx33a$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t hashsalt;
     * }
     * }
     */
    public static class expat {

        expat() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, Python_h.C_CHAR).withName("padding"),
            Python_h.C_LONG.withName("hashsalt")
        ).withName("$anon$73:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout padding$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("padding"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static final SequenceLayout padding$layout() {
            return padding$LAYOUT;
        }

        private static final long padding$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static final long padding$offset() {
            return padding$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static MemorySegment padding(MemorySegment struct) {
            return struct.asSlice(padding$OFFSET, padding$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static void padding(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, padding$OFFSET, padding$LAYOUT.byteSize());
        }

        private static long[] padding$DIMS = { 16 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static long[] padding$dimensions() {
            return padding$DIMS;
        }
        private static final VarHandle padding$ELEM_HANDLE = padding$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static byte padding(MemorySegment struct, long index0) {
            return (byte)padding$ELEM_HANDLE.get(struct, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * unsigned char padding[16]
         * }
         */
        public static void padding(MemorySegment struct, long index0, byte fieldValue) {
            padding$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
        }

        private static final OfLong hashsalt$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hashsalt"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * Py_hash_t hashsalt
         * }
         */
        public static final OfLong hashsalt$layout() {
            return hashsalt$LAYOUT;
        }

        private static final long hashsalt$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * Py_hash_t hashsalt
         * }
         */
        public static final long hashsalt$offset() {
            return hashsalt$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * Py_hash_t hashsalt
         * }
         */
        public static long hashsalt(MemorySegment struct) {
            return struct.get(hashsalt$LAYOUT, hashsalt$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * Py_hash_t hashsalt
         * }
         */
        public static void hashsalt(MemorySegment struct, long fieldValue) {
            struct.set(hashsalt$LAYOUT, hashsalt$OFFSET, fieldValue);
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

    private static final GroupLayout expat$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("expat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t hashsalt;
     * } expat
     * }
     */
    public static final GroupLayout expat$layout() {
        return expat$LAYOUT;
    }

    private static final long expat$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t hashsalt;
     * } expat
     * }
     */
    public static final long expat$offset() {
        return expat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t hashsalt;
     * } expat
     * }
     */
    public static MemorySegment expat(MemorySegment union) {
        return union.asSlice(expat$OFFSET, expat$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     unsigned char padding[16];
     *     Py_hash_t hashsalt;
     * } expat
     * }
     */
    public static void expat(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, union, expat$OFFSET, expat$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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

