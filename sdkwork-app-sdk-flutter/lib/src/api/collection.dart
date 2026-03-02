import '../http/client.dart';
import '../models.dart';

class CollectionApi {
  final HttpClient _client;
  
  CollectionApi(this._client);

  /// 获取合集详情
  Future<PlusApiResultCollectionDetailVO?> getCollection(String collectionId) async {
    final response = await _client.get(ApiPaths.appPath('/collection/${collectionId}'));
    return response is PlusApiResultCollectionDetailVO ? response : null;
  }

  /// 更新合集
  Future<PlusApiResultCollectionVO?> updateCollection(String collectionId, CollectionUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/collection/${collectionId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultCollectionVO ? response : null;
  }

  /// 删除合集
  Future<PlusApiResultVoid?> deleteCollection(String collectionId) async {
    final response = await _client.delete(ApiPaths.appPath('/collection/${collectionId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 更新内容排序
  Future<PlusApiResultVoid?> updateItemPositions(String collectionId, CollectionItemPositionForm body) async {
    final response = await _client.put(ApiPaths.appPath('/collection/${collectionId}/items/positions'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建合集
  Future<PlusApiResultCollectionVO?> createCollection(CollectionCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/collection'), body: body, contentType: 'application/json');
    return response is PlusApiResultCollectionVO ? response : null;
  }

  /// 获取合集内容列表
  Future<PlusApiResultListCollectionItemVO?> getCollectionItems(String collectionId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/collection/${collectionId}/items'), params: params);
    return response is PlusApiResultListCollectionItemVO ? response : null;
  }

  /// 添加内容到合集
  Future<PlusApiResultCollectionItemVO?> addItem(String collectionId, CollectionItemAddForm body) async {
    final response = await _client.post(ApiPaths.appPath('/collection/${collectionId}/items'), body: body, contentType: 'application/json');
    return response is PlusApiResultCollectionItemVO ? response : null;
  }

  /// 置顶内容
  Future<PlusApiResultVoid?> pinItem(String collectionId, String itemId) async {
    final response = await _client.post(ApiPaths.appPath('/collection/${collectionId}/items/${itemId}/pin'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消置顶
  Future<PlusApiResultVoid?> unpinItem(String collectionId, String itemId) async {
    final response = await _client.delete(ApiPaths.appPath('/collection/${collectionId}/items/${itemId}/pin'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取合集路径
  Future<PlusApiResultListCollectionVO?> getCollectionPath(String collectionId) async {
    final response = await _client.get(ApiPaths.appPath('/collection/${collectionId}/path'));
    return response is PlusApiResultListCollectionVO ? response : null;
  }

  /// 获取合集树
  Future<PlusApiResultListCollectionTreeVO?> getCollectionTree(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/collection/tree'), params: params);
    return response is PlusApiResultListCollectionTreeVO ? response : null;
  }

  /// 搜索合集
  Future<PlusApiResultPageCollectionVO?> searchCollections(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/collection/search'), params: params);
    return response is PlusApiResultPageCollectionVO ? response : null;
  }

  /// 获取我的合集
  Future<PlusApiResultPageCollectionVO?> getMyCollections(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/collection/my'), params: params);
    return response is PlusApiResultPageCollectionVO ? response : null;
  }

  /// 从合集移除内容
  Future<PlusApiResultVoid?> removeItem(String collectionId, String contentId) async {
    final response = await _client.delete(ApiPaths.appPath('/collection/${collectionId}/items/${contentId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
