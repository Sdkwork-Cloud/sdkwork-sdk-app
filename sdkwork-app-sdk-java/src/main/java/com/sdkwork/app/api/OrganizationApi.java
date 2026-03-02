package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class OrganizationApi {
    private final HttpClient client;
    
    public OrganizationApi(HttpClient client) {
        this.client = client;
    }

    /** 创建组织 */
    public PlusApiResultOrganizationVO createOrganization(OrganizationCreateForm body) throws Exception {
        return (PlusApiResultOrganizationVO) client.post(ApiPaths.appPath("/organization"), body);
    }

    /** 获取组织详情 */
    public PlusApiResultOrganizationDetailVO getOrganization(String orgId) throws Exception {
        return (PlusApiResultOrganizationDetailVO) client.get(ApiPaths.appPath("/organization/" + orgId + ""));
    }
}
