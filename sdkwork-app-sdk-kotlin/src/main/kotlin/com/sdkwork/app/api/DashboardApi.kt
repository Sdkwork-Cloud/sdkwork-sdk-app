package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class DashboardApi(private val client: HttpClient) {

    /** 完成待办 */
    suspend fun completeTodoItem(todoId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/dashboard/todos/$todoId/complete"), null) as? PlusApiResultVoid
    }

    /** 快捷入口 */
    suspend fun getShortcuts(): PlusApiResultListShortcutVO? {
        return client.get(ApiPaths.appPath("/dashboard/shortcuts")) as? PlusApiResultListShortcutVO
    }

    /** 更新快捷入口 */
    suspend fun updateShortcuts(body: ShortcutsUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/dashboard/shortcuts"), body) as? PlusApiResultVoid
    }

    /** 领取成就奖励 */
    suspend fun claimAchievementReward(achievementId: String): PlusApiResultAchievementRewardVO? {
        return client.post(ApiPaths.appPath("/dashboard/achievements/$achievementId/claim"), null) as? PlusApiResultAchievementRewardVO
    }

    /** 今日热点 */
    suspend fun getTrendingItems(params: Map<String, Any>? = null): PlusApiResultListTrendingItemVO? {
        return client.get(ApiPaths.appPath("/dashboard/trending"), params) as? PlusApiResultListTrendingItemVO
    }

    /** 待办事项 */
    suspend fun getTodoItems(): PlusApiResultListTodoItemVO? {
        return client.get(ApiPaths.appPath("/dashboard/todos")) as? PlusApiResultListTodoItemVO
    }

    /** 用户统计 */
    suspend fun getUserStatistics(): PlusApiResultUserStatisticsVO? {
        return client.get(ApiPaths.appPath("/dashboard/statistics")) as? PlusApiResultUserStatisticsVO
    }

    /** 会员统计 */
    suspend fun getVipStatistics(): PlusApiResultVipStatisticsVO? {
        return client.get(ApiPaths.appPath("/dashboard/statistics/vip")) as? PlusApiResultVipStatisticsVO
    }

    /** 使用统计 */
    suspend fun getUsageStatistics(params: Map<String, Any>? = null): PlusApiResultUsageStatisticsVO? {
        return client.get(ApiPaths.appPath("/dashboard/statistics/usage"), params) as? PlusApiResultUsageStatisticsVO
    }

    /** 存储统计 */
    suspend fun getStorageStatistics(): PlusApiResultStorageStatisticsVO? {
        return client.get(ApiPaths.appPath("/dashboard/statistics/storage")) as? PlusApiResultStorageStatisticsVO
    }

    /** 生成统计 */
    suspend fun getGenerationStatistics(params: Map<String, Any>? = null): PlusApiResultGenerationStatisticsVO? {
        return client.get(ApiPaths.appPath("/dashboard/statistics/generations"), params) as? PlusApiResultGenerationStatisticsVO
    }

    /** 推荐内容 */
    suspend fun getRecommendations(params: Map<String, Any>? = null): PlusApiResultListRecommendationVO? {
        return client.get(ApiPaths.appPath("/dashboard/recommendations"), params) as? PlusApiResultListRecommendationVO
    }

    /** 数据概览 */
    suspend fun getDataOverview(): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/dashboard/overview")) as? PlusApiResultMapStringObject
    }

    /** 用户等级 */
    suspend fun getUserLevel(): PlusApiResultUserLevelVO? {
        return client.get(ApiPaths.appPath("/dashboard/level")) as? PlusApiResultUserLevelVO
    }

    /** 首页数据 */
    suspend fun getHome(): PlusApiResultHomeDashboardVO? {
        return client.get(ApiPaths.appPath("/dashboard/home")) as? PlusApiResultHomeDashboardVO
    }

    /** 图表数据 */
    suspend fun getChartData(chartType: String, params: Map<String, Any>? = null): PlusApiResultChartDataVO? {
        return client.get(ApiPaths.appPath("/dashboard/charts/$chartType"), params) as? PlusApiResultChartDataVO
    }

    /** 最近活动 */
    suspend fun getRecentActivities(params: Map<String, Any>? = null): PlusApiResultListRecentActivityVO? {
        return client.get(ApiPaths.appPath("/dashboard/activities"), params) as? PlusApiResultListRecentActivityVO
    }

    /** 成就列表 */
    suspend fun getAchievements(): PlusApiResultListAchievementVO? {
        return client.get(ApiPaths.appPath("/dashboard/achievements")) as? PlusApiResultListAchievementVO
    }
}
