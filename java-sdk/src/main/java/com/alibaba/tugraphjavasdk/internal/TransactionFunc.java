// package com.alibaba.tugraphjavasdk.internal;

// import com.alibaba.fastffi.CXXHead;
// import com.alibaba.fastffi.FFIGen;
// import com.alibaba.fastffi.FFILibrary;
// import com.alibaba.fastffi.FFITypeFactory;
// import com.alibaba.tugraphjavasdk.internal.type.*;
// import com.alibaba.tugraphjavasdk.stdcxx.*;

// @FFIGen(library = Names.LibraryName)
// @FFILibrary(value = Names.LibraryName)
// @CXXHead(Names.HeaderName)
// public interface TransactionFunc {
//     TransactionFunc LIBRARY = FFITypeFactory.getLibrary(TransactionFunc.class);

//     void lgraph_api_transaction_destroy(Transaction txn);

//     void lgraph_api_transaction_commit(Transaction txn, CharPointer2 errptr);

//     void lgraph_api_transaction_abort(Transaction txn, CharPointer2 errptr);

//     boolean lgraph_api_transaction_is_valid(Transaction txn);

//     boolean lgraph_api_transaction_is_read_only(Transaction txn);

//     VertexIterator lgraph_api_transaction_get_vertex_iterator(Transaction txn, CharPointer2 errptr);

//     VertexIterator lgraph_api_transaction_get_vertex_iterator_by_vid(Transaction txn, long vid, boolean nearest, CharPointer2 errptr);

//     OutEdgeIterator lgraph_api_transaction_get_out_edge_iterator_by_euid(Transaction txn, EdgeUid euid, boolean nearest, CharPointer2 errptr);

//     OutEdgeIterator lgraph_api_transaction_get_out_edge_iterator_by_src_dst_lid(Transaction txn, long src, long dst, short lid, CharPointer2 errptr);

//     InEdgeIterator lgraph_api_transaction_get_in_edge_iterator_by_euid(Transaction txn, EdgeUid euid, boolean nearest, CharPointer2 errptr);

//     InEdgeIterator lgraph_api_transaction_get_in_edge_iterator_by_src_dst_lid(Transaction txn, long src, long dst, short lid, CharPointer2 errptr);

//     long lgraph_api_transaction_get_num_vertex_labels(Transaction txn, CharPointer2 errptr);

//     long lgraph_api_transaction_get_num_edge_labels(Transaction txn, CharPointer2 errptr);

//     long lgraph_api_transaction_list_vertex_labels(Transaction txn, CharPointer3 labels, CharPointer2 errptr);

//     long lgraph_api_transaction_list_edge_labels(Transaction txn, CharPointer3 labels, CharPointer2 errptr);

//     void lgraph_api_transaction_list_labels_destroy(CharPointer2 labels, long n);

//     long lgraph_api_transaction_get_vertex_label_id(Transaction txn, CharPointer label, CharPointer2 errptr);

//     long lgraph_api_transaction_get_edge_label_id(Transaction txn, CharPointer label, CharPointer2 errptr);

//     long lgraph_api_transaction_get_vertex_schema(Transaction txn, CharPointer label, FieldSpec3 field_specs, CharPointer2 errptr);

//     long lgraph_api_transaction_get_edge_schema(Transaction txn, CharPointer label, FieldSpec3 field_specs, CharPointer2 errptr);

//     long lgraph_api_transaction_get_vertex_field_id(Transaction txn, long label_id, CharPointer field_name, CharPointer2 errptr);

//     long lgraph_api_transaction_get_vertex_field_ids(Transaction txn, long label_id, CharPointer2 field_names, long field_names_size, SizetPointer2 field_ids, CharPointer2 errptr);

//     long lgraph_api_transaction_get_edge_field_id(Transaction txn, long label_id, CharPointer field_name, CharPointer2 errptr);

//     size_t lgraph_api_transaction_get_edge_field_ids(lgraph_api_transaction_t* txn, size_t label_id, const char** field_names, size_t field_names_size, size_t** field_ids, char** errptr);
//     long lgraph_api_transaction_get_edge_field_ids(Transaction txn, long label_id, CharPointer2 field_names, long field_names_size, SizetPointer2 field_ids, CharPointer2 errptr);

//     long lgraph_api_transaction_add_vertex_with_value_strings(Transaction txn, CharPointer label_name, CharPointer2 field_names, long field_names_size, CharPointer2 field_value_strings, long field_value_strings_size, CharPointer2 errptr);

//     long lgraph_api_transaction_add_vertex_with_field_data(Transaction txn, CharPointer label_name, CharPointer2 field_names, long field_names_size, FieldData2 field_values, long field_values_size, CharPointer2 errptr);

//     long lgraph_api_transaction_add_vertex_with_field_data_and_id(Transaction txn, long label_id, SizetPointer field_ids, long field_ids_size, FieldData2 field_values, long field_values_size, CharPointer2 errptr);

//     EdgeUid lgraph_api_transaction_add_edge_with_field_data(Transaction txn, long src, long dst, CharPointer label, CharPointer2 field_names, long field_names_size, FieldData2 field_values, long field_values_size, CharPointer2 errptr);

//     EdgeUid lgraph_api_transaction_add_edge_with_value_strings(Transaction txn, long src, long dst, CharPointer label, CharPointer2 field_names, long field_names_size, CharPointer2 field_value_strings, long field_value_strings_size, CharPointer2 errptr);

//     EdgeUid lgraph_api_transaction_add_edge_with_field_data_and_id(Transaction txn, long src, long dst, long label_id, SizetPointer field_ids, long field_ids_size, FieldData2 field_values, long field_values_size, CharPointer2 errptr);

//     boolean lgraph_api_transaction_upsert_edge_with_value_strings(Transaction txn, long src, long dst, CharPointer label, CharPointer2 field_names, long field_names_size, CharPointer2 field_value_strings, long field_value_strings_size, CharPointer2 errptr);

//     boolean lgraph_api_transaction_upsert_edge_with_field_data(Transaction txn, long src, long dst, CharPointer label, CharPointer2 field_names, long field_names_size, FieldData2 field_values, long field_values_size, CharPointer2 errptr);

//     boolean lgraph_api_transaction_upsert_edge_with_field_data_and_id(Transaction txn, long src, long dst, long label_id, SizetPointer field_ids, long field_ids_size, FieldData2 field_values, long field_values_size, CharPointer2 errptr);

//     long lgraph_api_transaction_list_vertex_indexes(Transaction txn, IndexSpec3 indexes, CharPointer2 errptr);

//     long lgraph_api_transaction_list_edge_indexes(Transaction txn, IndexSpec3 indexes, CharPointer2 errptr);

//     void lgraph_api_list_indexes_detroy(IndexSpec2 indexes, long n);

//     VertexIndexIterator lgraph_api_transaction_get_vertex_index_iterator_by_id(Transaction txn, long label_id, long field_id, FieldData key_start, FieldData key_end, CharPointer2 errptr);

//     EdgeIndexIterator lgraph_api_transaction_get_edge_index_iterator_by_id(Transaction txn, long label_id, long field_id, FieldData key_start, FieldData key_end, CharPointer2 errptr);

//     VertexIndexIterator lgraph_api_transaction_get_vertex_index_iterator_by_data(Transaction txn, CharPointer label, CharPointer field, FieldData key_start, FieldData key_end, CharPointer2 errptr);

//     EdgeIndexIterator lgraph_api_transaction_get_edge_index_iterator_by_data(Transaction txn, CharPointer label, CharPointer field, FieldData key_start, FieldData key_end, CharPointer2 errptr);

//     VertexIndexIterator lgraph_api_transaction_get_vertex_index_iterator_by_value_string(Transaction txn, CharPointer label, CharPointer field, CharPointer key_start, CharPointer key_end, CharPointer2 errptr);

//     EdgeIndexIterator lgraph_api_transaction_get_edge_index_iterator_by_value_string(Transaction txn, CharPointer label, CharPointer field, CharPointer key_start, CharPointer key_end, CharPointer2 errptr);

//     boolean lgraph_api_transaction_is_vertex_indexed(Transaction txn, CharPointer label, CharPointer field, CharPointer2 errptr);

//     boolean lgraph_api_transaction_is_edge_indexed(Transaction txn, CharPointer label, CharPointer field, CharPointer2 errptr);

//     VertexIterator lgraph_api_transaction_get_vertex_by_unique_index_value_string(Transaction txn, CharPointer label_name, CharPointer field_name, CharPointer field_value_string, CharPointer2 errptr);

//     OutEdgeIterator lgraph_api_transaction_get_edge_by_unique_index_value_string(Transaction txn, CharPointer label_name, CharPointer field_name, CharPointer field_value_string, CharPointer2 errptr);

//     VertexIterator lgraph_api_transaction_get_vertex_by_unique_index_with_data(Transaction txn, CharPointer label_name, CharPointer field_name, FieldData field_value, CharPointer2 errptr);

//     OutEdgeIterator lgraph_api_transaction_get_edge_by_unique_index_with_data(Transaction txn, CharPointer label_name, CharPointer field_name, FieldData field_value, CharPointer2 errptr);

//     VertexIterator lgraph_api_transaction_get_vertex_by_unique_index_with_id(Transaction txn, long label_id, long field_id, FieldData field_value, CharPointer2 errptr);

//     OutEdgeIterator lgraph_api_transaction_get_edge_by_unique_index_with_id(Transaction txn, long label_id, long field_id, FieldData field_value, CharPointer2 errptr);

//     long lgraph_api_transaction_get_num_vertices(Transaction txn, CharPointer2 errptr);

//     CharPointer lgraph_api_transaction_get_vertex_primary_field(Transaction txn, CharPointer label, CharPointer2 errptr);
// }
