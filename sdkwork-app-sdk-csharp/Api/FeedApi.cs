using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class FeedApi
    {
        private readonly HttpClient _client;

        public FeedApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 取消点赞Feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> UnlikeAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/unlike/{id}"), null);
        }

        /// <summary>
        /// 取消收藏Feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> UncollectAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/uncollect/{id}"), null);
        }

        /// <summary>
        /// 分享Feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> ShareAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/share/{id}"), null);
        }

        /// <summary>
        /// 点赞Feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> LikeAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/like/{id}"), null);
        }

        /// <summary>
        /// 收藏Feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> CollectAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/collect/{id}"), null, query);
        }

        /// <summary>
        /// 获取置顶Feed
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetTopFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/top"), query);
        }

        /// <summary>
        /// 搜索Feed
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> SearchFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/search"), query);
        }

        /// <summary>
        /// 获取推荐Feed
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetRecommendedFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/recommend"), query);
        }

        /// <summary>
        /// 获取最多浏览Feed
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetMostViewedFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/most-viewed"), query);
        }

        /// <summary>
        /// 获取最多点赞Feed
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetMostLikedFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/most-liked"), query);
        }

        /// <summary>
        /// 获取Feed列表
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetFeedListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/list"), query);
        }

        /// <summary>
        /// 获取热门Feed
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetHotFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/hot"), query);
        }

        /// <summary>
        /// 获取Feed详情
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> GetFeedDetailAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/detail/{id}"));
        }

        /// <summary>
        /// 检查收藏状态
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckCollectedAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/feeds/check-collected/{id}"));
        }

        /// <summary>
        /// 获取分类Feed
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetFeedsByCategoryAsync(string categoryId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath($"/feeds/category/{categoryId}"), query);
        }
    }
}
