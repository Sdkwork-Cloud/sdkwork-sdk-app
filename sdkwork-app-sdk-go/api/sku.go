package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SkuApi struct {
    client *sdkhttp.Client
}

func NewSkuApi(client *sdkhttp.Client) *SkuApi {
    return &SkuApi{client: client}
}

// 获取SKU详情
func (a *SkuApi) GetSkuDetail(skuId string) (sdktypes.PlusApiResultSkuDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/skus/%s", skuId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSkuDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkuDetailVO](raw)
}

// 获取SKU库存
func (a *SkuApi) GetSkuStock(skuId string) (sdktypes.PlusApiResultSkuStockVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/skus/%s/stock", skuId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSkuStockVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkuStockVO](raw)
}

// 检查SKU库存
func (a *SkuApi) CheckSkuStock(skuId string, query map[string]interface{}) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/skus/%s/check-stock", skuId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 获取产品的SKU列表
func (a *SkuApi) GetSkuByProduct(productId string, query map[string]interface{}) (sdktypes.PlusApiResultPageSkuVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/skus/product/%s", productId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageSkuVO](raw)
}

// 获取产品SKU统计
func (a *SkuApi) GetSkuStatistics(productId string) (sdktypes.PlusApiResultSkuStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/skus/product/%s/statistics", productId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSkuStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkuStatisticsVO](raw)
}

// 检查SKU编码是否存在
func (a *SkuApi) CheckSkuCodeExists(query map[string]interface{}) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Get(AppApiPath("/skus/exists"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 按编码获取SKU
func (a *SkuApi) GetSkuByCode(skuCode string) (sdktypes.PlusApiResultSkuVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/skus/code/%s", skuCode)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkuVO](raw)
}

// 批量获取SKU
func (a *SkuApi) BatchGetSkus(query map[string]interface{}) (sdktypes.PlusApiResultListSkuVO, error) {
    raw, err := a.client.Get(AppApiPath("/skus/batch"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSkuVO](raw)
}
