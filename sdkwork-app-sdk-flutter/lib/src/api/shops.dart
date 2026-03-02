import '../http/client.dart';
import '../models.dart';

class ShopsApi {
  final HttpClient _client;
  
  ShopsApi(this._client);

  /// 获取店铺详情
  Future<PlusApiResultShopDetailVO?> getShopDetail(String shopId) async {
    final response = await _client.get(ApiPaths.appPath('/shops/${shopId}'));
    return response is PlusApiResultShopDetailVO ? response : null;
  }

  /// 更新店铺
  Future<PlusApiResultShopVO?> updateShop(String shopId, ShopUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/shops/${shopId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultShopVO ? response : null;
  }

  /// 删除店铺
  Future<PlusApiResultVoid?> deleteShop(String shopId) async {
    final response = await _client.delete(ApiPaths.appPath('/shops/${shopId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 更新店铺状态
  Future<PlusApiResultVoid?> updateStatus(String shopId, Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.appPath('/shops/${shopId}/status'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 开店营业
  Future<PlusApiResultVoid?> openShop(String shopId) async {
    final response = await _client.put(ApiPaths.appPath('/shops/${shopId}/open'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 关店休息
  Future<PlusApiResultVoid?> closeShop(String shopId) async {
    final response = await _client.put(ApiPaths.appPath('/shops/${shopId}/close'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取店铺列表
  Future<PlusApiResultPageShopVO?> listShops(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/shops'), params: params);
    return response is PlusApiResultPageShopVO ? response : null;
  }

  /// 创建店铺
  Future<PlusApiResultShopVO?> createShop(ShopCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/shops'), body: body, contentType: 'application/json');
    return response is PlusApiResultShopVO ? response : null;
  }

  /// 获取店铺统计
  Future<PlusApiResultShopStatisticsVO?> getStatistics() async {
    final response = await _client.get(ApiPaths.appPath('/shops/statistics'));
    return response is PlusApiResultShopStatisticsVO ? response : null;
  }

  /// 获取所有激活店铺
  Future<PlusApiResultListShopVO?> listAllActive() async {
    final response = await _client.get(ApiPaths.appPath('/shops/all'));
    return response is PlusApiResultListShopVO ? response : null;
  }
}
