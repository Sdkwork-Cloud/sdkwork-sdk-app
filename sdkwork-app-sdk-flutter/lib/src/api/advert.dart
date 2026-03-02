import '../http/client.dart';
import '../models.dart';

class AdvertApi {
  final HttpClient _client;
  
  AdvertApi(this._client);

  /// 广告设置
  Future<PlusApiResultAdvertSettingsVO?> getAdvertSettings() async {
    final response = await _client.get(ApiPaths.appPath('/advert/settings'));
    return response is PlusApiResultAdvertSettingsVO ? response : null;
  }

  /// 更新广告设置
  Future<PlusApiResultVoid?> updateAdvertSettings(AdvertSettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/advert/settings'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 广告反馈
  Future<PlusApiResultVoid?> report(String adId, AdvertReportForm body) async {
    final response = await _client.post(ApiPaths.appPath('/advert/${adId}/report'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报播放进度
  Future<PlusApiResultVoid?> trackVideoProgress(String adId, VideoProgressForm body) async {
    final response = await _client.post(ApiPaths.appPath('/advert/${adId}/progress'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报展示
  Future<PlusApiResultVoid?> trackImpression(String adId, AdvertImpressionForm body) async {
    final response = await _client.post(ApiPaths.appPath('/advert/${adId}/impression'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报播放完成
  Future<PlusApiResultVoid?> trackVideoComplete(String adId, VideoCompleteForm body) async {
    final response = await _client.post(ApiPaths.appPath('/advert/${adId}/complete'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报关闭
  Future<PlusApiResultVoid?> trackClose(String adId, AdvertCloseForm body) async {
    final response = await _client.post(ApiPaths.appPath('/advert/${adId}/close'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 上报点击
  Future<PlusApiResultVoid?> trackClick(String adId, AdvertClickForm body) async {
    final response = await _client.post(ApiPaths.appPath('/advert/${adId}/click'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 屏蔽广告
  Future<PlusApiResultVoid?> block(String adId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/advert/${adId}/block'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 验证奖励
  Future<PlusApiResultRewardVerifyVO?> verifyReward(RewardVerifyForm body) async {
    final response = await _client.post(ApiPaths.appPath('/advert/rewarded/verify'), body: body, contentType: 'application/json');
    return response is PlusApiResultRewardVerifyVO ? response : null;
  }

  /// 开屏广告
  Future<PlusApiResultSplashAdvertVO?> getSplash() async {
    final response = await _client.get(ApiPaths.appPath('/advert/splash'));
    return response is PlusApiResultSplashAdvertVO ? response : null;
  }

  /// 激励视频广告
  Future<PlusApiResultRewardedAdvertVO?> getRewarded(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/advert/rewarded'), params: params);
    return response is PlusApiResultRewardedAdvertVO ? response : null;
  }

  /// 广告位列表
  Future<PlusApiResultListAdvertPositionVO?> listAdvertPositions() async {
    final response = await _client.get(ApiPaths.appPath('/advert/positions'));
    return response is PlusApiResultListAdvertPositionVO ? response : null;
  }

  /// 广告位详情
  Future<PlusApiResultAdvertPositionDetailVO?> getAdvertPosition(String positionId) async {
    final response = await _client.get(ApiPaths.appPath('/advert/positions/${positionId}'));
    return response is PlusApiResultAdvertPositionDetailVO ? response : null;
  }

  /// 获取位置广告
  Future<PlusApiResultListAdvertVO?> getAdsByPosition(String positionId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/advert/positions/${positionId}/ads'), params: params);
    return response is PlusApiResultListAdvertVO ? response : null;
  }

  /// 弹窗广告
  Future<PlusApiResultPopupAdvertVO?> getPopup() async {
    final response = await _client.get(ApiPaths.appPath('/advert/popup'));
    return response is PlusApiResultPopupAdvertVO ? response : null;
  }

  /// 插屏广告
  Future<PlusApiResultInterstitialAdvertVO?> getInterstitial(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/advert/interstitial'), params: params);
    return response is PlusApiResultInterstitialAdvertVO ? response : null;
  }

  /// 信息流广告
  Future<PlusApiResultListFeedAdvertVO?> getFeedAdverts(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/advert/feed'), params: params);
    return response is PlusApiResultListFeedAdvertVO ? response : null;
  }

  /// 广告配置
  Future<PlusApiResultAdvertConfigVO?> getAdvertConfig() async {
    final response = await _client.get(ApiPaths.appPath('/advert/config'));
    return response is PlusApiResultAdvertConfigVO ? response : null;
  }

  /// Banner广告
  Future<PlusApiResultListBannerAdvertVO?> getBannerAdverts(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/advert/banner'), params: params);
    return response is PlusApiResultListBannerAdvertVO ? response : null;
  }
}
