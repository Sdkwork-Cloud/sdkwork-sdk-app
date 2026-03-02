package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class PositionsApi {
    private final HttpClient client;
    
    public PositionsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取组织的岗位列表 */
    public PlusApiResultListPositionVO getPositionsByOrg(String orgId) throws Exception {
        return (PlusApiResultListPositionVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/positions"));
    }

    /** 获取岗位树 */
    public PlusApiResultListPositionDetailVO getPositionTree(String orgId) throws Exception {
        return (PlusApiResultListPositionDetailVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/positions/tree"));
    }
}
