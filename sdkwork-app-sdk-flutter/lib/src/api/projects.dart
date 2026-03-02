import '../http/client.dart';
import '../models.dart';

class ProjectsApi {
  final HttpClient _client;
  
  ProjectsApi(this._client);

  /// 获取项目详情
  Future<PlusApiResultProjectDetailVO?> getProjectDetail(String projectId) async {
    final response = await _client.get(ApiPaths.appPath('/projects/${projectId}'));
    return response is PlusApiResultProjectDetailVO ? response : null;
  }

  /// 更新项目
  Future<PlusApiResultProjectVO?> updateProject(String projectId, ProjectUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/projects/${projectId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultProjectVO ? response : null;
  }

  /// 删除项目
  Future<PlusApiResultVoid?> deleteProject(String projectId) async {
    final response = await _client.delete(ApiPaths.appPath('/projects/${projectId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消归档项目
  Future<PlusApiResultVoid?> unarchiveProject(String projectId) async {
    final response = await _client.put(ApiPaths.appPath('/projects/${projectId}/unarchive'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 移动项目
  Future<PlusApiResultVoid?> moveProject(String projectId, ProjectMoveRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/projects/${projectId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 归档项目
  Future<PlusApiResultVoid?> archiveProject(String projectId) async {
    final response = await _client.put(ApiPaths.appPath('/projects/${projectId}/archive'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取项目列表
  Future<PlusApiResultPageProjectVO?> listProjects(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/projects'), params: params);
    return response is PlusApiResultPageProjectVO ? response : null;
  }

  /// 创建项目
  Future<PlusApiResultProjectVO?> createProject(ProjectCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/projects'), body: body, contentType: 'application/json');
    return response is PlusApiResultProjectVO ? response : null;
  }

  /// 复制项目
  Future<PlusApiResultProjectVO?> copyProject(String projectId, ProjectCopyRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/projects/${projectId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultProjectVO ? response : null;
  }

  /// 项目统计
  Future<PlusApiResultProjectStatisticsVO?> getProjectStatistics(String projectId) async {
    final response = await _client.get(ApiPaths.appPath('/projects/${projectId}/statistics'));
    return response is PlusApiResultProjectStatisticsVO ? response : null;
  }

  /// 搜索项目
  Future<PlusApiResultPageProjectVO?> search(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/projects/search'), params: params);
    return response is PlusApiResultPageProjectVO ? response : null;
  }

  /// 最近访问项目
  Future<PlusApiResultListProjectVO?> listRecent(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/projects/recent'), params: params);
    return response is PlusApiResultListProjectVO ? response : null;
  }
}
