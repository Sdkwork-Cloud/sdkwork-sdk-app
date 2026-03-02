package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ShopsApi struct {
    client *sdkhttp.Client
}

func NewShopsApi(client *sdkhttp.Client) *ShopsApi {
    return &ShopsApi{client: client}
}

// 获取店铺详情
func (a *ShopsApi) GetShopDetail(shopId string) (sdktypes.PlusApiResultShopDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/shops/%s", shopId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultShopDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShopDetailVO](raw)
}

// 更新店铺
func (a *ShopsApi) UpdateShop(shopId string, body sdktypes.ShopUpdateForm) (sdktypes.PlusApiResultShopVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/shops/%s", shopId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShopVO](raw)
}

// 删除店铺
func (a *ShopsApi) DeleteShop(shopId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/shops/%s", shopId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 更新店铺状态
func (a *ShopsApi) UpdateStatus(shopId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/shops/%s/status", shopId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 开店营业
func (a *ShopsApi) OpenShop(shopId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/shops/%s/open", shopId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 关店休息
func (a *ShopsApi) CloseShop(shopId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/shops/%s/close", shopId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取店铺列表
func (a *ShopsApi) ListShops(query map[string]interface{}) (sdktypes.PlusApiResultPageShopVO, error) {
    raw, err := a.client.Get(AppApiPath("/shops"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageShopVO](raw)
}

// 创建店铺
func (a *ShopsApi) CreateShop(body sdktypes.ShopCreateForm) (sdktypes.PlusApiResultShopVO, error) {
    raw, err := a.client.Post(AppApiPath("/shops"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShopVO](raw)
}

// 获取店铺统计
func (a *ShopsApi) GetStatistics() (sdktypes.PlusApiResultShopStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/shops/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultShopStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShopStatisticsVO](raw)
}

// 获取所有激活店铺
func (a *ShopsApi) ListAllActive() (sdktypes.PlusApiResultListShopVO, error) {
    raw, err := a.client.Get(AppApiPath("/shops/all"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListShopVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListShopVO](raw)
}
