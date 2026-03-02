package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AppDocumentsApi(private val client: HttpClient) {

    /** Get document detail */
    suspend fun getDocumentDetail(documentId: String): PlusApiResultDocumentDetailVO? {
        return client.get(ApiPaths.appPath("/documents/$documentId")) as? PlusApiResultDocumentDetailVO
    }

    /** Update document metadata */
    suspend fun updateDocument(documentId: String, body: DocumentUpdateRequest): PlusApiResultDocumentOperationVO? {
        return client.put(ApiPaths.appPath("/documents/$documentId"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Delete document */
    suspend fun deleteDocument(documentId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/documents/$documentId")) as? PlusApiResultVoid
    }

    /** Get document content */
    suspend fun getDocumentContent(documentId: String): PlusApiResultDocumentContentVO? {
        return client.get(ApiPaths.appPath("/documents/$documentId/content")) as? PlusApiResultDocumentContentVO
    }

    /** Update document content */
    suspend fun updateDocumentContent(documentId: String, body: DocumentContentUpdateRequest): PlusApiResultDocumentContentVO? {
        return client.put(ApiPaths.appPath("/documents/$documentId/content"), body) as? PlusApiResultDocumentContentVO
    }

    /** List documents */
    suspend fun listDocuments(params: Map<String, Any>? = null): PlusApiResultPageDocumentVO? {
        return client.get(ApiPaths.appPath("/documents"), params) as? PlusApiResultPageDocumentVO
    }

    /** Create document */
    suspend fun createDocument(body: DocumentCreateRequest): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/documents"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Copy document */
    suspend fun copyDocument(documentId: String, body: DocumentCopyRequest): PlusApiResultDocumentOperationVO? {
        return client.post(ApiPaths.appPath("/documents/$documentId/copy"), body) as? PlusApiResultDocumentOperationVO
    }

    /** Batch update document */
    suspend fun batchUpdateDocument(documentId: String, body: DocumentBatchUpdateRequest): PlusApiResultDocumentBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/documents/$documentId/batch-update"), body) as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /** Batch update document */
    suspend fun createBatchUpdateDocument(documentId: String, body: DocumentBatchUpdateRequest): PlusApiResultDocumentBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/documents/$documentId:batchUpdate"), body) as? PlusApiResultDocumentBatchUpdateResultVO
    }
}
