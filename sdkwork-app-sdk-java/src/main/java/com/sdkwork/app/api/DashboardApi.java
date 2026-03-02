package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class DashboardApi {
    private final HttpClient client;
    
    public DashboardApi(HttpClient client) {
        this.client = client;
    }

    /** 完成待办 */
    public PlusApiResultVoid completeTodoItem(String todoId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/dashboard/todos/" + todoId + "/complete"), null);
    }

    /** 快捷入口 */
    public PlusApiResultListShortcutVO getShortcuts() throws Exception {
        return (PlusApiResultListShortcutVO) client.get(ApiPaths.appPath("/dashboard/shortcuts"));
    }

    /** 更新快捷入口 */
    public PlusApiResultVoid updateShortcuts(ShortcutsUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/dashboard/shortcuts"), body);
    }

    /** 领取成就奖励 */
    public PlusApiResultAchievementRewardVO claimAchievementReward(String achievementId) throws Exception {
        return (PlusApiResultAchievementRewardVO) client.post(ApiPaths.appPath("/dashboard/achievements/" + achievementId + "/claim"), null);
    }

    /** 今日热点 */
    public PlusApiResultListTrendingItemVO getTrendingItems(Map<String, Object> params) throws Exception {
        return (PlusApiResultListTrendingItemVO) client.get(ApiPaths.appPath("/dashboard/trending"), params);
    }

    /** 待办事项 */
    public PlusApiResultListTodoItemVO getTodoItems() throws Exception {
        return (PlusApiResultListTodoItemVO) client.get(ApiPaths.appPath("/dashboard/todos"));
    }

    /** 用户统计 */
    public PlusApiResultUserStatisticsVO getUserStatistics() throws Exception {
        return (PlusApiResultUserStatisticsVO) client.get(ApiPaths.appPath("/dashboard/statistics"));
    }

    /** 会员统计 */
    public PlusApiResultVipStatisticsVO getVipStatistics() throws Exception {
        return (PlusApiResultVipStatisticsVO) client.get(ApiPaths.appPath("/dashboard/statistics/vip"));
    }

    /** 使用统计 */
    public PlusApiResultUsageStatisticsVO getUsageStatistics(Map<String, Object> params) throws Exception {
        return (PlusApiResultUsageStatisticsVO) client.get(ApiPaths.appPath("/dashboard/statistics/usage"), params);
    }

    /** 存储统计 */
    public PlusApiResultStorageStatisticsVO getStorageStatistics() throws Exception {
        return (PlusApiResultStorageStatisticsVO) client.get(ApiPaths.appPath("/dashboard/statistics/storage"));
    }

    /** 生成统计 */
    public PlusApiResultGenerationStatisticsVO getGenerationStatistics(Map<String, Object> params) throws Exception {
        return (PlusApiResultGenerationStatisticsVO) client.get(ApiPaths.appPath("/dashboard/statistics/generations"), params);
    }

    /** 推荐内容 */
    public PlusApiResultListRecommendationVO getRecommendations(Map<String, Object> params) throws Exception {
        return (PlusApiResultListRecommendationVO) client.get(ApiPaths.appPath("/dashboard/recommendations"), params);
    }

    /** 数据概览 */
    public PlusApiResultMapStringObject getDataOverview() throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/dashboard/overview"));
    }

    /** 用户等级 */
    public PlusApiResultUserLevelVO getUserLevel() throws Exception {
        return (PlusApiResultUserLevelVO) client.get(ApiPaths.appPath("/dashboard/level"));
    }

    /** 首页数据 */
    public PlusApiResultHomeDashboardVO getHome() throws Exception {
        return (PlusApiResultHomeDashboardVO) client.get(ApiPaths.appPath("/dashboard/home"));
    }

    /** 图表数据 */
    public PlusApiResultChartDataVO getChartData(String chartType, Map<String, Object> params) throws Exception {
        return (PlusApiResultChartDataVO) client.get(ApiPaths.appPath("/dashboard/charts/" + chartType + ""), params);
    }

    /** 最近活动 */
    public PlusApiResultListRecentActivityVO getRecentActivities(Map<String, Object> params) throws Exception {
        return (PlusApiResultListRecentActivityVO) client.get(ApiPaths.appPath("/dashboard/activities"), params);
    }

    /** 成就列表 */
    public PlusApiResultListAchievementVO getAchievements() throws Exception {
        return (PlusApiResultListAchievementVO) client.get(ApiPaths.appPath("/dashboard/achievements"));
    }
}
