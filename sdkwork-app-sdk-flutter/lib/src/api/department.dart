import '../http/client.dart';
import '../models.dart';

class DepartmentApi {
  final HttpClient _client;
  
  DepartmentApi(this._client);

  /// 创建部门
  Future<PlusApiResultDepartmentVO?> createDepartment(DepartmentCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/organization/department'), body: body, contentType: 'application/json');
    return response is PlusApiResultDepartmentVO ? response : null;
  }

  /// 获取部门详情
  Future<PlusApiResultDepartmentDetailVO?> getDepartment(String deptId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/department/${deptId}'));
    return response is PlusApiResultDepartmentDetailVO ? response : null;
  }

  /// 获取子部门
  Future<PlusApiResultListDepartmentVO?> getChildDepartments(String deptId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/department/${deptId}/children'));
    return response is PlusApiResultListDepartmentVO ? response : null;
  }
}
