package com.alibaba.tugraphjavasdk.stdcxx;

import com.alibaba.fastffi.CXXOperator;
import com.alibaba.fastffi.CXXPointerRangeElement;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFITypeAlias;

@FFIGen
@FFITypeAlias("char")
public interface CharPointer extends CXXPointerRangeElement<CharPointer>{
    @CXXOperator("*&")
    byte get();

    @FFIFactory
    interface Factory {
        CharPointer create();
    }
}
