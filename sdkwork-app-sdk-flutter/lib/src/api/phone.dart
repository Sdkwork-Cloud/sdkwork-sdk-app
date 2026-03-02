import '../http/client.dart';
import '../models.dart';

class PhoneApi {
  final HttpClient _client;
  
  PhoneApi(this._client);

  /// 手机号验证码登录
  Future<PlusApiResultLoginVO?> login(PhoneLoginForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/phone/login'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }
}
