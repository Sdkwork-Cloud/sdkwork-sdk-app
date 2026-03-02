import '../http/client.dart';
import '../models.dart';

class TenantApi {
  final HttpClient _client;
  
  TenantApi(this._client);

  /// 获取租户详情
  Future<PlusApiResultTenantDetailVO?> getTenant(String tenantId) async {
    final response = await _client.get(ApiPaths.appPath('/tenant/${tenantId}'));
    return response is PlusApiResultTenantDetailVO ? response : null;
  }

  /// 更新租户
  Future<PlusApiResultTenantVO?> updateTenant(String tenantId, TenantUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/tenant/${tenantId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultTenantVO ? response : null;
  }

  /// 创建租户
  Future<PlusApiResultTenantVO?> createTenant(TenantCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/tenant'), body: body, contentType: 'application/json');
    return response is PlusApiResultTenantVO ? response : null;
  }

  /// 冻结租户
  Future<PlusApiResultTenantVO?> freeze(String tenantId) async {
    final response = await _client.post(ApiPaths.appPath('/tenant/${tenantId}/freeze'));
    return response is PlusApiResultTenantVO ? response : null;
  }

  /// 注销租户
  Future<PlusApiResultTenantVO?> close(String tenantId) async {
    final response = await _client.post(ApiPaths.appPath('/tenant/${tenantId}/close'));
    return response is PlusApiResultTenantVO ? response : null;
  }

  /// 激活租户
  Future<PlusApiResultTenantVO?> activate(String tenantId) async {
    final response = await _client.post(ApiPaths.appPath('/tenant/${tenantId}/activate'));
    return response is PlusApiResultTenantVO ? response : null;
  }

  /// 获取租户类型列表
  Future<PlusApiResultListTenantTypeVO?> getTenantTypes() async {
    final response = await _client.get(ApiPaths.appPath('/tenant/types'));
    return response is PlusApiResultListTenantTypeVO ? response : null;
  }

  /// 获取租户统计
  Future<PlusApiResultTenantStatisticsVO?> getTenantStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/tenant/statistics'));
    return response is PlusApiResultTenantStatisticsVO ? response : null;
  }

  /// 获取根租户
  Future<PlusApiResultTenantDetailVO?> getRoot() async {
    final response = await _client.get(ApiPaths.appPath('/tenant/root'));
    return response is PlusApiResultTenantDetailVO ? response : null;
  }

  /// 获取租户列表
  Future<PlusApiResultPageTenantVO?> getTenantList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/tenant/list'), params: params);
    return response is PlusApiResultPageTenantVO ? response : null;
  }

  /// 根据编码获取租户
  Future<PlusApiResultTenantDetailVO?> getTenantByCode(String code) async {
    final response = await _client.get(ApiPaths.appPath('/tenant/code/${code}'));
    return response is PlusApiResultTenantDetailVO ? response : null;
  }

  /// 获取云租户
  Future<PlusApiResultTenantDetailVO?> getCloud() async {
    final response = await _client.get(ApiPaths.appPath('/tenant/cloud'));
    return response is PlusApiResultTenantDetailVO ? response : null;
  }
}
