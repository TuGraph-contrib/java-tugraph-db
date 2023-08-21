package com.alibaba.tugraphjavasdk.stdcxx;

import com.alibaba.fastffi.*;

@FFIGen
@FFITypeAlias("jbyte")
public interface BytePointer extends FFIPointer, CXXPointer {
    Factory factory = FFITypeFactory.getFactory(Factory.class, BytePointer.class);

    @CXXOperator("*&")
    byte get();

    @CXXOperator("=")
    void SetValue(byte value);

    @FFIFactory
    interface Factory {
        BytePointer create();
    }
}
