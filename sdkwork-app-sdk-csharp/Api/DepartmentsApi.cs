using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class DepartmentsApi
    {
        private readonly HttpClient _client;

        public DepartmentsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取组织的部门列表
        /// </summary>
        public async Task<PlusApiResultListDepartmentVO?> GetDepartmentsByOrgAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultListDepartmentVO>(ApiPaths.AppPath($"/organization/{orgId}/departments"));
        }

        /// <summary>
        /// 获取部门树
        /// </summary>
        public async Task<PlusApiResultListDepartmentDetailVO?> GetDepartmentTreeAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultListDepartmentDetailVO>(ApiPaths.AppPath($"/organization/{orgId}/departments/tree"));
        }
    }
}
