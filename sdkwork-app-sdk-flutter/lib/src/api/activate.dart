import '../http/client.dart';
import '../models.dart';

class ActivateApi {
  final HttpClient _client;
  
  ActivateApi(this._client);

  /// 激活组织
  Future<PlusApiResultOrganizationVO?> organization(String orgId) async {
    final response = await _client.post(ApiPaths.appPath('/organization/${orgId}/activate'));
    return response is PlusApiResultOrganizationVO ? response : null;
  }
}
