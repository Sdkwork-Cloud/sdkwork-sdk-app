import '../http/client.dart';
import '../models.dart';

class DisableApi {
  final HttpClient _client;
  
  DisableApi(this._client);

  /// 禁用组织
  Future<PlusApiResultOrganizationVO?> organization(String orgId) async {
    final response = await _client.post(ApiPaths.appPath('/organization/${orgId}/disable'));
    return response is PlusApiResultOrganizationVO ? response : null;
  }
}
