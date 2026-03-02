package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class OauthApi {
    private final HttpClient client;
    
    public OauthApi(HttpClient client) {
        this.client = client;
    }

    /** OAuth授权URL */
    public PlusApiResultOAuthUrlVO getOauthUrl(OAuthAuthUrlForm body) throws Exception {
        return (PlusApiResultOAuthUrlVO) client.post(ApiPaths.appPath("/auth/oauth/url"), body);
    }

    /** OAuth登录 */
    public PlusApiResultLoginVO login(OAuthLoginForm body) throws Exception {
        return (PlusApiResultLoginVO) client.post(ApiPaths.appPath("/auth/oauth/login"), body);
    }
}
