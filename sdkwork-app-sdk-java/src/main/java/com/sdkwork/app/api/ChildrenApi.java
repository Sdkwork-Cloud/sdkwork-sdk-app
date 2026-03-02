package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ChildrenApi {
    private final HttpClient client;
    
    public ChildrenApi(HttpClient client) {
        this.client = client;
    }

    /** 获取子组织 */
    public PlusApiResultListOrganizationVO getChildOrganizations(String orgId) throws Exception {
        return (PlusApiResultListOrganizationVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/children"));
    }
}
