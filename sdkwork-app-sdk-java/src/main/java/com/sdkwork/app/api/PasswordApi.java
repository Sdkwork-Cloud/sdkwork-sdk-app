package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class PasswordApi {
    private final HttpClient client;
    
    public PasswordApi(HttpClient client) {
        this.client = client;
    }

    /** 修改密码 */
    public PlusApiResultVoid change(PasswordChangeForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/user/password"), body);
    }

    /** 重置密码 */
    public PlusApiResultVoid reset(PasswordResetForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/password/reset"), body);
    }
}
