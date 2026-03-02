package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class PositionApi {
    private final HttpClient client;
    
    public PositionApi(HttpClient client) {
        this.client = client;
    }

    /** 创建岗位 */
    public PlusApiResultPositionVO createPosition(PositionCreateForm body) throws Exception {
        return (PlusApiResultPositionVO) client.post(ApiPaths.appPath("/organization/position"), body);
    }

    /** 获取岗位详情 */
    public PlusApiResultPositionDetailVO getPosition(String posId) throws Exception {
        return (PlusApiResultPositionDetailVO) client.get(ApiPaths.appPath("/organization/position/" + posId + ""));
    }

    /** 获取子岗位 */
    public PlusApiResultListPositionVO getChildPositions(String posId) throws Exception {
        return (PlusApiResultListPositionVO) client.get(ApiPaths.appPath("/organization/position/" + posId + "/children"));
    }
}
