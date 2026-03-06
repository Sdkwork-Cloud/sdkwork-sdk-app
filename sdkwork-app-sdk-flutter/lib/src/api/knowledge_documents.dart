import '../http/client.dart';
import '../models.dart';

class KnowledgeDocumentsApi {
  final HttpClient _client;
  
  KnowledgeDocumentsApi(this._client);

  /// Restore knowledge document
  Future<PlusApiResultDocumentOperationVO?> restoreKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/restore'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Restore knowledge document
  Future<PlusApiResultDocumentOperationVO?> updateRestoreKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/restore'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Get knowledge document content
  Future<PlusApiResultDocumentContentVO?> getKnowledgeDocumentContent(String knowledgeBaseId, String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/content'));
    return response is PlusApiResultDocumentContentVO ? response : null;
  }

  /// Update knowledge document content
  Future<PlusApiResultDocumentContentVO?> updateKnowledgeDocumentContent(String knowledgeBaseId, String documentId, DocumentContentUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentContentVO ? response : null;
  }

  /// Get knowledge document content
  Future<PlusApiResultDocumentContentVO?> getKnowledgeDocumentContentKnowledgeBase(String knowledgeBaseId, String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/content'));
    return response is PlusApiResultDocumentContentVO ? response : null;
  }

  /// Update knowledge document content
  Future<PlusApiResultDocumentContentVO?> updateKnowledgeDocumentContentKnowledgeBase(String knowledgeBaseId, String documentId, DocumentContentUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentContentVO ? response : null;
  }

  /// Archive knowledge document
  Future<PlusApiResultDocumentOperationVO?> archiveKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/archive'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Archive knowledge document
  Future<PlusApiResultDocumentOperationVO?> updateArchiveKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/archive'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Get knowledge document detail
  Future<PlusApiResultDocumentDetailVO?> getKnowledgeDocumentDetail(String knowledgeBaseId, String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}'));
    return response is PlusApiResultDocumentDetailVO ? response : null;
  }

  /// Update knowledge document metadata
  Future<PlusApiResultDocumentOperationVO?> updateKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Delete knowledge document
  Future<PlusApiResultVoid?> deleteKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Get knowledge document detail
  Future<PlusApiResultDocumentDetailVO?> getKnowledgeDocumentDetailKnowledgeBase(String knowledgeBaseId, String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}'));
    return response is PlusApiResultDocumentDetailVO ? response : null;
  }

  /// Update knowledge document metadata
  Future<PlusApiResultDocumentOperationVO?> updateKnowledgeDocumentKnowledgeBase(String knowledgeBaseId, String documentId, DocumentUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Delete knowledge document
  Future<PlusApiResultVoid?> deleteKnowledgeDocumentKnowledgeBase(String knowledgeBaseId, String documentId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Favorite knowledge document
  Future<PlusApiResultDocumentOperationVO?> favoriteKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/favorite'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Unfavorite knowledge document
  Future<PlusApiResultDocumentOperationVO?> unfavoriteKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/favorite'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Favorite knowledge document
  Future<PlusApiResultDocumentOperationVO?> createFavoriteKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/favorite'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Unfavorite knowledge document
  Future<PlusApiResultDocumentOperationVO?> deleteUnfavoriteKnowledgeDocument(String knowledgeBaseId, String documentId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/favorite'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Copy knowledge document
  Future<PlusApiResultDocumentOperationVO?> copyKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentCopyRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Copy knowledge document
  Future<PlusApiResultDocumentOperationVO?> createCopyKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentCopyRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Batch update knowledge document
  Future<PlusApiResultDocumentBatchUpdateResultVO?> batchUpdateKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}/batch-update'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentBatchUpdateResultVO ? response : null;
  }

  /// Batch update knowledge document
  Future<PlusApiResultDocumentBatchUpdateResultVO?> createBatchUpdateKnowledgeDocument(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}:batchUpdate'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentBatchUpdateResultVO ? response : null;
  }

  /// Batch update knowledge document
  Future<PlusApiResultDocumentBatchUpdateResultVO?> createBatchUpdateKnowledgeDocumentDocumentIdBatchUpdate(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/${documentId}:batchUpdate'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentBatchUpdateResultVO ? response : null;
  }

  /// Batch update knowledge document
  Future<PlusApiResultDocumentBatchUpdateResultVO?> createBatchUpdateKnowledgeDocumentBatchUpdate(String knowledgeBaseId, String documentId, DocumentBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/${documentId}/batch-update'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentBatchUpdateResultVO ? response : null;
  }

  /// List knowledge documents
  Future<PlusApiResultPageDocumentVO?> listKnowledgeDocuments(String knowledgeBaseId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents'), params: params);
    return response is PlusApiResultPageDocumentVO ? response : null;
  }

  /// Create knowledge document
  Future<PlusApiResultDocumentOperationVO?> createKnowledgeDocument(String knowledgeBaseId, DocumentCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// List knowledge documents
  Future<PlusApiResultPageDocumentVO?> getList(String knowledgeBaseId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents'), params: params);
    return response is PlusApiResultPageDocumentVO ? response : null;
  }

  /// Create knowledge document
  Future<PlusApiResultDocumentOperationVO?> createKnowledgeDocumentKnowledgeBase(String knowledgeBaseId, DocumentCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents'), body: body, contentType: 'application/json');
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Batch delete knowledge documents
  Future<PlusApiResultDocumentOperationVO?> batchDelete(String knowledgeBaseId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/batch-delete'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Batch delete knowledge documents
  Future<PlusApiResultDocumentOperationVO?> deleteBatch(String knowledgeBaseId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/batch'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Batch delete knowledge documents
  Future<PlusApiResultDocumentOperationVO?> deleteBatchBatchDelete(String knowledgeBaseId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge_base/${knowledgeBaseId}/documents/batch-delete'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }

  /// Batch delete knowledge documents
  Future<PlusApiResultDocumentOperationVO?> deleteBatchDocuments(String knowledgeBaseId) async {
    final response = await _client.delete(ApiPaths.appPath('/knowledge-bases/${knowledgeBaseId}/documents/batch'));
    return response is PlusApiResultDocumentOperationVO ? response : null;
  }
}
