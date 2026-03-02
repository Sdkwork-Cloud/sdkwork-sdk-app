import '../http/client.dart';
import '../models.dart';

class AiApi {
  final HttpClient _client;
  
  AiApi(this._client);

  /// 获取提示语详情
  Future<PlusApiResultPromptVO?> getPromptDetail(String id) async {
    final response = await _client.get(ApiPaths.appPath('/prompt/${id}'));
    return response is PlusApiResultPromptVO ? response : null;
  }

  /// 更新提示语
  Future<PlusApiResultPromptVO?> updatePrompt(String id, PromptUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/prompt/${id}'), body: body, contentType: 'application/json');
    return response is PlusApiResultPromptVO ? response : null;
  }

  /// 删除提示语
  Future<PlusApiResultVoid?> deletePrompt(String id) async {
    final response = await _client.delete(ApiPaths.appPath('/prompt/${id}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建提示语
  Future<PlusApiResultPromptVO?> createPrompt(PromptCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/prompt'), body: body, contentType: 'application/json');
    return response is PlusApiResultPromptVO ? response : null;
  }

  /// 使用提示语
  Future<PlusApiResultVoid?> usePrompt(String id) async {
    final response = await _client.post(ApiPaths.appPath('/prompt/${id}/use'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 收藏提示语
  Future<PlusApiResultVoid?> favoritePrompt(String id) async {
    final response = await _client.post(ApiPaths.appPath('/prompt/${id}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消收藏提示语
  Future<PlusApiResultVoid?> unfavoritePrompt(String id) async {
    final response = await _client.delete(ApiPaths.appPath('/prompt/${id}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取热门提示语
  Future<PlusApiResultPagePromptVO?> getPopularPrompts(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/prompt/popular'), params: params);
    return response is PlusApiResultPagePromptVO ? response : null;
  }

  /// 获取最受欢迎提示语
  Future<PlusApiResultPagePromptVO?> getMostFavoritedPrompts(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/prompt/most-favorited'), params: params);
    return response is PlusApiResultPagePromptVO ? response : null;
  }

  /// 获取提示语列表
  Future<PlusApiResultPagePromptVO?> listPrompts(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/prompt/list'), params: params);
    return response is PlusApiResultPagePromptVO ? response : null;
  }

  /// 获取提示语历史详情
  Future<PlusApiResultPromptHistoryVO?> getPromptHistoryDetail(String id) async {
    final response = await _client.get(ApiPaths.appPath('/prompt/history/${id}'));
    return response is PlusApiResultPromptHistoryVO ? response : null;
  }

  /// 删除提示语历史
  Future<PlusApiResultVoid?> deletePromptHistory(String id) async {
    final response = await _client.delete(ApiPaths.appPath('/prompt/history/${id}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取提示语使用历史
  Future<PlusApiResultPagePromptHistoryVO?> listPromptHistory(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/prompt/history/list'), params: params);
    return response is PlusApiResultPagePromptHistoryVO ? response : null;
  }
}
