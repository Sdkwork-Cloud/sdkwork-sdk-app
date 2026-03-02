package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type PartnerApi struct {
    client *sdkhttp.Client
}

func NewPartnerApi(client *sdkhttp.Client) *PartnerApi {
    return &PartnerApi{client: client}
}

// 获取合作伙伴详情
func (a *PartnerApi) GetPartner(partnerId string) (sdktypes.PlusApiResultPartnerDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/partner/%s", partnerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPartnerDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPartnerDetailVO](raw)
}

// 更新合作伙伴
func (a *PartnerApi) UpdatePartner(partnerId string, body sdktypes.PartnerUpdateForm) (sdktypes.PlusApiResultPartnerVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/partner/%s", partnerId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPartnerVO](raw)
}

// 删除合作伙伴
func (a *PartnerApi) DeletePartner(partnerId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/partner/%s", partnerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 申请成为合作伙伴
func (a *PartnerApi) CreatePartner(body sdktypes.PartnerCreateForm) (sdktypes.PlusApiResultPartnerVO, error) {
    raw, err := a.client.Post(AppApiPath("/partner"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPartnerVO](raw)
}

// 提现佣金
func (a *PartnerApi) WithdrawCommission(partnerId string, body sdktypes.CommissionForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/partner/%s/withdraw", partnerId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 审批拒绝
func (a *PartnerApi) Reject(partnerId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/partner/%s/reject", partnerId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 添加佣金
func (a *PartnerApi) AddCommission(partnerId string, body sdktypes.CommissionForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/partner/%s/commission", partnerId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 审批通过
func (a *PartnerApi) Approve(partnerId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/partner/%s/approve", partnerId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取下级合作伙伴
func (a *PartnerApi) GetSubordinates(partnerId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePartnerVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/partner/subordinates/%s", partnerId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePartnerVO](raw)
}

// 获取合作伙伴统计
func (a *PartnerApi) GetPartnerStatistics() (sdktypes.PlusApiResultPartnerStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/partner/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPartnerStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPartnerStatisticsVO](raw)
}

// 搜索合作伙伴
func (a *PartnerApi) SearchPartners(query map[string]interface{}) (sdktypes.PlusApiResultPagePartnerVO, error) {
    raw, err := a.client.Get(AppApiPath("/partner/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePartnerVO](raw)
}

// 获取我的合作伙伴信息
func (a *PartnerApi) GetMy() (sdktypes.PlusApiResultPartnerDetailVO, error) {
    raw, err := a.client.Get(AppApiPath("/partner/my"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPartnerDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPartnerDetailVO](raw)
}

// 根据推广码查询
func (a *PartnerApi) GetByPromotionCode(promotionCode string) (sdktypes.PlusApiResultPartnerVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/partner/code/%s", promotionCode)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPartnerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPartnerVO](raw)
}
