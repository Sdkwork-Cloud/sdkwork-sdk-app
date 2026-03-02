package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class PhoneApi {
    private final HttpClient client;
    
    public PhoneApi(HttpClient client) {
        this.client = client;
    }

    /** 手机号验证码登录 */
    public PlusApiResultLoginVO login(PhoneLoginForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/phone/login"), body);
    }
}
