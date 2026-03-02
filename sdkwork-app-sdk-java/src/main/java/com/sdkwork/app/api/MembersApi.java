package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class MembersApi {
    private final HttpClient client;
    
    public MembersApi(HttpClient client) {
        this.client = client;
    }

    /** 获取组织成员 */
    public PlusApiResultPageMemberVO getMembersByOrg(String orgId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageMemberVO) client.get(ApiPaths.appPath("/organization/" + orgId + "/members"), params);
    }
}
