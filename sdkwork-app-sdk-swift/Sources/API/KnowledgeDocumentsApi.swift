import Foundation

public class KnowledgeDocumentsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Restore knowledge document
    public func restoreKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/restore"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Restore knowledge document
    public func updateRestoreKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/restore"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Get knowledge document content
    public func getKnowledgeDocumentContent(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentContentVO? {
        let response = try await client.get(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/content"))
        return response as? PlusApiResultDocumentContentVO
    }

    /// Update knowledge document content
    public func updateKnowledgeDocumentContent(knowledgeBaseId: String, documentId: String, body: DocumentContentUpdateRequest) async throws -> PlusApiResultDocumentContentVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/content"), body: body)
        return response as? PlusApiResultDocumentContentVO
    }

    /// Get knowledge document content
    public func getKnowledgeDocumentContentKnowledgeBase(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentContentVO? {
        let response = try await client.get(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/content"))
        return response as? PlusApiResultDocumentContentVO
    }

    /// Update knowledge document content
    public func updateKnowledgeDocumentContentKnowledgeBase(knowledgeBaseId: String, documentId: String, body: DocumentContentUpdateRequest) async throws -> PlusApiResultDocumentContentVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/content"), body: body)
        return response as? PlusApiResultDocumentContentVO
    }

    /// Archive knowledge document
    public func archiveKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/archive"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Archive knowledge document
    public func updateArchiveKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/archive"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Get knowledge document detail
    public func getKnowledgeDocumentDetail(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)"))
        return response as? PlusApiResultDocumentDetailVO
    }

    /// Update knowledge document metadata
    public func updateKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentUpdateRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Delete knowledge document
    public func deleteKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)"))
        return response as? PlusApiResultVoid
    }

    /// Get knowledge document detail
    public func getKnowledgeDocumentDetailKnowledgeBase(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)"))
        return response as? PlusApiResultDocumentDetailVO
    }

    /// Update knowledge document metadata
    public func updateKnowledgeDocumentKnowledgeBase(knowledgeBaseId: String, documentId: String, body: DocumentUpdateRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Delete knowledge document
    public func deleteKnowledgeDocumentKnowledgeBase(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)"))
        return response as? PlusApiResultVoid
    }

    /// Favorite knowledge document
    public func favoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/favorite"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Unfavorite knowledge document
    public func unfavoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/favorite"))
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Favorite knowledge document
    public func createFavoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/favorite"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Unfavorite knowledge document
    public func deleteUnfavoriteKnowledgeDocument(knowledgeBaseId: String, documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/favorite"))
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Copy knowledge document
    public func copyKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentCopyRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/copy"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Copy knowledge document
    public func createCopyKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentCopyRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/copy"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Batch update knowledge document
    public func batchUpdateKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest) async throws -> PlusApiResultDocumentBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId)/batch-update"), body: body)
        return response as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /// Batch update knowledge document
    public func createBatchUpdateKnowledgeDocument(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest) async throws -> PlusApiResultDocumentBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId):batchUpdate"), body: body)
        return response as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /// Batch update knowledge document
    public func createBatchUpdateKnowledgeDocumentDocumentIdBatchUpdate(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest) async throws -> PlusApiResultDocumentBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/\(documentId):batchUpdate"), body: body)
        return response as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /// Batch update knowledge document
    public func createBatchUpdateKnowledgeDocumentBatchUpdate(knowledgeBaseId: String, documentId: String, body: DocumentBatchUpdateRequest) async throws -> PlusApiResultDocumentBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/\(documentId)/batch-update"), body: body)
        return response as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /// List knowledge documents
    public func listKnowledgeDocuments(knowledgeBaseId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageDocumentVO? {
        let response = try await client.get(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents"), params: params)
        return response as? PlusApiResultPageDocumentVO
    }

    /// Create knowledge document
    public func createKnowledgeDocument(knowledgeBaseId: String, body: DocumentCreateRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// List knowledge documents
    public func getList(knowledgeBaseId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageDocumentVO? {
        let response = try await client.get(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents"), params: params)
        return response as? PlusApiResultPageDocumentVO
    }

    /// Create knowledge document
    public func createKnowledgeDocumentKnowledgeBase(knowledgeBaseId: String, body: DocumentCreateRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Batch delete knowledge documents
    public func batchDelete(knowledgeBaseId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/batch-delete"))
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Batch delete knowledge documents
    public func deleteBatch(knowledgeBaseId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/batch"))
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Batch delete knowledge documents
    public func deleteBatchBatchDelete(knowledgeBaseId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge_base/\(knowledgeBaseId)/documents/batch-delete"))
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Batch delete knowledge documents
    public func deleteBatchDocuments(knowledgeBaseId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/knowledge-bases/\(knowledgeBaseId)/documents/batch"))
        return response as? PlusApiResultDocumentOperationVO
    }
}
