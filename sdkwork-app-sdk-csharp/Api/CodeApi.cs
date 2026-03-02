using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class CodeApi
    {
        private readonly HttpClient _client;

        public CodeApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 根据编码获取组织
        /// </summary>
        public async Task<PlusApiResultOrganizationDetailVO?> GetOrganizationByAsync(string code)
        {
            return await _client.GetAsync<PlusApiResultOrganizationDetailVO>(ApiPaths.AppPath($"/organization/code/{code}"));
        }
    }
}
