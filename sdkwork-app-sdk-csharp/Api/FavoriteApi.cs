using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class FavoriteApi
    {
        private readonly HttpClient _client;

        public FavoriteApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 移动收藏
        /// </summary>
        public async Task<PlusApiResultFavoriteVO?> MoveFavoriteToFolderAsync(string favoriteId, FavoriteMoveForm body)
        {
            return await _client.PutAsync<PlusApiResultFavoriteVO>(ApiPaths.AppPath($"/favorite/{favoriteId}/move"), body);
        }

        /// <summary>
        /// 更新收藏夹
        /// </summary>
        public async Task<PlusApiResultFavoriteFolderVO?> UpdateFavoriteFolderAsync(string folderId, FavoriteFolderUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultFavoriteFolderVO>(ApiPaths.AppPath($"/favorite/folders/{folderId}"), body);
        }

        /// <summary>
        /// 删除收藏夹
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteFavoriteFolderAsync(string folderId, Dictionary<string, object>? query = null)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/favorite/folders/{folderId}"), query);
        }

        /// <summary>
        /// 批量移动收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchMoveFavoritesAsync(FavoriteBatchMoveForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/favorite/batch/move"), body);
        }

        /// <summary>
        /// 收藏列表
        /// </summary>
        public async Task<PlusApiResultPageFavoriteItemVO?> ListFavoritesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageFavoriteItemVO>(ApiPaths.AppPath("/favorite"), query);
        }

        /// <summary>
        /// 添加收藏
        /// </summary>
        public async Task<PlusApiResultFavoriteVO?> AddAsync(FavoriteAddForm body)
        {
            return await _client.PostAsync<PlusApiResultFavoriteVO>(ApiPaths.AppPath("/favorite"), body);
        }

        /// <summary>
        /// 收藏夹列表
        /// </summary>
        public async Task<PlusApiResultListFavoriteFolderVO?> ListFavoriteFoldersAsync()
        {
            return await _client.GetAsync<PlusApiResultListFavoriteFolderVO>(ApiPaths.AppPath("/favorite/folders"));
        }

        /// <summary>
        /// 创建收藏夹
        /// </summary>
        public async Task<PlusApiResultFavoriteFolderVO?> CreateFavoriteFolderAsync(FavoriteFolderCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultFavoriteFolderVO>(ApiPaths.AppPath("/favorite/folders"), body);
        }

        /// <summary>
        /// 批量检查收藏
        /// </summary>
        public async Task<PlusApiResultListFavoriteCheckVO?> BatchCheckFavoritesAsync(FavoriteBatchCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultListFavoriteCheckVO>(ApiPaths.AppPath("/favorite/batch-check"), body);
        }

        /// <summary>
        /// 收藏详情
        /// </summary>
        public async Task<PlusApiResultFavoriteDetailVO?> GetFavoriteDetailAsync(string favoriteId)
        {
            return await _client.GetAsync<PlusApiResultFavoriteDetailVO>(ApiPaths.AppPath($"/favorite/{favoriteId}"));
        }

        /// <summary>
        /// 取消收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> RemoveAsync(string favoriteId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/favorite/{favoriteId}"));
        }

        /// <summary>
        /// 收藏统计
        /// </summary>
        public async Task<PlusApiResultFavoriteStatisticsVO?> GetFavoriteStatisticsAsync()
        {
            return await _client.GetAsync<PlusApiResultFavoriteStatisticsVO>(ApiPaths.AppPath("/favorite/statistics"));
        }

        /// <summary>
        /// 最近收藏
        /// </summary>
        public async Task<PlusApiResultListFavoriteItemVO?> GetRecentFavoritesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFavoriteItemVO>(ApiPaths.AppPath("/favorite/recent"), query);
        }

        /// <summary>
        /// 各类型收藏数
        /// </summary>
        public async Task<PlusApiResultListFavoriteTypeCountVO?> GetFavoriteCountByTypeAsync()
        {
            return await _client.GetAsync<PlusApiResultListFavoriteTypeCountVO>(ApiPaths.AppPath("/favorite/count/by-type"));
        }

        /// <summary>
        /// 检查收藏状态
        /// </summary>
        public async Task<PlusApiResultFavoriteCheckVO?> CheckAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultFavoriteCheckVO>(ApiPaths.AppPath("/favorite/check"), query);
        }

        /// <summary>
        /// 按目标取消收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> RemoveFavoriteByTargetAsync(Dictionary<string, object>? query = null)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/favorite/by-target"), query);
        }

        /// <summary>
        /// 批量取消收藏
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchRemoveFavoritesAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/favorite/batch"));
        }
    }
}
