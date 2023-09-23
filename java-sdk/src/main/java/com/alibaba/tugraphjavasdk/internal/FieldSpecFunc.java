package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.*;
import com.alibaba.tugraphjavasdk.internal.type.FieldSpec;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface FieldSpecFunc {
    FieldSpecFunc LIBRARY = FFITypeFactory.getLibrary(FieldSpecFunc.class);

    FieldSpec lgraph_api_create_field_spec();

    FieldSpec lgraph_api_create_field_spec_name_type_optional(CharPointer name, int type, boolean optional);

    void lgraph_api_field_spec_destroy(FieldSpec fs);

    boolean lgraph_api_field_spec_eq(FieldSpec fs, FieldSpec other_fs);

    CharPointer lgraph_api_field_spec_to_string(FieldSpec fs);

    CharPointer lgraph_api_field_spec_get_name(FieldSpec fs);

    void lgraph_api_field_spec_set_name(FieldSpec fs, CharPointer name);

    int lgraph_api_field_spec_get_type(FieldSpec fs);

    void lgraph_api_field_spec_set_type(FieldSpec fs, int type);

    boolean lgraph_api_field_spec_get_optional(FieldSpec fs);

    void lgraph_api_field_spec_set_optional(FieldSpec fs, boolean optional);
}
