import '../http/client.dart';
import '../models.dart';

class DepartmentsApi {
  final HttpClient _client;
  
  DepartmentsApi(this._client);

  /// 获取组织的部门列表
  Future<PlusApiResultListDepartmentVO?> getDepartmentsByOrg(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/departments'));
    return response is PlusApiResultListDepartmentVO ? response : null;
  }

  /// 获取部门树
  Future<PlusApiResultListDepartmentDetailVO?> getDepartmentTree(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/departments/tree'));
    return response is PlusApiResultListDepartmentDetailVO ? response : null;
  }
}
