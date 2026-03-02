import Foundation

public class DashboardApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 完成待办
    public func completeTodoItem(todoId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/dashboard/todos/\(todoId)/complete"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 快捷入口
    public func getShortcuts() async throws -> PlusApiResultListShortcutVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/shortcuts"))
        return response as? PlusApiResultListShortcutVO
    }

    /// 更新快捷入口
    public func updateShortcuts(body: ShortcutsUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/dashboard/shortcuts"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 领取成就奖励
    public func claimAchievementReward(achievementId: String) async throws -> PlusApiResultAchievementRewardVO? {
        let response = try await client.post(ApiPaths.appPath("/dashboard/achievements/\(achievementId)/claim"), body: nil)
        return response as? PlusApiResultAchievementRewardVO
    }

    /// 今日热点
    public func getTrendingItems(params: [String: Any]? = nil) async throws -> PlusApiResultListTrendingItemVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/trending"), params: params)
        return response as? PlusApiResultListTrendingItemVO
    }

    /// 待办事项
    public func getTodoItems() async throws -> PlusApiResultListTodoItemVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/todos"))
        return response as? PlusApiResultListTodoItemVO
    }

    /// 用户统计
    public func getUserStatistics() async throws -> PlusApiResultUserStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/statistics"))
        return response as? PlusApiResultUserStatisticsVO
    }

    /// 会员统计
    public func getVipStatistics() async throws -> PlusApiResultVipStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/statistics/vip"))
        return response as? PlusApiResultVipStatisticsVO
    }

    /// 使用统计
    public func getUsageStatistics(params: [String: Any]? = nil) async throws -> PlusApiResultUsageStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/statistics/usage"), params: params)
        return response as? PlusApiResultUsageStatisticsVO
    }

    /// 存储统计
    public func getStorageStatistics() async throws -> PlusApiResultStorageStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/statistics/storage"))
        return response as? PlusApiResultStorageStatisticsVO
    }

    /// 生成统计
    public func getGenerationStatistics(params: [String: Any]? = nil) async throws -> PlusApiResultGenerationStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/statistics/generations"), params: params)
        return response as? PlusApiResultGenerationStatisticsVO
    }

    /// 推荐内容
    public func getRecommendations(params: [String: Any]? = nil) async throws -> PlusApiResultListRecommendationVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/recommendations"), params: params)
        return response as? PlusApiResultListRecommendationVO
    }

    /// 数据概览
    public func getDataOverview() async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/overview"))
        return response as? PlusApiResultMapStringObject
    }

    /// 用户等级
    public func getUserLevel() async throws -> PlusApiResultUserLevelVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/level"))
        return response as? PlusApiResultUserLevelVO
    }

    /// 首页数据
    public func getHome() async throws -> PlusApiResultHomeDashboardVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/home"))
        return response as? PlusApiResultHomeDashboardVO
    }

    /// 图表数据
    public func getChartData(chartType: String, params: [String: Any]? = nil) async throws -> PlusApiResultChartDataVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/charts/\(chartType)"), params: params)
        return response as? PlusApiResultChartDataVO
    }

    /// 最近活动
    public func getRecentActivities(params: [String: Any]? = nil) async throws -> PlusApiResultListRecentActivityVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/activities"), params: params)
        return response as? PlusApiResultListRecentActivityVO
    }

    /// 成就列表
    public func getAchievements() async throws -> PlusApiResultListAchievementVO? {
        let response = try await client.get(ApiPaths.appPath("/dashboard/achievements"))
        return response as? PlusApiResultListAchievementVO
    }
}
