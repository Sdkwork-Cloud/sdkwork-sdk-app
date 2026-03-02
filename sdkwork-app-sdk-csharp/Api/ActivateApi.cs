using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ActivateApi
    {
        private readonly HttpClient _client;

        public ActivateApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 激活组织
        /// </summary>
        public async Task<PlusApiResultOrganizationVO?> OrganizationAsync(string orgId)
        {
            return await _client.PostAsync<PlusApiResultOrganizationVO>(ApiPaths.AppPath($"/organization/{orgId}/activate"), null);
        }
    }
}
