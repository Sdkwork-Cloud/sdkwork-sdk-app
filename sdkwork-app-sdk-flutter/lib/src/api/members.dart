import '../http/client.dart';
import '../models.dart';

class MembersApi {
  final HttpClient _client;
  
  MembersApi(this._client);

  /// 获取组织成员
  Future<PlusApiResultPageMemberVO?> getMembersByOrg(String orgId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/members'), params: params);
    return response is PlusApiResultPageMemberVO ? response : null;
  }
}
