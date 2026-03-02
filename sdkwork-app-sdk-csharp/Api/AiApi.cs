using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AiApi
    {
        private readonly HttpClient _client;

        public AiApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取提示语详情
        /// </summary>
        public async Task<PlusApiResultPromptVO?> GetPromptDetailAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPromptVO>(ApiPaths.AppPath($"/prompt/{id}"));
        }

        /// <summary>
        /// 更新提示语
        /// </summary>
        public async Task<PlusApiResultPromptVO?> UpdatePromptAsync(string id, PromptUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultPromptVO>(ApiPaths.AppPath($"/prompt/{id}"), body);
        }

        /// <summary>
        /// 删除提示语
        /// </summary>
        public async Task<PlusApiResultVoid?> DeletePromptAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/prompt/{id}"));
        }

        /// <summary>
        /// 创建提示语
        /// </summary>
        public async Task<PlusApiResultPromptVO?> CreatePromptAsync(PromptCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultPromptVO>(ApiPaths.AppPath("/prompt"), body);
        }

        /// <summary>
        /// 使用提示语
        /// </summary>
        public async Task<PlusApiResultVoid?> UsePromptAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/prompt/{id}/use"), null);
        }

        /// <summary>
        /// 收藏提示语
        /// </summary>
        public async Task<PlusApiResultVoid?> FavoritePromptAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/prompt/{id}/favorite"), null);
        }

        /// <summary>
        /// 取消收藏提示语
        /// </summary>
        public async Task<PlusApiResultVoid?> UnfavoritePromptAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/prompt/{id}/favorite"));
        }

        /// <summary>
        /// 获取热门提示语
        /// </summary>
        public async Task<PlusApiResultPagePromptVO?> GetPopularPromptsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePromptVO>(ApiPaths.AppPath("/prompt/popular"), query);
        }

        /// <summary>
        /// 获取最受欢迎提示语
        /// </summary>
        public async Task<PlusApiResultPagePromptVO?> GetMostFavoritedPromptsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePromptVO>(ApiPaths.AppPath("/prompt/most-favorited"), query);
        }

        /// <summary>
        /// 获取提示语列表
        /// </summary>
        public async Task<PlusApiResultPagePromptVO?> ListPromptsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePromptVO>(ApiPaths.AppPath("/prompt/list"), query);
        }

        /// <summary>
        /// 获取提示语历史详情
        /// </summary>
        public async Task<PlusApiResultPromptHistoryVO?> GetPromptHistoryDetailAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPromptHistoryVO>(ApiPaths.AppPath($"/prompt/history/{id}"));
        }

        /// <summary>
        /// 删除提示语历史
        /// </summary>
        public async Task<PlusApiResultVoid?> DeletePromptHistoryAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/prompt/history/{id}"));
        }

        /// <summary>
        /// 获取提示语使用历史
        /// </summary>
        public async Task<PlusApiResultPagePromptHistoryVO?> ListPromptHistoryAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePromptHistoryVO>(ApiPaths.AppPath("/prompt/history/list"), query);
        }
    }
}
