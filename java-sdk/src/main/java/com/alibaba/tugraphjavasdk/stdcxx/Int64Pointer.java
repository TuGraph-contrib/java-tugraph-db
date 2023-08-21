package com.alibaba.tugraphjavasdk.stdcxx;

import com.alibaba.fastffi.*;

@FFIGen
@FFITypeAlias("int64_t")
@CXXHead(system="cstdint")
public interface Int64Pointer extends FFIPointer, CXXPointer {
    Factory factory = FFITypeFactory.getFactory(Factory.class, Int64Pointer.class);

    @CXXOperator("*&")
    double get();

    @CXXOperator("=")
    void SetValue(long value);

    @FFIFactory
    interface Factory {
        Int64Pointer create();
    }
}
