package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.tugraphjavasdk.internal.type.DateTime;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface DateTimeFunc {
    DateTimeFunc LIBRARY = FFITypeFactory.getLibrary(DateTimeFunc.class);

    DateTime lgraph_api_create_date_time();

    DateTime lgraph_api_create_date_time_ymdhms(int year, int month, int day, int hour, int minute, int second);

    DateTime lgraph_api_create_date_time_seconds(long seconds_since_epoch);

    long lgraph_api_date_time_seconds_since_epoch(DateTime obj);

    void lgraph_api_date_time_destroy(DateTime obj);
}
