package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.*;
import com.alibaba.tugraphjavasdk.internal.type.Date;
import com.alibaba.tugraphjavasdk.internal.type.DateTime;
import com.alibaba.tugraphjavasdk.internal.type.FieldData;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer;
import com.alibaba.tugraphjavasdk.stdcxx.Uint8Pointer;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface FieldDataFunc {
    FieldDataFunc LIBRARY = FFITypeFactory.getLibrary(FieldDataFunc.class);

    FieldData lgraph_api_create_field_data();

    FieldData lgraph_api_create_field_data_bool(boolean v);

    FieldData lgraph_api_create_field_data_int8(byte v);

    FieldData lgraph_api_create_field_data_int16(short v);

    FieldData lgraph_api_create_field_data_int32(int v);

    FieldData lgraph_api_create_field_data_int64(long v);

    FieldData lgraph_api_create_field_data_float(float v);

    FieldData lgraph_api_create_field_data_double(double v);

    FieldData lgraph_api_create_field_data_date(Date v);

    FieldData lgraph_api_create_field_data_date_time(DateTime v);

    FieldData lgraph_api_create_field_data_str(CharPointer v);

    FieldData lgraph_api_create_field_data_str_len(CharPointer v, long len);

    FieldData lgraph_api_create_field_data_blob(Uint8Pointer v, long len);

    FieldData lgraph_api_create_field_data_base64_blob(Uint8Pointer v, long len);

    FieldData lgraph_api_create_field_data_clone(FieldData fd);

    void lgraph_api_create_field_data_clone_from(FieldData fd, FieldData other_fd);

    void lgraph_api_field_data_destroy(FieldData fd);

    long lgraph_api_field_data_integer(FieldData fd);

    double lgraph_api_field_data_real(FieldData fd);

    CharPointer lgraph_api_field_data_str(FieldData fd);

    boolean lgraph_api_field_data_as_bool(FieldData fd);

    byte lgraph_api_field_data_as_int8(FieldData fd);

    short lgraph_api_field_data_as_int16(FieldData fd);

    int lgraph_api_field_data_as_int32(FieldData fd);

    long lgraph_api_field_data_as_int64(FieldData fd);

    float lgraph_api_field_data_as_float(FieldData fd);

    double lgraph_api_field_data_as_double(FieldData fd);

    Date lgraph_api_field_data_as_date(FieldData fd);

    DateTime lgraph_api_field_data_as_date_time(FieldData fd);

    FFIByteString lgraph_api_field_data_as_str(FieldData fd);

    FFIByteString lgraph_api_field_data_as_blob(FieldData fd);

    FFIByteString lgrpah_api_field_data_as_blob_base64(FieldData fd);

    FFIByteString lgraph_api_field_data_to_string(FieldData fd);

    boolean lgraph_api_field_data_eq(FieldData fd, FieldData other_fd);

    boolean lgraph_api_field_data_not_eq(FieldData fd, FieldData other_fd);

    boolean lgraph_api_field_data_greater_than(FieldData fd, FieldData other_fd);

    boolean lgraph_api_field_data_greater_eq_than(FieldData fd, FieldData other_fd);

    boolean lgraph_api_field_data_less_than(FieldData fd, FieldData other_fd);

    boolean lgraph_api_field_data_less_eq_than(FieldData fd, FieldData other_fd);

    int lgraph_api_field_data_get_type(FieldData obj);

    boolean lgraph_api_field_data_is_null(FieldData obj);

    boolean lgraph_api_field_data_is_buf(FieldData obj);

    boolean lgraph_api_field_data_is_empty_buf(FieldData obj);

    boolean lgraph_api_field_data_is_bool(FieldData obj);

    boolean lgraph_api_field_data_is_blob(FieldData obj);

    boolean lgraph_api_field_data_is_string(FieldData obj);

    boolean lgraph_api_field_data_is_int8(FieldData obj);

    boolean lgraph_api_field_data_is_int16(FieldData obj);

    boolean lgraph_api_field_data_is_int32(FieldData obj);

    boolean lgraph_api_field_data_is_int64(FieldData obj);

    boolean lgraph_api_field_data_is_float(FieldData obj);

    boolean lgraph_api_field_data_is_double(FieldData obj);

    boolean lgraph_api_field_data_is_real(FieldData obj);

    boolean lgraph_api_field_data_is_date(FieldData obj);

    boolean lgraph_api_field_data_is_date_time(FieldData obj);
}
