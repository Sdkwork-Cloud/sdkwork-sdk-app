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
        /// Create feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> CreateAsync(FeedCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath("/feeds"), body);
        }

        /// <summary>
        /// Unlike feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> UnlikeAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/unlike/{id}"), null);
        }

        /// <summary>
        /// Uncollect feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> UncollectAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/uncollect/{id}"), null);
        }

        /// <summary>
        /// Share feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> ShareAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/share/{id}"), null);
        }

        /// <summary>
        /// Like feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> LikeAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/like/{id}"), null);
        }

        /// <summary>
        /// Collect feed
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> CollectAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/collect/{id}"), null, query);
        }

        /// <summary>
        /// Get top feeds
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetTopFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/top"), query);
        }

        /// <summary>
        /// Search feeds
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> SearchFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/search"), query);
        }

        /// <summary>
        /// Get recommended feeds
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetRecommendedFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/recommend"), query);
        }

        /// <summary>
        /// Get most viewed feeds
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetMostViewedFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/most-viewed"), query);
        }

        /// <summary>
        /// Get most liked feeds
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetMostLikedFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/most-liked"), query);
        }

        /// <summary>
        /// Get feed list
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetFeedListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/list"), query);
        }

        /// <summary>
        /// Get hot feeds
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetHotFeedsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath("/feeds/hot"), query);
        }

        /// <summary>
        /// Get feed detail
        /// </summary>
        public async Task<PlusApiResultFeedItemVO?> GetFeedDetailAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultFeedItemVO>(ApiPaths.AppPath($"/feeds/detail/{id}"));
        }

        /// <summary>
        /// Check collected status
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckCollectedAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/feeds/check-collected/{id}"));
        }

        /// <summary>
        /// Get feeds by category
        /// </summary>
        public async Task<PlusApiResultListFeedItemVO?> GetFeedsByCategoryAsync(string categoryId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFeedItemVO>(ApiPaths.AppPath($"/feeds/category/{categoryId}"), query);
        }

        /// <summary>
        /// Delete feed
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/feeds/{id}"));
        }
    }
}
