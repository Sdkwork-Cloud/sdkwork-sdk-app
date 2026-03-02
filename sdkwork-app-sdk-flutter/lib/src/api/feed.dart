import '../http/client.dart';
import '../models.dart';

class FeedApi {
  final HttpClient _client;
  
  FeedApi(this._client);

  /// 取消点赞Feed
  Future<PlusApiResultFeedItemVO?> unlike(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/unlike/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// 取消收藏Feed
  Future<PlusApiResultFeedItemVO?> uncollect(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/uncollect/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// 分享Feed
  Future<PlusApiResultFeedItemVO?> share(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/share/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// 点赞Feed
  Future<PlusApiResultFeedItemVO?> like(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/like/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// 收藏Feed
  Future<PlusApiResultFeedItemVO?> collect(String id, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/collect/${id}'), params: params);
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// 获取置顶Feed
  Future<PlusApiResultListFeedItemVO?> getTopFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/top'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// 搜索Feed
  Future<PlusApiResultListFeedItemVO?> searchFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/search'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// 获取推荐Feed
  Future<PlusApiResultListFeedItemVO?> getRecommendedFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/recommend'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// 获取最多浏览Feed
  Future<PlusApiResultListFeedItemVO?> getMostViewedFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/most-viewed'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// 获取最多点赞Feed
  Future<PlusApiResultListFeedItemVO?> getMostLikedFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/most-liked'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// 获取Feed列表
  Future<PlusApiResultListFeedItemVO?> getFeedList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/list'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// 获取热门Feed
  Future<PlusApiResultListFeedItemVO?> getHotFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/hot'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// 获取Feed详情
  Future<PlusApiResultFeedItemVO?> getFeedDetail(String id) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/detail/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// 检查收藏状态
  Future<PlusApiResultBoolean?> checkCollected(String id) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/check-collected/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// 获取分类Feed
  Future<PlusApiResultListFeedItemVO?> getFeedsByCategory(String categoryId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/category/${categoryId}'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }
}
