import '../http/client.dart';
import '../models.dart';

class AvatarApi {
  final HttpClient _client;
  
  AvatarApi(this._client);

  /// 上传头像
  Future<PlusApiResultMapStringString?> upload(UploadAvatarRequest? body) async {
    final response = await _client.post(ApiPaths.appPath('/user/avatar'), body: body, contentType: 'application/json');
    return response is PlusApiResultMapStringString ? response : null;
  }
}
