package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AnalyticsApi struct {
    client *sdkhttp.Client
}

func NewAnalyticsApi(client *sdkhttp.Client) *AnalyticsApi {
    return &AnalyticsApi{client: client}
}

// 上报页面访问
func (a *AnalyticsApi) TrackPageView(body sdktypes.PageViewTrackForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/analytics/pageview"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 导出统计
func (a *AnalyticsApi) ExportStats(body sdktypes.StatsExportForm) (sdktypes.PlusApiResultExportResultVO, error) {
    raw, err := a.client.Post(AppApiPath("/analytics/export"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultExportResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExportResultVO](raw)
}

// 上报事件
func (a *AnalyticsApi) TrackEvent(body sdktypes.EventTrackForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/analytics/events"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量上报事件
func (a *AnalyticsApi) BatchTrackEvents(body sdktypes.BatchEventTrackForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/analytics/events/batch"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报错误
func (a *AnalyticsApi) TrackError(body sdktypes.ErrorTrackForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/analytics/errors"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 使用统计
func (a *AnalyticsApi) GetUserUsageStats() (sdktypes.PlusApiResultUserUsageStatsVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/usage"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserUsageStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserUsageStatsVO](raw)
}

// 留存分析
func (a *AnalyticsApi) GetRetentionAnalysis(query map[string]interface{}) (sdktypes.PlusApiResultRetentionAnalysisVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/retention"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultRetentionAnalysisVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRetentionAnalysisVO](raw)
}

// 报表列表
func (a *AnalyticsApi) ListReportTypes() (sdktypes.PlusApiResultListReportTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/reports"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListReportTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListReportTypeVO](raw)
}

// 实时在线
func (a *AnalyticsApi) GetRealtimeOnline() (sdktypes.PlusApiResultRealtimeOnlineVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/realtime/online"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultRealtimeOnlineVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRealtimeOnlineVO](raw)
}

// 实时事件
func (a *AnalyticsApi) GetRealtimeEvents(query map[string]interface{}) (sdktypes.PlusApiResultListRealtimeEventVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/realtime/events"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListRealtimeEventVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListRealtimeEventVO](raw)
}

// 路径分析
func (a *AnalyticsApi) GetPathAnalysis(query map[string]interface{}) (sdktypes.PlusApiResultPathAnalysisVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/path"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPathAnalysisVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPathAnalysisVO](raw)
}

// 漏斗分析
func (a *AnalyticsApi) GetFunnelAnalysis(query map[string]interface{}) (sdktypes.PlusApiResultFunnelAnalysisVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/funnel"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFunnelAnalysisVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFunnelAnalysisVO](raw)
}

// 事件趋势
func (a *AnalyticsApi) GetEventTrend(query map[string]interface{}) (sdktypes.PlusApiResultEventTrendVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/events/trend"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultEventTrendVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultEventTrendVO](raw)
}

// 热门事件
func (a *AnalyticsApi) GetTopEvents(query map[string]interface{}) (sdktypes.PlusApiResultListTopEventVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/events/top"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListTopEventVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTopEventVO](raw)
}

// 事件统计
func (a *AnalyticsApi) GetEventStats(query map[string]interface{}) (sdktypes.PlusApiResultEventStatsVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/events/stats"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultEventStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultEventStatsVO](raw)
}

// 设备分布
func (a *AnalyticsApi) GetDeviceDistribution() (sdktypes.PlusApiResultDeviceDistributionVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/devices"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDeviceDistributionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDeviceDistributionVO](raw)
}

// 转化路径
func (a *AnalyticsApi) GetConversionPath(query map[string]interface{}) (sdktypes.PlusApiResultConversionPathVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/conversion-path"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultConversionPathVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultConversionPathVO](raw)
}

// 渠道分析
func (a *AnalyticsApi) GetChannelAnalysis(query map[string]interface{}) (sdktypes.PlusApiResultChannelAnalysisVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/channels"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultChannelAnalysisVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultChannelAnalysisVO](raw)
}

// AI使用统计
func (a *AnalyticsApi) GetAiUsageStats(query map[string]interface{}) (sdktypes.PlusApiResultAiUsageStatsVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/ai-usage"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAiUsageStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAiUsageStatsVO](raw)
}

// 活跃度统计
func (a *AnalyticsApi) GetUserActivity(query map[string]interface{}) (sdktypes.PlusApiResultUserActivityVO, error) {
    raw, err := a.client.Get(AppApiPath("/analytics/activity"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserActivityVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserActivityVO](raw)
}
