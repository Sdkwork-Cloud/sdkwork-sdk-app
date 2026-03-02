package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class BindApi {
    private final HttpClient client;
    
    public BindApi(HttpClient client) {
        this.client = client;
    }

    /** 绑定第三方账号 */
    public PlusApiResultVoid thirdPartyAccount(String platform, ThirdPartyBindForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/user/bind/" + platform + ""), body);
    }

    /** 解绑第三方账号 */
    public PlusApiResultVoid unbindThirdPartyAccount(String platform) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/user/bind/" + platform + ""));
    }
}
