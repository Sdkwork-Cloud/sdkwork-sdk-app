package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class RegisterApi {
    private final HttpClient client;
    
    public RegisterApi(HttpClient client) {
        this.client = client;
    }

    /** 用户注册 */
    public PlusApiResultUserInfoVO register(RegisterForm body) throws Exception {
        return (PlusApiResultUserInfoVO) client.post(ApiPaths.appPath("/auth/register"), body);
    }
}
