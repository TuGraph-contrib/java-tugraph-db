package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.*;
import com.alibaba.tugraphjavasdk.internal.type.EdgeUid;
import com.alibaba.tugraphjavasdk.internal.type.UserInfo;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer2;
import com.alibaba.tugraphjavasdk.stdcxx.CharPointer3;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface UserInfoFunc {
    UserInfoFunc LIBRARY = FFITypeFactory.getLibrary(UserInfoFunc.class);

    UserInfo lgraph_api_create_user_info();

    void lgraph_api_user_info_destroy(UserInfo ui);

    CharPointer lgraph_api_user_info_get_desc(UserInfo ui);

    long lgraph_api_user_info_get_roles(UserInfo ui, CharPointer3 roles);

    void lgraph_api_user_info_destroy_roles(CharPointer2 roles, long n);

    boolean lgraph_api_user_info_get_disable(UserInfo ui);

    long lgraph_api_user_info_get_memory_limit(UserInfo ui);

    void lgraph_api_user_info_set_desc(UserInfo ui, CharPointer desc);

    void lgraph_api_user_info_add_role(UserInfo ui, CharPointer role);

    void lgraph_api_user_info_set_roles(UserInfo ui, CharPointer2 roles, long n);

    int lgraph_api_user_info_del_role(UserInfo ui, CharPointer role);

    void lgraph_api_user_info_set_disable(UserInfo ui, boolean disable);

    void lgraph_api_user_info_set_memory_limit(UserInfo ui, long memory_limit);
}
