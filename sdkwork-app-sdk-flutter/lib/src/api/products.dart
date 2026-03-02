import '../http/client.dart';
import '../models.dart';

class ProductsApi {
  final HttpClient _client;
  
  ProductsApi(this._client);

  /// 获取商品列表
  Future<PlusApiResultPageProductVO?> getProducts(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products'), params: params);
    return response is PlusApiResultPageProductVO ? response : null;
  }

  /// 获取商品详情
  Future<PlusApiResultProductDetailVO?> getProductDetail(String productId) async {
    final response = await _client.get(ApiPaths.appPath('/products/${productId}'));
    return response is PlusApiResultProductDetailVO ? response : null;
  }

  /// 获取商品库存
  Future<PlusApiResultInteger?> getProductStock(String productId) async {
    final response = await _client.get(ApiPaths.appPath('/products/${productId}/stock'));
    return response is PlusApiResultInteger ? response : null;
  }

  /// 获取商品统计
  Future<PlusApiResultProductStatisticsVO?> getProductStatistics(String productId) async {
    final response = await _client.get(ApiPaths.appPath('/products/${productId}/statistics'));
    return response is PlusApiResultProductStatisticsVO ? response : null;
  }

  /// 获取商品SKU列表
  Future<PlusApiResultListSkuVO?> getProductSkus(String productId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products/${productId}/skus'), params: params);
    return response is PlusApiResultListSkuVO ? response : null;
  }

  /// 检查商品库存
  Future<PlusApiResultBoolean?> checkProductStock(String productId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products/${productId}/check-stock'), params: params);
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 搜索商品
  Future<PlusApiResultPageProductVO?> search(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products/search'), params: params);
    return response is PlusApiResultPageProductVO ? response : null;
  }

  /// 获取最新商品
  Future<PlusApiResultListProductVO?> getLatest(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products/latest'), params: params);
    return response is PlusApiResultListProductVO ? response : null;
  }

  /// 获取热门商品
  Future<PlusApiResultListProductVO?> getHot(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products/hot'), params: params);
    return response is PlusApiResultListProductVO ? response : null;
  }

  /// 按编码获取商品
  Future<PlusApiResultProductVO?> getProductByCode(String code) async {
    final response = await _client.get(ApiPaths.appPath('/products/code/${code}'));
    return response is PlusApiResultProductVO ? response : null;
  }

  /// 按分类获取商品
  Future<PlusApiResultPageProductVO?> getProductsByCategory(String categoryId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products/category/${categoryId}'), params: params);
    return response is PlusApiResultPageProductVO ? response : null;
  }
}
