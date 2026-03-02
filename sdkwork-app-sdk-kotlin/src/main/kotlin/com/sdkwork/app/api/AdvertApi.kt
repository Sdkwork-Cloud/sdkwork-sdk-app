package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AdvertApi(private val client: HttpClient) {

    /** 广告设置 */
    suspend fun getAdvertSettings(): PlusApiResultAdvertSettingsVO? {
        return client.get(ApiPaths.appPath("/advert/settings")) as? PlusApiResultAdvertSettingsVO
    }

    /** 更新广告设置 */
    suspend fun updateAdvertSettings(body: AdvertSettingsUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/advert/settings"), body) as? PlusApiResultVoid
    }

    /** 广告反馈 */
    suspend fun report(adId: String, body: AdvertReportForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/advert/$adId/report"), body) as? PlusApiResultVoid
    }

    /** 上报播放进度 */
    suspend fun trackVideoProgress(adId: String, body: VideoProgressForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/advert/$adId/progress"), body) as? PlusApiResultVoid
    }

    /** 上报展示 */
    suspend fun trackImpression(adId: String, body: AdvertImpressionForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/advert/$adId/impression"), body) as? PlusApiResultVoid
    }

    /** 上报播放完成 */
    suspend fun trackVideoComplete(adId: String, body: VideoCompleteForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/advert/$adId/complete"), body) as? PlusApiResultVoid
    }

    /** 上报关闭 */
    suspend fun trackClose(adId: String, body: AdvertCloseForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/advert/$adId/close"), body) as? PlusApiResultVoid
    }

    /** 上报点击 */
    suspend fun trackClick(adId: String, body: AdvertClickForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/advert/$adId/click"), body) as? PlusApiResultVoid
    }

    /** 屏蔽广告 */
    suspend fun block(adId: String, params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/advert/$adId/block"), null, params) as? PlusApiResultVoid
    }

    /** 验证奖励 */
    suspend fun verifyReward(body: RewardVerifyForm): PlusApiResultRewardVerifyVO? {
        return client.post(ApiPaths.appPath("/advert/rewarded/verify"), body) as? PlusApiResultRewardVerifyVO
    }

    /** 开屏广告 */
    suspend fun getSplash(): PlusApiResultSplashAdvertVO? {
        return client.get(ApiPaths.appPath("/advert/splash")) as? PlusApiResultSplashAdvertVO
    }

    /** 激励视频广告 */
    suspend fun getRewarded(params: Map<String, Any>? = null): PlusApiResultRewardedAdvertVO? {
        return client.get(ApiPaths.appPath("/advert/rewarded"), params) as? PlusApiResultRewardedAdvertVO
    }

    /** 广告位列表 */
    suspend fun listAdvertPositions(): PlusApiResultListAdvertPositionVO? {
        return client.get(ApiPaths.appPath("/advert/positions")) as? PlusApiResultListAdvertPositionVO
    }

    /** 广告位详情 */
    suspend fun getAdvertPosition(positionId: String): PlusApiResultAdvertPositionDetailVO? {
        return client.get(ApiPaths.appPath("/advert/positions/$positionId")) as? PlusApiResultAdvertPositionDetailVO
    }

    /** 获取位置广告 */
    suspend fun getAdsByPosition(positionId: String, params: Map<String, Any>? = null): PlusApiResultListAdvertVO? {
        return client.get(ApiPaths.appPath("/advert/positions/$positionId/ads"), params) as? PlusApiResultListAdvertVO
    }

    /** 弹窗广告 */
    suspend fun getPopup(): PlusApiResultPopupAdvertVO? {
        return client.get(ApiPaths.appPath("/advert/popup")) as? PlusApiResultPopupAdvertVO
    }

    /** 插屏广告 */
    suspend fun getInterstitial(params: Map<String, Any>? = null): PlusApiResultInterstitialAdvertVO? {
        return client.get(ApiPaths.appPath("/advert/interstitial"), params) as? PlusApiResultInterstitialAdvertVO
    }

    /** 信息流广告 */
    suspend fun getFeedAdverts(params: Map<String, Any>? = null): PlusApiResultListFeedAdvertVO? {
        return client.get(ApiPaths.appPath("/advert/feed"), params) as? PlusApiResultListFeedAdvertVO
    }

    /** 广告配置 */
    suspend fun getAdvertConfig(): PlusApiResultAdvertConfigVO? {
        return client.get(ApiPaths.appPath("/advert/config")) as? PlusApiResultAdvertConfigVO
    }

    /** Banner广告 */
    suspend fun getBannerAdverts(params: Map<String, Any>? = null): PlusApiResultListBannerAdvertVO? {
        return client.get(ApiPaths.appPath("/advert/banner"), params) as? PlusApiResultListBannerAdvertVO
    }
}
