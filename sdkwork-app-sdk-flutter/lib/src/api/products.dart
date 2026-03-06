import '../http/client.dart';
import '../models.dart';

class ProductsApi {
  final HttpClient _client;
  
  ProductsApi(this._client);

  /// 更新商品属性
  Future<PlusApiResultProductAttributeVO?> updateProductAttribute(String productId, String attributeId, ProductAttributeUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/products/${productId}/attributes/${attributeId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultProductAttributeVO ? response : null;
  }

  /// 删除商品属性
  Future<PlusApiResultVoid?> deleteProductAttribute(String productId, String attributeId) async {
    final response = await _client.delete(ApiPaths.appPath('/products/${productId}/attributes/${attributeId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 更新商品分类
  Future<PlusApiResultProductCategoryVO?> updateProductCategory(String categoryId, ProductCategoryUpdateRequest body) async {
    final response = await _client.put(ApiPaths.appPath('/products/categories/${categoryId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultProductCategoryVO ? response : null;
  }

  /// 删除商品分类
  Future<PlusApiResultVoid?> deleteProductCategory(String categoryId) async {
    final response = await _client.delete(ApiPaths.appPath('/products/categories/${categoryId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取商品属性
  Future<PlusApiResultListProductAttributeVO?> listProductAttributes(String productId) async {
    final response = await _client.get(ApiPaths.appPath('/products/${productId}/attributes'));
    return response is PlusApiResultListProductAttributeVO ? response : null;
  }

  /// 创建商品属性
  Future<PlusApiResultProductAttributeVO?> createProductAttribute(String productId, ProductAttributeCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/products/${productId}/attributes'), body: body, contentType: 'application/json');
    return response is PlusApiResultProductAttributeVO ? response : null;
  }

  /// 获取商品分类列表
  Future<PlusApiResultListProductCategoryVO?> listProductCategories(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/products/categories'), params: params);
    return response is PlusApiResultListProductCategoryVO ? response : null;
  }

  /// 创建商品分类
  Future<PlusApiResultProductCategoryVO?> createProductCategory(ProductCategoryCreateRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/products/categories'), body: body, contentType: 'application/json');
    return response is PlusApiResultProductCategoryVO ? response : null;
  }

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

  /// 获取SPU详情
  Future<PlusApiResultProductDetailVO?> getSpuDetail(String productId) async {
    final response = await _client.get(ApiPaths.appPath('/products/${productId}/spu'));
    return response is PlusApiResultProductDetailVO ? response : null;
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

  /// 获取分类属性
  Future<PlusApiResultListProductAttributeVO?> listCategoryAttributes(String categoryId) async {
    final response = await _client.get(ApiPaths.appPath('/products/categories/${categoryId}/attributes'));
    return response is PlusApiResultListProductAttributeVO ? response : null;
  }

  /// 获取商品分类树
  Future<PlusApiResultListProductCategoryVO?> getProductCategoryTree() async {
    final response = await _client.get(ApiPaths.appPath('/products/categories/tree'));
    return response is PlusApiResultListProductCategoryVO ? response : null;
  }
}
