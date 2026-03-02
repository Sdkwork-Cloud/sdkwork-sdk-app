from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import BatchEventTrackForm, ErrorTrackForm, EventTrackForm, PageViewTrackForm, PlusApiResultAiUsageStatsVO, PlusApiResultChannelAnalysisVO, PlusApiResultConversionPathVO, PlusApiResultDeviceDistributionVO, PlusApiResultEventStatsVO, PlusApiResultEventTrendVO, PlusApiResultExportResultVO, PlusApiResultFunnelAnalysisVO, PlusApiResultListRealtimeEventVO, PlusApiResultListReportTypeVO, PlusApiResultListTopEventVO, PlusApiResultPathAnalysisVO, PlusApiResultRealtimeOnlineVO, PlusApiResultRetentionAnalysisVO, PlusApiResultUserActivityVO, PlusApiResultUserUsageStatsVO, PlusApiResultVoid, StatsExportForm

class AnalyticsApi:
    """analytics API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def track_page_view(self, body: PageViewTrackForm) -> PlusApiResultVoid:
        """上报页面访问"""
        return self._client.post(f"/app/v3/api/analytics/pageview", json=body)

    def export_stats(self, body: StatsExportForm) -> PlusApiResultExportResultVO:
        """导出统计"""
        return self._client.post(f"/app/v3/api/analytics/export", json=body)

    def track_event(self, body: EventTrackForm) -> PlusApiResultVoid:
        """上报事件"""
        return self._client.post(f"/app/v3/api/analytics/events", json=body)

    def batch_track_events(self, body: BatchEventTrackForm) -> PlusApiResultVoid:
        """批量上报事件"""
        return self._client.post(f"/app/v3/api/analytics/events/batch", json=body)

    def track_error(self, body: ErrorTrackForm) -> PlusApiResultVoid:
        """上报错误"""
        return self._client.post(f"/app/v3/api/analytics/errors", json=body)

    def get_user_usage_stats(self) -> PlusApiResultUserUsageStatsVO:
        """使用统计"""
        return self._client.get(f"/app/v3/api/analytics/usage")

    def get_retention_analysis(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultRetentionAnalysisVO:
        """留存分析"""
        return self._client.get(f"/app/v3/api/analytics/retention", params=params)

    def list_report_types(self) -> PlusApiResultListReportTypeVO:
        """报表列表"""
        return self._client.get(f"/app/v3/api/analytics/reports")

    def get_realtime_online(self) -> PlusApiResultRealtimeOnlineVO:
        """实时在线"""
        return self._client.get(f"/app/v3/api/analytics/realtime/online")

    def get_realtime_events(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListRealtimeEventVO:
        """实时事件"""
        return self._client.get(f"/app/v3/api/analytics/realtime/events", params=params)

    def get_path_analysis(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPathAnalysisVO:
        """路径分析"""
        return self._client.get(f"/app/v3/api/analytics/path", params=params)

    def get_funnel_analysis(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFunnelAnalysisVO:
        """漏斗分析"""
        return self._client.get(f"/app/v3/api/analytics/funnel", params=params)

    def get_event_trend(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultEventTrendVO:
        """事件趋势"""
        return self._client.get(f"/app/v3/api/analytics/events/trend", params=params)

    def get_top_events(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListTopEventVO:
        """热门事件"""
        return self._client.get(f"/app/v3/api/analytics/events/top", params=params)

    def get_event_stats(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultEventStatsVO:
        """事件统计"""
        return self._client.get(f"/app/v3/api/analytics/events/stats", params=params)

    def get_device_distribution(self) -> PlusApiResultDeviceDistributionVO:
        """设备分布"""
        return self._client.get(f"/app/v3/api/analytics/devices")

    def get_conversion_path(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultConversionPathVO:
        """转化路径"""
        return self._client.get(f"/app/v3/api/analytics/conversion-path", params=params)

    def get_channel_analysis(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultChannelAnalysisVO:
        """渠道分析"""
        return self._client.get(f"/app/v3/api/analytics/channels", params=params)

    def get_ai_usage_stats(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultAiUsageStatsVO:
        """AI使用统计"""
        return self._client.get(f"/app/v3/api/analytics/ai-usage", params=params)

    def get_user_activity(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultUserActivityVO:
        """活跃度统计"""
        return self._client.get(f"/app/v3/api/analytics/activity", params=params)
