using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class UploadApi
    {
        private readonly HttpClient _client;

        public UploadApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 获取上传策略
        /// </summary>
        public async Task<PlusApiResultUploadPolicyVO?> GetUploadPolicyAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultUploadPolicyVO>(ApiPaths.AppPath("/upload/upload-policy"), null, query);
        }

        /// <summary>
        /// 获取上传凭证
        /// </summary>
        public async Task<PlusApiResultUploadCredentialsVO?> GetUploadCredentialsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultUploadCredentialsVO>(ApiPaths.AppPath("/upload/upload-credentials"), null, query);
        }

        /// <summary>
        /// 获取预签名URL
        /// </summary>
        public async Task<PlusApiResultPresignedUrlVO?> GetPresignedUrlAsync(PresignedUrlForm body)
        {
            return await _client.PostAsync<PlusApiResultPresignedUrlVO>(ApiPaths.AppPath("/upload/presigned-url"), body);
        }

        /// <summary>
        /// 上传图片
        /// </summary>
        public async Task<PlusApiResultFileVO?> ImageAsync(ImageRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileVO>(ApiPaths.AppPath("/upload/image"), body, query);
        }

        /// <summary>
        /// 上传Base64图片
        /// </summary>
        public async Task<PlusApiResultFileVO?> Base64ImageAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileVO>(ApiPaths.AppPath("/upload/image/base64"), null, query);
        }

        /// <summary>
        /// 获取文件列表
        /// </summary>
        public async Task<PlusApiResultPageFileVO?> ListFilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageFileVO>(ApiPaths.AppPath("/upload/files"), query);
        }

        /// <summary>
        /// 多文件上传
        /// </summary>
        public async Task<PlusApiResultListFileVO?> FilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultListFileVO>(ApiPaths.AppPath("/upload/files"), null, query);
        }

        /// <summary>
        /// 复制文件
        /// </summary>
        public async Task<PlusApiResultFileVO?> CopyFileAsync(string fileId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileVO>(ApiPaths.AppPath($"/upload/files/{fileId}/copy"), null, query);
        }

        /// <summary>
        /// 单文件上传
        /// </summary>
        public async Task<PlusApiResultFileVO?> FileAsync(FileRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileVO>(ApiPaths.AppPath("/upload/file"), body, query);
        }

        /// <summary>
        /// 上传分片
        /// </summary>
        public async Task<PlusApiResultUploadChunkVO?> ChunkAsync(ChunkRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultUploadChunkVO>(ApiPaths.AppPath("/upload/chunk"), body, query);
        }

        /// <summary>
        /// 合并分片
        /// </summary>
        public async Task<PlusApiResultFileVO?> MergeChunksAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileVO>(ApiPaths.AppPath("/upload/chunk/merge"), null, query);
        }

        /// <summary>
        /// 初始化分片上传
        /// </summary>
        public async Task<PlusApiResultUploadInitVO?> InitChunkAsync(UploadInitForm body)
        {
            return await _client.PostAsync<PlusApiResultUploadInitVO>(ApiPaths.AppPath("/upload/chunk/init"), body);
        }

        /// <summary>
        /// 获取上传进度
        /// </summary>
        public async Task<PlusApiResultUploadChunkVO?> GetUploadProgressAsync(string uploadId)
        {
            return await _client.GetAsync<PlusApiResultUploadChunkVO>(ApiPaths.AppPath($"/upload/task/{uploadId}/progress"));
        }

        /// <summary>
        /// 获取存储使用情况
        /// </summary>
        public async Task<PlusApiResultStorageUsageVO?> GetStorageUsageAsync()
        {
            return await _client.GetAsync<PlusApiResultStorageUsageVO>(ApiPaths.AppPath("/upload/storage/usage"));
        }

        /// <summary>
        /// 获取文件预签名URL
        /// </summary>
        public async Task<PlusApiResultPresignedUrlVO?> GetFilePresignedUrlAsync(string fileId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPresignedUrlVO>(ApiPaths.AppPath($"/upload/presigned-url/{fileId}"), query);
        }

        /// <summary>
        /// 获取文件详情
        /// </summary>
        public async Task<PlusApiResultFileVO?> GetFileDetailAsync(string fileId)
        {
            return await _client.GetAsync<PlusApiResultFileVO>(ApiPaths.AppPath($"/upload/files/{fileId}"));
        }

        /// <summary>
        /// 删除文件
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteFileAsync(string fileId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/upload/files/{fileId}"));
        }

        /// <summary>
        /// 查询分片状态
        /// </summary>
        public async Task<PlusApiResultListInteger?> GetChunkStatusAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListInteger>(ApiPaths.AppPath("/upload/chunk/status"), query);
        }

        /// <summary>
        /// 取消上传
        /// </summary>
        public async Task<PlusApiResultVoid?> CancelAsync(string uploadId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/upload/task/{uploadId}"));
        }
    }
}
