using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ModelsApi
    {
        private readonly HttpClient _client;

        public ModelsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 批量获取模型价格
        /// </summary>
        public async Task<PlusApiResultListModelPriceVO?> GetModelPricesAsync(GetModelPricesRequest body)
        {
            return await _client.PostAsync<PlusApiResultListModelPriceVO>(ApiPaths.AppPath("/models/prices/batch"), body);
        }

        /// <summary>
        /// 获取模型详情
        /// </summary>
        public async Task<PlusApiResultModelInfoDetailVO?> GetModelByIdAsync(string modelId)
        {
            return await _client.GetAsync<PlusApiResultModelInfoDetailVO>(ApiPaths.AppPath($"/models/{modelId}"));
        }

        /// <summary>
        /// 获取模型类型列表
        /// </summary>
        public async Task<PlusApiResultListModelTypeVO?> GetModelTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListModelTypeVO>(ApiPaths.AppPath("/models/types"));
        }

        /// <summary>
        /// 获取类型模型列表
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetModelsByTypeAsync(string modelType, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath($"/models/type/{modelType}"), query);
        }

        /// <summary>
        /// 获取模型统计
        /// </summary>
        public async Task<PlusApiResultModelStatisticsVO?> GetModelStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultModelStatisticsVO>(ApiPaths.AppPath("/models/statistics"));
        }

        /// <summary>
        /// 搜索模型
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> SearchAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath("/models/search"), query);
        }

        /// <summary>
        /// 获取模型价格
        /// </summary>
        public async Task<PlusApiResultModelPriceVO?> GetModelPriceAsync(string model)
        {
            return await _client.GetAsync<PlusApiResultModelPriceVO>(ApiPaths.AppPath($"/models/price/{model}"));
        }

        /// <summary>
        /// 获取热门模型
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetPopularAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath("/models/popular"), query);
        }

        /// <summary>
        /// 获取系列模型列表
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetModelsByFamilyAsync(string family, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath($"/models/family/{family}"), query);
        }

        /// <summary>
        /// 获取所有模型系列
        /// </summary>
        public async Task<PlusApiResultListString?> GetAllFamiliesAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.AppPath("/models/families"));
        }

        /// <summary>
        /// 获取渠道模型列表
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetModelsByChannelAsync(string channel, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath($"/models/channel/{channel}"), query);
        }

        /// <summary>
        /// 根据模型标识获取详情
        /// </summary>
        public async Task<PlusApiResultModelInfoDetailVO?> GetModelByAsync(string model)
        {
            return await _client.GetAsync<PlusApiResultModelInfoDetailVO>(ApiPaths.AppPath($"/models/by-model/{model}"));
        }

        /// <summary>
        /// 获取活跃模型列表
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetActiveAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath("/models/active"), query);
        }
    }
}
