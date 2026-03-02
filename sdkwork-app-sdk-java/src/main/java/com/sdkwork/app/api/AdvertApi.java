package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AdvertApi {
    private final HttpClient client;
    
    public AdvertApi(HttpClient client) {
        this.client = client;
    }

    /** 广告设置 */
    public PlusApiResultAdvertSettingsVO getAdvertSettings() throws Exception {
        return (PlusApiResultAdvertSettingsVO) client.get(ApiPaths.appPath("/advert/settings"));
    }

    /** 更新广告设置 */
    public PlusApiResultVoid updateAdvertSettings(AdvertSettingsUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/advert/settings"), body);
    }

    /** 广告反馈 */
    public PlusApiResultVoid report(String adId, AdvertReportForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/advert/" + adId + "/report"), body);
    }

    /** 上报播放进度 */
    public PlusApiResultVoid trackVideoProgress(String adId, VideoProgressForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/advert/" + adId + "/progress"), body);
    }

    /** 上报展示 */
    public PlusApiResultVoid trackImpression(String adId, AdvertImpressionForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/advert/" + adId + "/impression"), body);
    }

    /** 上报播放完成 */
    public PlusApiResultVoid trackVideoComplete(String adId, VideoCompleteForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/advert/" + adId + "/complete"), body);
    }

    /** 上报关闭 */
    public PlusApiResultVoid trackClose(String adId, AdvertCloseForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/advert/" + adId + "/close"), body);
    }

    /** 上报点击 */
    public PlusApiResultVoid trackClick(String adId, AdvertClickForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/advert/" + adId + "/click"), body);
    }

    /** 屏蔽广告 */
    public PlusApiResultVoid block(String adId, Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/advert/" + adId + "/block"), null, params);
    }

    /** 验证奖励 */
    public PlusApiResultRewardVerifyVO verifyReward(RewardVerifyForm body) throws Exception {
        return (PlusApiResultRewardVerifyVO) client.post(ApiPaths.appPath("/advert/rewarded/verify"), body);
    }

    /** 开屏广告 */
    public PlusApiResultSplashAdvertVO getSplash() throws Exception {
        return (PlusApiResultSplashAdvertVO) client.get(ApiPaths.appPath("/advert/splash"));
    }

    /** 激励视频广告 */
    public PlusApiResultRewardedAdvertVO getRewarded(Map<String, Object> params) throws Exception {
        return (PlusApiResultRewardedAdvertVO) client.get(ApiPaths.appPath("/advert/rewarded"), params);
    }

    /** 广告位列表 */
    public PlusApiResultListAdvertPositionVO listAdvertPositions() throws Exception {
        return (PlusApiResultListAdvertPositionVO) client.get(ApiPaths.appPath("/advert/positions"));
    }

    /** 广告位详情 */
    public PlusApiResultAdvertPositionDetailVO getAdvertPosition(String positionId) throws Exception {
        return (PlusApiResultAdvertPositionDetailVO) client.get(ApiPaths.appPath("/advert/positions/" + positionId + ""));
    }

    /** 获取位置广告 */
    public PlusApiResultListAdvertVO getAdsByPosition(String positionId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListAdvertVO) client.get(ApiPaths.appPath("/advert/positions/" + positionId + "/ads"), params);
    }

    /** 弹窗广告 */
    public PlusApiResultPopupAdvertVO getPopup() throws Exception {
        return (PlusApiResultPopupAdvertVO) client.get(ApiPaths.appPath("/advert/popup"));
    }

    /** 插屏广告 */
    public PlusApiResultInterstitialAdvertVO getInterstitial(Map<String, Object> params) throws Exception {
        return (PlusApiResultInterstitialAdvertVO) client.get(ApiPaths.appPath("/advert/interstitial"), params);
    }

    /** 信息流广告 */
    public PlusApiResultListFeedAdvertVO getFeedAdverts(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFeedAdvertVO) client.get(ApiPaths.appPath("/advert/feed"), params);
    }

    /** 广告配置 */
    public PlusApiResultAdvertConfigVO getAdvertConfig() throws Exception {
        return (PlusApiResultAdvertConfigVO) client.get(ApiPaths.appPath("/advert/config"));
    }

    /** Banner广告 */
    public PlusApiResultListBannerAdvertVO getBannerAdverts(Map<String, Object> params) throws Exception {
        return (PlusApiResultListBannerAdvertVO) client.get(ApiPaths.appPath("/advert/banner"), params);
    }
}
