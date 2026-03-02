import '../http/client.dart';
import '../models.dart';

class QrApi {
  final HttpClient _client;
  
  QrApi(this._client);

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

  /// 检查二维码状态
  Future<PlusApiResultQrCodeStatusVO?> checkQrCodeStatus(String qrKey) async {
    final response = await _client.get(ApiPaths.appPath('/auth/qr/status/${qrKey}'));
    return response is PlusApiResultQrCodeStatusVO ? response : null;
  }
}
