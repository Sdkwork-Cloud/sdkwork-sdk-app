using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class KnowledgeDocumentsApi
    {
        private readonly HttpClient _client;

        public KnowledgeDocumentsApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Restore knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> RestoreKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/restore"), null);
        }

        /// <summary>
        /// Restore knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> UpdateRestoreKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/restore"), null);
        }

        /// <summary>
        /// Get knowledge document content
        /// </summary>
        public async Task<PlusApiResultDocumentContentVO?> GetKnowledgeDocumentContentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.GetAsync<PlusApiResultDocumentContentVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/content"));
        }

        /// <summary>
        /// Update knowledge document content
        /// </summary>
        public async Task<PlusApiResultDocumentContentVO?> UpdateKnowledgeDocumentContentAsync(string knowledgeBaseId, string documentId, DocumentContentUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultDocumentContentVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/content"), body);
        }

        /// <summary>
        /// Get knowledge document content
        /// </summary>
        public async Task<PlusApiResultDocumentContentVO?> GetKnowledgeDocumentContentKnowledgeBaseAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.GetAsync<PlusApiResultDocumentContentVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/content"));
        }

        /// <summary>
        /// Update knowledge document content
        /// </summary>
        public async Task<PlusApiResultDocumentContentVO?> UpdateKnowledgeDocumentContentKnowledgeBaseAsync(string knowledgeBaseId, string documentId, DocumentContentUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultDocumentContentVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/content"), body);
        }

        /// <summary>
        /// Archive knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> ArchiveKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/archive"), null);
        }

        /// <summary>
        /// Archive knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> UpdateArchiveKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/archive"), null);
        }

        /// <summary>
        /// Get knowledge document detail
        /// </summary>
        public async Task<PlusApiResultDocumentDetailVO?> GetKnowledgeDocumentDetailAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.GetAsync<PlusApiResultDocumentDetailVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}"));
        }

        /// <summary>
        /// Update knowledge document metadata
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> UpdateKnowledgeDocumentAsync(string knowledgeBaseId, string documentId, DocumentUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}"), body);
        }

        /// <summary>
        /// Delete knowledge document
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}"));
        }

        /// <summary>
        /// Get knowledge document detail
        /// </summary>
        public async Task<PlusApiResultDocumentDetailVO?> GetKnowledgeDocumentDetailKnowledgeBaseAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.GetAsync<PlusApiResultDocumentDetailVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}"));
        }

        /// <summary>
        /// Update knowledge document metadata
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> UpdateKnowledgeDocumentKnowledgeBaseAsync(string knowledgeBaseId, string documentId, DocumentUpdateRequest body)
        {
            return await _client.PutAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}"), body);
        }

        /// <summary>
        /// Delete knowledge document
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteKnowledgeDocumentKnowledgeBaseAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}"));
        }

        /// <summary>
        /// Favorite knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> FavoriteKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/favorite"), null);
        }

        /// <summary>
        /// Unfavorite knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> UnfavoriteKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/favorite"));
        }

        /// <summary>
        /// Favorite knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> CreateFavoriteKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/favorite"), null);
        }

        /// <summary>
        /// Unfavorite knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> DeleteUnfavoriteKnowledgeDocumentAsync(string knowledgeBaseId, string documentId)
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/favorite"));
        }

        /// <summary>
        /// Copy knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> CopyKnowledgeDocumentAsync(string knowledgeBaseId, string documentId, DocumentCopyRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/copy"), body);
        }

        /// <summary>
        /// Copy knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> CreateCopyKnowledgeDocumentAsync(string knowledgeBaseId, string documentId, DocumentCopyRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/copy"), body);
        }

        /// <summary>
        /// Batch update knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentBatchUpdateResultVO?> BatchUpdateKnowledgeDocumentAsync(string knowledgeBaseId, string documentId, DocumentBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentBatchUpdateResultVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}/batch-update"), body);
        }

        /// <summary>
        /// Batch update knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentBatchUpdateResultVO?> CreateBatchUpdateKnowledgeDocumentAsync(string knowledgeBaseId, string documentId, DocumentBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentBatchUpdateResultVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}:batchUpdate"), body);
        }

        /// <summary>
        /// Batch update knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentBatchUpdateResultVO?> CreateBatchUpdateKnowledgeDocumentDocumentIdBatchUpdateAsync(string knowledgeBaseId, string documentId, DocumentBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentBatchUpdateResultVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/{documentId}:batchUpdate"), body);
        }

        /// <summary>
        /// Batch update knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentBatchUpdateResultVO?> CreateBatchUpdateKnowledgeDocumentBatchUpdateAsync(string knowledgeBaseId, string documentId, DocumentBatchUpdateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentBatchUpdateResultVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/{documentId}/batch-update"), body);
        }

        /// <summary>
        /// List knowledge documents
        /// </summary>
        public async Task<PlusApiResultPageDocumentVO?> ListKnowledgeDocumentsAsync(string knowledgeBaseId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageDocumentVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents"), query);
        }

        /// <summary>
        /// Create knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> CreateKnowledgeDocumentAsync(string knowledgeBaseId, DocumentCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents"), body);
        }

        /// <summary>
        /// List knowledge documents
        /// </summary>
        public async Task<PlusApiResultPageDocumentVO?> GetListAsync(string knowledgeBaseId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageDocumentVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents"), query);
        }

        /// <summary>
        /// Create knowledge document
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> CreateKnowledgeDocumentKnowledgeBaseAsync(string knowledgeBaseId, DocumentCreateRequest body)
        {
            return await _client.PostAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents"), body);
        }

        /// <summary>
        /// Batch delete knowledge documents
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> BatchDeleteAsync(string knowledgeBaseId)
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/batch-delete"));
        }

        /// <summary>
        /// Batch delete knowledge documents
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> DeleteBatchAsync(string knowledgeBaseId)
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/batch"));
        }

        /// <summary>
        /// Batch delete knowledge documents
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> DeleteBatchBatchDeleteAsync(string knowledgeBaseId)
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge_base/{knowledgeBaseId}/documents/batch-delete"));
        }

        /// <summary>
        /// Batch delete knowledge documents
        /// </summary>
        public async Task<PlusApiResultDocumentOperationVO?> DeleteBatchDocumentsAsync(string knowledgeBaseId)
        {
            return await _client.DeleteAsync<PlusApiResultDocumentOperationVO>(ApiPaths.AppPath($"/knowledge-bases/{knowledgeBaseId}/documents/batch"));
        }
    }
}
