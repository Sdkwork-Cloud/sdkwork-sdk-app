import '../http/client.dart';
import '../models.dart';

class CartApi {
  final HttpClient _client;
  
  CartApi(this._client);

  /// 更新购物车商品数量
  Future<PlusApiResultCartItemVO?> updateItemQuantity(String itemId, UpdateCartItemForm body) async {
    final response = await _client.put(ApiPaths.appPath('/cart/items/${itemId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultCartItemVO ? response : null;
  }

  /// 删除购物车商品
  Future<PlusApiResultVoid?> removeItem(String itemId) async {
    final response = await _client.delete(ApiPaths.appPath('/cart/items/${itemId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 更新商品选中状态
  Future<PlusApiResultVoid?> updateItemSelection(String itemId, Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.appPath('/cart/items/${itemId}/select'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量更新选中状态
  Future<PlusApiResultVoid?> batchUpdateSelection(BatchSelectForm body) async {
    final response = await _client.put(ApiPaths.appPath('/cart/items/select'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取购物车商品列表
  Future<PlusApiResultListCartItemVO?> getCartItems() async {
    final response = await _client.get(ApiPaths.appPath('/cart/items'));
    return response is PlusApiResultListCartItemVO ? response : null;
  }

  /// 添加商品到购物车
  Future<PlusApiResultCartItemVO?> addItem(AddCartItemForm body) async {
    final response = await _client.post(ApiPaths.appPath('/cart/items'), body: body, contentType: 'application/json');
    return response is PlusApiResultCartItemVO ? response : null;
  }

  /// 批量删除购物车商品
  Future<PlusApiResultVoid?> removeItems(Map<String, dynamic>? params) async {
    final response = await _client.delete(ApiPaths.appPath('/cart/items'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取当前用户购物车
  Future<PlusApiResultShoppingCartVO?> getMy() async {
    final response = await _client.get(ApiPaths.appPath('/cart'));
    return response is PlusApiResultShoppingCartVO ? response : null;
  }

  /// 清空购物车
  Future<PlusApiResultVoid?> clear() async {
    final response = await _client.delete(ApiPaths.appPath('/cart'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取购物车统计
  Future<PlusApiResultCartStatisticsVO?> getCartStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/cart/statistics'));
    return response is PlusApiResultCartStatisticsVO ? response : null;
  }

  /// 获取选中的商品列表
  Future<PlusApiResultListCartItemVO?> getSelectedItems() async {
    final response = await _client.get(ApiPaths.appPath('/cart/items/selected'));
    return response is PlusApiResultListCartItemVO ? response : null;
  }

  /// 检查商品是否在购物车中
  Future<PlusApiResultBoolean?> checkItemIn(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/cart/check'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }
}
