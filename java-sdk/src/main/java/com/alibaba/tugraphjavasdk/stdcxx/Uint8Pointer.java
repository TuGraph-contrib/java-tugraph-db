package com.alibaba.tugraphjavasdk.stdcxx;

import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.*;

@FFIGen
@FFITypeAlias("uint8_t")
@CXXHead(system="cstdint")
public interface Uint8Pointer extends FFIPointer {
}
