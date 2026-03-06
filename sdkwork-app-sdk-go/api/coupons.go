package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CouponsApi struct {
    client *sdkhttp.Client
}

func NewCouponsApi(client *sdkhttp.Client) *CouponsApi {
    return &CouponsApi{client: client}
}

// 领取优惠券
func (a *CouponsApi) ReceiveCoupon(couponId string) (sdktypes.PlusApiResultUserCouponVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/coupons/%s/receive", couponId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserCouponVO](raw)
}

// 积分兑换优惠券
func (a *CouponsApi) ExchangeCouponByPoints(couponId string, body sdktypes.CouponPointsExchangeForm) (sdktypes.PlusApiResultUserCouponVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/coupons/%s/exchange/points", couponId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserCouponVO](raw)
}

// 兑换优惠券
func (a *CouponsApi) RedeemCoupon(body sdktypes.CouponRedeemForm) (sdktypes.PlusApiResultUserCouponVO, error) {
    raw, err := a.client.Post(AppApiPath("/coupons/redeem"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserCouponVO](raw)
}

// 使用优惠券
func (a *CouponsApi) UseCoupon(userCouponId string, query map[string]interface{}) (sdktypes.PlusApiResultUserCouponVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/coupons/my/%s/use", userCouponId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserCouponVO](raw)
}

// 回滚积分兑换优惠券
func (a *CouponsApi) RollbackPointsExchangeCoupon(userCouponId string, body *sdktypes.CouponRollbackForm) (sdktypes.PlusApiResultUserCouponVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/coupons/my/%s/rollback", userCouponId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserCouponVO](raw)
}

// 取消使用优惠券
func (a *CouponsApi) CancelUseCoupon(userCouponId string) (sdktypes.PlusApiResultUserCouponVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/coupons/my/%s/cancel", userCouponId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserCouponVO](raw)
}

// 获取可领取优惠券列表
func (a *CouponsApi) ListCoupons(query map[string]interface{}) (sdktypes.PlusApiResultPageCouponVO, error) {
    raw, err := a.client.Get(AppApiPath("/coupons"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCouponVO](raw)
}

// 获取优惠券详情
func (a *CouponsApi) GetCouponDetail(couponId string) (sdktypes.PlusApiResultCouponVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/coupons/%s", couponId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCouponVO](raw)
}

// 获取优惠券统计
func (a *CouponsApi) GetStatistics() (sdktypes.PlusApiResultCouponStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/coupons/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCouponStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCouponStatisticsVO](raw)
}

// 获取我的优惠券列表
func (a *CouponsApi) GetMy(query map[string]interface{}) (sdktypes.PlusApiResultPageUserCouponVO, error) {
    raw, err := a.client.Get(AppApiPath("/coupons/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageUserCouponVO](raw)
}

// 获取用户优惠券详情
func (a *CouponsApi) GetUserCouponDetail(userCouponId string) (sdktypes.PlusApiResultUserCouponVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/coupons/my/%s", userCouponId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserCouponVO](raw)
}

// 获取可用优惠券列表
func (a *CouponsApi) GetAvailable(query map[string]interface{}) (sdktypes.PlusApiResultPageUserCouponVO, error) {
    raw, err := a.client.Get(AppApiPath("/coupons/my/available"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageUserCouponVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageUserCouponVO](raw)
}
