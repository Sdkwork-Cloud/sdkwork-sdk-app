import Foundation

public class DocumentsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Get document detail
    public func getDocumentDetail(documentId: String) async throws -> PlusApiResultDocumentDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/documents/\(documentId)"))
        return response as? PlusApiResultDocumentDetailVO
    }

    /// Update document metadata
    public func updateDocument(documentId: String, body: DocumentUpdateRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/documents/\(documentId)"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Delete document
    public func deleteDocument(documentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/documents/\(documentId)"))
        return response as? PlusApiResultVoid
    }

    /// Restore document
    public func restoreDocument(documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/documents/\(documentId)/restore"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Get document content
    public func getDocumentContent(documentId: String) async throws -> PlusApiResultDocumentContentVO? {
        let response = try await client.get(ApiPaths.appPath("/documents/\(documentId)/content"))
        return response as? PlusApiResultDocumentContentVO
    }

    /// Update document content
    public func updateDocumentContent(documentId: String, body: DocumentContentUpdateRequest) async throws -> PlusApiResultDocumentContentVO? {
        let response = try await client.put(ApiPaths.appPath("/documents/\(documentId)/content"), body: body)
        return response as? PlusApiResultDocumentContentVO
    }

    /// Archive document
    public func archiveDocument(documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/documents/\(documentId)/archive"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// List documents
    public func listDocuments(params: [String: Any]? = nil) async throws -> PlusApiResultPageDocumentVO? {
        let response = try await client.get(ApiPaths.appPath("/documents"), params: params)
        return response as? PlusApiResultPageDocumentVO
    }

    /// Create document
    public func createDocument(body: DocumentCreateRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/documents"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Favorite document
    public func favoriteDocument(documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/documents/\(documentId)/favorite"), body: nil)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Unfavorite document
    public func unfavoriteDocument(documentId: String) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/documents/\(documentId)/favorite"))
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Copy document
    public func copyDocument(documentId: String, body: DocumentCopyRequest) async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/documents/\(documentId)/copy"), body: body)
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Batch update document
    public func batchUpdateDocument(documentId: String, body: DocumentBatchUpdateRequest) async throws -> PlusApiResultDocumentBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/documents/\(documentId)/batch-update"), body: body)
        return response as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /// Batch update document
    public func createBatchUpdateDocument(documentId: String, body: DocumentBatchUpdateRequest) async throws -> PlusApiResultDocumentBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/documents/\(documentId):batchUpdate"), body: body)
        return response as? PlusApiResultDocumentBatchUpdateResultVO
    }

    /// Batch delete documents
    public func batchDelete() async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/documents/batch-delete"))
        return response as? PlusApiResultDocumentOperationVO
    }

    /// Batch delete documents
    public func deleteBatch() async throws -> PlusApiResultDocumentOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/documents/batch"))
        return response as? PlusApiResultDocumentOperationVO
    }
}
