using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class NotesApi
    {
        private readonly HttpClient _client;

        public NotesApi(HttpClient client)
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
        /// 恢复笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> RestoreNoteAsync(string noteId)
        {
            return await _client.PutAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}/restore"), null);
        }

        /// <summary>
        /// 移动笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> MoveNoteAsync(string noteId, NoteMoveRequest body)
        {
            return await _client.PutAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}/move"), body);
        }

        /// <summary>
        /// 获取笔记正文
        /// </summary>
        public async Task<PlusApiResultNoteContentVO?> GetNoteContentAsync(string noteId)
        {
            return await _client.GetAsync<PlusApiResultNoteContentVO>(ApiPaths.AppPath($"/notes/{noteId}/content"));
        }

        /// <summary>
        /// 更新笔记正文
        /// </summary>
        public async Task<PlusApiResultNoteContentVO?> UpdateNoteContentAsync(string noteId, NoteContentUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultNoteContentVO>(ApiPaths.AppPath($"/notes/{noteId}/content"), body);
        }

        /// <summary>
        /// 归档笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> ArchiveNoteAsync(string noteId)
        {
            return await _client.PutAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath($"/notes/{noteId}/archive"), null);
        }

        /// <summary>
        /// 重命名文件夹
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
        /// 取消收藏
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
        /// 批量更新笔记正文
        /// </summary>
        public async Task<PlusApiResultNoteBatchUpdateResultVO?> BatchUpdateNoteAsync(string noteId, NoteBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultNoteBatchUpdateResultVO>(ApiPaths.AppPath($"/notes/{noteId}/batch-update"), body);
        }

        /// <summary>
        /// 批量更新笔记正文
        /// </summary>
        public async Task<PlusApiResultNoteBatchUpdateResultVO?> CreateBatchUpdateNoteAsync(string noteId, NoteBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultNoteBatchUpdateResultVO>(ApiPaths.AppPath($"/notes/{noteId}:batchUpdate"), body);
        }

        /// <summary>
        /// 获取文件夹树
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
        /// 获取笔记统计
        /// </summary>
        public async Task<PlusApiResultNoteStatisticsVO?> GetNoteStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultNoteStatisticsVO>(ApiPaths.AppPath("/notes/statistics"));
        }

        /// <summary>
        /// 批量删除笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> BatchDeleteAsync()
        {
            return await _client.DeleteAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath("/notes/batch"));
        }

        /// <summary>
        /// 批量删除笔记
        /// </summary>
        public async Task<PlusApiResultNoteOperationVO?> DeleteBatchAsync()
        {
            return await _client.DeleteAsync<PlusApiResultNoteOperationVO>(ApiPaths.AppPath("/notes/batch-delete"));
        }
    }
}
