package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class MemberApi {
    private final HttpClient client;
    
    public MemberApi(HttpClient client) {
        this.client = client;
    }

    /** 获取成员详情 */
    public PlusApiResultMemberVO getMember(String memberId) throws Exception {
        return (PlusApiResultMemberVO) client.get(ApiPaths.appPath("/organization/member/" + memberId + ""));
    }
}
