using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class StatisticsApi
    {
        private readonly HttpClient _client;

        public StatisticsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取组织统计
        /// </summary>
        public async Task<PlusApiResultOrganizationStatisticsVO?> GetOrganizationAsync()
        {
            return await _client.GetAsync<PlusApiResultOrganizationStatisticsVO>(ApiPaths.AppPath("/organization/statistics"));
        }
    }
}
