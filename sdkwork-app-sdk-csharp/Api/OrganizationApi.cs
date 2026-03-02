using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class OrganizationApi
    {
        private readonly HttpClient _client;

        public OrganizationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 创建组织
        /// </summary>
        public async Task<PlusApiResultOrganizationVO?> CreateOrganizationAsync(OrganizationCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultOrganizationVO>(ApiPaths.AppPath("/organization"), body);
        }

        /// <summary>
        /// 获取组织详情
        /// </summary>
        public async Task<PlusApiResultOrganizationDetailVO?> GetOrganizationAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultOrganizationDetailVO>(ApiPaths.AppPath($"/organization/{orgId}"));
        }
    }
}
