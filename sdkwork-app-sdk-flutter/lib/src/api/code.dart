import '../http/client.dart';
import '../models.dart';

class CodeApi {
  final HttpClient _client;
  
  CodeApi(this._client);

  /// 根据编码获取组织
  Future<PlusApiResultOrganizationDetailVO?> getOrganizationBy(String code) async {
    final response = await _client.get(ApiPaths.appPath('/organization/code/${code}'));
    return response is PlusApiResultOrganizationDetailVO ? response : null;
  }
}
