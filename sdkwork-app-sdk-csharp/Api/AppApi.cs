using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AppApi
    {
        private readonly HttpClient _client;

        public AppApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取笔记详情
        /// </summary>
        public async Task<PlusApiResultNoteVO?> GetNoteDetailAsync(string noteId)
        {
            return await _client.GetAsync<PlusApiResultNoteVO>(ApiPaths.AppPath($"/notes/{noteId}"));
        }

        /// <summary>
        /// 更新笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> UpdateNoteAsync(string noteId, NoteUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}"), body);
        }

        /// <summary>
        /// 删除笔记
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteNoteAsync(string noteId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notes/{noteId}"));
        }

        /// <summary>
        /// 移动笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> MoveNoteAsync(string noteId, NoteMoveRequest body)
        {
            return await _client.PutAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}/move"), body);
        }

        /// <summary>
        /// 更新文件夹
        /// </summary>
        public async Task<PlusApiResultNoteFolderVO?> UpdateFolderAsync(string folderId, NoteFolderUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultNoteFolderVO>(ApiPaths.AppPath($"/notes/folders/{folderId}"), body);
        }

        /// <summary>
        /// 删除文件夹
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> DeleteFolderAsync(string folderId)
        {
            return await _client.DeleteAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/folders/{folderId}"));
        }

        /// <summary>
        /// 获取应用详情
        /// </summary>
        public async Task<PlusApiResultAppDetailVO?> GetAppAsync(string appId)
        {
            return await _client.GetAsync<PlusApiResultAppDetailVO>(ApiPaths.AppPath($"/app/manage/{appId}"));
        }

        /// <summary>
        /// 更新应用
        /// </summary>
        public async Task<PlusApiResultAppVO?> UpdateAppAsync(string appId, AppUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultAppVO>(ApiPaths.AppPath($"/app/manage/{appId}"), body);
        }

        /// <summary>
        /// 删除应用
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteAppAsync(string appId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/app/manage/{appId}"));
        }

        /// <summary>
        /// 获取笔记列表
        /// </summary>
        public async Task<PlusApiResultPageNoteVO?> ListNotesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNoteVO>(ApiPaths.AppPath("/notes"), query);
        }

        /// <summary>
        /// 创建笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> CreateNoteAsync(NoteCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath("/notes"), body);
        }

        /// <summary>
        /// 收藏笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> FavoriteNoteAsync(string noteId)
        {
            return await _client.PostAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}/favorite"), null);
        }

        /// <summary>
        /// 取消收藏笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> UnfavoriteNoteAsync(string noteId)
        {
            return await _client.DeleteAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}/favorite"));
        }

        /// <summary>
        /// 复制笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> CopyNoteAsync(string noteId, NoteCopyRequest body)
        {
            return await _client.PostAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}/copy"), body);
        }

        /// <summary>
        /// 获取文件夹列表
        /// </summary>
        public async Task<PlusApiResultListNoteFolderVO?> ListFoldersAsync()
        {
            return await _client.GetAsync<PlusApiResultListNoteFolderVO>(ApiPaths.AppPath("/notes/folders"));
        }

        /// <summary>
        /// 创建文件夹
        /// </summary>
        public async Task<PlusApiResultNoteFolderVO?> CreateFolderAsync(NoteFolderCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultNoteFolderVO>(ApiPaths.AppPath("/notes/folders"), body);
        }

        /// <summary>
        /// 创建应用
        /// </summary>
        public async Task<PlusApiResultAppVO?> CreateAppAsync(AppCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultAppVO>(ApiPaths.AppPath("/app/manage"), body);
        }

        /// <summary>
        /// 停用应用
        /// </summary>
        public async Task<PlusApiResultVoid?> DeactivateAsync(string appId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/app/manage/{appId}/deactivate"), null);
        }

        /// <summary>
        /// 激活应用
        /// </summary>
        public async Task<PlusApiResultVoid?> ActivateAsync(string appId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/app/manage/{appId}/activate"), null);
        }

        /// <summary>
        /// 获取笔记统计
        /// </summary>
        public async Task<PlusApiResultNoteStatisticsVO?> GetNoteStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultNoteStatisticsVO>(ApiPaths.AppPath("/notes/statistics"));
        }

        /// <summary>
        /// 获取应用统计
        /// </summary>
        public async Task<PlusApiResultAppStatisticsVO?> GetAppStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultAppStatisticsVO>(ApiPaths.AppPath("/app/manage/statistics"));
        }

        /// <summary>
        /// 搜索应用
        /// </summary>
        public async Task<PlusApiResultPageAppVO?> SearchAppsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAppVO>(ApiPaths.AppPath("/app/manage/search"), query);
        }

        /// <summary>
        /// 获取项目应用
        /// </summary>
        public async Task<PlusApiResultPageAppVO?> GetProjectAppsAsync(string projectId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAppVO>(ApiPaths.AppPath($"/app/manage/project/{projectId}"), query);
        }

        /// <summary>
        /// 获取我的应用
        /// </summary>
        public async Task<PlusApiResultPageAppVO?> GetMyAppsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAppVO>(ApiPaths.AppPath("/app/manage/my"), query);
        }

        /// <summary>
        /// 获取账户余额汇总
        /// </summary>
        public async Task<PlusApiResultAccountSummaryVO?> GetAccountSummaryAsync()
        {
            return await _client.GetAsync<PlusApiResultAccountSummaryVO>(ApiPaths.AppPath("/account/summary"));
        }

        /// <summary>
        /// 批量删除笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> BatchDeleteNotesAsync()
        {
            return await _client.DeleteAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath("/notes/batch"));
        }
    }
}
