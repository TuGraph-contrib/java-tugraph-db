package com.alibaba.tugraphjavasdk.stdcxx;

import com.alibaba.fastffi.CXXOperator;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;

@FFIGen
@FFITypeAlias("double")
public interface DoublePointer extends FFIPointer, CXXPointer {
    Factory factory = FFITypeFactory.getFactory(Factory.class, DoublePointer.class);

    @CXXOperator("*&")
    double get();

    @CXXOperator("=")
    void SetValue(double value);

    @FFIFactory
    interface Factory {
        DoublePointer create();
    }
}
