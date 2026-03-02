import '../http/client.dart';
import '../models.dart';

class AuthApi {
  final HttpClient _client;
  
  AuthApi(this._client);

  /// Request password reset challenge
  Future<PlusApiResultVoid?> requestPasswordResetChallenge(PasswordResetRequestForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/password/reset/request'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }
}
