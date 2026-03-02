package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AdvertApi struct {
    client *sdkhttp.Client
}

func NewAdvertApi(client *sdkhttp.Client) *AdvertApi {
    return &AdvertApi{client: client}
}

// 广告设置
func (a *AdvertApi) GetAdvertSettings() (sdktypes.PlusApiResultAdvertSettingsVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/settings"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAdvertSettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAdvertSettingsVO](raw)
}

// 更新广告设置
func (a *AdvertApi) UpdateAdvertSettings(body sdktypes.AdvertSettingsUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/advert/settings"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 广告反馈
func (a *AdvertApi) Report(adId string, body sdktypes.AdvertReportForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/advert/%s/report", adId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报播放进度
func (a *AdvertApi) TrackVideoProgress(adId string, body sdktypes.VideoProgressForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/advert/%s/progress", adId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报展示
func (a *AdvertApi) TrackImpression(adId string, body sdktypes.AdvertImpressionForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/advert/%s/impression", adId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报播放完成
func (a *AdvertApi) TrackVideoComplete(adId string, body sdktypes.VideoCompleteForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/advert/%s/complete", adId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报关闭
func (a *AdvertApi) TrackClose(adId string, body sdktypes.AdvertCloseForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/advert/%s/close", adId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报点击
func (a *AdvertApi) TrackClick(adId string, body sdktypes.AdvertClickForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/advert/%s/click", adId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 屏蔽广告
func (a *AdvertApi) Block(adId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/advert/%s/block", adId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 验证奖励
func (a *AdvertApi) VerifyReward(body sdktypes.RewardVerifyForm) (sdktypes.PlusApiResultRewardVerifyVO, error) {
    raw, err := a.client.Post(AppApiPath("/advert/rewarded/verify"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultRewardVerifyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRewardVerifyVO](raw)
}

// 开屏广告
func (a *AdvertApi) GetSplash() (sdktypes.PlusApiResultSplashAdvertVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/splash"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSplashAdvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSplashAdvertVO](raw)
}

// 激励视频广告
func (a *AdvertApi) GetRewarded(query map[string]interface{}) (sdktypes.PlusApiResultRewardedAdvertVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/rewarded"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultRewardedAdvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRewardedAdvertVO](raw)
}

// 广告位列表
func (a *AdvertApi) ListAdvertPositions() (sdktypes.PlusApiResultListAdvertPositionVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/positions"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListAdvertPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListAdvertPositionVO](raw)
}

// 广告位详情
func (a *AdvertApi) GetAdvertPosition(positionId string) (sdktypes.PlusApiResultAdvertPositionDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/advert/positions/%s", positionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAdvertPositionDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAdvertPositionDetailVO](raw)
}

// 获取位置广告
func (a *AdvertApi) GetAdsByPosition(positionId string, query map[string]interface{}) (sdktypes.PlusApiResultListAdvertVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/advert/positions/%s/ads", positionId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListAdvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListAdvertVO](raw)
}

// 弹窗广告
func (a *AdvertApi) GetPopup() (sdktypes.PlusApiResultPopupAdvertVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/popup"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPopupAdvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPopupAdvertVO](raw)
}

// 插屏广告
func (a *AdvertApi) GetInterstitial(query map[string]interface{}) (sdktypes.PlusApiResultInterstitialAdvertVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/interstitial"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInterstitialAdvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInterstitialAdvertVO](raw)
}

// 信息流广告
func (a *AdvertApi) GetFeedAdverts(query map[string]interface{}) (sdktypes.PlusApiResultListFeedAdvertVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/feed"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedAdvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedAdvertVO](raw)
}

// 广告配置
func (a *AdvertApi) GetAdvertConfig() (sdktypes.PlusApiResultAdvertConfigVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/config"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAdvertConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAdvertConfigVO](raw)
}

// Banner广告
func (a *AdvertApi) GetBannerAdverts(query map[string]interface{}) (sdktypes.PlusApiResultListBannerAdvertVO, error) {
    raw, err := a.client.Get(AppApiPath("/advert/banner"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListBannerAdvertVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListBannerAdvertVO](raw)
}
