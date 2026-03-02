import '../http/client.dart';
import '../models.dart';

class OauthApi {
  final HttpClient _client;
  
  OauthApi(this._client);

  /// OAuth授权URL
  Future<PlusApiResultOAuthUrlVO?> getOauthUrl(OAuthAuthUrlForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/oauth/url'), body: body, contentType: 'application/json');
    return response is PlusApiResultOAuthUrlVO ? response : null;
  }

  /// OAuth登录
  Future<PlusApiResultLoginVO?> login(OAuthLoginForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/oauth/login'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }
}
