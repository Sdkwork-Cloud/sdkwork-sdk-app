import '../http/client.dart';
import '../models.dart';

class AnalyticsApi {
  final HttpClient _client;
  
  AnalyticsApi(this._client);

  /// 上报页面访问
  Future<PlusApiResultVoid?> trackPageView(PageViewTrackForm body) async {
    final response = await _client.post(ApiPaths.appPath('/analytics/pageview'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 导出统计
  Future<PlusApiResultExportResultVO?> exportStats(StatsExportForm body) async {
    final response = await _client.post(ApiPaths.appPath('/analytics/export'), body: body, contentType: 'application/json');
    return response is PlusApiResultExportResultVO ? response : null;
  }

  /// 上报事件
  Future<PlusApiResultVoid?> trackEvent(EventTrackForm body) async {
    final response = await _client.post(ApiPaths.appPath('/analytics/events'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量上报事件
  Future<PlusApiResultVoid?> batchTrackEvents(BatchEventTrackForm body) async {
    final response = await _client.post(ApiPaths.appPath('/analytics/events/batch'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报错误
  Future<PlusApiResultVoid?> trackError(ErrorTrackForm body) async {
    final response = await _client.post(ApiPaths.appPath('/analytics/errors'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 使用统计
  Future<PlusApiResultUserUsageStatsVO?> getUserUsageStats() async {
    final response = await _client.get(ApiPaths.appPath('/analytics/usage'));
    return response is PlusApiResultUserUsageStatsVO ? response : null;
  }

  /// 留存分析
  Future<PlusApiResultRetentionAnalysisVO?> getRetentionAnalysis(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/retention'), params: params);
    return response is PlusApiResultRetentionAnalysisVO ? response : null;
  }

  /// 报表列表
  Future<PlusApiResultListReportTypeVO?> listReportTypes() async {
    final response = await _client.get(ApiPaths.appPath('/analytics/reports'));
    return response is PlusApiResultListReportTypeVO ? response : null;
  }

  /// 实时在线
  Future<PlusApiResultRealtimeOnlineVO?> getRealtimeOnline() async {
    final response = await _client.get(ApiPaths.appPath('/analytics/realtime/online'));
    return response is PlusApiResultRealtimeOnlineVO ? response : null;
  }

  /// 实时事件
  Future<PlusApiResultListRealtimeEventVO?> getRealtimeEvents(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/realtime/events'), params: params);
    return response is PlusApiResultListRealtimeEventVO ? response : null;
  }

  /// 路径分析
  Future<PlusApiResultPathAnalysisVO?> getPathAnalysis(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/path'), params: params);
    return response is PlusApiResultPathAnalysisVO ? response : null;
  }

  /// 漏斗分析
  Future<PlusApiResultFunnelAnalysisVO?> getFunnelAnalysis(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/funnel'), params: params);
    return response is PlusApiResultFunnelAnalysisVO ? response : null;
  }

  /// 事件趋势
  Future<PlusApiResultEventTrendVO?> getEventTrend(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/events/trend'), params: params);
    return response is PlusApiResultEventTrendVO ? response : null;
  }

  /// 热门事件
  Future<PlusApiResultListTopEventVO?> getTopEvents(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/events/top'), params: params);
    return response is PlusApiResultListTopEventVO ? response : null;
  }

  /// 事件统计
  Future<PlusApiResultEventStatsVO?> getEventStats(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/events/stats'), params: params);
    return response is PlusApiResultEventStatsVO ? response : null;
  }

  /// 设备分布
  Future<PlusApiResultDeviceDistributionVO?> getDeviceDistribution() async {
    final response = await _client.get(ApiPaths.appPath('/analytics/devices'));
    return response is PlusApiResultDeviceDistributionVO ? response : null;
  }

  /// 转化路径
  Future<PlusApiResultConversionPathVO?> getConversionPath(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/conversion-path'), params: params);
    return response is PlusApiResultConversionPathVO ? response : null;
  }

  /// 渠道分析
  Future<PlusApiResultChannelAnalysisVO?> getChannelAnalysis(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/channels'), params: params);
    return response is PlusApiResultChannelAnalysisVO ? response : null;
  }

  /// AI使用统计
  Future<PlusApiResultAiUsageStatsVO?> getAiUsageStats(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/ai-usage'), params: params);
    return response is PlusApiResultAiUsageStatsVO ? response : null;
  }

  /// 活跃度统计
  Future<PlusApiResultUserActivityVO?> getUserActivity(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/analytics/activity'), params: params);
    return response is PlusApiResultUserActivityVO ? response : null;
  }
}
