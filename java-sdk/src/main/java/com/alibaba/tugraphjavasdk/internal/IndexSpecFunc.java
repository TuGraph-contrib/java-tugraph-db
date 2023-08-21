package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.*;
import com.alibaba.tugraphjavasdk.internal.type.FieldSpec;
import com.alibaba.tugraphjavasdk.internal.type.IndexSpec;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface IndexSpecFunc {
    IndexSpecFunc LIBRARY = FFITypeFactory.getLibrary(IndexSpecFunc.class);

    IndexSpec lgraph_api_create_index_spec();

    void lgraph_api_index_spec_destroy(IndexSpec is);

    CharPointer lgraph_api_index_spec_get_label(IndexSpec is);

    CharPointer lgraph_api_index_spec_get_field(IndexSpec is);

    boolean lgraph_api_index_spec_get_unique(IndexSpec is);

    void lgraph_api_index_spec_set_label(IndexSpec is, CharPointer label);

    void lgraph_api_index_spec_set_field(IndexSpec is, CharPointer field);

    void lgraph_api_index_spec_set_unique(IndexSpec is, boolean unique);
}
