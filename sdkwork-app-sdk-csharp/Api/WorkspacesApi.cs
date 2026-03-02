using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class WorkspacesApi
    {
        private readonly HttpClient _client;

        public WorkspacesApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取工作空间详情
        /// </summary>
        public async Task<PlusApiResultWorkspaceVO?> GetWorkspaceDetailAsync(string workspaceId)
        {
            return await _client.GetAsync<PlusApiResultWorkspaceVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}"));
        }

        /// <summary>
        /// 更新工作空间
        /// </summary>
        public async Task<PlusApiResultWorkspaceVO?> UpdateWorkspaceAsync(string workspaceId, WorkspaceUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultWorkspaceVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}"), body);
        }

        /// <summary>
        /// 删除工作空间
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteWorkspaceAsync(string workspaceId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}"));
        }

        /// <summary>
        /// 获取项目详情
        /// </summary>
        public async Task<PlusApiResultProjectDetailVO?> GetProjectDetailAsync(string workspaceId, string projectId)
        {
            return await _client.GetAsync<PlusApiResultProjectDetailVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects/{projectId}"));
        }

        /// <summary>
        /// 更新项目
        /// </summary>
        public async Task<PlusApiResultProjectVO?> UpdateProjectAsync(string workspaceId, string projectId, ProjectUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultProjectVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects/{projectId}"), body);
        }

        /// <summary>
        /// 删除项目
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteProjectAsync(string workspaceId, string projectId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects/{projectId}"));
        }

        /// <summary>
        /// 取消归档项目
        /// </summary>
        public async Task<PlusApiResultVoid?> UnarchiveProjectAsync(string workspaceId, string projectId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects/{projectId}/unarchive"), null);
        }

        /// <summary>
        /// 移动项目
        /// </summary>
        public async Task<PlusApiResultVoid?> MoveProjectAsync(string workspaceId, string projectId, ProjectMoveForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects/{projectId}/move"), body);
        }

        /// <summary>
        /// 归档项目
        /// </summary>
        public async Task<PlusApiResultVoid?> ArchiveProjectAsync(string workspaceId, string projectId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects/{projectId}/archive"), null);
        }

        /// <summary>
        /// 更新成员角色
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateMemberRoleAsync(string workspaceId, string userId, MemberRoleUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}/members/{userId}/role"), body);
        }

        /// <summary>
        /// 获取工作空间列表
        /// </summary>
        public async Task<PlusApiResultListWorkspaceVO?> ListWorkspacesAsync()
        {
            return await _client.GetAsync<PlusApiResultListWorkspaceVO>(ApiPaths.AppPath("/workspaces"));
        }

        /// <summary>
        /// 创建工作空间
        /// </summary>
        public async Task<PlusApiResultWorkspaceVO?> CreateWorkspaceAsync(WorkspaceCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultWorkspaceVO>(ApiPaths.AppPath("/workspaces"), body);
        }

        /// <summary>
        /// 获取项目列表
        /// </summary>
        public async Task<PlusApiResultPageProjectVO?> ListProjectsAsync(string workspaceId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageProjectVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects"), query);
        }

        /// <summary>
        /// 创建项目
        /// </summary>
        public async Task<PlusApiResultProjectVO?> CreateProjectAsync(string workspaceId, ProjectCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultProjectVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects"), body);
        }

        /// <summary>
        /// 复制项目
        /// </summary>
        public async Task<PlusApiResultProjectVO?> CopyProjectAsync(string workspaceId, string projectId, ProjectCopyForm body)
        {
            return await _client.PostAsync<PlusApiResultProjectVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}/projects/{projectId}/copy"), body);
        }

        /// <summary>
        /// 获取工作空间成员
        /// </summary>
        public async Task<PlusApiResultListMemberVO?> ListWorkspaceMembersAsync(string workspaceId)
        {
            return await _client.GetAsync<PlusApiResultListMemberVO>(ApiPaths.AppPath($"/workspaces/{workspaceId}/members"));
        }

        /// <summary>
        /// 邀请成员
        /// </summary>
        public async Task<PlusApiResultVoid?> InviteMemberAsync(string workspaceId, MemberInviteForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}/members"), body);
        }

        /// <summary>
        /// 获取当前工作空间
        /// </summary>
        public async Task<PlusApiResultWorkspaceVO?> GetCurrentWorkspaceAsync()
        {
            return await _client.GetAsync<PlusApiResultWorkspaceVO>(ApiPaths.AppPath("/workspaces/current"));
        }

        /// <summary>
        /// 移除成员
        /// </summary>
        public async Task<PlusApiResultVoid?> RemoveMemberAsync(string workspaceId, string userId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/workspaces/{workspaceId}/members/{userId}"));
        }
    }
}
