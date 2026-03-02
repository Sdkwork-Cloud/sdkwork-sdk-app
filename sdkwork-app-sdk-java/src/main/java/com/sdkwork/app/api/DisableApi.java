package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class DisableApi {
    private final HttpClient client;
    
    public DisableApi(HttpClient client) {
        this.client = client;
    }

    /** 禁用组织 */
    public PlusApiResultOrganizationVO organization(String orgId) throws Exception {
        return (PlusApiResultOrganizationVO) client.post(ApiPaths.appPath("/organization/" + orgId + "/disable"), null);
    }
}
