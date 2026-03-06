import '../http/client.dart';
import '../models.dart';

class HistoryApi {
  final HttpClient _client;
  
  HistoryApi(this._client);

  /// 浏览历史
  Future<PlusApiResultPageBrowseHistoryVO?> listBrowse(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/history/browse'), params: params);
    return response is PlusApiResultPageBrowseHistoryVO ? response : null;
  }

  /// 添加浏览记录
  Future<PlusApiResultVoid?> addBrowse(BrowseHistoryAddForm body) async {
    final response = await _client.post(ApiPaths.appPath('/history/browse'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 清空浏览历史
  Future<PlusApiResultVoid?> clearBrowse(Map<String, dynamic>? params) async {
    final response = await _client.delete(ApiPaths.appPath('/history/browse'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 历史统计
  Future<PlusApiResultHistoryStatisticsVO?> getHistoryStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/history/statistics'));
    return response is PlusApiResultHistoryStatisticsVO ? response : null;
  }

  /// 浏览统计
  Future<PlusApiResultBrowseStatisticsVO?> getBrowseStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/history/statistics/browse'));
    return response is PlusApiResultBrowseStatisticsVO ? response : null;
  }

  /// 所有会话
  Future<PlusApiResultListSessionInfoVO?> listSessions() async {
    final response = await _client.get(ApiPaths.appPath('/history/sessions'));
    return response is PlusApiResultListSessionInfoVO ? response : null;
  }

  /// 当前会话
  Future<PlusApiResultSessionInfoVO?> getCurrentSession() async {
    final response = await _client.get(ApiPaths.appPath('/history/sessions/current'));
    return response is PlusApiResultSessionInfoVO ? response : null;
  }

  /// 操作历史
  Future<PlusApiResultPageOperationHistoryVO?> listOperation(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/history/operations'), params: params);
    return response is PlusApiResultPageOperationHistoryVO ? response : null;
  }

  /// 最近操作
  Future<PlusApiResultListOperationHistoryVO?> getRecentOperations(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/history/operations/recent'), params: params);
    return response is PlusApiResultListOperationHistoryVO ? response : null;
  }

  /// 登录历史
  Future<PlusApiResultPageLoginHistoryVO?> listLogin(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/history/logins'), params: params);
    return response is PlusApiResultPageLoginHistoryVO ? response : null;
  }

  /// 生成历史
  Future<PlusApiResultPageGenerationHistoryVO?> listGeneration(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/history/generations'), params: params);
    return response is PlusApiResultPageGenerationHistoryVO ? response : null;
  }

  /// 清空生成历史
  Future<PlusApiResultVoid?> clearGeneration() async {
    final response = await _client.delete(ApiPaths.appPath('/history/generations'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 最近生成
  Future<PlusApiResultListGenerationHistoryVO?> getRecentGenerations(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/history/generations/recent'), params: params);
    return response is PlusApiResultListGenerationHistoryVO ? response : null;
  }

  /// 终止会话
  Future<PlusApiResultVoid?> terminateSession(String sessionId) async {
    final response = await _client.delete(ApiPaths.appPath('/history/sessions/${sessionId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 终止其他会话
  Future<PlusApiResultVoid?> terminateOtherSessions() async {
    final response = await _client.delete(ApiPaths.appPath('/history/sessions/others'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 删除生成历史
  Future<PlusApiResultVoid?> deleteGeneration(String historyId) async {
    final response = await _client.delete(ApiPaths.appPath('/history/generations/${historyId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 删除浏览记录
  Future<PlusApiResultVoid?> deleteBrowse(String historyId) async {
    final response = await _client.delete(ApiPaths.appPath('/history/browse/${historyId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量删除浏览记录
  Future<PlusApiResultVoid?> batchDeleteBrowse() async {
    final response = await _client.delete(ApiPaths.appPath('/history/browse/batch'));
    return response is PlusApiResultVoid ? response : null;
  }
}
