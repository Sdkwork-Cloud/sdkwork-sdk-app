import '../http/client.dart';
import '../models.dart';

class LoginApi {
  final HttpClient _client;
  
  LoginApi(this._client);

  /// 用户登录
  Future<PlusApiResultLoginVO?> login(LoginForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/login'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }
}
