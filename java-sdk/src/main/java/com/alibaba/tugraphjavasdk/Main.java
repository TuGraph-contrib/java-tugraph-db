package com.alibaba.tugraphjavasdk;

import com.alibaba.tugraphjavasdk.internal.DateFunc;
import com.alibaba.tugraphjavasdk.internal.type.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Date ptr = DateFunc.LIBRARY.lgraph_api_create_date_days(123);
        System.out.println("lgraph_api_date_days_since_epoch = " + DateFunc.LIBRARY.lgraph_api_date_days_since_epoch(ptr));
        DateFunc.LIBRARY.lgraph_api_date_destroy(ptr);
    }
}