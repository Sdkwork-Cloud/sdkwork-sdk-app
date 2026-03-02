import '../http/client.dart';
import '../models.dart';

class CommentsApi {
  final HttpClient _client;
  
  CommentsApi(this._client);

  /// 发表评论
  Future<PlusApiResultCommentVO?> createComment(CommentCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/comments'), body: body, contentType: 'application/json');
    return response is PlusApiResultCommentVO ? response : null;
  }

  /// 回复评论
  Future<PlusApiResultCommentVO?> replyComment(String commentId, CommentReplyForm body) async {
    final response = await _client.post(ApiPaths.appPath('/comments/${commentId}/reply'), body: body, contentType: 'application/json');
    return response is PlusApiResultCommentVO ? response : null;
  }

  /// 置顶评论
  Future<PlusApiResultCommentVO?> pinComment(String commentId) async {
    final response = await _client.post(ApiPaths.appPath('/comments/${commentId}/pin'));
    return response is PlusApiResultCommentVO ? response : null;
  }

  /// 取消置顶
  Future<PlusApiResultCommentVO?> unpinComment(String commentId) async {
    final response = await _client.delete(ApiPaths.appPath('/comments/${commentId}/pin'));
    return response is PlusApiResultCommentVO ? response : null;
  }

  /// 点赞评论
  Future<PlusApiResultCommentVO?> likeComment(String commentId) async {
    final response = await _client.post(ApiPaths.appPath('/comments/${commentId}/like'));
    return response is PlusApiResultCommentVO ? response : null;
  }

  /// 取消点赞
  Future<PlusApiResultCommentVO?> unlikeComment(String commentId) async {
    final response = await _client.delete(ApiPaths.appPath('/comments/${commentId}/like'));
    return response is PlusApiResultCommentVO ? response : null;
  }

  /// 获取评论详情
  Future<PlusApiResultCommentDetailVO?> getCommentDetail(String commentId) async {
    final response = await _client.get(ApiPaths.appPath('/comments/${commentId}'));
    return response is PlusApiResultCommentDetailVO ? response : null;
  }

  /// 删除评论
  Future<PlusApiResultVoid?> deleteComment(String commentId) async {
    final response = await _client.delete(ApiPaths.appPath('/comments/${commentId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取回复列表
  Future<PlusApiResultPageCommentVO?> getReplies(String commentId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/comments/${commentId}/replies'), params: params);
    return response is PlusApiResultPageCommentVO ? response : null;
  }

  /// 获取评论统计
  Future<PlusApiResultCommentStatisticsVO?> getCommentStatistics(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/comments/statistics'), params: params);
    return response is PlusApiResultCommentStatisticsVO ? response : null;
  }

  /// 获取我的评论
  Future<PlusApiResultPageCommentVO?> getMy(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/comments/my'), params: params);
    return response is PlusApiResultPageCommentVO ? response : null;
  }

  /// 获取评论列表
  Future<PlusApiResultPageCommentVO?> getComments(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/comments/list'), params: params);
    return response is PlusApiResultPageCommentVO ? response : null;
  }
}
