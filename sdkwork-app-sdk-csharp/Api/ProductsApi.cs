using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ProductsApi
    {
        private readonly HttpClient _client;

        public ProductsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取商品列表
        /// </summary>
        public async Task<PlusApiResultPageProductVO?> GetProductsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProductVO>(ApiPaths.AppPath("/products"), query);
        }

        /// <summary>
        /// 获取商品详情
        /// </summary>
        public async Task<PlusApiResultProductDetailVO?> GetProductDetailAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultProductDetailVO>(ApiPaths.AppPath($"/products/{productId}"));
        }

        /// <summary>
        /// 获取商品库存
        /// </summary>
        public async Task<PlusApiResultInteger?> GetProductStockAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultInteger>(ApiPaths.AppPath($"/products/{productId}/stock"));
        }

        /// <summary>
        /// 获取商品统计
        /// </summary>
        public async Task<PlusApiResultProductStatisticsVO?> GetProductStatisticsAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultProductStatisticsVO>(ApiPaths.AppPath($"/products/{productId}/statistics"));
        }

        /// <summary>
        /// 获取商品SKU列表
        /// </summary>
        public async Task<PlusApiResultListSkuVO?> GetProductSkusAsync(string productId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListSkuVO>(ApiPaths.AppPath($"/products/{productId}/skus"), query);
        }

        /// <summary>
        /// 检查商品库存
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckProductStockAsync(string productId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/products/{productId}/check-stock"), query);
        }

        /// <summary>
        /// 搜索商品
        /// </summary>
        public async Task<PlusApiResultPageProductVO?> SearchAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProductVO>(ApiPaths.AppPath("/products/search"), query);
        }

        /// <summary>
        /// 获取最新商品
        /// </summary>
        public async Task<PlusApiResultListProductVO?> GetLatestAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListProductVO>(ApiPaths.AppPath("/products/latest"), query);
        }

        /// <summary>
        /// 获取热门商品
        /// </summary>
        public async Task<PlusApiResultListProductVO?> GetHotAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListProductVO>(ApiPaths.AppPath("/products/hot"), query);
        }

        /// <summary>
        /// 按编码获取商品
        /// </summary>
        public async Task<PlusApiResultProductVO?> GetProductByCodeAsync(string code)
        {
            return await _client.GetAsync<PlusApiResultProductVO>(ApiPaths.AppPath($"/products/code/{code}"));
        }

        /// <summary>
        /// 按分类获取商品
        /// </summary>
        public async Task<PlusApiResultPageProductVO?> GetProductsByCategoryAsync(string categoryId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProductVO>(ApiPaths.AppPath($"/products/category/{categoryId}"), query);
        }
    }
}
