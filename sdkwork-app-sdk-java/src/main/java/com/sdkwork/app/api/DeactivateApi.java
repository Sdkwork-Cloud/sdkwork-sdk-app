package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class DeactivateApi {
    private final HttpClient client;
    
    public DeactivateApi(HttpClient client) {
        this.client = client;
    }

    /** 注销账号 */
    public PlusApiResultVoid account(AccountDeactivateForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/user/deactivate"), body);
    }
}
