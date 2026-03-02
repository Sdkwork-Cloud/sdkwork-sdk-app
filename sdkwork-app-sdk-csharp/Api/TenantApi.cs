using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class TenantApi
    {
        private readonly HttpClient _client;

        public TenantApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取租户详情
        /// </summary>
        public async Task<PlusApiResultTenantDetailVO?> GetTenantAsync(string tenantId)
        {
            return await _client.GetAsync<PlusApiResultTenantDetailVO>(ApiPaths.AppPath($"/tenant/{tenantId}"));
        }

        /// <summary>
        /// 更新租户
        /// </summary>
        public async Task<PlusApiResultTenantVO?> UpdateTenantAsync(string tenantId, TenantUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultTenantVO>(ApiPaths.AppPath($"/tenant/{tenantId}"), body);
        }

        /// <summary>
        /// 创建租户
        /// </summary>
        public async Task<PlusApiResultTenantVO?> CreateTenantAsync(TenantCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultTenantVO>(ApiPaths.AppPath("/tenant"), body);
        }

        /// <summary>
        /// 冻结租户
        /// </summary>
        public async Task<PlusApiResultTenantVO?> FreezeAsync(string tenantId)
        {
            return await _client.PostAsync<PlusApiResultTenantVO>(ApiPaths.AppPath($"/tenant/{tenantId}/freeze"), null);
        }

        /// <summary>
        /// 注销租户
        /// </summary>
        public async Task<PlusApiResultTenantVO?> CloseAsync(string tenantId)
        {
            return await _client.PostAsync<PlusApiResultTenantVO>(ApiPaths.AppPath($"/tenant/{tenantId}/close"), null);
        }

        /// <summary>
        /// 激活租户
        /// </summary>
        public async Task<PlusApiResultTenantVO?> ActivateAsync(string tenantId)
        {
            return await _client.PostAsync<PlusApiResultTenantVO>(ApiPaths.AppPath($"/tenant/{tenantId}/activate"), null);
        }

        /// <summary>
        /// 获取租户类型列表
        /// </summary>
        public async Task<PlusApiResultListTenantTypeVO?> GetTenantTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListTenantTypeVO>(ApiPaths.AppPath("/tenant/types"));
        }

        /// <summary>
        /// 获取租户统计
        /// </summary>
        public async Task<PlusApiResultTenantStatisticsVO?> GetTenantStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultTenantStatisticsVO>(ApiPaths.AppPath("/tenant/statistics"));
        }

        /// <summary>
        /// 获取根租户
        /// </summary>
        public async Task<PlusApiResultTenantDetailVO?> GetRootAsync()
        {
            return await _client.GetAsync<PlusApiResultTenantDetailVO>(ApiPaths.AppPath("/tenant/root"));
        }

        /// <summary>
        /// 获取租户列表
        /// </summary>
        public async Task<PlusApiResultPageTenantVO?> GetTenantListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageTenantVO>(ApiPaths.AppPath("/tenant/list"), query);
        }

        /// <summary>
        /// 根据编码获取租户
        /// </summary>
        public async Task<PlusApiResultTenantDetailVO?> GetTenantByCodeAsync(string code)
        {
            return await _client.GetAsync<PlusApiResultTenantDetailVO>(ApiPaths.AppPath($"/tenant/code/{code}"));
        }

        /// <summary>
        /// 获取云租户
        /// </summary>
        public async Task<PlusApiResultTenantDetailVO?> GetCloudAsync()
        {
            return await _client.GetAsync<PlusApiResultTenantDetailVO>(ApiPaths.AppPath("/tenant/cloud"));
        }
    }
}
