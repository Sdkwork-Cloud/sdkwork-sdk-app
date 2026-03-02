using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class FileSystemApi
    {
        private readonly HttpClient _client;

        public FileSystemApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Rename node
        /// </summary>
        public async Task<PlusApiResultFileSystemNodeVO?> RenameNodeAsync(string nodeId, FileSystemRenameForm body)
        {
            return await _client.PutAsync<PlusApiResultFileSystemNodeVO>(ApiPaths.AppPath($"/filesystem/nodes/{nodeId}/rename"), body);
        }

        /// <summary>
        /// Move node
        /// </summary>
        public async Task<PlusApiResultFileSystemNodeVO?> MoveNodeAsync(string nodeId, FileSystemMoveForm body)
        {
            return await _client.PutAsync<PlusApiResultFileSystemNodeVO>(ApiPaths.AppPath($"/filesystem/nodes/{nodeId}/move"), body);
        }

        /// <summary>
        /// Get file content
        /// </summary>
        public async Task<PlusApiResultFileSystemContentVO?> GetFileContentAsync(string fileId)
        {
            return await _client.GetAsync<PlusApiResultFileSystemContentVO>(ApiPaths.AppPath($"/filesystem/files/{fileId}/content"));
        }

        /// <summary>
        /// Update file content
        /// </summary>
        public async Task<PlusApiResultFileSystemContentVO?> UpdateFileContentAsync(string fileId, FileSystemContentUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultFileSystemContentVO>(ApiPaths.AppPath($"/filesystem/files/{fileId}/content"), body);
        }

        /// <summary>
        /// Copy node
        /// </summary>
        public async Task<PlusApiResultFileSystemNodeVO?> CopyNodeAsync(string nodeId, FileSystemCopyForm body)
        {
            return await _client.PostAsync<PlusApiResultFileSystemNodeVO>(ApiPaths.AppPath($"/filesystem/nodes/{nodeId}/copy"), body);
        }

        /// <summary>
        /// Create folder
        /// </summary>
        public async Task<PlusApiResultFileSystemNodeVO?> CreateFolderAsync(FileSystemFolderCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultFileSystemNodeVO>(ApiPaths.AppPath("/filesystem/folders"), body);
        }

        /// <summary>
        /// Create file
        /// </summary>
        public async Task<PlusApiResultFileSystemNodeVO?> CreateFileAsync(FileSystemFileCreateForm body)
        {
            return await _client.PostAsync<PlusApiResultFileSystemNodeVO>(ApiPaths.AppPath("/filesystem/files"), body);
        }

        /// <summary>
        /// List nodes
        /// </summary>
        public async Task<PlusApiResultPageFileSystemNodeVO?> ListNodesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageFileSystemNodeVO>(ApiPaths.AppPath("/filesystem/nodes"), query);
        }

        /// <summary>
        /// Get node detail
        /// </summary>
        public async Task<PlusApiResultFileSystemNodeVO?> GetNodeDetailAsync(string nodeId)
        {
            return await _client.GetAsync<PlusApiResultFileSystemNodeVO>(ApiPaths.AppPath($"/filesystem/nodes/{nodeId}"));
        }

        /// <summary>
        /// Delete node
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteNodeAsync(string nodeId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/filesystem/nodes/{nodeId}"));
        }

        /// <summary>
        /// List disks
        /// </summary>
        public async Task<PlusApiResultListFileSystemDiskVO?> ListDisksAsync()
        {
            return await _client.GetAsync<PlusApiResultListFileSystemDiskVO>(ApiPaths.AppPath("/filesystem/disks"));
        }

        /// <summary>
        /// Get primary disk
        /// </summary>
        public async Task<PlusApiResultFileSystemDiskVO?> GetPrimaryDiskAsync()
        {
            return await _client.GetAsync<PlusApiResultFileSystemDiskVO>(ApiPaths.AppPath("/filesystem/disks/default"));
        }
    }
}
