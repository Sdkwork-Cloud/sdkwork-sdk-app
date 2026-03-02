package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class StatisticsApi {
    private final HttpClient client;
    
    public StatisticsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取组织统计 */
    public PlusApiResultOrganizationStatisticsVO getOrganization() throws Exception {
        return (PlusApiResultOrganizationStatisticsVO) client.get(ApiPaths.appPath("/organization/statistics"));
    }
}
