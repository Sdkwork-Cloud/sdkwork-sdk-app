import '../http/client.dart';
import '../models.dart';

class DocumentsApi {
  final HttpClient _client;
  
  DocumentsApi(this._client);

  /// Get document detail
  Future<PlusApiResultDocumentDetailVO?> getDocumentDetail(String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/documents/${documentId}'));
    return response is PlusApiResultDocumentDetailVO ? response : null;
  }

  /// Update document metadata
  Future<PlusApiResultDocumentOperationVO?> updateDocument(String documentId, DocumentUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/documents/${documentId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Delete document
  Future<PlusApiResultVoid?> deleteDocument(String documentId) async {
    final response = await _client.delete(ApiPaths.appPath('/documents/${documentId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Restore document
  Future<PlusApiResultDocumentOperationVO?> restoreDocument(String documentId) async {
    final response = await _client.put(ApiPaths.appPath('/documents/${documentId}/restore'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Get document content
  Future<PlusApiResultDocumentContentVO?> getDocumentContent(String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/documents/${documentId}/content'));
    return response is PlusApiResultDocumentContentVO ? response : null;
  }

  /// Update document content
  Future<PlusApiResultDocumentContentVO?> updateDocumentContent(String documentId, DocumentContentUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/documents/${documentId}/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentContentVO ? response : null;
  }

  /// Archive document
  Future<PlusApiResultDocumentOperationVO?> archiveDocument(String documentId) async {
    final response = await _client.put(ApiPaths.appPath('/documents/${documentId}/archive'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// List documents
  Future<PlusApiResultPageDocumentVO?> listDocuments(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/documents'), params: params);
    return response is PlusApiResultPageDocumentVO ? response : null;
  }

  /// Create document
  Future<PlusApiResultDocumentOperationVO?> createDocument(DocumentCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/documents'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Favorite document
  Future<PlusApiResultDocumentOperationVO?> favoriteDocument(String documentId) async {
    final response = await _client.post(ApiPaths.appPath('/documents/${documentId}/favorite'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Unfavorite document
  Future<PlusApiResultDocumentOperationVO?> unfavoriteDocument(String documentId) async {
    final response = await _client.delete(ApiPaths.appPath('/documents/${documentId}/favorite'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Copy document
  Future<PlusApiResultDocumentOperationVO?> copyDocument(String documentId, DocumentCopyRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/documents/${documentId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Batch update document
  Future<PlusApiResultDocumentBatchUpdateResultVO?> batchUpdateDocument(String documentId, DocumentBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/documents/${documentId}/batch-update'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentBatchUpdateResultVO ? response : null;
  }

  /// Batch update document
  Future<PlusApiResultDocumentBatchUpdateResultVO?> createBatchUpdateDocument(String documentId, DocumentBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/documents/${documentId}:batchUpdate'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentBatchUpdateResultVO ? response : null;
  }

  /// Batch delete documents
  Future<PlusApiResultDocumentOperationVO?> batchDelete() async {
    final response = await _client.delete(ApiPaths.appPath('/documents/batch-delete'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Batch delete documents
  Future<PlusApiResultDocumentOperationVO?> deleteBatch() async {
    final response = await _client.delete(ApiPaths.appPath('/documents/batch'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }
}
