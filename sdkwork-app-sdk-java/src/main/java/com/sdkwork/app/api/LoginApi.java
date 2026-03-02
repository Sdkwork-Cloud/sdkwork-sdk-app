package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class LoginApi {
    private final HttpClient client;
    
    public LoginApi(HttpClient client) {
        this.client = client;
    }

    /** 用户登录 */
    public PlusApiResultLoginVO login(LoginForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/login"), body);
    }
}
