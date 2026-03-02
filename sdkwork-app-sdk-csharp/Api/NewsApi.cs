using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class NewsApi
    {
        private readonly HttpClient _client;

        public NewsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取新闻详情
        /// </summary>
        public async Task<PlusApiResultNewsDetailVO?> GetNewsAsync(string newsId)
        {
            return await _client.GetAsync<PlusApiResultNewsDetailVO>(ApiPaths.AppPath($"/news/{newsId}"));
        }

        /// <summary>
        /// 更新新闻
        /// </summary>
        public async Task<PlusApiResultNewsVO?> UpdateNewsAsync(string newsId, NewsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultNewsVO>(ApiPaths.AppPath($"/news/{newsId}"), body);
        }

        /// <summary>
        /// 删除新闻
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteNewsAsync(string newsId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/news/{newsId}"));
        }

        /// <summary>
        /// 创建新闻
        /// </summary>
        public async Task<PlusApiResultNewsVO?> CreateNewsAsync(NewsCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultNewsVO>(ApiPaths.AppPath("/news"), body);
        }

        /// <summary>
        /// 搜索新闻
        /// </summary>
        public async Task<PlusApiResultPageNewsVO?> SearchAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNewsVO>(ApiPaths.AppPath("/news/search"), query);
        }

        /// <summary>
        /// 获取我的新闻
        /// </summary>
        public async Task<PlusApiResultPageNewsVO?> GetMyAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNewsVO>(ApiPaths.AppPath("/news/my"), query);
        }

        /// <summary>
        /// 获取最新新闻
        /// </summary>
        public async Task<PlusApiResultPageNewsVO?> GetLatestAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNewsVO>(ApiPaths.AppPath("/news/latest"), query);
        }

        /// <summary>
        /// 获取分类新闻
        /// </summary>
        public async Task<PlusApiResultPageNewsVO?> GetCategoryAsync(string categoryId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNewsVO>(ApiPaths.AppPath($"/news/category/{categoryId}"), query);
        }
    }
}
