package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.tugraphjavasdk.internal.type.Date;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFITypeFactory;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface DateFunc {
    DateFunc LIBRARY = FFITypeFactory.getLibrary(DateFunc.class);

    Date lgraph_api_create_date();

    Date lgraph_api_create_date_ymd(int year, int month, int day);

    Date lgraph_api_create_date_days(int day);

    int lgraph_api_date_days_since_epoch(Date obj);

    void lgraph_api_date_destroy(Date obj);
}
