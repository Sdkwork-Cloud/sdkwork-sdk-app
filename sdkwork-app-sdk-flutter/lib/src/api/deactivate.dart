import '../http/client.dart';
import '../models.dart';

class DeactivateApi {
  final HttpClient _client;
  
  DeactivateApi(this._client);

  /// 注销账号
  Future<PlusApiResultVoid?> account(AccountDeactivateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/user/deactivate'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }
}
