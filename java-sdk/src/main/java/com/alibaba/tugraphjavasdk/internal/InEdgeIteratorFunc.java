package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.tugraphjavasdk.internal.type.*;
import com.alibaba.tugraphjavasdk.stdcxx.*;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface InEdgeIteratorFunc {
    InEdgeIteratorFunc LIBRARY = FFITypeFactory.getLibrary(InEdgeIteratorFunc.class);

    void lgraph_api_in_edge_iterator_destroy(InEdgeIterator it);

    void lgraph_api_in_edge_iterator_close(InEdgeIterator it);

    boolean lgraph_api_in_edge_iterator_next(InEdgeIterator it, CharPointer2 errptr);

    boolean lgraph_api_in_edge_iterator_goto(InEdgeIterator it, EdgeUid uid, boolean nearest, CharPointer2 errptr);

    EdgeUid lgraph_api_in_edge_iterator_get_uid(InEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_in_edge_iterator_get_src(InEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_in_edge_iterator_get_dst(InEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_in_edge_iterator_get_edge_id(InEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_in_edge_iterator_get_temporal_id(InEdgeIterator it, CharPointer2 errptr);

    boolean lgraph_api_in_edge_iterator_is_valid(InEdgeIterator it);

    CharPointer lgraph_api_in_edge_iterator_get_label(InEdgeIterator it, CharPointer2 errptr);

    short lgraph_api_in_edge_iterator_get_label_id(InEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_in_edge_iterator_get_fields_by_names(InEdgeIterator it, CharPointer2 field_names, long field_names_len, FieldData3 field_data, CharPointer2 errptr);

    FieldData lgraph_api_in_edge_iterator_get_field(InEdgeIterator it, CharPointer field_name, CharPointer2 errptr);

    long lgraph_api_in_edge_iterator_get_fields_by_ids(InEdgeIterator it, SizetPointer field_ids, long field_ids_len, FieldData3 field_data, CharPointer2 errptr);

    FieldData lgraph_api_in_edge_iterator_get_field_by_id(InEdgeIterator it, long field_id, CharPointer2 errptr);

    FieldData lgraph_api_in_edge_iterator_get_field_by_name(InEdgeIterator it, CharPointer field_name, CharPointer2 errptr);

    long lgraph_api_in_edge_iterator_get_all_fields(InEdgeIterator it, CharPointer3 field_names, FieldData3 field_data, CharPointer2 errptr);

    void lgraph_api_in_edge_iterator_set_field_by_name(InEdgeIterator it, CharPointer field_name, FieldData field_value, CharPointer2 errptr);

    void lgraph_api_in_edge_iterator_set_field_by_id(InEdgeIterator it, long field_id, FieldData field_value, CharPointer2 errptr);

    void lgraph_api_in_edge_iterator_set_fields_by_value_strings(InEdgeIterator it, CharPointer2 field_names, long field_names_len, CharPointer2 field_value_strings, long field_value_strings_len, CharPointer2 errptr);

    void lgraph_api_in_edge_iterator_set_fields_by_data(InEdgeIterator it, CharPointer2 field_names, long field_names_len, FieldData2 field_values, long field_values_len, CharPointer2 errptr);

    void lgraph_api_in_edge_iterator_set_fields_by_ids(InEdgeIterator it, SizetPointer field_ids, long field_ids_len, FieldData2 field_values, long field_values_len, CharPointer2 errptr);

    void lgraph_api_in_edge_iterator_delete(InEdgeIterator it, CharPointer2 errptr);

    CharPointer lgraph_api_in_edge_iterator_to_string(InEdgeIterator it, CharPointer2 errptr);

    boolean lgraph_api_out_edge_iterator_eq(OutEdgeIterator lhs, OutEdgeIterator rhs);

    boolean LGraphApi_OutInEdgeIterator_eq(OutEdgeIterator lhs, InEdgeIterator rhs);

    boolean lgraph_api_in_edge_iterator_eq(InEdgeIterator lhs, InEdgeIterator rhs);
}
