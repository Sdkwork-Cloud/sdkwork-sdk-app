import '../http/client.dart';
import '../models.dart';

class AppApi {
  final HttpClient _client;
  
  AppApi(this._client);

  /// 获取笔记详情
  Future<PlusApiResultNoteVO?> getNoteDetail(String noteId) async {
    final response = await _client.get(ApiPaths.appPath('/notes/${noteId}'));
    return response is PlusApiResultNoteVO ? response : null;
  }

  /// 更新笔记
  Future<PlusApiResultNoteOperationVO?> updateNote(String noteId, NoteUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/notes/${noteId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 删除笔记
  Future<PlusApiResultVoid?> deleteNote(String noteId) async {
    final response = await _client.delete(ApiPaths.appPath('/notes/${noteId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 移动笔记
  Future<PlusApiResultNoteOperationVO?> moveNote(String noteId, NoteMoveRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/notes/${noteId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 更新文件夹
  Future<PlusApiResultNoteFolderVO?> updateFolder(String folderId, NoteFolderUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/notes/folders/${folderId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteFolderVO ? response : null;
  }

  /// 删除文件夹
  Future<PlusApiResultNoteOperationVO?> deleteFolder(String folderId) async {
    final response = await _client.delete(ApiPaths.appPath('/notes/folders/${folderId}'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 获取应用详情
  Future<PlusApiResultAppDetailVO?> getApp(String appId) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/${appId}'));
    return response is PlusApiResultAppDetailVO ? response : null;
  }

  /// 更新应用
  Future<PlusApiResultAppVO?> updateApp(String appId, AppUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/app/manage/${appId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultAppVO ? response : null;
  }

  /// 删除应用
  Future<PlusApiResultVoid?> deleteApp(String appId) async {
    final response = await _client.delete(ApiPaths.appPath('/app/manage/${appId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取笔记列表
  Future<PlusApiResultPageNoteVO?> listNotes(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/notes'), params: params);
    return response is PlusApiResultPageNoteVO ? response : null;
  }

  /// 创建笔记
  Future<PlusApiResultNoteOperationVO?> createNote(NoteCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/notes'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 收藏笔记
  Future<PlusApiResultNoteOperationVO?> favoriteNote(String noteId) async {
    final response = await _client.post(ApiPaths.appPath('/notes/${noteId}/favorite'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 取消收藏笔记
  Future<PlusApiResultNoteOperationVO?> unfavoriteNote(String noteId) async {
    final response = await _client.delete(ApiPaths.appPath('/notes/${noteId}/favorite'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 复制笔记
  Future<PlusApiResultNoteOperationVO?> copyNote(String noteId, NoteCopyRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/notes/${noteId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 获取文件夹列表
  Future<PlusApiResultListNoteFolderVO?> listFolders() async {
    final response = await _client.get(ApiPaths.appPath('/notes/folders'));
    return response is PlusApiResultListNoteFolderVO ? response : null;
  }

  /// 创建文件夹
  Future<PlusApiResultNoteFolderVO?> createFolder(NoteFolderCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/notes/folders'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteFolderVO ? response : null;
  }

  /// 创建应用
  Future<PlusApiResultAppVO?> createApp(AppCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/app/manage'), body: body, contentType: 'application/json');
    return response is PlusApiResultAppVO ? response : null;
  }

  /// 停用应用
  Future<PlusApiResultVoid?> deactivate(String appId) async {
    final response = await _client.post(ApiPaths.appPath('/app/manage/${appId}/deactivate'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 激活应用
  Future<PlusApiResultVoid?> activate(String appId) async {
    final response = await _client.post(ApiPaths.appPath('/app/manage/${appId}/activate'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取笔记统计
  Future<PlusApiResultNoteStatisticsVO?> getNoteStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/notes/statistics'));
    return response is PlusApiResultNoteStatisticsVO ? response : null;
  }

  /// 获取应用统计
  Future<PlusApiResultAppStatisticsVO?> getAppStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/statistics'));
    return response is PlusApiResultAppStatisticsVO ? response : null;
  }

  /// 搜索应用
  Future<PlusApiResultPageAppVO?> searchApps(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/search'), params: params);
    return response is PlusApiResultPageAppVO ? response : null;
  }

  /// 获取项目应用
  Future<PlusApiResultPageAppVO?> getProjectApps(String projectId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/project/${projectId}'), params: params);
    return response is PlusApiResultPageAppVO ? response : null;
  }

  /// 获取我的应用
  Future<PlusApiResultPageAppVO?> getMyApps(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/app/manage/my'), params: params);
    return response is PlusApiResultPageAppVO ? response : null;
  }

  /// 获取账户余额汇总
  Future<PlusApiResultAccountSummaryVO?> getAccountSummary() async {
    final response = await _client.get(ApiPaths.appPath('/account/summary'));
    return response is PlusApiResultAccountSummaryVO ? response : null;
  }

  /// 批量删除笔记
  Future<PlusApiResultNoteOperationVO?> batchDeleteNotes() async {
    final response = await _client.delete(ApiPaths.appPath('/notes/batch'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }
}
