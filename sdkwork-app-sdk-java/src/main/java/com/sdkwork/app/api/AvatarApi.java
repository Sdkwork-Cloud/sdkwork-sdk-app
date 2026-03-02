package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AvatarApi {
    private final HttpClient client;
    
    public AvatarApi(HttpClient client) {
        this.client = client;
    }

    /** 上传头像 */
    public PlusApiResultMapStringString upload(UploadAvatarRequest body) throws Exception {
        return (PlusApiResultMapStringString) client.post(ApiPaths.appPath("/user/avatar"), body);
    }
}
