using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AnalyticsApi
    {
        private readonly HttpClient _client;

        public AnalyticsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 上报页面访问
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackPageViewAsync(PageViewTrackForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/analytics/pageview"), body);
        }

        /// <summary>
        /// 导出统计
        /// </summary>
        public async Task<PlusApiResultExportResultVO?> ExportStatsAsync(StatsExportForm body)
        {
            return await _client.PostAsync<PlusApiResultExportResultVO>(ApiPaths.AppPath("/analytics/export"), body);
        }

        /// <summary>
        /// 上报事件
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackEventAsync(EventTrackForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/analytics/events"), body);
        }

        /// <summary>
        /// 批量上报事件
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchTrackEventsAsync(BatchEventTrackForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/analytics/events/batch"), body);
        }

        /// <summary>
        /// 上报错误
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackErrorAsync(ErrorTrackForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/analytics/errors"), body);
        }

        /// <summary>
        /// 使用统计
        /// </summary>
        public async Task<PlusApiResultUserUsageStatsVO?> GetUserUsageStatsAsync()
        {
            return await _client.GetAsync<PlusApiResultUserUsageStatsVO>(ApiPaths.AppPath("/analytics/usage"));
        }

        /// <summary>
        /// 留存分析
        /// </summary>
        public async Task<PlusApiResultRetentionAnalysisVO?> GetRetentionAnalysisAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultRetentionAnalysisVO>(ApiPaths.AppPath("/analytics/retention"), query);
        }

        /// <summary>
        /// 报表列表
        /// </summary>
        public async Task<PlusApiResultListReportTypeVO?> ListReportTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListReportTypeVO>(ApiPaths.AppPath("/analytics/reports"));
        }

        /// <summary>
        /// 实时在线
        /// </summary>
        public async Task<PlusApiResultRealtimeOnlineVO?> GetRealtimeOnlineAsync()
        {
            return await _client.GetAsync<PlusApiResultRealtimeOnlineVO>(ApiPaths.AppPath("/analytics/realtime/online"));
        }

        /// <summary>
        /// 实时事件
        /// </summary>
        public async Task<PlusApiResultListRealtimeEventVO?> GetRealtimeEventsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListRealtimeEventVO>(ApiPaths.AppPath("/analytics/realtime/events"), query);
        }

        /// <summary>
        /// 路径分析
        /// </summary>
        public async Task<PlusApiResultPathAnalysisVO?> GetPathAnalysisAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPathAnalysisVO>(ApiPaths.AppPath("/analytics/path"), query);
        }

        /// <summary>
        /// 漏斗分析
        /// </summary>
        public async Task<PlusApiResultFunnelAnalysisVO?> GetFunnelAnalysisAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultFunnelAnalysisVO>(ApiPaths.AppPath("/analytics/funnel"), query);
        }

        /// <summary>
        /// 事件趋势
        /// </summary>
        public async Task<PlusApiResultEventTrendVO?> GetEventTrendAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultEventTrendVO>(ApiPaths.AppPath("/analytics/events/trend"), query);
        }

        /// <summary>
        /// 热门事件
        /// </summary>
        public async Task<PlusApiResultListTopEventVO?> GetTopEventsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListTopEventVO>(ApiPaths.AppPath("/analytics/events/top"), query);
        }

        /// <summary>
        /// 事件统计
        /// </summary>
        public async Task<PlusApiResultEventStatsVO?> GetEventStatsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultEventStatsVO>(ApiPaths.AppPath("/analytics/events/stats"), query);
        }

        /// <summary>
        /// 设备分布
        /// </summary>
        public async Task<PlusApiResultDeviceDistributionVO?> GetDeviceDistributionAsync()
        {
            return await _client.GetAsync<PlusApiResultDeviceDistributionVO>(ApiPaths.AppPath("/analytics/devices"));
        }

        /// <summary>
        /// 转化路径
        /// </summary>
        public async Task<PlusApiResultConversionPathVO?> GetConversionPathAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultConversionPathVO>(ApiPaths.AppPath("/analytics/conversion-path"), query);
        }

        /// <summary>
        /// 渠道分析
        /// </summary>
        public async Task<PlusApiResultChannelAnalysisVO?> GetChannelAnalysisAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultChannelAnalysisVO>(ApiPaths.AppPath("/analytics/channels"), query);
        }

        /// <summary>
        /// AI使用统计
        /// </summary>
        public async Task<PlusApiResultAiUsageStatsVO?> GetAiUsageStatsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultAiUsageStatsVO>(ApiPaths.AppPath("/analytics/ai-usage"), query);
        }

        /// <summary>
        /// 活跃度统计
        /// </summary>
        public async Task<PlusApiResultUserActivityVO?> GetUserActivityAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultUserActivityVO>(ApiPaths.AppPath("/analytics/activity"), query);
        }
    }
}
