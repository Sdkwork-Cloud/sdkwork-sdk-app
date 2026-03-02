package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AuthApi {
    private final HttpClient client;
    
    public AuthApi(HttpClient client) {
        this.client = client;
    }

    /** Request password reset challenge */
    public PlusApiResultVoid requestPasswordResetChallenge(PasswordResetRequestForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/password/reset/request"), body);
    }
}
