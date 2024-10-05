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
 *     PyObject ob_base;
 *     PyObject *dict;
 *     PyObject *args;
 *     PyObject *notes;
 *     PyObject *traceback;
 *     PyObject *context;
 *     PyObject *cause;
 *     char suppress_context;
 *     PyObject *name;
 * }
 * }
 */
public class PyNameErrorObject {

    PyNameErrorObject() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _object.layout().withName("ob_base"),
        Python_h.C_POINTER.withName("dict"),
        Python_h.C_POINTER.withName("args"),
        Python_h.C_POINTER.withName("notes"),
        Python_h.C_POINTER.withName("traceback"),
        Python_h.C_POINTER.withName("context"),
        Python_h.C_POINTER.withName("cause"),
        Python_h.C_CHAR.withName("suppress_context"),
        MemoryLayout.paddingLayout(7),
        Python_h.C_POINTER.withName("name")
    ).withName("$anon$73:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ob_base$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ob_base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject ob_base
     * }
     */
    public static final GroupLayout ob_base$layout() {
        return ob_base$LAYOUT;
    }

    private static final long ob_base$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject ob_base
     * }
     */
    public static final long ob_base$offset() {
        return ob_base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject ob_base
     * }
     */
    public static MemorySegment ob_base(MemorySegment struct) {
        return struct.asSlice(ob_base$OFFSET, ob_base$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject ob_base
     * }
     */
    public static void ob_base(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ob_base$OFFSET, ob_base$LAYOUT.byteSize());
    }

    private static final AddressLayout dict$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("dict"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *dict
     * }
     */
    public static final AddressLayout dict$layout() {
        return dict$LAYOUT;
    }

    private static final long dict$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *dict
     * }
     */
    public static final long dict$offset() {
        return dict$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *dict
     * }
     */
    public static MemorySegment dict(MemorySegment struct) {
        return struct.get(dict$LAYOUT, dict$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *dict
     * }
     */
    public static void dict(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(dict$LAYOUT, dict$OFFSET, fieldValue);
    }

    private static final AddressLayout args$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("args"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *args
     * }
     */
    public static final AddressLayout args$layout() {
        return args$LAYOUT;
    }

    private static final long args$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *args
     * }
     */
    public static final long args$offset() {
        return args$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *args
     * }
     */
    public static MemorySegment args(MemorySegment struct) {
        return struct.get(args$LAYOUT, args$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *args
     * }
     */
    public static void args(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(args$LAYOUT, args$OFFSET, fieldValue);
    }

    private static final AddressLayout notes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("notes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *notes
     * }
     */
    public static final AddressLayout notes$layout() {
        return notes$LAYOUT;
    }

    private static final long notes$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *notes
     * }
     */
    public static final long notes$offset() {
        return notes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *notes
     * }
     */
    public static MemorySegment notes(MemorySegment struct) {
        return struct.get(notes$LAYOUT, notes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *notes
     * }
     */
    public static void notes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(notes$LAYOUT, notes$OFFSET, fieldValue);
    }

    private static final AddressLayout traceback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("traceback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *traceback
     * }
     */
    public static final AddressLayout traceback$layout() {
        return traceback$LAYOUT;
    }

    private static final long traceback$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *traceback
     * }
     */
    public static final long traceback$offset() {
        return traceback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *traceback
     * }
     */
    public static MemorySegment traceback(MemorySegment struct) {
        return struct.get(traceback$LAYOUT, traceback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *traceback
     * }
     */
    public static void traceback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(traceback$LAYOUT, traceback$OFFSET, fieldValue);
    }

    private static final AddressLayout context$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *context
     * }
     */
    public static final AddressLayout context$layout() {
        return context$LAYOUT;
    }

    private static final long context$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *context
     * }
     */
    public static final long context$offset() {
        return context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *context
     * }
     */
    public static MemorySegment context(MemorySegment struct) {
        return struct.get(context$LAYOUT, context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *context
     * }
     */
    public static void context(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(context$LAYOUT, context$OFFSET, fieldValue);
    }

    private static final AddressLayout cause$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("cause"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *cause
     * }
     */
    public static final AddressLayout cause$layout() {
        return cause$LAYOUT;
    }

    private static final long cause$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *cause
     * }
     */
    public static final long cause$offset() {
        return cause$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *cause
     * }
     */
    public static MemorySegment cause(MemorySegment struct) {
        return struct.get(cause$LAYOUT, cause$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *cause
     * }
     */
    public static void cause(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(cause$LAYOUT, cause$OFFSET, fieldValue);
    }

    private static final OfByte suppress_context$LAYOUT = (OfByte)$LAYOUT.select(groupElement("suppress_context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char suppress_context
     * }
     */
    public static final OfByte suppress_context$layout() {
        return suppress_context$LAYOUT;
    }

    private static final long suppress_context$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char suppress_context
     * }
     */
    public static final long suppress_context$offset() {
        return suppress_context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char suppress_context
     * }
     */
    public static byte suppress_context(MemorySegment struct) {
        return struct.get(suppress_context$LAYOUT, suppress_context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char suppress_context
     * }
     */
    public static void suppress_context(MemorySegment struct, byte fieldValue) {
        struct.set(suppress_context$LAYOUT, suppress_context$OFFSET, fieldValue);
    }

    private static final AddressLayout name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PyObject *name
     * }
     */
    public static final AddressLayout name$layout() {
        return name$LAYOUT;
    }

    private static final long name$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PyObject *name
     * }
     */
    public static final long name$offset() {
        return name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PyObject *name
     * }
     */
    public static MemorySegment name(MemorySegment struct) {
        return struct.get(name$LAYOUT, name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PyObject *name
     * }
     */
    public static void name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(name$LAYOUT, name$OFFSET, fieldValue);
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

