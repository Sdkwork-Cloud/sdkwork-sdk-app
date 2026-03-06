import '../http/client.dart';
import '../models.dart';

class DriveApi {
  final HttpClient _client;
  
  DriveApi(this._client);

  /// Restore drive item
  Future<PlusApiResultDriveItemVO?> restoreItem(String itemId) async {
    final response = await _client.put(ApiPaths.appPath('/drive/items/${itemId}/restore'));
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// Rename drive item
  Future<PlusApiResultDriveItemVO?> renameItem(String itemId, DriveRenameForm body) async {
    final response = await _client.put(ApiPaths.appPath('/drive/items/${itemId}/rename'), body: body, contentType: 'application/json');
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// Move drive item
  Future<PlusApiResultDriveItemVO?> moveItem(String itemId, DriveMoveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/drive/items/${itemId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// Get drive file content
  Future<PlusApiResultDriveContentVO?> getItemContent(String itemId) async {
    final response = await _client.get(ApiPaths.appPath('/drive/items/${itemId}/content'));
    return response is PlusApiResultDriveContentVO ? response : null;
  }

  /// Update drive file content
  Future<PlusApiResultDriveContentVO?> updateItemContent(String itemId, DriveContentUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/drive/items/${itemId}/content'), body: body, contentType: 'application/json');
    return response is PlusApiResultDriveContentVO ? response : null;
  }

  /// Archive drive item
  Future<PlusApiResultDriveItemVO?> archiveItem(String itemId) async {
    final response = await _client.put(ApiPaths.appPath('/drive/items/${itemId}/archive'));
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// Favorite drive item
  Future<PlusApiResultDriveItemVO?> favoriteItem(String itemId) async {
    final response = await _client.post(ApiPaths.appPath('/drive/items/${itemId}/favorite'));
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// Unfavorite drive item
  Future<PlusApiResultDriveItemVO?> unfavoriteItem(String itemId) async {
    final response = await _client.delete(ApiPaths.appPath('/drive/items/${itemId}/favorite'));
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// Copy drive item
  Future<PlusApiResultDriveItemVO?> copyItem(String itemId, DriveCopyForm body) async {
    final response = await _client.post(ApiPaths.appPath('/drive/items/${itemId}/copy'), body: body, contentType: 'application/json');
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// Batch delete drive items
  Future<PlusApiResultVoid?> batchDeleteItems(DriveBatchDeleteForm body) async {
    final response = await _client.post(ApiPaths.appPath('/drive/items/batch-delete'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// Create drive folder
  Future<PlusApiResultDriveItemVO?> createFolder(DriveFolderCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/drive/folders'), body: body, contentType: 'application/json');
    return response is PlusApiResultDriveItemVO ? response : null;
  }

  /// List drive items
  Future<PlusApiResultPageDriveItemVO?> listItems(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/drive/items'), params: params);
    return response is PlusApiResultPageDriveItemVO ? response : null;
  }

  /// Get drive item detail
  Future<PlusApiResultDriveItemDetailVO?> getItemDetail(String itemId) async {
    final response = await _client.get(ApiPaths.appPath('/drive/items/${itemId}'));
    return response is PlusApiResultDriveItemDetailVO ? response : null;
  }

  /// Delete drive item
  Future<PlusApiResultVoid?> deleteItem(String itemId) async {
    final response = await _client.delete(ApiPaths.appPath('/drive/items/${itemId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
