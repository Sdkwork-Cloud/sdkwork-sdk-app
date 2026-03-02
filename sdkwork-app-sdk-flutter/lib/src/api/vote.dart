import '../http/client.dart';
import '../models.dart';

class VoteApi {
  final HttpClient _client;
  
  VoteApi(this._client);

  /// 投票
  Future<PlusApiResultVoteVO?> vote(VoteForm body) async {
    final response = await _client.post(ApiPaths.appPath('/vote'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoteVO ? response : null;
  }

  /// 取消投票
  Future<PlusApiResultVoid?> cancel(Map<String, dynamic>? params) async {
    final response = await _client.delete(ApiPaths.appPath('/vote'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 切换投票
  Future<PlusApiResultVoteVO?> toggle(VoteForm body) async {
    final response = await _client.post(ApiPaths.appPath('/vote/toggle'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoteVO ? response : null;
  }

  /// 点赞
  Future<PlusApiResultVoteVO?> like(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/vote/like'), params: params);
    return response is PlusApiResultVoteVO ? response : null;
  }

  /// 点踩
  Future<PlusApiResultVoteVO?> dislike(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/vote/dislike'), params: params);
    return response is PlusApiResultVoteVO ? response : null;
  }

  /// 获取投票详情
  Future<PlusApiResultVoteDetailVO?> getVoteDetail(String voteId) async {
    final response = await _client.get(ApiPaths.appPath('/vote/${voteId}'));
    return response is PlusApiResultVoteDetailVO ? response : null;
  }

  /// 获取热门内容
  Future<PlusApiResultListLong?> getTopLikedContent(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vote/top-liked'), params: params);
    return response is PlusApiResultListLong ? response : null;
  }

  /// 获取投票状态
  Future<PlusApiResultVoteStatusVO?> getVoteStatus(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vote/status'), params: params);
    return response is PlusApiResultVoteStatusVO ? response : null;
  }

  /// 获取投票统计
  Future<PlusApiResultVoteStatisticsVO?> getVoteStatistics(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vote/statistics'), params: params);
    return response is PlusApiResultVoteStatisticsVO ? response : null;
  }

  /// 获取我的投票历史
  Future<PlusApiResultPageVoteDetailVO?> getMyVotes(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/vote/my-votes'), params: params);
    return response is PlusApiResultPageVoteDetailVO ? response : null;
  }
}
