import '../http/client.dart';
import '../models.dart';

class NotesApi {
  final HttpClient _client;
  
  NotesApi(this._client);

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

  /// 恢复笔记
  Future<PlusApiResultNoteOperationVO?> restoreNote(String noteId) async {
    final response = await _client.put(ApiPaths.appPath('/notes/${noteId}/restore'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 移动笔记
  Future<PlusApiResultNoteOperationVO?> moveNote(String noteId, NoteMoveRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/notes/${noteId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 获取笔记正文
  Future<PlusApiResultNoteContentVO?> getNoteContent(String noteId) async {
    final response = await _client.get(ApiPaths.appPath('/notes/${noteId}/content'));
    return response is PlusApiResultNoteContentVO ? response : null;
  }

  /// 更新笔记正文
  Future<PlusApiResultNoteContentVO?> updateNoteContent(String noteId, NoteContentUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/notes/${noteId}/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteContentVO ? response : null;
  }

  /// 归档笔记
  Future<PlusApiResultNoteOperationVO?> archiveNote(String noteId) async {
    final response = await _client.put(ApiPaths.appPath('/notes/${noteId}/archive'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 重命名文件夹
  Future<PlusApiResultNoteFolderVO?> updateFolder(String folderId, NoteFolderUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/notes/folders/${folderId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteFolderVO ? response : null;
  }

  /// 删除文件夹
  Future<PlusApiResultNoteOperationVO?> deleteFolder(String folderId) async {
    final response = await _client.delete(ApiPaths.appPath('/notes/folders/${folderId}'));
    return response is PlusApiResultNoteOperationVO ? response : null;
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

  /// 取消收藏
  Future<PlusApiResultNoteOperationVO?> unfavoriteNote(String noteId) async {
    final response = await _client.delete(ApiPaths.appPath('/notes/${noteId}/favorite'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 复制笔记
  Future<PlusApiResultNoteOperationVO?> copyNote(String noteId, NoteCopyRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/notes/${noteId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 批量更新笔记正文
  Future<PlusApiResultNoteBatchUpdateResultVO?> batchUpdateNote(String noteId, NoteBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/notes/${noteId}/batch-update'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteBatchUpdateResultVO ? response : null;
  }

  /// 批量更新笔记正文
  Future<PlusApiResultNoteBatchUpdateResultVO?> createBatchUpdateNote(String noteId, NoteBatchUpdateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/notes/${noteId}:batchUpdate'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteBatchUpdateResultVO ? response : null;
  }

  /// 获取文件夹树
  Future<PlusApiResultListNoteFolderVO?> listFolders() async {
    final response = await _client.get(ApiPaths.appPath('/notes/folders'));
    return response is PlusApiResultListNoteFolderVO ? response : null;
  }

  /// 创建文件夹
  Future<PlusApiResultNoteFolderVO?> createFolder(NoteFolderCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/notes/folders'), body: body, contentType: 'application/json');
    return response is PlusApiResultNoteFolderVO ? response : null;
  }

  /// 获取笔记统计
  Future<PlusApiResultNoteStatisticsVO?> getNoteStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/notes/statistics'));
    return response is PlusApiResultNoteStatisticsVO ? response : null;
  }

  /// 批量删除笔记
  Future<PlusApiResultNoteOperationVO?> batchDelete() async {
    final response = await _client.delete(ApiPaths.appPath('/notes/batch'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }

  /// 批量删除笔记
  Future<PlusApiResultNoteOperationVO?> deleteBatch() async {
    final response = await _client.delete(ApiPaths.appPath('/notes/batch-delete'));
    return response is PlusApiResultNoteOperationVO ? response : null;
  }
}
