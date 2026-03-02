package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class RefreshApi {
    private final HttpClient client;
    
    public RefreshApi(HttpClient client) {
        this.client = client;
    }

    /** 刷新令牌 */
    public PlusApiResultLoginVO token(TokenRefreshForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/refresh"), body);
    }
}
