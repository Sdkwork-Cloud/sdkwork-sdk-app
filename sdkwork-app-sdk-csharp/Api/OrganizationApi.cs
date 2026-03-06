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
        /// 禁用组织
        /// </summary>
        public async Task<PlusApiResultOrganizationVO?> DisableAsync(string orgId)
        {
            return await _client.PostAsync<PlusApiResultOrganizationVO>(ApiPaths.AppPath($"/organization/{orgId}/disable"), null);
        }

        /// <summary>
        /// 激活组织
        /// </summary>
        public async Task<PlusApiResultOrganizationVO?> ActivateAsync(string orgId)
        {
            return await _client.PostAsync<PlusApiResultOrganizationVO>(ApiPaths.AppPath($"/organization/{orgId}/activate"), null);
        }

        /// <summary>
        /// 创建岗位
        /// </summary>
        public async Task<PlusApiResultPositionVO?> CreatePositionAsync(PositionCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultPositionVO>(ApiPaths.AppPath("/organization/position"), body);
        }

        /// <summary>
        /// 创建部门
        /// </summary>
        public async Task<PlusApiResultDepartmentVO?> CreateDepartmentAsync(DepartmentCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultDepartmentVO>(ApiPaths.AppPath("/organization/department"), body);
        }

        /// <summary>
        /// 获取组织详情
        /// </summary>
        public async Task<PlusApiResultOrganizationDetailVO?> GetOrganizationAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultOrganizationDetailVO>(ApiPaths.AppPath($"/organization/{orgId}"));
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

        /// <summary>
        /// 获取组织成员
        /// </summary>
        public async Task<PlusApiResultPageMemberVO?> GetMembersByOrgAsync(string orgId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageMemberVO>(ApiPaths.AppPath($"/organization/{orgId}/members"), query);
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

        /// <summary>
        /// 获取子组织
        /// </summary>
        public async Task<PlusApiResultListOrganizationVO?> GetChildOrganizationsAsync(string orgId)
        {
            return await _client.GetAsync<PlusApiResultListOrganizationVO>(ApiPaths.AppPath($"/organization/{orgId}/children"));
        }

        /// <summary>
        /// 获取组织统计
        /// </summary>
        public async Task<PlusApiResultOrganizationStatisticsVO?> GetOrganizationStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultOrganizationStatisticsVO>(ApiPaths.AppPath("/organization/statistics"));
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

        /// <summary>
        /// 获取成员详情
        /// </summary>
        public async Task<PlusApiResultMemberVO?> GetMemberAsync(string memberId)
        {
            return await _client.GetAsync<PlusApiResultMemberVO>(ApiPaths.AppPath($"/organization/member/{memberId}"));
        }

        /// <summary>
        /// 获取组织列表
        /// </summary>
        public async Task<PlusApiResultPageOrganizationVO?> GetOrganizationListAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageOrganizationVO>(ApiPaths.AppPath("/organization/list"), query);
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

        /// <summary>
        /// 根据编码获取组织
        /// </summary>
        public async Task<PlusApiResultOrganizationDetailVO?> GetOrganizationByCodeAsync(string code)
        {
            return await _client.GetAsync<PlusApiResultOrganizationDetailVO>(ApiPaths.AppPath($"/organization/code/{code}"));
        }
    }
}
