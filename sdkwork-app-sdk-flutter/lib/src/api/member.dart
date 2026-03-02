import '../http/client.dart';
import '../models.dart';

class MemberApi {
  final HttpClient _client;
  
  MemberApi(this._client);

  /// 获取成员详情
  Future<PlusApiResultMemberVO?> getMember(String memberId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/member/${memberId}'));
    return response is PlusApiResultMemberVO ? response : null;
  }
}
