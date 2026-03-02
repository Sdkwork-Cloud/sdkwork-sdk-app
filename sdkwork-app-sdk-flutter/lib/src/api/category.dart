import '../http/client.dart';
import '../models.dart';

class CategoryApi {
  final HttpClient _client;
  
  CategoryApi(this._client);

  /// 获取分类详情
  Future<PlusApiResultCategoryDetailVO?> getCategoryDetail(String categoryId) async {
    final response = await _client.get(ApiPaths.appPath('/category/${categoryId}'));
    return response is PlusApiResultCategoryDetailVO ? response : null;
  }

  /// 更新分类
  Future<PlusApiResultCategoryVO?> updateCategory(String categoryId, CategoryUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/category/${categoryId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultCategoryVO ? response : null;
  }

  /// 删除分类
  Future<PlusApiResultVoid?> deleteCategory(String categoryId) async {
    final response = await _client.delete(ApiPaths.appPath('/category/${categoryId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 更新分类状态
  Future<PlusApiResultCategoryVO?> updateCategoryStatus(String categoryId, Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.appPath('/category/${categoryId}/status'), params: params);
    return response is PlusApiResultCategoryVO ? response : null;
  }

  /// 移动分类
  Future<PlusApiResultCategoryVO?> move(String categoryId, CategoryMoveForm body) async {
    final response = await _client.put(ApiPaths.appPath('/category/${categoryId}/move'), body: body, contentType: 'application/json');
    return response is PlusApiResultCategoryVO ? response : null;
  }

  /// 排序分类
  Future<PlusApiResultVoid?> sortCategories(CategorySortForm body) async {
    final response = await _client.put(ApiPaths.appPath('/category/sort'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取分类列表
  Future<PlusApiResultListCategoryVO?> listCategories(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/category'), params: params);
    return response is PlusApiResultListCategoryVO ? response : null;
  }

  /// 创建分类
  Future<PlusApiResultCategoryVO?> createCategory(CategoryCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/category'), body: body, contentType: 'application/json');
    return response is PlusApiResultCategoryVO ? response : null;
  }

  /// 获取标签列表
  Future<PlusApiResultListTagVO?> listTags(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/category/tags'), params: params);
    return response is PlusApiResultListTagVO ? response : null;
  }

  /// 创建标签
  Future<PlusApiResultTagVO?> createTag(TagCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/category/tags'), body: body, contentType: 'application/json');
    return response is PlusApiResultTagVO ? response : null;
  }

  /// 获取分类路径
  Future<PlusApiResultListCategoryVO?> getCategoryPath(String categoryId) async {
    final response = await _client.get(ApiPaths.appPath('/category/${categoryId}/path'));
    return response is PlusApiResultListCategoryVO ? response : null;
  }

  /// 获取子分类
  Future<PlusApiResultListCategoryVO?> getChildren(String categoryId) async {
    final response = await _client.get(ApiPaths.appPath('/category/${categoryId}/children'));
    return response is PlusApiResultListCategoryVO ? response : null;
  }

  /// 获取分类类型
  Future<PlusApiResultListCategoryTypeVO?> getCategoryTypes() async {
    final response = await _client.get(ApiPaths.appPath('/category/types'));
    return response is PlusApiResultListCategoryTypeVO ? response : null;
  }

  /// 获取分类树
  Future<PlusApiResultListCategoryTreeVO?> getCategoryTree(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/category/tree'), params: params);
    return response is PlusApiResultListCategoryTreeVO ? response : null;
  }

  /// 删除标签
  Future<PlusApiResultVoid?> deleteTag(String tagId) async {
    final response = await _client.delete(ApiPaths.appPath('/category/tags/${tagId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
