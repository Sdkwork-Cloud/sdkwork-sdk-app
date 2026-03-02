import '../http/client.dart';
import '../models.dart';

class FavoriteApi {
  final HttpClient _client;
  
  FavoriteApi(this._client);

  /// 移动收藏
  Future<PlusApiResultFavoriteVO?> moveFavoriteToFolder(String favoriteId, FavoriteMoveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/favorite/${favoriteId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultFavoriteVO ? response : null;
  }

  /// 更新收藏夹
  Future<PlusApiResultFavoriteFolderVO?> updateFavoriteFolder(String folderId, FavoriteFolderUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/favorite/folders/${folderId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultFavoriteFolderVO ? response : null;
  }

  /// 删除收藏夹
  Future<PlusApiResultVoid?> deleteFavoriteFolder(String folderId, Map<String, dynamic>? params) async {
    final response = await _client.delete(ApiPaths.appPath('/favorite/folders/${folderId}'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量移动收藏
  Future<PlusApiResultVoid?> batchMoveFavorites(FavoriteBatchMoveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/favorite/batch/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 收藏列表
  Future<PlusApiResultPageFavoriteItemVO?> listFavorites(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/favorite'), params: params);
    return response is PlusApiResultPageFavoriteItemVO ? response : null;
  }

  /// 添加收藏
  Future<PlusApiResultFavoriteVO?> add(FavoriteAddForm body) async {
    final response = await _client.post(ApiPaths.appPath('/favorite'), body: body, contentType: 'application/json');
    return response is PlusApiResultFavoriteVO ? response : null;
  }

  /// 收藏夹列表
  Future<PlusApiResultListFavoriteFolderVO?> listFavoriteFolders() async {
    final response = await _client.get(ApiPaths.appPath('/favorite/folders'));
    return response is PlusApiResultListFavoriteFolderVO ? response : null;
  }

  /// 创建收藏夹
  Future<PlusApiResultFavoriteFolderVO?> createFavoriteFolder(FavoriteFolderCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/favorite/folders'), body: body, contentType: 'application/json');
    return response is PlusApiResultFavoriteFolderVO ? response : null;
  }

  /// 批量检查收藏
  Future<PlusApiResultListFavoriteCheckVO?> batchCheckFavorites(FavoriteBatchCheckForm body) async {
    final response = await _client.post(ApiPaths.appPath('/favorite/batch-check'), body: body, contentType: 'application/json');
    return response is PlusApiResultListFavoriteCheckVO ? response : null;
  }

  /// 收藏详情
  Future<PlusApiResultFavoriteDetailVO?> getFavoriteDetail(String favoriteId) async {
    final response = await _client.get(ApiPaths.appPath('/favorite/${favoriteId}'));
    return response is PlusApiResultFavoriteDetailVO ? response : null;
  }

  /// 取消收藏
  Future<PlusApiResultVoid?> remove(String favoriteId) async {
    final response = await _client.delete(ApiPaths.appPath('/favorite/${favoriteId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 收藏统计
  Future<PlusApiResultFavoriteStatisticsVO?> getFavoriteStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/favorite/statistics'));
    return response is PlusApiResultFavoriteStatisticsVO ? response : null;
  }

  /// 最近收藏
  Future<PlusApiResultListFavoriteItemVO?> getRecentFavorites(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/favorite/recent'), params: params);
    return response is PlusApiResultListFavoriteItemVO ? response : null;
  }

  /// 各类型收藏数
  Future<PlusApiResultListFavoriteTypeCountVO?> getFavoriteCountByType() async {
    final response = await _client.get(ApiPaths.appPath('/favorite/count/by-type'));
    return response is PlusApiResultListFavoriteTypeCountVO ? response : null;
  }

  /// 检查收藏状态
  Future<PlusApiResultFavoriteCheckVO?> check(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/favorite/check'), params: params);
    return response is PlusApiResultFavoriteCheckVO ? response : null;
  }

  /// 按目标取消收藏
  Future<PlusApiResultVoid?> removeFavoriteByTarget(Map<String, dynamic>? params) async {
    final response = await _client.delete(ApiPaths.appPath('/favorite/by-target'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量取消收藏
  Future<PlusApiResultVoid?> batchRemoveFavorites() async {
    final response = await _client.delete(ApiPaths.appPath('/favorite/batch'));
    return response is PlusApiResultVoid ? response : null;
  }
}
