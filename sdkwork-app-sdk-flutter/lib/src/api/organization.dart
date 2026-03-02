import '../http/client.dart';
import '../models.dart';

class OrganizationApi {
  final HttpClient _client;
  
  OrganizationApi(this._client);

  /// 创建组织
  Future<PlusApiResultOrganizationVO?> createOrganization(OrganizationCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/organization'), body: body, contentType: 'application/json');
    return response is PlusApiResultOrganizationVO ? response : null;
  }

  /// 获取组织详情
  Future<PlusApiResultOrganizationDetailVO?> getOrganization(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}'));
    return response is PlusApiResultOrganizationDetailVO ? response : null;
  }
}
