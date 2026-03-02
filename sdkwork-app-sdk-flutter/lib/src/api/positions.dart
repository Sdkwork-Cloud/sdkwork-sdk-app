import '../http/client.dart';
import '../models.dart';

class PositionsApi {
  final HttpClient _client;
  
  PositionsApi(this._client);

  /// 获取组织的岗位列表
  Future<PlusApiResultListPositionVO?> getPositionsByOrg(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/positions'));
    return response is PlusApiResultListPositionVO ? response : null;
  }

  /// 获取岗位树
  Future<PlusApiResultListPositionDetailVO?> getPositionTree(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/positions/tree'));
    return response is PlusApiResultListPositionDetailVO ? response : null;
  }
}
