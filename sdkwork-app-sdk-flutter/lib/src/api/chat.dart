import '../http/client.dart';
import '../models.dart';

class ChatApi {
  final HttpClient _client;
  
  ChatApi(this._client);

  /// 获取会话详情
  Future<PlusApiResultChatSessionDetailVO?> getSessionDetail(String sessionId) async {
    final response = await _client.get(ApiPaths.appPath('/chat/sessions/${sessionId}'));
    return response is PlusApiResultChatSessionDetailVO ? response : null;
  }

  /// 更新会话
  Future<PlusApiResultVoid?> updateSession(String sessionId, ChatSessionUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/chat/sessions/${sessionId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 删除会话
  Future<PlusApiResultVoid?> deleteSession(String sessionId) async {
    final response = await _client.delete(ApiPaths.appPath('/chat/sessions/${sessionId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取会话列表
  Future<PlusApiResultPageChatSessionVO?> listSessions(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/chat/sessions'), params: params);
    return response is PlusApiResultPageChatSessionVO ? response : null;
  }

  /// 创建对话会话
  Future<PlusApiResultChatSessionVO?> createSession(ChatSessionCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/chat/sessions'), body: body, contentType: 'application/json');
    return response is PlusApiResultChatSessionVO ? response : null;
  }

  /// 停止生成
  Future<PlusApiResultVoid?> stopGeneration(String sessionId) async {
    final response = await _client.post(ApiPaths.appPath('/chat/sessions/${sessionId}/stop'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取消息历史
  Future<PlusApiResultPageChatMessageVO?> getMessageHistory(String sessionId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/chat/sessions/${sessionId}/messages'), params: params);
    return response is PlusApiResultPageChatMessageVO ? response : null;
  }

  /// 发送消息
  Future<PlusApiResultChatMessageVO?> sendMessage(String sessionId, ChatMessageSendForm body) async {
    final response = await _client.post(ApiPaths.appPath('/chat/sessions/${sessionId}/messages'), body: body, contentType: 'application/json');
    return response is PlusApiResultChatMessageVO ? response : null;
  }

  /// 重新生成
  Future<PlusApiResultChatMessageVO?> regenerateMessage(String sessionId, String messageId) async {
    final response = await _client.post(ApiPaths.appPath('/chat/sessions/${sessionId}/messages/${messageId}/regenerate'));
    return response is PlusApiResultChatMessageVO ? response : null;
  }

  /// 收藏消息
  Future<PlusApiResultVoid?> favoriteMessage(String sessionId, String messageId) async {
    final response = await _client.post(ApiPaths.appPath('/chat/sessions/${sessionId}/messages/${messageId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消收藏消息
  Future<PlusApiResultVoid?> unfavoriteMessage(String sessionId, String messageId) async {
    final response = await _client.delete(ApiPaths.appPath('/chat/sessions/${sessionId}/messages/${messageId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 流式发送消息
  Future<void> sendMessageStream(String sessionId, ChatMessageSendForm body) async {
    await _client.post(ApiPaths.appPath('/chat/sessions/${sessionId}/messages/stream'), body: body, contentType: 'application/json');
  }

  /// 导出对话
  Future<PlusApiResultExportVO?> exportConversation(String sessionId, ChatExportForm body) async {
    final response = await _client.post(ApiPaths.appPath('/chat/sessions/${sessionId}/export'), body: body, contentType: 'application/json');
    return response is PlusApiResultExportVO ? response : null;
  }

  /// 复制对话
  Future<PlusApiResultChatSessionVO?> copySession(String sessionId) async {
    final response = await _client.post(ApiPaths.appPath('/chat/sessions/${sessionId}/copy'));
    return response is PlusApiResultChatSessionVO ? response : null;
  }
}
