using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class SearchApi
    {
        private readonly HttpClient _client;

        public SearchApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 搜索历史
        /// </summary>
        public async Task<PlusApiResultListSearchHistoryVO?> GetSearchHistoryAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListSearchHistoryVO>(ApiPaths.AppPath("/search/history"), query);
        }

        /// <summary>
        /// 添加搜索历史
        /// </summary>
        public async Task<PlusApiResultVoid?> AddSearchHistoryAsync(SearchHistoryAddRequest body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/search/history"), body);
        }

        /// <summary>
        /// 清空搜索历史
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearSearchHistoryAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/search/history"));
        }

        /// <summary>
        /// 高级搜索
        /// </summary>
        public async Task<PlusApiResultPageSearchResult?> AdvancedAsync(AdvancedSearchRequest body)
        {
            return await _client.PostAsync<PlusApiResultPageSearchResult>(ApiPaths.AppPath("/search/advanced"), body);
        }

        /// <summary>
        /// 全局搜索
        /// </summary>
        public async Task<PlusApiResultGlobalSearchVO?> GlobalAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultGlobalSearchVO>(ApiPaths.AppPath("/search"), query);
        }

        /// <summary>
        /// 搜索用户
        /// </summary>
        public async Task<PlusApiResultPageUserSearchResult?> UsersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageUserSearchResult>(ApiPaths.AppPath("/search/users"), query);
        }

        /// <summary>
        /// 搜索建议
        /// </summary>
        public async Task<PlusApiResultListSearchSuggestionVO?> GetSearchSuggestionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListSearchSuggestionVO>(ApiPaths.AppPath("/search/suggestions"), query);
        }

        /// <summary>
        /// 搜索统计
        /// </summary>
        public async Task<PlusApiResultSearchStatisticsVO?> GetSearchStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultSearchStatisticsVO>(ApiPaths.AppPath("/search/statistics"));
        }

        /// <summary>
        /// 搜索项目
        /// </summary>
        public async Task<PlusApiResultPageProjectSearchResult?> ProjectsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProjectSearchResult>(ApiPaths.AppPath("/search/projects"), query);
        }

        /// <summary>
        /// 搜索笔记
        /// </summary>
        public async Task<PlusApiResultPageNoteSearchResult?> NotesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNoteSearchResult>(ApiPaths.AppPath("/search/notes"), query);
        }

        /// <summary>
        /// 热门搜索
        /// </summary>
        public async Task<PlusApiResultListHotSearchVO?> GetHotSearchesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListHotSearchVO>(ApiPaths.AppPath("/search/hot"), query);
        }

        /// <summary>
        /// 筛选条件
        /// </summary>
        public async Task<PlusApiResultSearchFiltersVO?> GetSearchFiltersAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultSearchFiltersVO>(ApiPaths.AppPath("/search/filters"), query);
        }

        /// <summary>
        /// 搜索资源
        /// </summary>
        public async Task<PlusApiResultPageAssetSearchResult?> AssetsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAssetSearchResult>(ApiPaths.AppPath("/search/assets"), query);
        }

        /// <summary>
        /// 删除搜索历史
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteSearchHistoryAsync(string keyword)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/search/history/{keyword}"));
        }
    }
}
