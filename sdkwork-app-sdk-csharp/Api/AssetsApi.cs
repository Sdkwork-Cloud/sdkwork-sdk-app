using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AssetsApi
    {
        private readonly HttpClient _client;

        public AssetsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 重命名资产
        /// </summary>
        public async Task<PlusApiResultVoid?> RenameAssetAsync(string assetId, AssetRenameForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/assets/{assetId}/rename"), body);
        }

        /// <summary>
        /// 移动资产
        /// </summary>
        public async Task<PlusApiResultVoid?> MoveAssetAsync(string assetId, AssetMoveForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/assets/{assetId}/move"), body);
        }

        /// <summary>
        /// 收藏资产
        /// </summary>
        public async Task<PlusApiResultVoid?> FavoriteAssetAsync(string assetId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/assets/{assetId}/favorite"), null);
        }

        /// <summary>
        /// 取消收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> UnfavoriteAssetAsync(string assetId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/assets/{assetId}/favorite"));
        }

        /// <summary>
        /// 获取文件夹列表
        /// </summary>
        public async Task<PlusApiResultListFolderVO?> ListFoldersAsync()
        {
            return await _client.GetAsync<PlusApiResultListFolderVO>(ApiPaths.AppPath("/assets/folders"));
        }

        /// <summary>
        /// 创建文件夹
        /// </summary>
        public async Task<PlusApiResultFolderVO?> CreateFolderAsync(FolderCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultFolderVO>(ApiPaths.AppPath("/assets/folders"), body);
        }

        /// <summary>
        /// 获取资产列表
        /// </summary>
        public async Task<PlusApiResultPageAssetVO?> ListAssetsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAssetVO>(ApiPaths.AppPath("/assets"), query);
        }

        /// <summary>
        /// 获取资产详情
        /// </summary>
        public async Task<PlusApiResultAssetDetailVO?> GetAssetDetailAsync(string assetId)
        {
            return await _client.GetAsync<PlusApiResultAssetDetailVO>(ApiPaths.AppPath($"/assets/{assetId}"));
        }

        /// <summary>
        /// 删除资产
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteAssetAsync(string assetId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/assets/{assetId}"));
        }

        /// <summary>
        /// 下载资产
        /// </summary>
        public async Task<PlusApiResultDownloadUrlVO?> GetDownloadUrlAsync(string assetId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultDownloadUrlVO>(ApiPaths.AppPath($"/assets/{assetId}/download"), query);
        }

        /// <summary>
        /// 获取资产统计
        /// </summary>
        public async Task<PlusApiResultAssetStatisticsVO?> GetStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultAssetStatisticsVO>(ApiPaths.AppPath("/assets/statistics"));
        }

        /// <summary>
        /// 删除文件夹
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteFolderAsync(string folderId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/assets/folders/{folderId}"));
        }

        /// <summary>
        /// 批量删除资产
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchDeleteAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/assets/batch"));
        }
    }
}
