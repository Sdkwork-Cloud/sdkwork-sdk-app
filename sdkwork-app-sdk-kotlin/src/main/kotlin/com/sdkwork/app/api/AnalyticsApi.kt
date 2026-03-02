package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AnalyticsApi(private val client: HttpClient) {

    /** 上报页面访问 */
    suspend fun trackPageView(body: PageViewTrackForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/analytics/pageview"), body) as? PlusApiResultVoid
    }

    /** 导出统计 */
    suspend fun exportStats(body: StatsExportForm): PlusApiResultExportResultVO? {
        return client.post(ApiPaths.appPath("/analytics/export"), body) as? PlusApiResultExportResultVO
    }

    /** 上报事件 */
    suspend fun trackEvent(body: EventTrackForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/analytics/events"), body) as? PlusApiResultVoid
    }

    /** 批量上报事件 */
    suspend fun batchTrackEvents(body: BatchEventTrackForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/analytics/events/batch"), body) as? PlusApiResultVoid
    }

    /** 上报错误 */
    suspend fun trackError(body: ErrorTrackForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/analytics/errors"), body) as? PlusApiResultVoid
    }

    /** 使用统计 */
    suspend fun getUserUsageStats(): PlusApiResultUserUsageStatsVO? {
        return client.get(ApiPaths.appPath("/analytics/usage")) as? PlusApiResultUserUsageStatsVO
    }

    /** 留存分析 */
    suspend fun getRetentionAnalysis(params: Map<String, Any>? = null): PlusApiResultRetentionAnalysisVO? {
        return client.get(ApiPaths.appPath("/analytics/retention"), params) as? PlusApiResultRetentionAnalysisVO
    }

    /** 报表列表 */
    suspend fun listReportTypes(): PlusApiResultListReportTypeVO? {
        return client.get(ApiPaths.appPath("/analytics/reports")) as? PlusApiResultListReportTypeVO
    }

    /** 实时在线 */
    suspend fun getRealtimeOnline(): PlusApiResultRealtimeOnlineVO? {
        return client.get(ApiPaths.appPath("/analytics/realtime/online")) as? PlusApiResultRealtimeOnlineVO
    }

    /** 实时事件 */
    suspend fun getRealtimeEvents(params: Map<String, Any>? = null): PlusApiResultListRealtimeEventVO? {
        return client.get(ApiPaths.appPath("/analytics/realtime/events"), params) as? PlusApiResultListRealtimeEventVO
    }

    /** 路径分析 */
    suspend fun getPathAnalysis(params: Map<String, Any>? = null): PlusApiResultPathAnalysisVO? {
        return client.get(ApiPaths.appPath("/analytics/path"), params) as? PlusApiResultPathAnalysisVO
    }

    /** 漏斗分析 */
    suspend fun getFunnelAnalysis(params: Map<String, Any>? = null): PlusApiResultFunnelAnalysisVO? {
        return client.get(ApiPaths.appPath("/analytics/funnel"), params) as? PlusApiResultFunnelAnalysisVO
    }

    /** 事件趋势 */
    suspend fun getEventTrend(params: Map<String, Any>? = null): PlusApiResultEventTrendVO? {
        return client.get(ApiPaths.appPath("/analytics/events/trend"), params) as? PlusApiResultEventTrendVO
    }

    /** 热门事件 */
    suspend fun getTopEvents(params: Map<String, Any>? = null): PlusApiResultListTopEventVO? {
        return client.get(ApiPaths.appPath("/analytics/events/top"), params) as? PlusApiResultListTopEventVO
    }

    /** 事件统计 */
    suspend fun getEventStats(params: Map<String, Any>? = null): PlusApiResultEventStatsVO? {
        return client.get(ApiPaths.appPath("/analytics/events/stats"), params) as? PlusApiResultEventStatsVO
    }

    /** 设备分布 */
    suspend fun getDeviceDistribution(): PlusApiResultDeviceDistributionVO? {
        return client.get(ApiPaths.appPath("/analytics/devices")) as? PlusApiResultDeviceDistributionVO
    }

    /** 转化路径 */
    suspend fun getConversionPath(params: Map<String, Any>? = null): PlusApiResultConversionPathVO? {
        return client.get(ApiPaths.appPath("/analytics/conversion-path"), params) as? PlusApiResultConversionPathVO
    }

    /** 渠道分析 */
    suspend fun getChannelAnalysis(params: Map<String, Any>? = null): PlusApiResultChannelAnalysisVO? {
        return client.get(ApiPaths.appPath("/analytics/channels"), params) as? PlusApiResultChannelAnalysisVO
    }

    /** AI使用统计 */
    suspend fun getAiUsageStats(params: Map<String, Any>? = null): PlusApiResultAiUsageStatsVO? {
        return client.get(ApiPaths.appPath("/analytics/ai-usage"), params) as? PlusApiResultAiUsageStatsVO
    }

    /** 活跃度统计 */
    suspend fun getUserActivity(params: Map<String, Any>? = null): PlusApiResultUserActivityVO? {
        return client.get(ApiPaths.appPath("/analytics/activity"), params) as? PlusApiResultUserActivityVO
    }
}
