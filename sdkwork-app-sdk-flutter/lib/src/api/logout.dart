import '../http/client.dart';
import '../models.dart';

class LogoutApi {
  final HttpClient _client;
  
  LogoutApi(this._client);

  /// 用户登出
  Future<PlusApiResultVoid?> logout() async {
    final response = await _client.post(ApiPaths.appPath('/auth/logout'));
    return response is PlusApiResultVoid ? response : null;
  }
}
