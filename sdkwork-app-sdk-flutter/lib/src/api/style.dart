import '../http/client.dart';
import '../models.dart';

class StyleApi {
  final HttpClient _client;
  
  StyleApi(this._client);

  /// 获取风格详情
  Future<PlusApiResultGenerationStyleDetailVO?> getStyle(String styleId) async {
    final response = await _client.get(ApiPaths.appPath('/generation/style/${styleId}'));
    return response is PlusApiResultGenerationStyleDetailVO ? response : null;
  }

  /// 更新风格
  Future<PlusApiResultGenerationStyleVO?> updateStyle(String styleId, GenerationStyleUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/generation/style/${styleId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationStyleVO ? response : null;
  }

  /// 删除风格
  Future<PlusApiResultVoid?> deleteStyle(String styleId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/style/${styleId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建风格
  Future<PlusApiResultGenerationStyleVO?> createStyle(GenerationStyleCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/generation/style'), body: body, contentType: 'application/json');
    return response is PlusApiResultGenerationStyleVO ? response : null;
  }

  /// 发布风格
  Future<PlusApiResultVoid?> publish(String styleId) async {
    final response = await _client.post(ApiPaths.appPath('/generation/style/${styleId}/publish'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消发布
  Future<PlusApiResultVoid?> unpublish(String styleId) async {
    final response = await _client.delete(ApiPaths.appPath('/generation/style/${styleId}/publish'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 停用风格
  Future<PlusApiResultVoid?> deactivate(String styleId) async {
    final response = await _client.post(ApiPaths.appPath('/generation/style/${styleId}/deactivate'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 激活风格
  Future<PlusApiResultVoid?> activate(String styleId) async {
    final response = await _client.post(ApiPaths.appPath('/generation/style/${styleId}/activate'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取风格类型列表
  Future<PlusApiResultListStyleTypeVO?> getStyleTypes() async {
    final response = await _client.get(ApiPaths.appPath('/generation/style/types'));
    return response is PlusApiResultListStyleTypeVO ? response : null;
  }

  /// 获取风格统计
  Future<PlusApiResultStyleStatisticsVO?> getStyleStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/generation/style/statistics'));
    return response is PlusApiResultStyleStatisticsVO ? response : null;
  }

  /// 搜索风格
  Future<PlusApiResultPageGenerationStyleVO?> searchStyles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/style/search'), params: params);
    return response is PlusApiResultPageGenerationStyleVO ? response : null;
  }

  /// 获取公开风格
  Future<PlusApiResultPageGenerationStyleVO?> getPublicStyles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/style/public'), params: params);
    return response is PlusApiResultPageGenerationStyleVO ? response : null;
  }

  /// 获取热门风格
  Future<PlusApiResultPageGenerationStyleVO?> getPopularStyles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/style/popular'), params: params);
    return response is PlusApiResultPageGenerationStyleVO ? response : null;
  }

  /// 获取我的风格
  Future<PlusApiResultPageGenerationStyleVO?> getMyStyles(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/generation/style/my'), params: params);
    return response is PlusApiResultPageGenerationStyleVO ? response : null;
  }
}
