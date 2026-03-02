import '../http/client.dart';
import '../models.dart';

class AssetsApi {
  final HttpClient _client;
  
  AssetsApi(this._client);

  /// 重命名资产
  Future<PlusApiResultVoid?> renameAsset(String assetId, AssetRenameForm body) async {
    final response = await _client.put(ApiPaths.appPath('/assets/${assetId}/rename'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 移动资产
  Future<PlusApiResultVoid?> moveAsset(String assetId, AssetMoveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/assets/${assetId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 收藏资产
  Future<PlusApiResultVoid?> favoriteAsset(String assetId) async {
    final response = await _client.post(ApiPaths.appPath('/assets/${assetId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消收藏
  Future<PlusApiResultVoid?> unfavoriteAsset(String assetId) async {
    final response = await _client.delete(ApiPaths.appPath('/assets/${assetId}/favorite'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取文件夹列表
  Future<PlusApiResultListFolderVO?> listFolders() async {
    final response = await _client.get(ApiPaths.appPath('/assets/folders'));
    return response is PlusApiResultListFolderVO ? response : null;
  }

  /// 创建文件夹
  Future<PlusApiResultFolderVO?> createFolder(FolderCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/assets/folders'), body: body, contentType: 'application/json');
    return response is PlusApiResultFolderVO ? response : null;
  }

  /// 获取资产列表
  Future<PlusApiResultPageAssetVO?> listAssets(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/assets'), params: params);
    return response is PlusApiResultPageAssetVO ? response : null;
  }

  /// 获取资产详情
  Future<PlusApiResultAssetDetailVO?> getAssetDetail(String assetId) async {
    final response = await _client.get(ApiPaths.appPath('/assets/${assetId}'));
    return response is PlusApiResultAssetDetailVO ? response : null;
  }

  /// 删除资产
  Future<PlusApiResultVoid?> deleteAsset(String assetId) async {
    final response = await _client.delete(ApiPaths.appPath('/assets/${assetId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 下载资产
  Future<PlusApiResultDownloadUrlVO?> getDownloadUrl(String assetId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/assets/${assetId}/download'), params: params);
    return response is PlusApiResultDownloadUrlVO ? response : null;
  }

  /// 获取资产统计
  Future<PlusApiResultAssetStatisticsVO?> getStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/assets/statistics'));
    return response is PlusApiResultAssetStatisticsVO ? response : null;
  }

  /// 删除文件夹
  Future<PlusApiResultVoid?> deleteFolder(String folderId) async {
    final response = await _client.delete(ApiPaths.appPath('/assets/folders/${folderId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量删除资产
  Future<PlusApiResultVoid?> batchDelete() async {
    final response = await _client.delete(ApiPaths.appPath('/assets/batch'));
    return response is PlusApiResultVoid ? response : null;
  }
}
