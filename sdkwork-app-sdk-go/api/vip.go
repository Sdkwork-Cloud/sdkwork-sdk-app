package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type VipApi struct {
    client *sdkhttp.Client
}

func NewVipApi(client *sdkhttp.Client) *VipApi {
    return &VipApi{client: client}
}

// 购买VIP
func (a *VipApi) Purchase(body sdktypes.VipPurchaseForm) (sdktypes.PlusApiResultVipPurchaseVO, error) {
    raw, err := a.client.Post(AppApiPath("/vip/purchase"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVipPurchaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipPurchaseVO](raw)
}

// 升级VIP
func (a *VipApi) Upgrade(body sdktypes.VipUpgradeForm) (sdktypes.PlusApiResultVipPurchaseVO, error) {
    raw, err := a.client.Post(AppApiPath("/vip/purchase/upgrade"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVipPurchaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipPurchaseVO](raw)
}

// 续费VIP
func (a *VipApi) Renew(body sdktypes.VipRenewForm) (sdktypes.PlusApiResultVipPurchaseVO, error) {
    raw, err := a.client.Post(AppApiPath("/vip/purchase/renew"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVipPurchaseVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipPurchaseVO](raw)
}

// 使用加速特权
func (a *VipApi) UseSpeedUpPrivilege(body sdktypes.SpeedUpForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/vip/privilege/speed-up"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 领取每日奖励
func (a *VipApi) ClaimDailyReward() (sdktypes.PlusApiResultVipDailyRewardVO, error) {
    raw, err := a.client.Post(AppApiPath("/vip/points/daily-reward"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVipDailyRewardVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipDailyRewardVO](raw)
}

// 邀请好友
func (a *VipApi) InviteFriend(body sdktypes.VipInviteForm) (sdktypes.PlusApiResultVipInviteVO, error) {
    raw, err := a.client.Post(AppApiPath("/vip/invite"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVipInviteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipInviteVO](raw)
}

// 领取优惠券
func (a *VipApi) ClaimCoupon(couponId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/vip/coupons/%s/claim", couponId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取VIP状态
func (a *VipApi) GetVipStatus() (sdktypes.PlusApiResultVipStatusVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/status"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipStatusVO](raw)
}

// 获取特权使用情况
func (a *VipApi) GetPrivilegeUsage() (sdktypes.PlusApiResultVipPrivilegeUsageVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/privilege/usage"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipPrivilegeUsageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipPrivilegeUsageVO](raw)
}

// 获取积分明细
func (a *VipApi) GetPointsHistory() (sdktypes.PlusApiResultListVipPointsHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/points/history"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipPointsHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipPointsHistoryVO](raw)
}

// 获取每日奖励状态
func (a *VipApi) GetDailyRewardStatus() (sdktypes.PlusApiResultVipDailyRewardStatusVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/points/daily-reward/status"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipDailyRewardStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipDailyRewardStatusVO](raw)
}

// 获取积分余额
func (a *VipApi) GetPointsBalance() (sdktypes.PlusApiResultLong, error) {
    raw, err := a.client.Get(AppApiPath("/vip/points/balance"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultLong
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLong](raw)
}

// 获取套餐分组列表
func (a *VipApi) ListPackGroups(query map[string]interface{}) (sdktypes.PlusApiResultListVipPackGroupVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/pack-groups"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipPackGroupVO](raw)
}

// 获取分组详情
func (a *VipApi) GetPackGroupDetail(groupId string) (sdktypes.PlusApiResultVipPackGroupDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/vip/pack-groups/%s", groupId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipPackGroupDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipPackGroupDetailVO](raw)
}

// 获取分组套餐
func (a *VipApi) ListPacksByGroup(groupId string) (sdktypes.PlusApiResultListVipPackVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/vip/pack-groups/%s/packs", groupId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipPackVO](raw)
}

// 获取所有套餐
func (a *VipApi) ListAllPacks(query map[string]interface{}) (sdktypes.PlusApiResultListVipPackVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/pack-groups/packs"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipPackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipPackVO](raw)
}

// 获取套餐详情
func (a *VipApi) GetPackDetail(packId string) (sdktypes.PlusApiResultVipPackDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/vip/pack-groups/packs/%s", packId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipPackDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipPackDetailVO](raw)
}

// 对比套餐
func (a *VipApi) ComparePacks(query map[string]interface{}) (sdktypes.PlusApiResultListVipPackGroupVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/pack-groups/compare"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipPackGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipPackGroupVO](raw)
}

// 获取VIP等级列表
func (a *VipApi) ListVipLevels() (sdktypes.PlusApiResultListVipLevelVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/levels"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipLevelVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipLevelVO](raw)
}

// 获取邀请规则
func (a *VipApi) GetInviteRules() (sdktypes.PlusApiResultInviteRulesVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/invite/rules"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInviteRulesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInviteRulesVO](raw)
}

// 获取邀请记录
func (a *VipApi) GetInviteRecords(query map[string]interface{}) (sdktypes.PlusApiResultListVipInviteRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/invite/records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipInviteRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipInviteRecordVO](raw)
}

// 获取邀请信息
func (a *VipApi) GetInviteInfo() (sdktypes.PlusApiResultVipInviteInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/invite/info"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipInviteInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipInviteInfoVO](raw)
}

// 获取VIP信息
func (a *VipApi) GetVipInfo() (sdktypes.PlusApiResultVipInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/info"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVipInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVipInfoVO](raw)
}

// 获取VIP优惠券
func (a *VipApi) ListVipCoupons() (sdktypes.PlusApiResultListVipCouponVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/coupons"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipCouponVO](raw)
}

// 获取我的优惠券
func (a *VipApi) ListMyCoupons(query map[string]interface{}) (sdktypes.PlusApiResultListVipCouponVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/coupons/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipCouponVO](raw)
}

// 检查VIP状态
func (a *VipApi) CheckVipStatus() (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Get(AppApiPath("/vip/check"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 获取VIP权益
func (a *VipApi) ListVipBenefits(query map[string]interface{}) (sdktypes.PlusApiResultListVipBenefitVO, error) {
    raw, err := a.client.Get(AppApiPath("/vip/benefits"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVipBenefitVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVipBenefitVO](raw)
}
