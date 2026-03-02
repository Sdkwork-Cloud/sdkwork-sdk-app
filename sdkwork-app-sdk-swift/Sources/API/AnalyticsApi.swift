import Foundation

public class AnalyticsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 上报页面访问
    public func trackPageView(body: PageViewTrackForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/analytics/pageview"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 导出统计
    public func exportStats(body: StatsExportForm) async throws -> PlusApiResultExportResultVO? {
        let response = try await client.post(ApiPaths.appPath("/analytics/export"), body: body)
        return response as? PlusApiResultExportResultVO
    }

    /// 上报事件
    public func trackEvent(body: EventTrackForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/analytics/events"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 批量上报事件
    public func batchTrackEvents(body: BatchEventTrackForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/analytics/events/batch"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报错误
    public func trackError(body: ErrorTrackForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/analytics/errors"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 使用统计
    public func getUserUsageStats() async throws -> PlusApiResultUserUsageStatsVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/usage"))
        return response as? PlusApiResultUserUsageStatsVO
    }

    /// 留存分析
    public func getRetentionAnalysis(params: [String: Any]? = nil) async throws -> PlusApiResultRetentionAnalysisVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/retention"), params: params)
        return response as? PlusApiResultRetentionAnalysisVO
    }

    /// 报表列表
    public func listReportTypes() async throws -> PlusApiResultListReportTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/reports"))
        return response as? PlusApiResultListReportTypeVO
    }

    /// 实时在线
    public func getRealtimeOnline() async throws -> PlusApiResultRealtimeOnlineVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/realtime/online"))
        return response as? PlusApiResultRealtimeOnlineVO
    }

    /// 实时事件
    public func getRealtimeEvents(params: [String: Any]? = nil) async throws -> PlusApiResultListRealtimeEventVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/realtime/events"), params: params)
        return response as? PlusApiResultListRealtimeEventVO
    }

    /// 路径分析
    public func getPathAnalysis(params: [String: Any]? = nil) async throws -> PlusApiResultPathAnalysisVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/path"), params: params)
        return response as? PlusApiResultPathAnalysisVO
    }

    /// 漏斗分析
    public func getFunnelAnalysis(params: [String: Any]? = nil) async throws -> PlusApiResultFunnelAnalysisVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/funnel"), params: params)
        return response as? PlusApiResultFunnelAnalysisVO
    }

    /// 事件趋势
    public func getEventTrend(params: [String: Any]? = nil) async throws -> PlusApiResultEventTrendVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/events/trend"), params: params)
        return response as? PlusApiResultEventTrendVO
    }

    /// 热门事件
    public func getTopEvents(params: [String: Any]? = nil) async throws -> PlusApiResultListTopEventVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/events/top"), params: params)
        return response as? PlusApiResultListTopEventVO
    }

    /// 事件统计
    public func getEventStats(params: [String: Any]? = nil) async throws -> PlusApiResultEventStatsVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/events/stats"), params: params)
        return response as? PlusApiResultEventStatsVO
    }

    /// 设备分布
    public func getDeviceDistribution() async throws -> PlusApiResultDeviceDistributionVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/devices"))
        return response as? PlusApiResultDeviceDistributionVO
    }

    /// 转化路径
    public func getConversionPath(params: [String: Any]? = nil) async throws -> PlusApiResultConversionPathVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/conversion-path"), params: params)
        return response as? PlusApiResultConversionPathVO
    }

    /// 渠道分析
    public func getChannelAnalysis(params: [String: Any]? = nil) async throws -> PlusApiResultChannelAnalysisVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/channels"), params: params)
        return response as? PlusApiResultChannelAnalysisVO
    }

    /// AI使用统计
    public func getAiUsageStats(params: [String: Any]? = nil) async throws -> PlusApiResultAiUsageStatsVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/ai-usage"), params: params)
        return response as? PlusApiResultAiUsageStatsVO
    }

    /// 活跃度统计
    public func getUserActivity(params: [String: Any]? = nil) async throws -> PlusApiResultUserActivityVO? {
        let response = try await client.get(ApiPaths.appPath("/analytics/activity"), params: params)
        return response as? PlusApiResultUserActivityVO
    }
}
