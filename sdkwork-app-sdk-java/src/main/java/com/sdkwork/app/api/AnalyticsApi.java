package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AnalyticsApi {
    private final HttpClient client;
    
    public AnalyticsApi(HttpClient client) {
        this.client = client;
    }

    /** 上报页面访问 */
    public PlusApiResultVoid trackPageView(PageViewTrackForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/analytics/pageview"), body);
    }

    /** 导出统计 */
    public PlusApiResultExportResultVO exportStats(StatsExportForm body) throws Exception {
        return (PlusApiResultExportResultVO) client.post(ApiPaths.appPath("/analytics/export"), body);
    }

    /** 上报事件 */
    public PlusApiResultVoid trackEvent(EventTrackForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/analytics/events"), body);
    }

    /** 批量上报事件 */
    public PlusApiResultVoid batchTrackEvents(BatchEventTrackForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/analytics/events/batch"), body);
    }

    /** 上报错误 */
    public PlusApiResultVoid trackError(ErrorTrackForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/analytics/errors"), body);
    }

    /** 使用统计 */
    public PlusApiResultUserUsageStatsVO getUserUsageStats() throws Exception {
        return (PlusApiResultUserUsageStatsVO) client.get(ApiPaths.appPath("/analytics/usage"));
    }

    /** 留存分析 */
    public PlusApiResultRetentionAnalysisVO getRetentionAnalysis(Map<String, Object> params) throws Exception {
        return (PlusApiResultRetentionAnalysisVO) client.get(ApiPaths.appPath("/analytics/retention"), params);
    }

    /** 报表列表 */
    public PlusApiResultListReportTypeVO listReportTypes() throws Exception {
        return (PlusApiResultListReportTypeVO) client.get(ApiPaths.appPath("/analytics/reports"));
    }

    /** 实时在线 */
    public PlusApiResultRealtimeOnlineVO getRealtimeOnline() throws Exception {
        return (PlusApiResultRealtimeOnlineVO) client.get(ApiPaths.appPath("/analytics/realtime/online"));
    }

    /** 实时事件 */
    public PlusApiResultListRealtimeEventVO getRealtimeEvents(Map<String, Object> params) throws Exception {
        return (PlusApiResultListRealtimeEventVO) client.get(ApiPaths.appPath("/analytics/realtime/events"), params);
    }

    /** 路径分析 */
    public PlusApiResultPathAnalysisVO getPathAnalysis(Map<String, Object> params) throws Exception {
        return (PlusApiResultPathAnalysisVO) client.get(ApiPaths.appPath("/analytics/path"), params);
    }

    /** 漏斗分析 */
    public PlusApiResultFunnelAnalysisVO getFunnelAnalysis(Map<String, Object> params) throws Exception {
        return (PlusApiResultFunnelAnalysisVO) client.get(ApiPaths.appPath("/analytics/funnel"), params);
    }

    /** 事件趋势 */
    public PlusApiResultEventTrendVO getEventTrend(Map<String, Object> params) throws Exception {
        return (PlusApiResultEventTrendVO) client.get(ApiPaths.appPath("/analytics/events/trend"), params);
    }

    /** 热门事件 */
    public PlusApiResultListTopEventVO getTopEvents(Map<String, Object> params) throws Exception {
        return (PlusApiResultListTopEventVO) client.get(ApiPaths.appPath("/analytics/events/top"), params);
    }

    /** 事件统计 */
    public PlusApiResultEventStatsVO getEventStats(Map<String, Object> params) throws Exception {
        return (PlusApiResultEventStatsVO) client.get(ApiPaths.appPath("/analytics/events/stats"), params);
    }

    /** 设备分布 */
    public PlusApiResultDeviceDistributionVO getDeviceDistribution() throws Exception {
        return (PlusApiResultDeviceDistributionVO) client.get(ApiPaths.appPath("/analytics/devices"));
    }

    /** 转化路径 */
    public PlusApiResultConversionPathVO getConversionPath(Map<String, Object> params) throws Exception {
        return (PlusApiResultConversionPathVO) client.get(ApiPaths.appPath("/analytics/conversion-path"), params);
    }

    /** 渠道分析 */
    public PlusApiResultChannelAnalysisVO getChannelAnalysis(Map<String, Object> params) throws Exception {
        return (PlusApiResultChannelAnalysisVO) client.get(ApiPaths.appPath("/analytics/channels"), params);
    }

    /** AI使用统计 */
    public PlusApiResultAiUsageStatsVO getAiUsageStats(Map<String, Object> params) throws Exception {
        return (PlusApiResultAiUsageStatsVO) client.get(ApiPaths.appPath("/analytics/ai-usage"), params);
    }

    /** 活跃度统计 */
    public PlusApiResultUserActivityVO getUserActivity(Map<String, Object> params) throws Exception {
        return (PlusApiResultUserActivityVO) client.get(ApiPaths.appPath("/analytics/activity"), params);
    }
}
