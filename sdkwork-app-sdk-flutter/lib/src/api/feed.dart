import '../http/client.dart';
import '../models.dart';

class FeedApi {
  final HttpClient _client;
  
  FeedApi(this._client);

  /// Create feed
  Future<PlusApiResultFeedItemVO?> create(FeedCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/feeds'), body: body, contentType: 'application/json');
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// Unlike feed
  Future<PlusApiResultFeedItemVO?> unlike(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/unlike/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// Uncollect feed
  Future<PlusApiResultFeedItemVO?> uncollect(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/uncollect/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// Share feed
  Future<PlusApiResultFeedItemVO?> share(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/share/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// Like feed
  Future<PlusApiResultFeedItemVO?> like(String id) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/like/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// Collect feed
  Future<PlusApiResultFeedItemVO?> collect(String id, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/feeds/collect/${id}'), params: params);
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// Get top feeds
  Future<PlusApiResultListFeedItemVO?> getTopFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/top'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Search feeds
  Future<PlusApiResultListFeedItemVO?> searchFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/search'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Get recommended feeds
  Future<PlusApiResultListFeedItemVO?> getRecommendedFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/recommend'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Get most viewed feeds
  Future<PlusApiResultListFeedItemVO?> getMostViewedFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/most-viewed'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Get most liked feeds
  Future<PlusApiResultListFeedItemVO?> getMostLikedFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/most-liked'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Get feed list
  Future<PlusApiResultListFeedItemVO?> getFeedList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/list'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Get hot feeds
  Future<PlusApiResultListFeedItemVO?> getHotFeeds(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/hot'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Get feed detail
  Future<PlusApiResultFeedItemVO?> getFeedDetail(String id) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/detail/${id}'));
    return response is PlusApiResultFeedItemVO ? response : null;
  }

  /// Check collected status
  Future<PlusApiResultBoolean?> checkCollected(String id) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/check-collected/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }

  /// Get feeds by category
  Future<PlusApiResultListFeedItemVO?> getFeedsByCategory(String categoryId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feeds/category/${categoryId}'), params: params);
    return response is PlusApiResultListFeedItemVO ? response : null;
  }

  /// Delete feed
  Future<PlusApiResultBoolean?> delete(String id) async {
    final response = await _client.delete(ApiPaths.appPath('/feeds/${id}'));
    return response is PlusApiResultBoolean ? response : null;
  }
}
