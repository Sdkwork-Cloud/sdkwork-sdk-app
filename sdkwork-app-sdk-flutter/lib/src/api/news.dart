import '../http/client.dart';
import '../models.dart';

class NewsApi {
  final HttpClient _client;
  
  NewsApi(this._client);

  /// 获取新闻详情
  Future<PlusApiResultNewsDetailVO?> getNews(String newsId) async {
    final response = await _client.get(ApiPaths.appPath('/news/${newsId}'));
    return response is PlusApiResultNewsDetailVO ? response : null;
  }

  /// 更新新闻
  Future<PlusApiResultNewsVO?> updateNews(String newsId, NewsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/news/${newsId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultNewsVO ? response : null;
  }

  /// 删除新闻
  Future<PlusApiResultVoid?> deleteNews(String newsId) async {
    final response = await _client.delete(ApiPaths.appPath('/news/${newsId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建新闻
  Future<PlusApiResultNewsVO?> createNews(NewsCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/news'), body: body, contentType: 'application/json');
    return response is PlusApiResultNewsVO ? response : null;
  }

  /// 搜索新闻
  Future<PlusApiResultPageNewsVO?> search(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/news/search'), params: params);
    return response is PlusApiResultPageNewsVO ? response : null;
  }

  /// 获取我的新闻
  Future<PlusApiResultPageNewsVO?> getMy(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/news/my'), params: params);
    return response is PlusApiResultPageNewsVO ? response : null;
  }

  /// 获取最新新闻
  Future<PlusApiResultPageNewsVO?> getLatest(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/news/latest'), params: params);
    return response is PlusApiResultPageNewsVO ? response : null;
  }

  /// 获取分类新闻
  Future<PlusApiResultPageNewsVO?> getCategory(String categoryId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/news/category/${categoryId}'), params: params);
    return response is PlusApiResultPageNewsVO ? response : null;
  }
}
