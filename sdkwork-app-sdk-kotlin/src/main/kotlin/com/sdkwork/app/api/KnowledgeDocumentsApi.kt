package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class KnowledgeDocumentsApi(private val client: HttpClient) {

    /** Restore knowledge document */
    suspend fun restoreKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.put(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/restore"), null) as? PlusApiResultDocumentOperationVO
    }

    /** Restore knowledge document */
    suspend fun updateRestoreKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.put(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/restore"), null) as? PlusApiResultDocumentOperationVO
    }

    /** Get knowledge document content */
    suspend fun getKnowledgeDocumentContent(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentContentVO? {
        return client.get(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/content")) as? PlusApiResultDocumentContentVO
    }

    /** Update knowledge document content */
    suspend fun updateKnowledgeDocumentContent(knowledgeBaseId: String, documentId: String, body: DocumentContentUpdateRequest): PlusApiResultDocumentContentVO? {
        return client.put(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/content"), body) as? PlusApiResultDocumentContentVO
    }

    /** Get knowledge document content */
    suspend fun getKnowledgeDocumentContentKnowledgeBase(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentContentVO? {
        return client.get(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/content")) as? PlusApiResultDocumentContentVO
    }

    /** Update knowledge document content */
    suspend fun updateKnowledgeDocumentContentKnowledgeBase(knowledgeBaseId: String, documentId: String, body: DocumentContentUpdateRequest): PlusApiResultDocumentContentVO? {
        return client.put(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/content"), body) as? PlusApiResultDocumentContentVO
    }

    /** Archive knowledge document */
    suspend fun archiveKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.put(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/archive"), null) as? PlusApiResultDocumentOperationVO
    }

    /** Archive knowledge document */
    suspend fun updateArchiveKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.put(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/archive"), null) as? PlusApiResultDocumentOperationVO
    }

    /** Get knowledge document detail */
    suspend fun getKnowledgeDocumentDetail(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentDetailVO? {
        return client.get(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId")) as? PlusApiResultDocumentDetailVO
    }

    /** Update knowledge document metadata */
    suspend fun updateKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentUpdateRequest): PlusApiResultDocumentOperationVO? {
        return client.put(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Delete knowledge document */
    suspend fun deleteKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId")) as? PlusApiResultVoid
    }

    /** Get knowledge document detail */
    suspend fun getKnowledgeDocumentDetailKnowledgeBase(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentDetailVO? {
        return client.get(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId")) as? PlusApiResultDocumentDetailVO
    }

    /** Update knowledge document metadata */
    suspend fun updateKnowledgeDocumentKnowledgeBase(knowledgeBaseId: String, documentId: String, body: DocumentUpdateRequest): PlusApiResultDocumentOperationVO? {
        return client.put(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Delete knowledge document */
    suspend fun deleteKnowledgeDocumentKnowledgeBase(knowledgeBaseId: String, documentId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId")) as? PlusApiResultVoid
    }

    /** Favorite knowledge document */
    suspend fun favoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/favorite"), null) as? PlusApiResultDocumentOperationVO
    }

    /** Unfavorite knowledge document */
    suspend fun unfavoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.delete(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/favorite")) as? PlusApiResultDocumentOperationVO
    }

    /** Favorite knowledge document */
    suspend fun createFavoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/favorite"), null) as? PlusApiResultDocumentOperationVO
    }

    /** Unfavorite knowledge document */
    suspend fun deleteUnfavoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String): PlusApiResultDocumentOperationVO? {
        return client.delete(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/favorite")) as? PlusApiResultDocumentOperationVO
    }

    /** Copy knowledge document */
    suspend fun copyKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentCopyRequest): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/copy"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Copy knowledge document */
    suspend fun createCopyKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentCopyRequest): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/copy"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Batch update knowledge document */
    suspend fun batchUpdateKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest): PlusApiResultDocumentBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId/batch-update"), body) as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /** Batch update knowledge document */
    suspend fun createBatchUpdateKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest): PlusApiResultDocumentBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId:batchUpdate"), body) as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /** Batch update knowledge document */
    suspend fun createBatchUpdateKnowledgeDocumentDocumentIdBatchUpdate(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest): PlusApiResultDocumentBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/$documentId:batchUpdate"), body) as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /** Batch update knowledge document */
    suspend fun createBatchUpdateKnowledgeDocumentBatchUpdate(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest): PlusApiResultDocumentBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/$documentId/batch-update"), body) as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /** List knowledge documents */
    suspend fun listKnowledgeDocuments(knowledgeBaseId: String, params: Map<String, Any>? = null): PlusApiResultPageDocumentVO? {
        return client.get(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents"), params) as? PlusApiResultPageDocumentVO
    }

    /** Create knowledge document */
    suspend fun createKnowledgeDocument(knowledgeBaseId: String, body: DocumentCreateRequest): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents"), body) as? PlusApiResultDocumentOperationVO
    }

    /** List knowledge documents */
    suspend fun getList(knowledgeBaseId: String, params: Map<String, Any>? = null): PlusApiResultPageDocumentVO? {
        return client.get(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents"), params) as? PlusApiResultPageDocumentVO
    }

    /** Create knowledge document */
    suspend fun createKnowledgeDocumentKnowledgeBase(knowledgeBaseId: String, body: DocumentCreateRequest): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Batch delete knowledge documents */
    suspend fun batchDelete(knowledgeBaseId: String): PlusApiResultDocumentOperationVO? {
        return client.delete(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/batch-delete")) as? PlusApiResultDocumentOperationVO
    }

    /** Batch delete knowledge documents */
    suspend fun deleteBatch(knowledgeBaseId: String): PlusApiResultDocumentOperationVO? {
        return client.delete(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/batch")) as? PlusApiResultDocumentOperationVO
    }

    /** Batch delete knowledge documents */
    suspend fun deleteBatchBatchDelete(knowledgeBaseId: String): PlusApiResultDocumentOperationVO? {
        return client.delete(ApiPaths.appPath("/knowledge_base/$knowledgeBaseId/documents/batch-delete")) as? PlusApiResultDocumentOperationVO
    }

    /** Batch delete knowledge documents */
    suspend fun deleteBatchDocuments(knowledgeBaseId: String): PlusApiResultDocumentOperationVO? {
        return client.delete(ApiPaths.appPath("/knowledge-bases/$knowledgeBaseId/documents/batch")) as? PlusApiResultDocumentOperationVO
    }
}
