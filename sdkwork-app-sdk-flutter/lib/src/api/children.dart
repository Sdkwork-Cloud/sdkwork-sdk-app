import '../http/client.dart';
import '../models.dart';

class ChildrenApi {
  final HttpClient _client;
  
  ChildrenApi(this._client);

  /// 获取子组织
  Future<PlusApiResultListOrganizationVO?> getChildOrganizations(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/children'));
    return response is PlusApiResultListOrganizationVO ? response : null;
  }
}
