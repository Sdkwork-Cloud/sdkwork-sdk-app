using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AppApi
    {
        private readonly HttpClient _client;

        public AppApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取应用详情
        /// </summary>
        public async Task<PlusApiResultAppDetailVO?> GetAppAsync(string appId)
        {
            return await _client.GetAsync<PlusApiResultAppDetailVO>(ApiPaths.AppPath($"/app/manage/{appId}"));
        }

        /// <summary>
        /// 更新应用
        /// </summary>
        public async Task<PlusApiResultAppVO?> UpdateAppAsync(string appId, AppUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultAppVO>(ApiPaths.AppPath($"/app/manage/{appId}"), body);
        }

        /// <summary>
        /// 删除应用
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteAppAsync(string appId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/app/manage/{appId}"));
        }

        /// <summary>
        /// 创建应用
        /// </summary>
        public async Task<PlusApiResultAppVO?> CreateAppAsync(AppCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultAppVO>(ApiPaths.AppPath("/app/manage"), body);
        }

        /// <summary>
        /// 停用应用
        /// </summary>
        public async Task<PlusApiResultVoid?> DeactivateAsync(string appId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/app/manage/{appId}/deactivate"), null);
        }

        /// <summary>
        /// 激活应用
        /// </summary>
        public async Task<PlusApiResultVoid?> ActivateAsync(string appId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/app/manage/{appId}/activate"), null);
        }

        /// <summary>
        /// 检查发布就绪状态
        /// </summary>
        public async Task<PlusApiResultAppPublishReadinessVO?> CheckPublishReadinessAsync(string appId)
        {
            return await _client.GetAsync<PlusApiResultAppPublishReadinessVO>(ApiPaths.AppPath($"/app/manage/{appId}/publish/readiness"));
        }

        /// <summary>
        /// 获取应用统计
        /// </summary>
        public async Task<PlusApiResultAppStatisticsVO?> GetAppStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultAppStatisticsVO>(ApiPaths.AppPath("/app/manage/statistics"));
        }

        /// <summary>
        /// 搜索应用
        /// </summary>
        public async Task<PlusApiResultPageAppVO?> SearchAppsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAppVO>(ApiPaths.AppPath("/app/manage/search"), query);
        }

        /// <summary>
        /// 获取项目应用
        /// </summary>
        public async Task<PlusApiResultPageAppVO?> GetProjectAppsAsync(string projectId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAppVO>(ApiPaths.AppPath($"/app/manage/project/{projectId}"), query);
        }

        /// <summary>
        /// 获取我的应用
        /// </summary>
        public async Task<PlusApiResultPageAppVO?> GetMyAppsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAppVO>(ApiPaths.AppPath("/app/manage/my"), query);
        }

        /// <summary>
        /// 获取账户余额汇总
        /// </summary>
        public async Task<PlusApiResultAccountSummaryVO?> GetAccountSummaryAsync()
        {
            return await _client.GetAsync<PlusApiResultAccountSummaryVO>(ApiPaths.AppPath("/account/summary"));
        }
    }
}
