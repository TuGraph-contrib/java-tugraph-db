package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.tugraphjavasdk.internal.type.EdgeIndexIterator;
import com.alibaba.tugraphjavasdk.internal.type.EdgeUid;
import com.alibaba.tugraphjavasdk.internal.type.FieldData;
import com.alibaba.tugraphjavasdk.internal.type.VertexIndexIterator;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer2;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface EdgeIndexIteratorFunc {
    EdgeIndexIteratorFunc LIBRARY = FFITypeFactory.getLibrary(EdgeIndexIteratorFunc.class);

    void lgraph_api_edge_index_iterator_close(EdgeIndexIterator iter);

    void lgraph_api_edge_index_iterator_destroy(EdgeIndexIterator iter);

    boolean lgraph_api_edge_index_iterator_is_valid(EdgeIndexIterator iter);

    boolean lgraph_api_edge_index_iterator_next(EdgeIndexIterator iter, CharPointer2 errptr);

    FieldData lgraph_api_edge_index_iterator_get_index_value(EdgeIndexIterator iter, CharPointer2 errptr);

    EdgeUid lgraph_api_edge_index_iterator_get_uid(EdgeIndexIterator iter, CharPointer2 errptr);

    long lgraph_api_edge_index_iterator_get_src(EdgeIndexIterator iter, CharPointer2 errptr);

    long lgraph_api_edge_index_iterator_get_dst(EdgeIndexIterator iter, CharPointer2 errptr);

    short lgraph_api_edge_index_iterator_get_label_id(EdgeIndexIterator iter, CharPointer2 errptr);

    long lgraph_api_edge_index_iterator_get_edge_id(EdgeIndexIterator iter, CharPointer2 errptr);
}
