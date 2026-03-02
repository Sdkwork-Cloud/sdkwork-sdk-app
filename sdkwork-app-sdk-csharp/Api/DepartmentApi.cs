using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class DepartmentApi
    {
        private readonly HttpClient _client;

        public DepartmentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 创建部门
        /// </summary>
        public async Task<PlusApiResultDepartmentVO?> CreateDepartmentAsync(DepartmentCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultDepartmentVO>(ApiPaths.AppPath("/organization/department"), body);
        }

        /// <summary>
        /// 获取部门详情
        /// </summary>
        public async Task<PlusApiResultDepartmentDetailVO?> GetDepartmentAsync(string deptId)
        {
            return await _client.GetAsync<PlusApiResultDepartmentDetailVO>(ApiPaths.AppPath($"/organization/department/{deptId}"));
        }

        /// <summary>
        /// 获取子部门
        /// </summary>
        public async Task<PlusApiResultListDepartmentVO?> GetChildDepartmentsAsync(string deptId)
        {
            return await _client.GetAsync<PlusApiResultListDepartmentVO>(ApiPaths.AppPath($"/organization/department/{deptId}/children"));
        }
    }
}
