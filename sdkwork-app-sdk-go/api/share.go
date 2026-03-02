package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ShareApi struct {
    client *sdkhttp.Client
}

func NewShareApi(client *sdkhttp.Client) *ShareApi {
    return &ShareApi{client: client}
}

// 更新分享设置
func (a *ShareApi) UpdateShareSettings(shareId string, body sdktypes.ShareUpdateForm) (sdktypes.PlusApiResultShareRecordVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/share/%s", shareId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultShareRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShareRecordVO](raw)
}

// 取消分享
func (a *ShareApi) Cancel(shareId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/share/%s", shareId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建分享
func (a *ShareApi) CreateShare(body sdktypes.ShareCreateForm) (sdktypes.PlusApiResultShareCreateVO, error) {
    raw, err := a.client.Post(AppApiPath("/share"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultShareCreateVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShareCreateVO](raw)
}

// 访问分享
func (a *ShareApi) Visit(shareCode string, body sdktypes.ShareVisitForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/share/%s/visit", shareCode)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 验证分享密码
func (a *ShareApi) VerifySharePassword(shareCode string, body sdktypes.ShareVerifyForm) (sdktypes.PlusApiResultShareVerifyVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/share/%s/verify", shareCode)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultShareVerifyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShareVerifyVO](raw)
}

// 上报分享
func (a *ShareApi) Track(body sdktypes.ShareTrackForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/share/track"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 生成分享海报
func (a *ShareApi) GenerateSharePoster(body sdktypes.SharePosterForm) (sdktypes.PlusApiResultSharePosterVO, error) {
    raw, err := a.client.Post(AppApiPath("/share/poster"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSharePosterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSharePosterVO](raw)
}

// 领取邀请奖励
func (a *ShareApi) ClaimInviteReward(rewardId string) (sdktypes.PlusApiResultInviteRewardClaimVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/share/invite/rewards/%s/claim", rewardId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInviteRewardClaimVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInviteRewardClaimVO](raw)
}

// 生成邀请链接
func (a *ShareApi) GenerateInviteLink(body sdktypes.InviteLinkForm) (sdktypes.PlusApiResultInviteLinkVO, error) {
    raw, err := a.client.Post(AppApiPath("/share/invite/link"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultInviteLinkVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInviteLinkVO](raw)
}

// 获取访问记录
func (a *ShareApi) GetShareVisitors(shareId string, query map[string]interface{}) (sdktypes.PlusApiResultPageShareVisitorVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/share/%s/visitors", shareId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageShareVisitorVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageShareVisitorVO](raw)
}

// 获取分享统计
func (a *ShareApi) GetShareStatistics(shareId string) (sdktypes.PlusApiResultShareStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/share/%s/statistics", shareId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultShareStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShareStatisticsVO](raw)
}

// 获取分享信息
func (a *ShareApi) GetShareInfo(shareCode string, query map[string]interface{}) (sdktypes.PlusApiResultShareInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/share/%s", shareCode)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultShareInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShareInfoVO](raw)
}

// 获取分享平台配置
func (a *ShareApi) GetSharePlatforms() (sdktypes.PlusApiResultListSharePlatformVO, error) {
    raw, err := a.client.Get(AppApiPath("/share/platforms"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSharePlatformVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSharePlatformVO](raw)
}

// 获取我的分享
func (a *ShareApi) ListMyShares(query map[string]interface{}) (sdktypes.PlusApiResultPageShareRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/share/my-shares"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageShareRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageShareRecordVO](raw)
}

// 获取邀请记录
func (a *ShareApi) GetInviteRecords(query map[string]interface{}) (sdktypes.PlusApiResultPageInviteRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/share/invite/records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageInviteRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageInviteRecordVO](raw)
}

// 获取邀请信息
func (a *ShareApi) GetInviteInfo() (sdktypes.PlusApiResultInviteInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/share/invite/info"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInviteInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInviteInfoVO](raw)
}

// 批量取消分享
func (a *ShareApi) BatchCancelShares() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/share/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
