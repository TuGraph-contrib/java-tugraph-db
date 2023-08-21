package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.*;
import com.alibaba.tugraphjavasdk.internal.type.RoleInfo;
import com.alibaba.tugraphjavasdk.internal.type.UserInfo;
import com.alibaba.tugraphjavasdk.stdcxx.*;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface RoleInfoFunc {
    RoleInfoFunc LIBRARY = FFITypeFactory.getLibrary(RoleInfoFunc.class);

    RoleInfo lgraph_api_create_role_info();

    void lgraph_api_role_info_destroy(RoleInfo ri);

    CharPointer lgraph_api_role_info_get_desc(RoleInfo ri);

    /* if graph_name not exist, return -1 */
    int lgraph_api_role_info_get_access_level(RoleInfo ri, CharPointer graph_name);

    long lgraph_api_role_info_get_graph_access(RoleInfo ri, CharPointer3 graph_names, IntPointer2 access_levels);

    void lgraph_api_role_info_destroy_graph_access(CharPointer2 graph_names, IntPointer access_levels, long n);

    boolean lgraph_api_role_info_get_disabled(RoleInfo ri);

    void lgraph_api_role_info_set_desc(RoleInfo ri, CharPointer desc);

    boolean lgraph_api_role_info_add_access_level(RoleInfo ri, CharPointer graph, int access_level);

    void lgraph_api_role_info_set_graph_access(RoleInfo ri, CharPointer2 graph_names, IntPointer access_levels, long n);

    /* if graph_name not exist, return -1 */
    int lgraph_api_role_info_del_access_level(RoleInfo ri, CharPointer graph_name);

    void lgraph_api_role_info_set_disabled(RoleInfo ri, boolean disabled);
}
