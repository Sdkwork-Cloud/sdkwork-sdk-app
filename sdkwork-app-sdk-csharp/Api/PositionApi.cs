using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class PositionApi
    {
        private readonly HttpClient _client;

        public PositionApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 创建岗位
        /// </summary>
        public async Task<PlusApiResultPositionVO?> CreatePositionAsync(PositionCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultPositionVO>(ApiPaths.AppPath("/organization/position"), body);
        }

        /// <summary>
        /// 获取岗位详情
        /// </summary>
        public async Task<PlusApiResultPositionDetailVO?> GetPositionAsync(string posId)
        {
            return await _client.GetAsync<PlusApiResultPositionDetailVO>(ApiPaths.AppPath($"/organization/position/{posId}"));
        }

        /// <summary>
        /// 获取子岗位
        /// </summary>
        public async Task<PlusApiResultListPositionVO?> GetChildPositionsAsync(string posId)
        {
            return await _client.GetAsync<PlusApiResultListPositionVO>(ApiPaths.AppPath($"/organization/position/{posId}/children"));
        }
    }
}
