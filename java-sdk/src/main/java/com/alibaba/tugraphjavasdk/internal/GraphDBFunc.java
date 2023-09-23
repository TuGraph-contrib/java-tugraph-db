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
public interface GraphDBFunc {
    GraphDBFunc LIBRARY = FFITypeFactory.getLibrary(GraphDBFunc.class);

    void lgraph_api_graph_db_close(GraphDB graphdb, CharPointer2 errptr);

    void lgraph_api_graph_db_destroy(GraphDB graphdb);

    Transaction lgraph_api_graph_db_create_read_txn(GraphDB graphdb, CharPointer2 errptr);

    Transaction lgraph_api_graph_db_create_write_txn(GraphDB graphdb, boolean optimistic, CharPointer2 errptr);

    Transaction lgraph_api_graph_db_fork_txn(GraphDB graphdb, Transaction txn, CharPointer2 errptr);

    void lgraph_api_graph_db_flush(GraphDB graphdb, CharPointer2 errptr);

    void lgraph_api_graph_db_drop_all_data(GraphDB graphdb, CharPointer2 errptr);

    void lgraph_api_graph_db_drop_all_vertex(GraphDB graphdb, CharPointer2 errptr);

    long lgraph_api_graph_db_estimate_num_vertices(GraphDB graphdb, CharPointer2 errptr);

    boolean lgraph_api_graph_db_add_vertex_label(GraphDB graphdb, CharPointer label,  FieldSpec2 fds, long fds_len, CharPointer primary_field, CharPointer2 errptr);

    boolean lgraph_api_graph_db_delete_vertex_label(GraphDB graphdb, CharPointer label, SizetPointer n_modified, CharPointer2 errptr);

    boolean lgraph_api_graph_db_alter_vertex_label_del_fields(GraphDB graphdb, CharPointer label, CharPointer2 del_fields, long del_fields_len, SizetPointer n_modified, CharPointer2 errptr);

    
    boolean lgraph_api_graph_db_alter_vertex_label_add_fields(GraphDB graphdb, CharPointer label, FieldSpec2 add_fields, long add_fields_len, FieldData2 default_values, long default_values_len, SizetPointer n_modified, CharPointer2 errptr);

    boolean lgraph_api_graph_db_alter_vertex_label_mod_fields(GraphDB graphdb, CharPointer label, FieldSpec2 mod_fields, long mod_fields_len, SizetPointer n_modified, CharPointer2 errptr);

    boolean lgraph_api_graph_db_add_edge_label(GraphDB graphdb, CharPointer label, FieldSpec2 fds, long fds_len, CharPointer temporal_field, CharPointer2 first_edge_constraints, CharPointer2 second_edge_constraints, long edge_constraints_len, CharPointer2 errptr);

    boolean lgraph_api_graph_db_delete_edge_label(GraphDB graphdb, CharPointer label, SizetPointer n_modified, CharPointer2 errptr);

    boolean lgraph_api_graph_db_alter_label_mod_edge_constraints(GraphDB graphdb, CharPointer label, CharPointer2 first_edge_constraints, CharPointer2 second_edge_constraints, long edge_constraints_len, CharPointer2 errptr);

    boolean lgraph_api_graph_db_alter_edge_label_del_fields(GraphDB graphdb, CharPointer label, CharPointer2 del_fields, long del_fields_len, SizetPointer n_modified, CharPointer2 errptr);

    boolean lgraph_api_graph_db_alter_edge_label_add_fields(GraphDB graphdb, CharPointer label, FieldSpec2 add_fields, long add_fields_len, FieldData2 default_values, long default_values_len, SizetPointer n_modified, CharPointer2 errptr);

    boolean lgraph_api_graph_db_alter_edge_label_mod_fields(GraphDB graphdb, CharPointer label, FieldSpec2 mod_fields, long mod_fields_len, SizetPointer n_modified, CharPointer2 errptr);

    boolean lgraph_api_graph_db_add_vertex_index(GraphDB graphdb, CharPointer label, CharPointer field, boolean is_unique, CharPointer2 errptr);

    // boolean lgraph_api_graph_db_add_edge_index(GraphDB graphdb, CharPointer label, CharPointer field, boolean is_unique, CharPointer2 errptr);
    boolean lgraph_api_graph_db_add_edge_index(GraphDB graphdb, CharPointer label, CharPointer field, boolean is_unique, boolean is_global, CharPointer2 errptr);

    boolean lgraph_api_graph_db_is_vertex_indexed(GraphDB graphdb, CharPointer label, CharPointer field, CharPointer2 errptr);

    boolean lgraph_api_graph_db_is_edge_indexed(GraphDB graphdb, CharPointer label, CharPointer field, CharPointer2 errptr);

    boolean lgraph_api_graph_db_delete_vertex_index(GraphDB graphdb, CharPointer label, CharPointer field, CharPointer2 errptr);

    boolean lgraph_api_graph_db_delete_edge_index(GraphDB graphdb, CharPointer label, CharPointer field, CharPointer2 errptr);

    CharPointer lgraph_api_graph_db_get_description(GraphDB graphdb, CharPointer2 errptr);

    long lgraph_api_graph_db_get_max_size(GraphDB graphdb, CharPointer2 errptr);

    boolean lgraph_api_graph_db_add_vertex_full_text_index(GraphDB graphdb, CharPointer vertex_label, CharPointer field, CharPointer2 errptr);

    boolean lgraph_api_graph_db_add_edge_full_text_index(GraphDB graphdb, CharPointer edge_label, CharPointer field, CharPointer2 errptr);

    boolean lgraph_api_graph_db_delete_vertex_full_text_index(GraphDB graphdb, CharPointer vertex_label, CharPointer field, CharPointer2 errptr);

    boolean lgraph_api_graph_db_delete_edge_full_text_index(GraphDB graphdb, CharPointer edge_label, CharPointer field, CharPointer2 errptr);

    void lgraph_api_graph_db_rebuild_full_text_index(GraphDB graphdb, CharPointer2 vertex_labels, long vertex_labels_len, CharPointer2 edge_labels, long edge_labels_len, CharPointer2 errptr);

    long lgraph_api_graph_db_list_full_text_indexes(GraphDB graphdb, BoolPointer2 is_vertex, CharPointer3 label_names, CharPointer3 property_names, CharPointer2 errptr);

    void lgraph_api_graph_db_list_full_text_indexes_destroy(BoolPointer2 is_vertex, CharPointer3 label_names, CharPointer3 property_names, long n);

    long lgraph_api_graph_db_query_vertex_by_full_text_index(GraphDB graphdb, CharPointer label, CharPointer query, int top_n, Int64Pointer2 vids, FloatPointer2 scores, CharPointer2 errptr);

    long lgraph_api_graph_db_query_edge_by_full_text_index(GraphDB graphdb, CharPointer label, CharPointer query, int top_n, EdgeUid3 euids, FloatPointer2 scores, CharPointer2 errptr);
}
