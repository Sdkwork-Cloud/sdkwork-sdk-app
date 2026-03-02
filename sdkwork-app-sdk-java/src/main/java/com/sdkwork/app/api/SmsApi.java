package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class SmsApi {
    private final HttpClient client;
    
    public SmsApi(HttpClient client) {
        this.client = client;
    }

    /** 验证验证码 */
    public PlusApiResultVerifyResultVO verifySmsCode(VerifyCodeCheckForm body) throws Exception {
        return (PlusApiResultVerifyResultVO) client.post(ApiPaths.appPath("/auth/sms/verify"), body);
    }

    /** 发送验证码 */
    public PlusApiResultVoid sendSmsCode(VerifyCodeSendForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/sms/send"), body);
    }
}
