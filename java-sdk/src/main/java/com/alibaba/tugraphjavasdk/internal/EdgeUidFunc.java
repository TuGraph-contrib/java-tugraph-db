package com.alibaba.tugraphjavasdk.internal;

import com.alibaba.fastffi.*;
import com.alibaba.tugraphjavasdk.internal.type.EdgeUid;
import com.alibaba.tugraphjavasdk.internal.type.IndexSpec;

@FFIGen(library = Names.LibraryName)
@FFILibrary(value = Names.LibraryName)
@CXXHead(Names.HeaderName)
public interface EdgeUidFunc {
    EdgeUidFunc LIBRARY = FFITypeFactory.getLibrary(EdgeUidFunc.class);

    EdgeUid lgraph_api_create_edge_euid(long src, long dst, short lid, long tid, long eid);

    void lgraph_api_edge_euid_destroy(EdgeUid euid);

    long lgraph_api_edge_euid_get_src(EdgeUid euid);

    long lgraph_api_edge_euid_get_dst(EdgeUid euid);

    short lgraph_api_edge_euid_get_lid(EdgeUid euid);

    long lgraph_api_edge_euid_get_tid(EdgeUid euid);

    long lgraph_api_edge_euid_get_eid(EdgeUid euid);

    void lgraph_api_edge_euid_set_src(EdgeUid euid, long src);

    void lgraph_api_edge_euid_set_dst(EdgeUid euid, long dst);

    void lgraph_api_edge_euid_set_lid(EdgeUid euid, short lid);

    void lgraph_api_edge_euid_set_tid(EdgeUid euid, long tid);

    void lgraph_api_edge_euid_set_eid(EdgeUid euid, long eid);

    void lgraph_api_edge_euid_reverse(EdgeUid euid);

    boolean lgraph_api_edge_euid_eq(EdgeUid euid, EdgeUid other_euid);

    boolean lgraph_api_edge_euid_out_less(EdgeUid euid, EdgeUid other_euid);

    boolean lgraph_api_edge_euid_in_less(EdgeUid euid, EdgeUid other_euid);

    FFIByteString lgraph_api_edge_euid_to_string(EdgeUid euid);
}
