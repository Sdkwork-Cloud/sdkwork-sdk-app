using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ShopsApi
    {
        private readonly HttpClient _client;

        public ShopsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取店铺详情
        /// </summary>
        public async Task<PlusApiResultShopDetailVO?> GetShopDetailAsync(string shopId)
        {
            return await _client.GetAsync<PlusApiResultShopDetailVO>(ApiPaths.AppPath($"/shops/{shopId}"));
        }

        /// <summary>
        /// 更新店铺
        /// </summary>
        public async Task<PlusApiResultShopVO?> UpdateShopAsync(string shopId, ShopUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultShopVO>(ApiPaths.AppPath($"/shops/{shopId}"), body);
        }

        /// <summary>
        /// 删除店铺
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteShopAsync(string shopId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/shops/{shopId}"));
        }

        /// <summary>
        /// 更新店铺状态
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateStatusAsync(string shopId, Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/shops/{shopId}/status"), null, query);
        }

        /// <summary>
        /// 开店营业
        /// </summary>
        public async Task<PlusApiResultVoid?> OpenShopAsync(string shopId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/shops/{shopId}/open"), null);
        }

        /// <summary>
        /// 关店休息
        /// </summary>
        public async Task<PlusApiResultVoid?> CloseShopAsync(string shopId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/shops/{shopId}/close"), null);
        }

        /// <summary>
        /// 获取店铺列表
        /// </summary>
        public async Task<PlusApiResultPageShopVO?> ListShopsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageShopVO>(ApiPaths.AppPath("/shops"), query);
        }

        /// <summary>
        /// 创建店铺
        /// </summary>
        public async Task<PlusApiResultShopVO?> CreateShopAsync(ShopCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultShopVO>(ApiPaths.AppPath("/shops"), body);
        }

        /// <summary>
        /// 获取店铺统计
        /// </summary>
        public async Task<PlusApiResultShopStatisticsVO?> GetStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultShopStatisticsVO>(ApiPaths.AppPath("/shops/statistics"));
        }

        /// <summary>
        /// 获取所有激活店铺
        /// </summary>
        public async Task<PlusApiResultListShopVO?> ListAllActiveAsync()
        {
            return await _client.GetAsync<PlusApiResultListShopVO>(ApiPaths.AppPath("/shops/all"));
        }
    }
}
