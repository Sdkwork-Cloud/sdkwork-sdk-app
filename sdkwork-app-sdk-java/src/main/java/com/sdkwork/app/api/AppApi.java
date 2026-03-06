package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AppApi {
    private final HttpClient client;
    
    public AppApi(HttpClient client) {
        this.client = client;
    }

    /** 获取应用详情 */
    public PlusApiResultAppDetailVO getApp(String appId) throws Exception {
        return (PlusApiResultAppDetailVO) client.get(ApiPaths.appPath("/app/manage/" + appId + ""));
    }

    /** 更新应用 */
    public PlusApiResultAppVO updateApp(String appId, AppUpdateForm body) throws Exception {
        return (PlusApiResultAppVO) client.put(ApiPaths.appPath("/app/manage/" + appId + ""), body);
    }

    /** 删除应用 */
    public PlusApiResultVoid deleteApp(String appId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/app/manage/" + appId + ""));
    }

    /** 创建应用 */
    public PlusApiResultAppVO createApp(AppCreateForm body) throws Exception {
        return (PlusApiResultAppVO) client.post(ApiPaths.appPath("/app/manage"), body);
    }

    /** 停用应用 */
    public PlusApiResultVoid deactivate(String appId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/app/manage/" + appId + "/deactivate"), null);
    }

    /** 激活应用 */
    public PlusApiResultVoid activate(String appId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/app/manage/" + appId + "/activate"), null);
    }

    /** 检查发布就绪状态 */
    public PlusApiResultAppPublishReadinessVO checkPublishReadiness(String appId) throws Exception {
        return (PlusApiResultAppPublishReadinessVO) client.get(ApiPaths.appPath("/app/manage/" + appId + "/publish/readiness"));
    }

    /** 获取应用统计 */
    public PlusApiResultAppStatisticsVO getAppStatistics() throws Exception {
        return (PlusApiResultAppStatisticsVO) client.get(ApiPaths.appPath("/app/manage/statistics"));
    }

    /** 搜索应用 */
    public PlusApiResultPageAppVO searchApps(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAppVO) client.get(ApiPaths.appPath("/app/manage/search"), params);
    }

    /** 获取项目应用 */
    public PlusApiResultPageAppVO getProjectApps(String projectId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAppVO) client.get(ApiPaths.appPath("/app/manage/project/" + projectId + ""), params);
    }

    /** 获取我的应用 */
    public PlusApiResultPageAppVO getMyApps(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAppVO) client.get(ApiPaths.appPath("/app/manage/my"), params);
    }

    /** 获取账户余额汇总 */
    public PlusApiResultAccountSummaryVO getAccountSummary() throws Exception {
        return (PlusApiResultAccountSummaryVO) client.get(ApiPaths.appPath("/account/summary"));
    }
}
