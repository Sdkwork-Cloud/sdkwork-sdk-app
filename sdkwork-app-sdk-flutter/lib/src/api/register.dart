import '../http/client.dart';
import '../models.dart';

class RegisterApi {
  final HttpClient _client;
  
  RegisterApi(this._client);

  /// 用户注册
  Future<PlusApiResultUserInfoVO?> register(RegisterForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/register'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserInfoVO ? response : null;
  }
}
