package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CodeApi {
    private final HttpClient client;
    
    public CodeApi(HttpClient client) {
        this.client = client;
    }

    /** 根据编码获取组织 */
    public PlusApiResultOrganizationDetailVO getOrganizationBy(String code) throws Exception {
        return (PlusApiResultOrganizationDetailVO) client.get(ApiPaths.appPath("/organization/code/" + code + ""));
    }
}
