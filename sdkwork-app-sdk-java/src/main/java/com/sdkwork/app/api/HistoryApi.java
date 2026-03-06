package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class HistoryApi {
    private final HttpClient client;
    
    public HistoryApi(HttpClient client) {
        this.client = client;
    }

    /** 浏览历史 */
    public PlusApiResultPageBrowseHistoryVO listBrowse(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageBrowseHistoryVO) client.get(ApiPaths.appPath("/history/browse"), params);
    }

    /** 添加浏览记录 */
    public PlusApiResultVoid addBrowse(BrowseHistoryAddForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/history/browse"), body);
    }

    /** 清空浏览历史 */
    public PlusApiResultVoid clearBrowse(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/history/browse"), params);
    }

    /** 历史统计 */
    public PlusApiResultHistoryStatisticsVO getHistoryStatistics() throws Exception {
        return (PlusApiResultHistoryStatisticsVO) client.get(ApiPaths.appPath("/history/statistics"));
    }

    /** 浏览统计 */
    public PlusApiResultBrowseStatisticsVO getBrowseStatistics() throws Exception {
        return (PlusApiResultBrowseStatisticsVO) client.get(ApiPaths.appPath("/history/statistics/browse"));
    }

    /** 所有会话 */
    public PlusApiResultListSessionInfoVO listSessions() throws Exception {
        return (PlusApiResultListSessionInfoVO) client.get(ApiPaths.appPath("/history/sessions"));
    }

    /** 当前会话 */
    public PlusApiResultSessionInfoVO getCurrentSession() throws Exception {
        return (PlusApiResultSessionInfoVO) client.get(ApiPaths.appPath("/history/sessions/current"));
    }

    /** 操作历史 */
    public PlusApiResultPageOperationHistoryVO listOperation(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageOperationHistoryVO) client.get(ApiPaths.appPath("/history/operations"), params);
    }

    /** 最近操作 */
    public PlusApiResultListOperationHistoryVO getRecentOperations(Map<String, Object> params) throws Exception {
        return (PlusApiResultListOperationHistoryVO) client.get(ApiPaths.appPath("/history/operations/recent"), params);
    }

    /** 登录历史 */
    public PlusApiResultPageLoginHistoryVO listLogin(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageLoginHistoryVO) client.get(ApiPaths.appPath("/history/logins"), params);
    }

    /** 生成历史 */
    public PlusApiResultPageGenerationHistoryVO listGeneration(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationHistoryVO) client.get(ApiPaths.appPath("/history/generations"), params);
    }

    /** 清空生成历史 */
    public PlusApiResultVoid clearGeneration() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/history/generations"));
    }

    /** 最近生成 */
    public PlusApiResultListGenerationHistoryVO getRecentGenerations(Map<String, Object> params) throws Exception {
        return (PlusApiResultListGenerationHistoryVO) client.get(ApiPaths.appPath("/history/generations/recent"), params);
    }

    /** 终止会话 */
    public PlusApiResultVoid terminateSession(String sessionId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/history/sessions/" + sessionId + ""));
    }

    /** 终止其他会话 */
    public PlusApiResultVoid terminateOtherSessions() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/history/sessions/others"));
    }

    /** 删除生成历史 */
    public PlusApiResultVoid deleteGeneration(String historyId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/history/generations/" + historyId + ""));
    }

    /** 删除浏览记录 */
    public PlusApiResultVoid deleteBrowse(String historyId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/history/browse/" + historyId + ""));
    }

    /** 批量删除浏览记录 */
    public PlusApiResultVoid batchDeleteBrowse() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/history/browse/batch"));
    }
}
