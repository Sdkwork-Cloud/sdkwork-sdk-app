using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class ProjectsApi
    {
        private readonly HttpClient _client;

        public ProjectsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取项目详情
        /// </summary>
        public async Task<PlusApiResultProjectDetailVO?> GetProjectDetailAsync(string projectId)
        {
            return await _client.GetAsync<PlusApiResultProjectDetailVO>(ApiPaths.AppPath($"/projects/{projectId}"));
        }

        /// <summary>
        /// 更新项目
        /// </summary>
        public async Task<PlusApiResultProjectVO?> UpdateProjectAsync(string projectId, ProjectUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultProjectVO>(ApiPaths.AppPath($"/projects/{projectId}"), body);
        }

        /// <summary>
        /// 删除项目
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteProjectAsync(string projectId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/projects/{projectId}"));
        }

        /// <summary>
        /// 取消归档项目
        /// </summary>
        public async Task<PlusApiResultVoid?> UnarchiveProjectAsync(string projectId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/projects/{projectId}/unarchive"), null);
        }

        /// <summary>
        /// 移动项目
        /// </summary>
        public async Task<PlusApiResultVoid?> MoveProjectAsync(string projectId, ProjectMoveRequest body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/projects/{projectId}/move"), body);
        }

        /// <summary>
        /// 归档项目
        /// </summary>
        public async Task<PlusApiResultVoid?> ArchiveProjectAsync(string projectId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/projects/{projectId}/archive"), null);
        }

        /// <summary>
        /// 获取项目列表
        /// </summary>
        public async Task<PlusApiResultPageProjectVO?> ListProjectsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProjectVO>(ApiPaths.AppPath("/projects"), query);
        }

        /// <summary>
        /// 创建项目
        /// </summary>
        public async Task<PlusApiResultProjectVO?> CreateProjectAsync(ProjectCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultProjectVO>(ApiPaths.AppPath("/projects"), body);
        }

        /// <summary>
        /// 复制项目
        /// </summary>
        public async Task<PlusApiResultProjectVO?> CopyProjectAsync(string projectId, ProjectCopyRequest body)
        {
            return await _client.PostAsync<PlusApiResultProjectVO>(ApiPaths.AppPath($"/projects/{projectId}/copy"), body);
        }

        /// <summary>
        /// 项目统计
        /// </summary>
        public async Task<PlusApiResultProjectStatisticsVO?> GetProjectStatisticsAsync(string projectId)
        {
            return await _client.GetAsync<PlusApiResultProjectStatisticsVO>(ApiPaths.AppPath($"/projects/{projectId}/statistics"));
        }

        /// <summary>
        /// 搜索项目
        /// </summary>
        public async Task<PlusApiResultPageProjectVO?> SearchAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProjectVO>(ApiPaths.AppPath("/projects/search"), query);
        }

        /// <summary>
        /// 最近访问项目
        /// </summary>
        public async Task<PlusApiResultListProjectVO?> ListRecentAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListProjectVO>(ApiPaths.AppPath("/projects/recent"), query);
        }
    }
}
