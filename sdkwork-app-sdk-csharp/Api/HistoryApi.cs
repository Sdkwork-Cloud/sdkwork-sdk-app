using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class HistoryApi
    {
        private readonly HttpClient _client;

        public HistoryApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 浏览历史
        /// </summary>
        public async Task<PlusApiResultPageBrowseHistoryVO?> ListBrowseAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageBrowseHistoryVO>(ApiPaths.AppPath("/history/browse"), query);
        }

        /// <summary>
        /// 添加浏览记录
        /// </summary>
        public async Task<PlusApiResultVoid?> AddBrowseAsync(BrowseHistoryAddForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/history/browse"), body);
        }

        /// <summary>
        /// 清空浏览历史
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearBrowseAsync(Dictionary<string, object>? query = null)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/history/browse"), query);
        }

        /// <summary>
        /// 历史统计
        /// </summary>
        public async Task<PlusApiResultHistoryStatisticsVO?> GetHistoryStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultHistoryStatisticsVO>(ApiPaths.AppPath("/history/statistics"));
        }

        /// <summary>
        /// 浏览统计
        /// </summary>
        public async Task<PlusApiResultBrowseStatisticsVO?> GetBrowseStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultBrowseStatisticsVO>(ApiPaths.AppPath("/history/statistics/browse"));
        }

        /// <summary>
        /// 所有会话
        /// </summary>
        public async Task<PlusApiResultListSessionInfoVO?> ListSessionsAsync()
        {
            return await _client.GetAsync<PlusApiResultListSessionInfoVO>(ApiPaths.AppPath("/history/sessions"));
        }

        /// <summary>
        /// 当前会话
        /// </summary>
        public async Task<PlusApiResultSessionInfoVO?> GetCurrentSessionAsync()
        {
            return await _client.GetAsync<PlusApiResultSessionInfoVO>(ApiPaths.AppPath("/history/sessions/current"));
        }

        /// <summary>
        /// 操作历史
        /// </summary>
        public async Task<PlusApiResultPageOperationHistoryVO?> ListOperationAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageOperationHistoryVO>(ApiPaths.AppPath("/history/operations"), query);
        }

        /// <summary>
        /// 最近操作
        /// </summary>
        public async Task<PlusApiResultListOperationHistoryVO?> GetRecentOperationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListOperationHistoryVO>(ApiPaths.AppPath("/history/operations/recent"), query);
        }

        /// <summary>
        /// 登录历史
        /// </summary>
        public async Task<PlusApiResultPageLoginHistoryVO?> ListLoginAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageLoginHistoryVO>(ApiPaths.AppPath("/history/logins"), query);
        }

        /// <summary>
        /// 生成历史
        /// </summary>
        public async Task<PlusApiResultPageGenerationHistoryVO?> ListGenerationAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageGenerationHistoryVO>(ApiPaths.AppPath("/history/generations"), query);
        }

        /// <summary>
        /// 清空生成历史
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearGenerationAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/history/generations"));
        }

        /// <summary>
        /// 最近生成
        /// </summary>
        public async Task<PlusApiResultListGenerationHistoryVO?> GetRecentGenerationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListGenerationHistoryVO>(ApiPaths.AppPath("/history/generations/recent"), query);
        }

        /// <summary>
        /// 终止会话
        /// </summary>
        public async Task<PlusApiResultVoid?> TerminateSessionAsync(string sessionId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/history/sessions/{sessionId}"));
        }

        /// <summary>
        /// 终止其他会话
        /// </summary>
        public async Task<PlusApiResultVoid?> TerminateOtherSessionsAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/history/sessions/others"));
        }

        /// <summary>
        /// 删除生成历史
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteGenerationAsync(string historyId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/history/generations/{historyId}"));
        }

        /// <summary>
        /// 删除浏览记录
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteBrowseAsync(string historyId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/history/browse/{historyId}"));
        }

        /// <summary>
        /// 批量删除浏览记录
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchDeleteBrowseAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/history/browse/batch"));
        }
    }
}
