package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CartApi struct {
    client *sdkhttp.Client
}

func NewCartApi(client *sdkhttp.Client) *CartApi {
    return &CartApi{client: client}
}

// 更新购物车商品数量
func (a *CartApi) UpdateItemQuantity(itemId string, body sdktypes.UpdateCartItemForm) (sdktypes.PlusApiResultCartItemVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/cart/items/%s", itemId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCartItemVO](raw)
}

// 删除购物车商品
func (a *CartApi) RemoveItem(itemId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/cart/items/%s", itemId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 更新商品选中状态
func (a *CartApi) UpdateItemSelection(itemId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/cart/items/%s/select", itemId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量更新选中状态
func (a *CartApi) BatchUpdateSelection(body sdktypes.BatchSelectForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/cart/items/select"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取购物车商品列表
func (a *CartApi) GetCartItems() (sdktypes.PlusApiResultListCartItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/cart/items"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCartItemVO](raw)
}

// 添加商品到购物车
func (a *CartApi) AddItem(body sdktypes.AddCartItemForm) (sdktypes.PlusApiResultCartItemVO, error) {
    raw, err := a.client.Post(AppApiPath("/cart/items"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCartItemVO](raw)
}

// 批量删除购物车商品
func (a *CartApi) RemoveItems(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/cart/items"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取当前用户购物车
func (a *CartApi) GetMy() (sdktypes.PlusApiResultShoppingCartVO, error) {
    raw, err := a.client.Get(AppApiPath("/cart"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultShoppingCartVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultShoppingCartVO](raw)
}

// 清空购物车
func (a *CartApi) Clear() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/cart"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取购物车统计
func (a *CartApi) GetCartStatistics() (sdktypes.PlusApiResultCartStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/cart/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCartStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCartStatisticsVO](raw)
}

// 获取选中的商品列表
func (a *CartApi) GetSelectedItems() (sdktypes.PlusApiResultListCartItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/cart/items/selected"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCartItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCartItemVO](raw)
}

// 检查商品是否在购物车中
func (a *CartApi) CheckItemIn(query map[string]interface{}) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Get(AppApiPath("/cart/check"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
