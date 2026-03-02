import '../http/client.dart';
import '../models.dart';

class ShareApi {
  final HttpClient _client;
  
  ShareApi(this._client);

  /// 更新分享设置
  Future<PlusApiResultShareRecordVO?> updateShareSettings(String shareId, ShareUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/share/${shareId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultShareRecordVO ? response : null;
  }

  /// 取消分享
  Future<PlusApiResultVoid?> cancel(String shareId) async {
    final response = await _client.delete(ApiPaths.appPath('/share/${shareId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 创建分享
  Future<PlusApiResultShareCreateVO?> createShare(ShareCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/share'), body: body, contentType: 'application/json');
    return response is PlusApiResultShareCreateVO ? response : null;
  }

  /// 访问分享
  Future<PlusApiResultVoid?> visit(String shareCode, ShareVisitForm body) async {
    final response = await _client.post(ApiPaths.appPath('/share/${shareCode}/visit'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 验证分享密码
  Future<PlusApiResultShareVerifyVO?> verifySharePassword(String shareCode, ShareVerifyForm body) async {
    final response = await _client.post(ApiPaths.appPath('/share/${shareCode}/verify'), body: body, contentType: 'application/json');
    return response is PlusApiResultShareVerifyVO ? response : null;
  }

  /// 上报分享
  Future<PlusApiResultVoid?> track(ShareTrackForm body) async {
    final response = await _client.post(ApiPaths.appPath('/share/track'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 生成分享海报
  Future<PlusApiResultSharePosterVO?> generateSharePoster(SharePosterForm body) async {
    final response = await _client.post(ApiPaths.appPath('/share/poster'), body: body, contentType: 'application/json');
    return response is PlusApiResultSharePosterVO ? response : null;
  }

  /// 领取邀请奖励
  Future<PlusApiResultInviteRewardClaimVO?> claimInviteReward(String rewardId) async {
    final response = await _client.post(ApiPaths.appPath('/share/invite/rewards/${rewardId}/claim'));
    return response is PlusApiResultInviteRewardClaimVO ? response : null;
  }

  /// 生成邀请链接
  Future<PlusApiResultInviteLinkVO?> generateInviteLink(InviteLinkForm body) async {
    final response = await _client.post(ApiPaths.appPath('/share/invite/link'), body: body, contentType: 'application/json');
    return response is PlusApiResultInviteLinkVO ? response : null;
  }

  /// 获取访问记录
  Future<PlusApiResultPageShareVisitorVO?> getShareVisitors(String shareId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/share/${shareId}/visitors'), params: params);
    return response is PlusApiResultPageShareVisitorVO ? response : null;
  }

  /// 获取分享统计
  Future<PlusApiResultShareStatisticsVO?> getShareStatistics(String shareId) async {
    final response = await _client.get(ApiPaths.appPath('/share/${shareId}/statistics'));
    return response is PlusApiResultShareStatisticsVO ? response : null;
  }

  /// 获取分享信息
  Future<PlusApiResultShareInfoVO?> getShareInfo(String shareCode, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/share/${shareCode}'), params: params);
    return response is PlusApiResultShareInfoVO ? response : null;
  }

  /// 获取分享平台配置
  Future<PlusApiResultListSharePlatformVO?> getSharePlatforms() async {
    final response = await _client.get(ApiPaths.appPath('/share/platforms'));
    return response is PlusApiResultListSharePlatformVO ? response : null;
  }

  /// 获取我的分享
  Future<PlusApiResultPageShareRecordVO?> listMyShares(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/share/my-shares'), params: params);
    return response is PlusApiResultPageShareRecordVO ? response : null;
  }

  /// 获取邀请记录
  Future<PlusApiResultPageInviteRecordVO?> getInviteRecords(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/share/invite/records'), params: params);
    return response is PlusApiResultPageInviteRecordVO ? response : null;
  }

  /// 获取邀请信息
  Future<PlusApiResultInviteInfoVO?> getInviteInfo() async {
    final response = await _client.get(ApiPaths.appPath('/share/invite/info'));
    return response is PlusApiResultInviteInfoVO ? response : null;
  }

  /// 批量取消分享
  Future<PlusApiResultVoid?> batchCancelShares() async {
    final response = await _client.delete(ApiPaths.appPath('/share/batch'));
    return response is PlusApiResultVoid ? response : null;
  }
}
