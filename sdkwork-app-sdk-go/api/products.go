package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ProductsApi struct {
    client *sdkhttp.Client
}

func NewProductsApi(client *sdkhttp.Client) *ProductsApi {
    return &ProductsApi{client: client}
}

// 获取商品列表
func (a *ProductsApi) GetProducts(query map[string]interface{}) (sdktypes.PlusApiResultPageProductVO, error) {
    raw, err := a.client.Get(AppApiPath("/products"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageProductVO](raw)
}

// 获取商品详情
func (a *ProductsApi) GetProductDetail(productId string) (sdktypes.PlusApiResultProductDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/%s", productId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultProductDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductDetailVO](raw)
}

// 获取商品库存
func (a *ProductsApi) GetProductStock(productId string) (sdktypes.PlusApiResultInteger, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/%s/stock", productId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInteger
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInteger](raw)
}

// 获取商品统计
func (a *ProductsApi) GetProductStatistics(productId string) (sdktypes.PlusApiResultProductStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/%s/statistics", productId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultProductStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductStatisticsVO](raw)
}

// 获取商品SKU列表
func (a *ProductsApi) GetProductSkus(productId string, query map[string]interface{}) (sdktypes.PlusApiResultListSkuVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/%s/skus", productId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSkuVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSkuVO](raw)
}

// 检查商品库存
func (a *ProductsApi) CheckProductStock(productId string, query map[string]interface{}) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/%s/check-stock", productId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 搜索商品
func (a *ProductsApi) Search(query map[string]interface{}) (sdktypes.PlusApiResultPageProductVO, error) {
    raw, err := a.client.Get(AppApiPath("/products/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageProductVO](raw)
}

// 获取最新商品
func (a *ProductsApi) GetLatest(query map[string]interface{}) (sdktypes.PlusApiResultListProductVO, error) {
    raw, err := a.client.Get(AppApiPath("/products/latest"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListProductVO](raw)
}

// 获取热门商品
func (a *ProductsApi) GetHot(query map[string]interface{}) (sdktypes.PlusApiResultListProductVO, error) {
    raw, err := a.client.Get(AppApiPath("/products/hot"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListProductVO](raw)
}

// 按编码获取商品
func (a *ProductsApi) GetProductByCode(code string) (sdktypes.PlusApiResultProductVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/code/%s", code)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductVO](raw)
}

// 按分类获取商品
func (a *ProductsApi) GetProductsByCategory(categoryId string, query map[string]interface{}) (sdktypes.PlusApiResultPageProductVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/category/%s", categoryId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageProductVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageProductVO](raw)
}
