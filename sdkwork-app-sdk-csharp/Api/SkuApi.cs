using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class SkuApi
    {
        private readonly HttpClient _client;

        public SkuApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取SKU详情
        /// </summary>
        public async Task<PlusApiResultSkuDetailVO?> GetSkuDetailAsync(string skuId)
        {
            return await _client.GetAsync<PlusApiResultSkuDetailVO>(ApiPaths.AppPath($"/skus/{skuId}"));
        }

        /// <summary>
        /// 获取SKU库存
        /// </summary>
        public async Task<PlusApiResultSkuStockVO?> GetSkuStockAsync(string skuId)
        {
            return await _client.GetAsync<PlusApiResultSkuStockVO>(ApiPaths.AppPath($"/skus/{skuId}/stock"));
        }

        /// <summary>
        /// 检查SKU库存
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckSkuStockAsync(string skuId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/skus/{skuId}/check-stock"), query);
        }

        /// <summary>
        /// 获取产品的SKU列表
        /// </summary>
        public async Task<PlusApiResultPageSkuVO?> GetSkuByProductAsync(string productId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageSkuVO>(ApiPaths.AppPath($"/skus/product/{productId}"), query);
        }

        /// <summary>
        /// 获取产品SKU统计
        /// </summary>
        public async Task<PlusApiResultSkuStatisticsVO?> GetSkuStatisticsAsync(string productId)
        {
            return await _client.GetAsync<PlusApiResultSkuStatisticsVO>(ApiPaths.AppPath($"/skus/product/{productId}/statistics"));
        }

        /// <summary>
        /// 检查SKU编码是否存在
        /// </summary>
        public async Task<PlusApiResultBoolean?> CheckSkuCodeExistsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultBoolean>(ApiPaths.AppPath("/skus/exists"), query);
        }

        /// <summary>
        /// 按编码获取SKU
        /// </summary>
        public async Task<PlusApiResultSkuVO?> GetSkuByCodeAsync(string skuCode)
        {
            return await _client.GetAsync<PlusApiResultSkuVO>(ApiPaths.AppPath($"/skus/code/{skuCode}"));
        }

        /// <summary>
        /// 批量获取SKU
        /// </summary>
        public async Task<PlusApiResultListSkuVO?> BatchGetSkusAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListSkuVO>(ApiPaths.AppPath("/skus/batch"), query);
        }
    }
}
