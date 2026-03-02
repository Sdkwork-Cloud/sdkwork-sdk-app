package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class LogoutApi {
    private final HttpClient client;
    
    public LogoutApi(HttpClient client) {
        this.client = client;
    }

    /** 用户登出 */
    public PlusApiResultVoid logout() throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/logout"), null);
    }
}
