package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ListApi {
    private final HttpClient client;
    
    public ListApi(HttpClient client) {
        this.client = client;
    }

    /** 获取组织列表 */
    public PlusApiResultPageOrganizationVO getOrganization(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageOrganizationVO) client.get(ApiPaths.appPath("/organization/list"), params);
    }
}
