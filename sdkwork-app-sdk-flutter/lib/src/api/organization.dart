import '../http/client.dart';
import '../models.dart';

class OrganizationApi {
  final HttpClient _client;
  
  OrganizationApi(this._client);

  /// 创建组织
  Future<PlusApiResultOrganizationVO?> createOrganization(OrganizationCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/organization'), body: body, contentType: 'application/json');
    return response is PlusApiResultOrganizationVO ? response : null;
  }

  /// 禁用组织
  Future<PlusApiResultOrganizationVO?> disable(String orgId) async {
    final response = await _client.post(ApiPaths.appPath('/organization/${orgId}/disable'));
    return response is PlusApiResultOrganizationVO ? response : null;
  }

  /// 激活组织
  Future<PlusApiResultOrganizationVO?> activate(String orgId) async {
    final response = await _client.post(ApiPaths.appPath('/organization/${orgId}/activate'));
    return response is PlusApiResultOrganizationVO ? response : null;
  }

  /// 创建岗位
  Future<PlusApiResultPositionVO?> createPosition(PositionCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/organization/position'), body: body, contentType: 'application/json');
    return response is PlusApiResultPositionVO ? response : null;
  }

  /// 创建部门
  Future<PlusApiResultDepartmentVO?> createDepartment(DepartmentCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/organization/department'), body: body, contentType: 'application/json');
    return response is PlusApiResultDepartmentVO ? response : null;
  }

  /// 获取组织详情
  Future<PlusApiResultOrganizationDetailVO?> getOrganization(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}'));
    return response is PlusApiResultOrganizationDetailVO ? response : null;
  }

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

  /// 获取组织成员
  Future<PlusApiResultPageMemberVO?> getMembersByOrg(String orgId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/members'), params: params);
    return response is PlusApiResultPageMemberVO ? response : null;
  }

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

  /// 获取子组织
  Future<PlusApiResultListOrganizationVO?> getChildOrganizations(String orgId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/${orgId}/children'));
    return response is PlusApiResultListOrganizationVO ? response : null;
  }

  /// 获取组织统计
  Future<PlusApiResultOrganizationStatisticsVO?> getOrganizationStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/organization/statistics'));
    return response is PlusApiResultOrganizationStatisticsVO ? response : null;
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

  /// 获取成员详情
  Future<PlusApiResultMemberVO?> getMember(String memberId) async {
    final response = await _client.get(ApiPaths.appPath('/organization/member/${memberId}'));
    return response is PlusApiResultMemberVO ? response : null;
  }

  /// 获取组织列表
  Future<PlusApiResultPageOrganizationVO?> getOrganizationList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/organization/list'), params: params);
    return response is PlusApiResultPageOrganizationVO ? response : null;
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

  /// 根据编码获取组织
  Future<PlusApiResultOrganizationDetailVO?> getOrganizationByCode(String code) async {
    final response = await _client.get(ApiPaths.appPath('/organization/code/${code}'));
    return response is PlusApiResultOrganizationDetailVO ? response : null;
  }
}
