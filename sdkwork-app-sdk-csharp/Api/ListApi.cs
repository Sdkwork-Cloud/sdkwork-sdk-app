using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ListApi
    {
        private readonly HttpClient _client;

        public ListApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取组织列表
        /// </summary>
        public async Task<PlusApiResultPageOrganizationVO?> GetOrganizationAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageOrganizationVO>(ApiPaths.AppPath("/organization/list"), query);
        }
    }
}
