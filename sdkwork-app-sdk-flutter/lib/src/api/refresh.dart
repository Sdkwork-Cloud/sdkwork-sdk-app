import '../http/client.dart';
import '../models.dart';

class RefreshApi {
  final HttpClient _client;
  
  RefreshApi(this._client);

  /// 刷新令牌
  Future<PlusApiResultLoginVO?> token(TokenRefreshForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/refresh'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }
}
