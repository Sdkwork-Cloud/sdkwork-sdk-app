import '../http/client.dart';
import '../models.dart';

class ProfileApi {
  final HttpClient _client;
  
  ProfileApi(this._client);

  /// 获取用户信息
  Future<PlusApiResultUserProfileVO?> getUser() async {
    final response = await _client.get(ApiPaths.appPath('/user/profile'));
    return response is PlusApiResultUserProfileVO ? response : null;
  }

  /// 更新用户信息
  Future<PlusApiResultUserProfileVO?> updateUser(UserProfileUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/user/profile'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserProfileVO ? response : null;
  }
}
