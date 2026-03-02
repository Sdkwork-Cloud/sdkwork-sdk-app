import '../http/client.dart';
import '../models.dart';

class SmsApi {
  final HttpClient _client;
  
  SmsApi(this._client);

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
}
