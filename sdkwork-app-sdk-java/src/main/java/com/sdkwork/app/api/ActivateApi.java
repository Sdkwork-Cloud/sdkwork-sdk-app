package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ActivateApi {
    private final HttpClient client;
    
    public ActivateApi(HttpClient client) {
        this.client = client;
    }

    /** 激活组织 */
    public PlusApiResultOrganizationVO organization(String orgId) throws Exception {
        return (PlusApiResultOrganizationVO) client.post(ApiPaths.appPath("/organization/" + orgId + "/activate"), null);
    }
}
