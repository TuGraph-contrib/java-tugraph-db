package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.*;
import com.alibaba.tugraphjavasdk.internal.type.*;
import com.alibaba.tugraphjavasdk.stdcxx.*;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface OutEdgeIteratorFunc {
    OutEdgeIteratorFunc LIBRARY = FFITypeFactory.getLibrary(OutEdgeIteratorFunc.class);

    void lgraph_api_out_edge_iterator_destroy(OutEdgeIterator it);

    void lgraph_api_out_edge_iterator_close(OutEdgeIterator it);

    boolean lgraph_api_out_edge_iterator_goto(OutEdgeIterator it, EdgeUid euid, boolean nearest, CharPointer2 errptr);

    boolean lgraph_api_out_edge_iterator_is_valid(OutEdgeIterator it);

    boolean lgraph_api_out_edge_iterator_next(OutEdgeIterator it, CharPointer2 errptr);

    EdgeUid lgraph_api_out_edge_iterator_get_uid(OutEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_out_edge_iterator_get_dst(OutEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_out_edge_iterator_get_edge_id(OutEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_out_edge_iterator_get_temporal_id(OutEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_out_edge_iterator_get_src(OutEdgeIterator it, CharPointer2 errptr);

    CharPointer lgraph_api_out_edge_iterator_get_label(OutEdgeIterator it, CharPointer2 errptr);

    short lgraph_api_out_edge_iterator_get_label_id(OutEdgeIterator it, CharPointer2 errptr);

    long lgraph_api_out_edge_iterator_get_fields_by_names(OutEdgeIterator it, CharPointer2 field_names, long field_names_len, FieldData3 field_data, CharPointer2 errptr);

    FieldData lgraph_api_out_edge_iterator_get_field_by_name(OutEdgeIterator it, CharPointer field_name, CharPointer2 errptr);

    long lgraph_api_out_edge_iterator_get_fields_by_ids(OutEdgeIterator it, SizetPointer field_ids, long field_ids_len, FieldData3 field_data, CharPointer2 errptr);

    FieldData lgraph_api_out_edge_iterator_get_field_by_id(OutEdgeIterator it, long field_id, CharPointer2 errptr);

    long lgraph_api_out_edge_iterator_get_all_fields(OutEdgeIterator it, CharPointer3 field_names, FieldData3 field_data, CharPointer2 errptr);

    void lgraph_api_field_names_destroy(CharPointer2 field_names, long n);

    void lgraph_api_out_edge_iterator_set_field_by_name(OutEdgeIterator it, CharPointer field_name, FieldData field_value, CharPointer2 errptr);

    void lgraph_api_out_edge_iterator_set_field_by_id(OutEdgeIterator it, long field_id, FieldData field_value, CharPointer2 errptr);

    void lgraph_api_out_edge_iterator_set_fields_by_value_strings(OutEdgeIterator it, CharPointer2 field_names, long field_names_len, CharPointer2 field_value_strings, long field_value_strings_len, CharPointer2 errptr);

    void lgraph_api_out_edge_iterator_set_fields_by_data(OutEdgeIterator it, CharPointer2 field_names, long field_names_len, FieldData2 field_values, long field_values_len, CharPointer2 errptr);

    void lgraph_api_out_edge_iterator_set_fields_by_ids(OutEdgeIterator it, SizetPointer field_ids, long field_ids_len, FieldData2 field_values, long field_values_len, CharPointer2 errptr);

    void lgraph_api_out_edge_iterator_delete(OutEdgeIterator it, CharPointer2 errptr);

    CharPointer lgraph_api_out_edge_iterator_to_string(OutEdgeIterator it, CharPointer2 errptr);
}
