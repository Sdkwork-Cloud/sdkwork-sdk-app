import '../http/client.dart';
import '../models.dart';

class AppApi {
  final HttpClient _client;
  
  AppApi(this._client);

  /// 获取应用详情
  Future<PlusApiResultAppDetailVO?> getApp(String appId) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/${appId}'));
    return response is PlusApiResultAppDetailVO ? response : null;
  }

  /// 更新应用
  Future<PlusApiResultAppVO?> updateApp(String appId, AppUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/app/manage/${appId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultAppVO ? response : null;
  }

  /// 删除应用
  Future<PlusApiResultVoid?> deleteApp(String appId) async {
    final response = await _client.delete(ApiPaths.appPath('/app/manage/${appId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建应用
  Future<PlusApiResultAppVO?> createApp(AppCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/app/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultAppVO ? response : null;
  }

  /// 停用应用
  Future<PlusApiResultVoid?> deactivate(String appId) async {
    final response = await _client.post(ApiPaths.appPath('/app/manage/${appId}/deactivate'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 激活应用
  Future<PlusApiResultVoid?> activate(String appId) async {
    final response = await _client.post(ApiPaths.appPath('/app/manage/${appId}/activate'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 检查发布就绪状态
  Future<PlusApiResultAppPublishReadinessVO?> checkPublishReadiness(String appId) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/${appId}/publish/readiness'));
    return response is PlusApiResultAppPublishReadinessVO ? response : null;
  }

  /// 获取应用统计
  Future<PlusApiResultAppStatisticsVO?> getAppStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/statistics'));
    return response is PlusApiResultAppStatisticsVO ? response : null;
  }

  /// 搜索应用
  Future<PlusApiResultPageAppVO?> searchApps(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/search'), params: params);
    return response is PlusApiResultPageAppVO ? response : null;
  }

  /// 获取项目应用
  Future<PlusApiResultPageAppVO?> getProjectApps(String projectId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/project/${projectId}'), params: params);
    return response is PlusApiResultPageAppVO ? response : null;
  }

  /// 获取我的应用
  Future<PlusApiResultPageAppVO?> getMyApps(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/my'), params: params);
    return response is PlusApiResultPageAppVO ? response : null;
  }

  /// 获取账户余额汇总
  Future<PlusApiResultAccountSummaryVO?> getAccountSummary() async {
    final response = await _client.get(ApiPaths.appPath('/account/summary'));
    return response is PlusApiResultAccountSummaryVO ? response : null;
  }
}
