using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class DisableApi
    {
        private readonly HttpClient _client;

        public DisableApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 禁用组织
        /// </summary>
        public async Task<PlusApiResultOrganizationVO?> OrganizationAsync(string orgId)
        {
            return await _client.PostAsync<PlusApiResultOrganizationVO>(ApiPaths.AppPath($"/organization/{orgId}/disable"), null);
        }
    }
}
