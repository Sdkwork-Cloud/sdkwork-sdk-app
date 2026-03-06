using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class DocumentsApi
    {
        private readonly HttpClient _client;

        public DocumentsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get document detail
        /// </summary>
        public async Task<PlusApiResultDocumentDetailVO?> GetDocumentDetailAsync(string documentId)
        {
            return await _client.GetAsync<PlusApiResultDocumentDetailVO>(ApiPaths.AppPath($"/documents/{documentId}"));
        }

        /// <summary>
        /// Update document metadata
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> UpdateDocumentAsync(string documentId, DocumentUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/documents/{documentId}"), body);
        }

        /// <summary>
        /// Delete document
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteDocumentAsync(string documentId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/documents/{documentId}"));
        }

        /// <summary>
        /// Restore document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> RestoreDocumentAsync(string documentId)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/documents/{documentId}/restore"), null);
        }

        /// <summary>
        /// Get document content
        /// </summary>
        public async Task<PlusApiResultDocumentContentVO?> GetDocumentContentAsync(string documentId)
        {
            return await _client.GetAsync<PlusApiResultDocumentContentVO>(ApiPaths.AppPath($"/documents/{documentId}/content"));
        }

        /// <summary>
        /// Update document content
        /// </summary>
        public async Task<PlusApiResultDocumentContentVO?> UpdateDocumentContentAsync(string documentId, DocumentContentUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultDocumentContentVO>(ApiPaths.AppPath($"/documents/{documentId}/content"), body);
        }

        /// <summary>
        /// Archive document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> ArchiveDocumentAsync(string documentId)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/documents/{documentId}/archive"), null);
        }

        /// <summary>
        /// List documents
        /// </summary>
        public async Task<PlusApiResultPageDocumentVO?> ListDocumentsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageDocumentVO>(ApiPaths.AppPath("/documents"), query);
        }

        /// <summary>
        /// Create document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> CreateDocumentAsync(DocumentCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath("/documents"), body);
        }

        /// <summary>
        /// Favorite document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> FavoriteDocumentAsync(string documentId)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/documents/{documentId}/favorite"), null);
        }

        /// <summary>
        /// Unfavorite document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> UnfavoriteDocumentAsync(string documentId)
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/documents/{documentId}/favorite"));
        }

        /// <summary>
        /// Copy document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> CopyDocumentAsync(string documentId, DocumentCopyRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/documents/{documentId}/copy"), body);
        }

        /// <summary>
        /// Batch update document
        /// </summary>
        public async Task<PlusApiResultDocumentBatchUpdateResultVO?> BatchUpdateDocumentAsync(string documentId, DocumentBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentBatchUpdateResultVO>(ApiPaths.AppPath($"/documents/{documentId}/batch-update"), body);
        }

        /// <summary>
        /// Batch update document
        /// </summary>
        public async Task<PlusApiResultDocumentBatchUpdateResultVO?> CreateBatchUpdateDocumentAsync(string documentId, DocumentBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentBatchUpdateResultVO>(ApiPaths.AppPath($"/documents/{documentId}:batchUpdate"), body);
        }

        /// <summary>
        /// Batch delete documents
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> BatchDeleteAsync()
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath("/documents/batch-delete"));
        }

        /// <summary>
        /// Batch delete documents
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> DeleteBatchAsync()
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath("/documents/batch"));
        }
    }
}
