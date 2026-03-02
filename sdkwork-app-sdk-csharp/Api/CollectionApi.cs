using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CollectionApi
    {
        private readonly HttpClient _client;

        public CollectionApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取合集详情
        /// </summary>
        public async Task<PlusApiResultCollectionDetailVO?> GetCollectionAsync(string collectionId)
        {
            return await _client.GetAsync<PlusApiResultCollectionDetailVO>(ApiPaths.AppPath($"/collection/{collectionId}"));
        }

        /// <summary>
        /// 更新合集
        /// </summary>
        public async Task<PlusApiResultCollectionVO?> UpdateCollectionAsync(string collectionId, CollectionUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultCollectionVO>(ApiPaths.AppPath($"/collection/{collectionId}"), body);
        }

        /// <summary>
        /// 删除合集
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteCollectionAsync(string collectionId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/collection/{collectionId}"));
        }

        /// <summary>
        /// 更新内容排序
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateItemPositionsAsync(string collectionId, CollectionItemPositionForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/collection/{collectionId}/items/positions"), body);
        }

        /// <summary>
        /// 创建合集
        /// </summary>
        public async Task<PlusApiResultCollectionVO?> CreateCollectionAsync(CollectionCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultCollectionVO>(ApiPaths.AppPath("/collection"), body);
        }

        /// <summary>
        /// 获取合集内容列表
        /// </summary>
        public async Task<PlusApiResultListCollectionItemVO?> GetCollectionItemsAsync(string collectionId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListCollectionItemVO>(ApiPaths.AppPath($"/collection/{collectionId}/items"), query);
        }

        /// <summary>
        /// 添加内容到合集
        /// </summary>
        public async Task<PlusApiResultCollectionItemVO?> AddItemAsync(string collectionId, CollectionItemAddForm body)
        {
            return await _client.PostAsync<PlusApiResultCollectionItemVO>(ApiPaths.AppPath($"/collection/{collectionId}/items"), body);
        }

        /// <summary>
        /// 置顶内容
        /// </summary>
        public async Task<PlusApiResultVoid?> PinItemAsync(string collectionId, string itemId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/collection/{collectionId}/items/{itemId}/pin"), null);
        }

        /// <summary>
        /// 取消置顶
        /// </summary>
        public async Task<PlusApiResultVoid?> UnpinItemAsync(string collectionId, string itemId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/collection/{collectionId}/items/{itemId}/pin"));
        }

        /// <summary>
        /// 获取合集路径
        /// </summary>
        public async Task<PlusApiResultListCollectionVO?> GetCollectionPathAsync(string collectionId)
        {
            return await _client.GetAsync<PlusApiResultListCollectionVO>(ApiPaths.AppPath($"/collection/{collectionId}/path"));
        }

        /// <summary>
        /// 获取合集树
        /// </summary>
        public async Task<PlusApiResultListCollectionTreeVO?> GetCollectionTreeAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListCollectionTreeVO>(ApiPaths.AppPath("/collection/tree"), query);
        }

        /// <summary>
        /// 搜索合集
        /// </summary>
        public async Task<PlusApiResultPageCollectionVO?> SearchCollectionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCollectionVO>(ApiPaths.AppPath("/collection/search"), query);
        }

        /// <summary>
        /// 获取我的合集
        /// </summary>
        public async Task<PlusApiResultPageCollectionVO?> GetMyCollectionsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageCollectionVO>(ApiPaths.AppPath("/collection/my"), query);
        }

        /// <summary>
        /// 从合集移除内容
        /// </summary>
        public async Task<PlusApiResultVoid?> RemoveItemAsync(string collectionId, string contentId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/collection/{collectionId}/items/{contentId}"));
        }
    }
}
