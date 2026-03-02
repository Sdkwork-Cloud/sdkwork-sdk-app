import '../http/client.dart';
import '../models.dart';

class WorkspacesApi {
  final HttpClient _client;
  
  WorkspacesApi(this._client);

  /// 获取工作空间详情
  Future<PlusApiResultWorkspaceVO?> getWorkspaceDetail(String workspaceId) async {
    final response = await _client.get(ApiPaths.appPath('/workspaces/${workspaceId}'));
    return response is PlusApiResultWorkspaceVO ? response : null;
  }

  /// 更新工作空间
  Future<PlusApiResultWorkspaceVO?> updateWorkspace(String workspaceId, WorkspaceUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/workspaces/${workspaceId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultWorkspaceVO ? response : null;
  }

  /// 删除工作空间
  Future<PlusApiResultVoid?> deleteWorkspace(String workspaceId) async {
    final response = await _client.delete(ApiPaths.appPath('/workspaces/${workspaceId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取项目详情
  Future<PlusApiResultProjectDetailVO?> getProjectDetail(String workspaceId, String projectId) async {
    final response = await _client.get(ApiPaths.appPath('/workspaces/${workspaceId}/projects/${projectId}'));
    return response is PlusApiResultProjectDetailVO ? response : null;
  }

  /// 更新项目
  Future<PlusApiResultProjectVO?> updateProject(String workspaceId, String projectId, ProjectUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/workspaces/${workspaceId}/projects/${projectId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultProjectVO ? response : null;
  }

  /// 删除项目
  Future<PlusApiResultVoid?> deleteProject(String workspaceId, String projectId) async {
    final response = await _client.delete(ApiPaths.appPath('/workspaces/${workspaceId}/projects/${projectId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消归档项目
  Future<PlusApiResultVoid?> unarchiveProject(String workspaceId, String projectId) async {
    final response = await _client.put(ApiPaths.appPath('/workspaces/${workspaceId}/projects/${projectId}/unarchive'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 移动项目
  Future<PlusApiResultVoid?> moveProject(String workspaceId, String projectId, ProjectMoveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/workspaces/${workspaceId}/projects/${projectId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 归档项目
  Future<PlusApiResultVoid?> archiveProject(String workspaceId, String projectId) async {
    final response = await _client.put(ApiPaths.appPath('/workspaces/${workspaceId}/projects/${projectId}/archive'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 更新成员角色
  Future<PlusApiResultVoid?> updateMemberRole(String workspaceId, String userId, MemberRoleUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/workspaces/${workspaceId}/members/${userId}/role'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取工作空间列表
  Future<PlusApiResultListWorkspaceVO?> listWorkspaces() async {
    final response = await _client.get(ApiPaths.appPath('/workspaces'));
    return response is PlusApiResultListWorkspaceVO ? response : null;
  }

  /// 创建工作空间
  Future<PlusApiResultWorkspaceVO?> createWorkspace(WorkspaceCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/workspaces'), body: body, contentType: 'application/json');
    return response is PlusApiResultWorkspaceVO ? response : null;
  }

  /// 获取项目列表
  Future<PlusApiResultPageProjectVO?> listProjects(String workspaceId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/workspaces/${workspaceId}/projects'), params: params);
    return response is PlusApiResultPageProjectVO ? response : null;
  }

  /// 创建项目
  Future<PlusApiResultProjectVO?> createProject(String workspaceId, ProjectCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/workspaces/${workspaceId}/projects'), body: body, contentType: 'application/json');
    return response is PlusApiResultProjectVO ? response : null;
  }

  /// 复制项目
  Future<PlusApiResultProjectVO?> copyProject(String workspaceId, String projectId, ProjectCopyForm body) async {
    final response = await _client.post(ApiPaths.appPath('/workspaces/${workspaceId}/projects/${projectId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultProjectVO ? response : null;
  }

  /// 获取工作空间成员
  Future<PlusApiResultListMemberVO?> listWorkspaceMembers(String workspaceId) async {
    final response = await _client.get(ApiPaths.appPath('/workspaces/${workspaceId}/members'));
    return response is PlusApiResultListMemberVO ? response : null;
  }

  /// 邀请成员
  Future<PlusApiResultVoid?> inviteMember(String workspaceId, MemberInviteForm body) async {
    final response = await _client.post(ApiPaths.appPath('/workspaces/${workspaceId}/members'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取当前工作空间
  Future<PlusApiResultWorkspaceVO?> getCurrentWorkspace() async {
    final response = await _client.get(ApiPaths.appPath('/workspaces/current'));
    return response is PlusApiResultWorkspaceVO ? response : null;
  }

  /// 移除成员
  Future<PlusApiResultVoid?> removeMember(String workspaceId, String userId) async {
    final response = await _client.delete(ApiPaths.appPath('/workspaces/${workspaceId}/members/${userId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
