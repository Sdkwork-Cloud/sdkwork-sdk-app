using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ToolApi
    {
        private readonly HttpClient _client;

        public ToolApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update tool credentials
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> UpdateCredentialsAsync(string toolId, UpdateCredentialsRequest? body = null)
        {
            return await _client.PutAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/tools/my/{toolId}/credentials"), body);
        }

        /// <summary>
        /// List my tools
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListMineAsync()
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath("/tools/my"));
        }

        /// <summary>
        /// Install tool
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> InstallAsync(InstallRequest? body = null)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath("/tools/my"), body);
        }

        /// <summary>
        /// Test tool
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> TestAsync(string toolId)
        {
            return await _client.PostAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/tools/market/{toolId}/test"), null);
        }

        /// <summary>
        /// List tool market
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListMarketAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath("/tools/market"), query);
        }

        /// <summary>
        /// Get tool market item
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetMarketItemAsync(string toolId)
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath($"/tools/market/{toolId}"));
        }

        /// <summary>
        /// List tool categories
        /// </summary>
        public async Task<PlusApiResultListMapStringObject?> ListCategoriesAsync()
        {
            return await _client.GetAsync<PlusApiResultListMapStringObject>(ApiPaths.AppPath("/tools/categories"));
        }

        /// <summary>
        /// Uninstall tool
        /// </summary>
        public async Task<PlusApiResultVoid?> UninstallAsync(string toolId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/tools/my/{toolId}"));
        }
    }
}
