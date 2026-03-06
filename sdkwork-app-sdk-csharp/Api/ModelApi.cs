using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ModelApi
    {
        private readonly HttpClient _client;

        public ModelApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Batch get model prices
        /// </summary>
        public async Task<PlusApiResultListModelPriceVO?> GetModelPricesAsync(GetModelPricesRequest body)
        {
            return await _client.PostAsync<PlusApiResultListModelPriceVO>(ApiPaths.AppPath("/models/prices/batch"), body);
        }

        /// <summary>
        /// Get model detail
        /// </summary>
        public async Task<PlusApiResultModelInfoDetailVO?> GetModelByIdAsync(string modelId)
        {
            return await _client.GetAsync<PlusApiResultModelInfoDetailVO>(ApiPaths.AppPath($"/models/{modelId}"));
        }

        /// <summary>
        /// Get model types
        /// </summary>
        public async Task<PlusApiResultListModelTypeVO?> GetModelTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListModelTypeVO>(ApiPaths.AppPath("/models/types"));
        }

        /// <summary>
        /// Get models by type
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetModelsByTypeAsync(string modelType, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath($"/models/type/{modelType}"), query);
        }

        /// <summary>
        /// Get model statistics
        /// </summary>
        public async Task<PlusApiResultModelStatisticsVO?> GetModelStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultModelStatisticsVO>(ApiPaths.AppPath("/models/statistics"));
        }

        /// <summary>
        /// Search models
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> SearchModelsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath("/models/search"), query);
        }

        /// <summary>
        /// Get model default price
        /// </summary>
        public async Task<PlusApiResultModelPriceVO?> GetModelPriceAsync(string model)
        {
            return await _client.GetAsync<PlusApiResultModelPriceVO>(ApiPaths.AppPath($"/models/price/{model}"));
        }

        /// <summary>
        /// Get model pricing rules
        /// </summary>
        public async Task<PlusApiResultListModelPriceVO?> GetModelPriceRulesAsync(string model, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListModelPriceVO>(ApiPaths.AppPath($"/models/price-rules/{model}"), query);
        }

        /// <summary>
        /// Get popular models
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetPopularModelsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath("/models/popular"), query);
        }

        /// <summary>
        /// Get models by family
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetModelsByFamilyAsync(string family, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath($"/models/family/{family}"), query);
        }

        /// <summary>
        /// Get all families
        /// </summary>
        public async Task<PlusApiResultListString?> GetAllFamiliesAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.AppPath("/models/families"));
        }

        /// <summary>
        /// Get models by channel
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetModelsByChannelAsync(string channel, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath($"/models/channel/{channel}"), query);
        }

        /// <summary>
        /// Get model detail by alias
        /// </summary>
        public async Task<PlusApiResultModelInfoDetailVO?> GetModelByAsync(string model)
        {
            return await _client.GetAsync<PlusApiResultModelInfoDetailVO>(ApiPaths.AppPath($"/models/by-model/{model}"));
        }

        /// <summary>
        /// Get active models
        /// </summary>
        public async Task<PlusApiResultPageModelInfoVO?> GetActiveModelsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageModelInfoVO>(ApiPaths.AppPath("/models/active"), query);
        }
    }
}
