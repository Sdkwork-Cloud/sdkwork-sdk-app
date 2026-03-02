import '../http/client.dart';
import '../models.dart';

class PositionApi {
  final HttpClient _client;
  
  PositionApi(this._client);

  /// 创建岗位
  Future<PlusApiResultPositionVO?> createPosition(PositionCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/organization/position'), body: body, contentType: 'application/json');
    return response is PlusApiResultPositionVO ? response : null;
  }

  /// 获取岗位详情
  Future<PlusApiResultPositionDetailVO?> getPosition(String posId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/position/${posId}'));
    return response is PlusApiResultPositionDetailVO ? response : null;
  }

  /// 获取子岗位
  Future<PlusApiResultListPositionVO?> getChildPositions(String posId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/position/${posId}/children'));
    return response is PlusApiResultListPositionVO ? response : null;
  }
}
