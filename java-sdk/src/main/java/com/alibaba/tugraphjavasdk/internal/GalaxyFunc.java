package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.tugraphjavasdk.internal.type.*;
import com.alibaba.tugraphjavasdk.stdcxx.*;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface GalaxyFunc {
    GalaxyFunc LIBRARY = FFITypeFactory.getLibrary(GalaxyFunc.class);

    Galaxy lgraph_api_galaxy_create(CharPointer dir, boolean durable, boolean create_if_not_exist, CharPointer2 errptr);

    Galaxy lgraph_api_galaxy_create_with_user(CharPointer dir, CharPointer user, CharPointer password, boolean durable, boolean create_if_not_exist, CharPointer2 errptr);

    void lgraph_api_galaxy_destroy(Galaxy galaxy);

    void lgraph_api_galaxy_set_current_user(Galaxy galaxy, CharPointer user, CharPointer password, CharPointer2 errptr);

    void lgraph_api_galaxy_set_user(Galaxy galaxy, CharPointer user, CharPointer2 errptr);

    boolean lgraph_api_galaxy_create_graph(Galaxy galaxy, CharPointer graph_name, CharPointer description, long max_size, CharPointer2 errptr);

    boolean lgraph_api_galaxy_delete_graph(Galaxy galaxy, CharPointer graph_name, CharPointer2 errptr);

    boolean lgraph_api_galaxy_mod_graph(Galaxy galaxy, CharPointer graph_name, boolean mod_desc, CharPointer desc, boolean mod_size, long new_max_size, CharPointer2 errptr);

    long lgraph_api_galaxy_list_graphs(Galaxy galaxy, CharPointer3 graph_names, CharPointer3 graph_descs, SizetPointer2 graph_sizes, CharPointer2 errptr);

    boolean lgraph_api_galaxy_create_user(Galaxy galaxy, CharPointer user, CharPointer password, CharPointer desc, CharPointer2 errptr);

    boolean lgraph_api_galaxy_delete_user(Galaxy galaxy, CharPointer user, CharPointer2 errptr);

    boolean lgraph_api_galaxy_set_password(Galaxy galaxy, CharPointer user, CharPointer old_password, CharPointer new_password, CharPointer2 errptr);

    boolean lgraph_api_galaxy_set_user_desc(Galaxy galaxy, CharPointer user, CharPointer desc, CharPointer2 errptr);

    boolean lgraph_api_galaxy_set_user_roles(Galaxy galaxy, CharPointer user, CharPointer2 roles, long num_roles, CharPointer2 errptr);

    boolean lgraph_api_galaxy_set_user_graph_access(Galaxy galaxy, CharPointer user, CharPointer graph, int access, CharPointer2 errptr);

    boolean lgraph_api_galaxy_disable_user(Galaxy galaxy, CharPointer user, CharPointer2 errptr);

    boolean lgraph_api_galaxy_enable_user(Galaxy galaxy, CharPointer user, CharPointer2 errptr);

    long lgraph_api_galaxy_list_users(Galaxy galaxy, CharPointer3 user_names, UserInfo3 user_infos, CharPointer2 errptr);

    void lgraph_api_galaxy_list_users_destroy(CharPointer2 user_names, UserInfo2 user_infos, long num_users);

    UserInfo lgraph_api_galaxy_get_user_info(Galaxy galaxy, CharPointer user, CharPointer2 errptr);

    boolean lgraph_api_galaxy_create_role(Galaxy galaxy, CharPointer role, CharPointer desc, CharPointer2 errptr);

    boolean lgraph_api_galaxy_delete_role(Galaxy galaxy, CharPointer role, CharPointer2 errptr);

    boolean lgraph_api_galaxy_disable_role(Galaxy galaxy, CharPointer role, CharPointer2 errptr);

    boolean lgraph_api_galaxy_enable_role(Galaxy galaxy, CharPointer role, CharPointer2 errptr);

    boolean lgraph_api_galaxy_set_role_desc(Galaxy galaxy, CharPointer role, CharPointer desc, CharPointer2 errptr);

    boolean lgraph_api_galaxy_set_role_access_rights(Galaxy galaxy, CharPointer role, CharPointer2 graph_names, IntPointer access_levels, long num_graphs, CharPointer2 errptr);

    boolean lgraph_api_galaxy_set_role_access_rights_incremental(Galaxy galaxy, CharPointer role, CharPointer2 graph_names, IntPointer access_levels, long num_graphs, CharPointer2 errptr);

    RoleInfo lgraph_api_galaxy_get_role_info(Galaxy galaxy, CharPointer role, CharPointer2 errptr);

    long lgraph_api_galaxy_list_roles(Galaxy galaxy, CharPointer3 role_names, RoleInfo3 role_info, CharPointer2 errptr);

    int lgraph_api_galaxy_get_access_level(Galaxy galaxy, CharPointer user, CharPointer graph, CharPointer2 errptr);

    GraphDB lgraph_api_galaxy_open_graph(Galaxy galaxy, CharPointer graph, boolean read_only, CharPointer2 errptr);

    void lgraph_api_galaxy_close(Galaxy galaxy, CharPointer2 errptr);
}
