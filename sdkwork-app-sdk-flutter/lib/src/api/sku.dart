import '../http/client.dart';
import '../models.dart';

class SkuApi {
  final HttpClient _client;
  
  SkuApi(this._client);

  /// 获取SKU详情
  Future<PlusApiResultSkuDetailVO?> getSkuDetail(String skuId) async {
    final response = await _client.get(ApiPaths.appPath('/skus/${skuId}'));
    return response is PlusApiResultSkuDetailVO ? response : null;
  }

  /// 获取SKU库存
  Future<PlusApiResultSkuStockVO?> getSkuStock(String skuId) async {
    final response = await _client.get(ApiPaths.appPath('/skus/${skuId}/stock'));
    return response is PlusApiResultSkuStockVO ? response : null;
  }

  /// 检查SKU库存
  Future<PlusApiResultBoolean?> checkSkuStock(String skuId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/skus/${skuId}/check-stock'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 获取产品的SKU列表
  Future<PlusApiResultPageSkuVO?> getSkuByProduct(String productId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/skus/product/${productId}'), params: params);
    return response is PlusApiResultPageSkuVO ? response : null;
  }

  /// 获取产品SKU统计
  Future<PlusApiResultSkuStatisticsVO?> getSkuStatistics(String productId) async {
    final response = await _client.get(ApiPaths.appPath('/skus/product/${productId}/statistics'));
    return response is PlusApiResultSkuStatisticsVO ? response : null;
  }

  /// 检查SKU编码是否存在
  Future<PlusApiResultBoolean?> checkSkuCodeExists(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/skus/exists'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 按编码获取SKU
  Future<PlusApiResultSkuVO?> getSkuByCode(String skuCode) async {
    final response = await _client.get(ApiPaths.appPath('/skus/code/${skuCode}'));
    return response is PlusApiResultSkuVO ? response : null;
  }

  /// 批量获取SKU
  Future<PlusApiResultListSkuVO?> batchGetSkus(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/skus/batch'), params: params);
    return response is PlusApiResultListSkuVO ? response : null;
  }
}
