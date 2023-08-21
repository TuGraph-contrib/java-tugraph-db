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
public interface VertexIndexIteratorFunc {
    VertexIndexIteratorFunc LIBRARY = FFITypeFactory.getLibrary(VertexIndexIteratorFunc.class);

    void lgraph_api_vertex_index_iterator_destroy(VertexIndexIterator it);

    void lgraph_api_vertex_index_iterator_close(VertexIndexIterator it);

    boolean lgraph_api_vertex_index_iterator_is_valid(VertexIndexIterator it);

    boolean lgraph_api_vertex_index_iterator_next(VertexIndexIterator it, CharPointer2 errptr);

    FieldData lgraph_api_vertex_index_iterator_get_index_value(VertexIndexIterator it, CharPointer2 errptr);

    long lgraph_api_vertex_index_iterator_get_vid(VertexIndexIterator it, CharPointer2 errptr);
}
