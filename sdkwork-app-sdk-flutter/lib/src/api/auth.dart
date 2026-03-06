import '../http/client.dart';
import '../models.dart';

class AuthApi {
  final HttpClient _client;
  
  AuthApi(this._client);

  /// 验证验证码
  Future<PlusApiResultVerifyResultVO?> verifySmsCode(VerifyCodeCheckForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/sms/verify'), body: body, contentType: 'application/json');
    return response is PlusApiResultVerifyResultVO ? response : null;
  }

  /// 发送验证码
  Future<PlusApiResultVoid?> sendSmsCode(VerifyCodeSendForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/sms/send'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 用户注册
  Future<PlusApiResultUserInfoVO?> register(RegisterForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/register'), body: body, contentType: 'application/json');
    return response is PlusApiResultUserInfoVO ? response : null;
  }

  /// 刷新令牌
  Future<PlusApiResultLoginVO?> refreshToken(TokenRefreshForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/refresh'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }

  /// 生成登录二维码
  Future<PlusApiResultQrCodeVO?> generateQrCode() async {
    final response = await _client.post(ApiPaths.appPath('/auth/qr/generate'));
    return response is PlusApiResultQrCodeVO ? response : null;
  }

  /// 确认二维码登录
  Future<PlusApiResultVoid?> confirmQrCodeLogin(QrCodeConfirmForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/qr/confirm'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 手机号验证码登录
  Future<PlusApiResultLoginVO?> phoneLogin(PhoneLoginForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/phone/login'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }

  /// 重置密码
  Future<PlusApiResultVoid?> resetPassword(PasswordResetForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/password/reset'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// Request password reset challenge
  Future<PlusApiResultVoid?> requestPasswordResetChallenge(PasswordResetRequestForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/password/reset/request'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// OAuth授权URL
  Future<PlusApiResultOAuthUrlVO?> getOauthUrl(OAuthAuthUrlForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/oauth/url'), body: body, contentType: 'application/json');
    return response is PlusApiResultOAuthUrlVO ? response : null;
  }

  /// OAuth登录
  Future<PlusApiResultLoginVO?> oauthLogin(OAuthLoginForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/oauth/login'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }

  /// 用户登出
  Future<PlusApiResultVoid?> logout() async {
    final response = await _client.post(ApiPaths.appPath('/auth/logout'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 用户登录
  Future<PlusApiResultLoginVO?> login(LoginForm body) async {
    final response = await _client.post(ApiPaths.appPath('/auth/login'), body: body, contentType: 'application/json');
    return response is PlusApiResultLoginVO ? response : null;
  }

  /// 检查二维码状态
  Future<PlusApiResultQrCodeStatusVO?> checkQrCodeStatus(String qrKey) async {
    final response = await _client.get(ApiPaths.appPath('/auth/qr/status/${qrKey}'));
    return response is PlusApiResultQrCodeStatusVO ? response : null;
  }

  /// 二维码统一入口
  Future<void> qrCodeEntry(String qrKey) async {
    await _client.get(ApiPaths.appPath('/auth/qr/entry/${qrKey}'));
  }
}
