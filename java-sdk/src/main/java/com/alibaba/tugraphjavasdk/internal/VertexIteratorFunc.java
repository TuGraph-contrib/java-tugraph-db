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
public interface VertexIteratorFunc {
    VertexIteratorFunc LIBRARY = FFITypeFactory.getLibrary(VertexIteratorFunc.class);

    void lgraph_api_vertex_iterator_destroy(VertexIterator it);

    void lgraph_api_vertex_iterator_close(VertexIterator it);

    boolean lgraph_api_vertex_iterator_next(VertexIterator it, CharPointer2 errptr);

    boolean lgraph_api_vertex_iterator_goto(VertexIterator it, long vid, boolean nearest, CharPointer2 errptr);

    long lgraph_api_vertex_iterator_get_id(VertexIterator it, CharPointer2 errptr);

    OutEdgeIterator lgraph_api_vertex_iterator_get_out_edge_iterator(VertexIterator it, CharPointer2 errptr);

    OutEdgeIterator lgraph_api_vertex_iterator_get_out_edge_iterator_by_euid(VertexIterator it, EdgeUid euid, boolean nearest, CharPointer2 errptr);

    InEdgeIterator lgraph_api_vertex_iterator_get_in_edge_iterator(VertexIterator it, CharPointer2 errptr);

    InEdgeIterator lgraph_api_vertex_iterator_get_in_edge_iterator_by_euid(VertexIterator it, EdgeUid euid, boolean nearest, CharPointer2 errptr);

    boolean lgraph_api_vertex_iterator_is_valid(VertexIterator it);

    CharPointer lgraph_api_vertex_iterator_get_label(VertexIterator it, CharPointer2 errptr);

    short lgraph_api_vertex_iterator_get_label_id(VertexIterator it, CharPointer2 errptr);

    long lgraph_api_vertex_iterator_get_fields_by_names(VertexIterator it, CharPointer2 field_names, long field_names_len, FieldData3 field_data, CharPointer2 errptr);

    FieldData lgraph_api_vertex_iterator_get_field_by_name(VertexIterator it, CharPointer field_name, CharPointer2 errptr);

    long lgraph_api_vertex_iterator_get_fields_by_ids(VertexIterator it, SizetPointer field_ids, long field_ids_len, FieldData3 field_data, CharPointer2 errptr);

    FieldData lgraph_api_vertex_iterator_get_field_by_id(VertexIterator it, long field_id, CharPointer2 errptr);

    long lgraph_api_vertex_iterator_get_all_fields(VertexIterator it, CharPointer3 field_names, FieldData3 field_data, CharPointer2 errptr);

    void lgraph_api_vertex_iterator_set_field_by_name(VertexIterator it, CharPointer field_name, FieldData field_value, CharPointer2 errptr);

    void lgraph_api_vertex_iterator_set_field_by_id(VertexIterator it, long field_id, FieldData field_value, CharPointer2 errptr);

    void lgraph_api_vertex_iterator_set_fields_by_value_strings(VertexIterator it, CharPointer2 field_names, long field_names_len, CharPointer2 field_value_strings, long field_value_strings_len, CharPointer2 errptr);

    void lgraph_api_vertex_iterator_set_fields_by_data(VertexIterator it, CharPointer2 field_names, long field_names_len, FieldData2 field_values, long field_values_len, CharPointer2 errptr);

    void lgraph_api_vertex_iterator_set_fields_by_ids(VertexIterator it, SizetPointer field_ids, long field_ids_len, FieldData2 field_values, long field_values_len, CharPointer2 errptr);

    long lgraph_api_vertex_iterator_list_src_vids(VertexIterator it, long n_limit, BoolPointer more_to_go, Int64Pointer2 vids, CharPointer2 errptr);

    long lgraph_api_vertex_iterator_list_dst_vids(VertexIterator it, long n_limit, BoolPointer more_to_go, Int64Pointer2 vids, CharPointer2 errptr);

    void lgraph_api_vertex_iterator_list_vids_destroy(Int64Pointer vids);

    long lgraph_api_vertex_iterator_get_num_in_edges(VertexIterator it, long n_limit, BoolPointer more_to_go, CharPointer2 errptr);

    long lgraph_api_vertex_iterator_get_num_out_edges(VertexIterator it, long n_limit, BoolPointer more_to_go, CharPointer2 errptr);

    void lgraph_api_vertex_iterator_delete(VertexIterator it, SizetPointer n_in_edges, SizetPointer n_out_edges, CharPointer2 errptr);

    CharPointer lgraph_api_vertex_iterator_to_string(VertexIterator it);
}
