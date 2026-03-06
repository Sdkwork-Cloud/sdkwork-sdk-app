import '../http/client.dart';
import '../models.dart';

class AgentApi {
  final HttpClient _client;
  
  AgentApi(this._client);

  /// Get agent
  Future<PlusApiResultMapStringObject?> get(String agentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Update agent
  Future<PlusApiResultMapStringObject?> update(String agentId, UpdateRequest? body) async {
    final response = await _client.put(ApiPaths.appPath('/agents/${agentId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Delete agent
  Future<PlusApiResultVoid?> delete(String agentId) async {
    final response = await _client.delete(ApiPaths.appPath('/agents/${agentId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// List agents
  Future<PlusApiResultMapStringObject?> list(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/agents'), params: params);
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Create agent
  Future<PlusApiResultMapStringObject?> create(CreateRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/agents'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// List sessions
  Future<PlusApiResultListMapStringObject?> listSessions(String agentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/sessions'));
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Create session
  Future<PlusApiResultMapStringObject?> createSession(String agentId, CreateSessionRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/agents/${agentId}/sessions'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Reset agent
  Future<PlusApiResultVoid?> reset(String agentId) async {
    final response = await _client.post(ApiPaths.appPath('/agents/${agentId}/reset'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// List session messages
  Future<PlusApiResultListMapStringObject?> listSessionMessages(String sessionId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/sessions/${sessionId}/messages'));
    return response is PlusApiResultListMapStringObject ? response : null;
  }

  /// Send session message
  Future<PlusApiResultMapStringObject?> sendSessionMessage(String sessionId, SendSessionMessageRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/agents/sessions/${sessionId}/messages'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Clear session
  Future<PlusApiResultVoid?> clearSession(String sessionId) async {
    final response = await _client.post(ApiPaths.appPath('/agents/sessions/${sessionId}/clear'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Agent stats
  Future<PlusApiResultMapStringObject?> stats(String agentId) async {
    final response = await _client.get(ApiPaths.appPath('/agents/${agentId}/stats'));
    return response is PlusApiResultMapStringObject ? response : null;
  }

  /// Delete session
  Future<PlusApiResultVoid?> deleteSession(String sessionId) async {
    final response = await _client.delete(ApiPaths.appPath('/agents/sessions/${sessionId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
