using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class PositionsApi
    {
        private readonly HttpClient _client;

        public PositionsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取组织的岗位列表
        /// </summary>
        public async Task<PlusApiResultListPositionVO?> GetPositionsByOrgAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultListPositionVO>(ApiPaths.AppPath($"/organization/{orgId}/positions"));
        }

        /// <summary>
        /// 获取岗位树
        /// </summary>
        public async Task<PlusApiResultListPositionDetailVO?> GetPositionTreeAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultListPositionDetailVO>(ApiPaths.AppPath($"/organization/{orgId}/positions/tree"));
        }
    }
}
