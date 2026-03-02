using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ChildrenApi
    {
        private readonly HttpClient _client;

        public ChildrenApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取子组织
        /// </summary>
        public async Task<PlusApiResultListOrganizationVO?> GetChildOrganizationsAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultListOrganizationVO>(ApiPaths.AppPath($"/organization/{orgId}/children"));
        }
    }
}
