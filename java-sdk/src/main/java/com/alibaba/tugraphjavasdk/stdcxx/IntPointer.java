package com.alibaba.tugraphjavasdk.stdcxx;

import com.alibaba.fastffi.*;

@FFIGen
@FFITypeAlias("int")
public interface IntPointer extends FFIPointer, CXXPointer {
    Factory factory = FFITypeFactory.getFactory(Factory.class, IntPointer.class);

    @CXXOperator("*&")
    double get();

    @CXXOperator("=")
    void SetValue(int value);

    @FFIFactory
    interface Factory {
        IntPointer create();
    }
}
