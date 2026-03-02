import '../http/client.dart';
import '../models.dart';

class FileSystemApi {
  final HttpClient _client;
  
  FileSystemApi(this._client);

  /// Rename node
  Future<PlusApiResultFileSystemNodeVO?> renameNode(String nodeId, FileSystemRenameForm body) async {
    final response = await _client.put(ApiPaths.appPath('/filesystem/nodes/${nodeId}/rename'), body: body, contentType: 'application/json');
    return response is PlusApiResultFileSystemNodeVO ? response : null;
  }

  /// Move node
  Future<PlusApiResultFileSystemNodeVO?> moveNode(String nodeId, FileSystemMoveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/filesystem/nodes/${nodeId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultFileSystemNodeVO ? response : null;
  }

  /// Get file content
  Future<PlusApiResultFileSystemContentVO?> getFileContent(String fileId) async {
    final response = await _client.get(ApiPaths.appPath('/filesystem/files/${fileId}/content'));
    return response is PlusApiResultFileSystemContentVO ? response : null;
  }

  /// Update file content
  Future<PlusApiResultFileSystemContentVO?> updateFileContent(String fileId, FileSystemContentUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/filesystem/files/${fileId}/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultFileSystemContentVO ? response : null;
  }

  /// Copy node
  Future<PlusApiResultFileSystemNodeVO?> copyNode(String nodeId, FileSystemCopyForm body) async {
    final response = await _client.post(ApiPaths.appPath('/filesystem/nodes/${nodeId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultFileSystemNodeVO ? response : null;
  }

  /// Create folder
  Future<PlusApiResultFileSystemNodeVO?> createFolder(FileSystemFolderCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/filesystem/folders'), body: body, contentType: 'application/json');
    return response is PlusApiResultFileSystemNodeVO ? response : null;
  }

  /// Create file
  Future<PlusApiResultFileSystemNodeVO?> createFile(FileSystemFileCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/filesystem/files'), body: body, contentType: 'application/json');
    return response is PlusApiResultFileSystemNodeVO ? response : null;
  }

  /// List nodes
  Future<PlusApiResultPageFileSystemNodeVO?> listNodes(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/filesystem/nodes'), params: params);
    return response is PlusApiResultPageFileSystemNodeVO ? response : null;
  }

  /// Get node detail
  Future<PlusApiResultFileSystemNodeVO?> getNodeDetail(String nodeId) async {
    final response = await _client.get(ApiPaths.appPath('/filesystem/nodes/${nodeId}'));
    return response is PlusApiResultFileSystemNodeVO ? response : null;
  }

  /// Delete node
  Future<PlusApiResultVoid?> deleteNode(String nodeId) async {
    final response = await _client.delete(ApiPaths.appPath('/filesystem/nodes/${nodeId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// List disks
  Future<PlusApiResultListFileSystemDiskVO?> listDisks() async {
    final response = await _client.get(ApiPaths.appPath('/filesystem/disks'));
    return response is PlusApiResultListFileSystemDiskVO ? response : null;
  }

  /// Get primary disk
  Future<PlusApiResultFileSystemDiskVO?> getPrimaryDisk() async {
    final response = await _client.get(ApiPaths.appPath('/filesystem/disks/default'));
    return response is PlusApiResultFileSystemDiskVO ? response : null;
  }
}
