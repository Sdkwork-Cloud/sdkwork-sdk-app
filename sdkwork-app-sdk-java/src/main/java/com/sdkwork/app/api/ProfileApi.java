package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ProfileApi {
    private final HttpClient client;
    
    public ProfileApi(HttpClient client) {
        this.client = client;
    }

    /** 获取用户信息 */
    public PlusApiResultUserProfileVO getUser() throws Exception {
        return (PlusApiResultUserProfileVO) client.get(ApiPaths.appPath("/user/profile"));
    }

    /** 更新用户信息 */
    public PlusApiResultUserProfileVO updateUser(UserProfileUpdateForm body) throws Exception {
        return (PlusApiResultUserProfileVO) client.put(ApiPaths.appPath("/user/profile"), body);
    }
}
