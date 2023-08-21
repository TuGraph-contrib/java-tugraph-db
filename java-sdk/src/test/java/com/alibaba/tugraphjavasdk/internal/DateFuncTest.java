package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.tugraphjavasdk.internal.DateFunc;
import com.alibaba.tugraphjavasdk.internal.type.Date;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFuncTest {
    @Test
    public void test_lgraph_api_create_date() {
        Date obj = null;
        try {
            obj = DateFunc.LIBRARY.lgraph_api_create_date();
            assertNotNull(obj);
        } finally {
            DateFunc.LIBRARY.lgraph_api_date_destroy(obj);
            obj = null;
        }
    }

    @Test
    public void test_lgraph_api_create_date_ymd() {
        Date obj = null;
        try {
            obj = DateFunc.LIBRARY.lgraph_api_create_date_ymd(2023, 7, 25);
            int span = DateFunc.LIBRARY.lgraph_api_date_days_since_epoch(obj);
            assertEquals(19563, span); //On 20230725, there were a total of 19563 days from 19700101
        } finally {
            DateFunc.LIBRARY.lgraph_api_date_destroy(obj);
            obj = null;
        }
    }

    @Test
    public void test_lgraph_api_create_date_days() {
        Date obj = null;
        try {
            obj = DateFunc.LIBRARY.lgraph_api_create_date_days(1234);
            int span = DateFunc.LIBRARY.lgraph_api_date_days_since_epoch(obj);
            assertEquals(1234, span);
        } finally {
            DateFunc.LIBRARY.lgraph_api_date_destroy(obj);
            obj = null;
        }
    }

    @Test
    public void test_lgraph_api_date_days_since_epoch() {
        Date obj = null;
        try {
            obj = DateFunc.LIBRARY.lgraph_api_create_date_ymd(2023, 7, 25);
            int span = DateFunc.LIBRARY.lgraph_api_date_days_since_epoch(obj);
            assertEquals(19563, span); //On 20230725, there were a total of 19563 days from 19700101
        } finally {
            DateFunc.LIBRARY.lgraph_api_date_destroy(obj);
            obj = null;
        }
    }

    @Test
    public void test_lgraph_api_date_destroy() {
    }
}
