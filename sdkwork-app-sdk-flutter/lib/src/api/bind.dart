import '../http/client.dart';
import '../models.dart';

class BindApi {
  final HttpClient _client;
  
  BindApi(this._client);

  /// 绑定第三方账号
  Future<PlusApiResultVoid?> thirdPartyAccount(String platform, ThirdPartyBindForm body) async {
    final response = await _client.post(ApiPaths.appPath('/user/bind/${platform}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 解绑第三方账号
  Future<PlusApiResultVoid?> unbindThirdPartyAccount(String platform) async {
    final response = await _client.delete(ApiPaths.appPath('/user/bind/${platform}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
