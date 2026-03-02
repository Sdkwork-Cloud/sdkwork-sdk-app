using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class DriveApi
    {
        private readonly HttpClient _client;

        public DriveApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Rename drive item
        /// </summary>
        public async Task<PlusApiResultDriveItemVO?> RenameItemAsync(string itemId, DriveRenameForm body)
        {
            return await _client.PutAsync<PlusApiResultDriveItemVO>(ApiPaths.AppPath($"/drive/items/{itemId}/rename"), body);
        }

        /// <summary>
        /// Move drive item
        /// </summary>
        public async Task<PlusApiResultDriveItemVO?> MoveItemAsync(string itemId, DriveMoveForm body)
        {
            return await _client.PutAsync<PlusApiResultDriveItemVO>(ApiPaths.AppPath($"/drive/items/{itemId}/move"), body);
        }

        /// <summary>
        /// Get drive file content
        /// </summary>
        public async Task<PlusApiResultDriveContentVO?> GetItemContentAsync(string itemId)
        {
            return await _client.GetAsync<PlusApiResultDriveContentVO>(ApiPaths.AppPath($"/drive/items/{itemId}/content"));
        }

        /// <summary>
        /// Update drive file content
        /// </summary>
        public async Task<PlusApiResultDriveContentVO?> UpdateItemContentAsync(string itemId, DriveContentUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultDriveContentVO>(ApiPaths.AppPath($"/drive/items/{itemId}/content"), body);
        }

        /// <summary>
        /// Copy drive item
        /// </summary>
        public async Task<PlusApiResultDriveItemVO?> CopyItemAsync(string itemId, DriveCopyForm body)
        {
            return await _client.PostAsync<PlusApiResultDriveItemVO>(ApiPaths.AppPath($"/drive/items/{itemId}/copy"), body);
        }

        /// <summary>
        /// Batch delete drive items
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchDeleteItemsAsync(DriveBatchDeleteForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/drive/items/batch-delete"), body);
        }

        /// <summary>
        /// Create drive folder
        /// </summary>
        public async Task<PlusApiResultDriveItemVO?> CreateFolderAsync(DriveFolderCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultDriveItemVO>(ApiPaths.AppPath("/drive/folders"), body);
        }

        /// <summary>
        /// List drive items
        /// </summary>
        public async Task<PlusApiResultPageDriveItemVO?> ListItemsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageDriveItemVO>(ApiPaths.AppPath("/drive/items"), query);
        }

        /// <summary>
        /// Get drive item detail
        /// </summary>
        public async Task<PlusApiResultDriveItemDetailVO?> GetItemDetailAsync(string itemId)
        {
            return await _client.GetAsync<PlusApiResultDriveItemDetailVO>(ApiPaths.AppPath($"/drive/items/{itemId}"));
        }

        /// <summary>
        /// Delete drive item
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteItemAsync(string itemId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/drive/items/{itemId}"));
        }
    }
}
