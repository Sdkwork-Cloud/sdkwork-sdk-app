import '../http/client.dart';
import '../models.dart';

class AgentMemoryApi {
  final HttpClient _client;
  
  AgentMemoryApi(this._client);

  /// List memories
  Future<PlusApiResultListMapStringObject?> list(String agentId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory'), params: params);
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Create memory
  Future<PlusApiResultMapStringObject?> create(String agentId, CreatePostRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/agents/${agentId}/memory'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Summarize session
  Future<PlusApiResultMapStringObject?> summarizeSession(String agentId, String sessionId) async {
    final response = await _client.post(ApiPaths.appPath('/agents/${agentId}/memory/sessions/${sessionId}/summarize'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List knowledge
  Future<PlusApiResultListMapStringObject?> listKnowledge(String agentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/knowledge'));
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Create knowledge
  Future<PlusApiResultMapStringObject?> createKnowledge(String agentId, CreateKnowledgeRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/agents/${agentId}/memory/knowledge'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Consolidate memories
  Future<PlusApiResultMapStringObject?> consolidate(String agentId) async {
    final response = await _client.post(ApiPaths.appPath('/agents/${agentId}/memory/consolidate'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Memory stats
  Future<PlusApiResultMapStringObject?> stats(String agentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/stats'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List session history
  Future<PlusApiResultListMapStringObject?> listSessionHistory(String agentId, String sessionId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/sessions/${sessionId}/history'), params: params);
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Search memories
  Future<PlusApiResultListMapStringObject?> search(String agentId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/search'), params: params);
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Get knowledge
  Future<PlusApiResultMapStringObject?> getKnowledge(String agentId, String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/knowledge/${documentId}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Delete knowledge
  Future<PlusApiResultMapStringObject?> deleteKnowledge(String agentId, String documentId) async {
    final response = await _client.delete(ApiPaths.appPath('/agents/${agentId}/memory/knowledge/${documentId}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List knowledge chunks
  Future<PlusApiResultListMapStringObject?> listKnowledgeChunks(String agentId, String documentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/knowledge/${documentId}/chunks'));
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Knowledge stats
  Future<PlusApiResultMapStringObject?> knowledgeStats(String agentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/knowledge/stats'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Search knowledge
  Future<PlusApiResultListMapStringObject?> searchKnowledge(String agentId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/memory/knowledge/search'), params: params);
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Delete memory
  Future<PlusApiResultMapStringObject?> delete(String agentId, String memoryId) async {
    final response = await _client.delete(ApiPaths.appPath('/agents/${agentId}/memory/${memoryId}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Clear session memories
  Future<PlusApiResultMapStringObject?> clearSession(String agentId, String sessionId) async {
    final response = await _client.delete(ApiPaths.appPath('/agents/${agentId}/memory/sessions/${sessionId}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }
}
