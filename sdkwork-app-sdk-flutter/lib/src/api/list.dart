import '../http/client.dart';
import '../models.dart';

class ListApi {
  final HttpClient _client;
  
  ListApi(this._client);

  /// 获取组织列表
  Future<PlusApiResultPageOrganizationVO?> getOrganization(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/organization/list'), params: params);
    return response is PlusApiResultPageOrganizationVO ? response : null;
  }
}
