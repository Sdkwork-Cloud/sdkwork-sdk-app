import '../http/client.dart';
import '../models.dart';

class PasswordApi {
  final HttpClient _client;
  
  PasswordApi(this._client);

  /// 修改密码
  Future<PlusApiResultVoid?> change(PasswordChangeForm body) async {
    final response = await _client.put(ApiPaths.appPath('/user/password'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 重置密码
  Future<PlusApiResultVoid?> reset(PasswordResetForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/password/reset'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }
}
