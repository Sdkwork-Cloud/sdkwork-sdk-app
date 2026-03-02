using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class DashboardApi
    {
        private readonly HttpClient _client;

        public DashboardApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 完成待办
        /// </summary>
        public async Task<PlusApiResultVoid?> CompleteTodoItemAsync(string todoId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/dashboard/todos/{todoId}/complete"), null);
        }

        /// <summary>
        /// 快捷入口
        /// </summary>
        public async Task<PlusApiResultListShortcutVO?> GetShortcutsAsync()
        {
            return await _client.GetAsync<PlusApiResultListShortcutVO>(ApiPaths.AppPath("/dashboard/shortcuts"));
        }

        /// <summary>
        /// 更新快捷入口
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateShortcutsAsync(ShortcutsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/dashboard/shortcuts"), body);
        }

        /// <summary>
        /// 领取成就奖励
        /// </summary>
        public async Task<PlusApiResultAchievementRewardVO?> ClaimAchievementRewardAsync(string achievementId)
        {
            return await _client.PostAsync<PlusApiResultAchievementRewardVO>(ApiPaths.AppPath($"/dashboard/achievements/{achievementId}/claim"), null);
        }

        /// <summary>
        /// 今日热点
        /// </summary>
        public async Task<PlusApiResultListTrendingItemVO?> GetTrendingItemsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListTrendingItemVO>(ApiPaths.AppPath("/dashboard/trending"), query);
        }

        /// <summary>
        /// 待办事项
        /// </summary>
        public async Task<PlusApiResultListTodoItemVO?> GetTodoItemsAsync()
        {
            return await _client.GetAsync<PlusApiResultListTodoItemVO>(ApiPaths.AppPath("/dashboard/todos"));
        }

        /// <summary>
        /// 用户统计
        /// </summary>
        public async Task<PlusApiResultUserStatisticsVO?> GetUserStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultUserStatisticsVO>(ApiPaths.AppPath("/dashboard/statistics"));
        }

        /// <summary>
        /// 会员统计
        /// </summary>
        public async Task<PlusApiResultVipStatisticsVO?> GetVipStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultVipStatisticsVO>(ApiPaths.AppPath("/dashboard/statistics/vip"));
        }

        /// <summary>
        /// 使用统计
        /// </summary>
        public async Task<PlusApiResultUsageStatisticsVO?> GetUsageStatisticsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultUsageStatisticsVO>(ApiPaths.AppPath("/dashboard/statistics/usage"), query);
        }

        /// <summary>
        /// 存储统计
        /// </summary>
        public async Task<PlusApiResultStorageStatisticsVO?> GetStorageStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultStorageStatisticsVO>(ApiPaths.AppPath("/dashboard/statistics/storage"));
        }

        /// <summary>
        /// 生成统计
        /// </summary>
        public async Task<PlusApiResultGenerationStatisticsVO?> GetGenerationStatisticsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultGenerationStatisticsVO>(ApiPaths.AppPath("/dashboard/statistics/generations"), query);
        }

        /// <summary>
        /// 推荐内容
        /// </summary>
        public async Task<PlusApiResultListRecommendationVO?> GetRecommendationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListRecommendationVO>(ApiPaths.AppPath("/dashboard/recommendations"), query);
        }

        /// <summary>
        /// 数据概览
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetDataOverviewAsync()
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath("/dashboard/overview"));
        }

        /// <summary>
        /// 用户等级
        /// </summary>
        public async Task<PlusApiResultUserLevelVO?> GetUserLevelAsync()
        {
            return await _client.GetAsync<PlusApiResultUserLevelVO>(ApiPaths.AppPath("/dashboard/level"));
        }

        /// <summary>
        /// 首页数据
        /// </summary>
        public async Task<PlusApiResultHomeDashboardVO?> GetHomeAsync()
        {
            return await _client.GetAsync<PlusApiResultHomeDashboardVO>(ApiPaths.AppPath("/dashboard/home"));
        }

        /// <summary>
        /// 图表数据
        /// </summary>
        public async Task<PlusApiResultChartDataVO?> GetChartDataAsync(string chartType, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultChartDataVO>(ApiPaths.AppPath($"/dashboard/charts/{chartType}"), query);
        }

        /// <summary>
        /// 最近活动
        /// </summary>
        public async Task<PlusApiResultListRecentActivityVO?> GetRecentActivitiesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListRecentActivityVO>(ApiPaths.AppPath("/dashboard/activities"), query);
        }

        /// <summary>
        /// 成就列表
        /// </summary>
        public async Task<PlusApiResultListAchievementVO?> GetAchievementsAsync()
        {
            return await _client.GetAsync<PlusApiResultListAchievementVO>(ApiPaths.AppPath("/dashboard/achievements"));
        }
    }
}
