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

// 更新商品属性
func (a *ProductsApi) UpdateProductAttribute(productId string, attributeId string, body sdktypes.ProductAttributeUpdateRequest) (sdktypes.PlusApiResultProductAttributeVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/products/%s/attributes/%s", productId, attributeId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProductAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductAttributeVO](raw)
}

// 删除商品属性
func (a *ProductsApi) DeleteProductAttribute(productId string, attributeId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/products/%s/attributes/%s", productId, attributeId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 更新商品分类
func (a *ProductsApi) UpdateProductCategory(categoryId string, body sdktypes.ProductCategoryUpdateRequest) (sdktypes.PlusApiResultProductCategoryVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/products/categories/%s", categoryId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProductCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductCategoryVO](raw)
}

// 删除商品分类
func (a *ProductsApi) DeleteProductCategory(categoryId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/products/categories/%s", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取商品属性
func (a *ProductsApi) ListProductAttributes(productId string) (sdktypes.PlusApiResultListProductAttributeVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/%s/attributes", productId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListProductAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListProductAttributeVO](raw)
}

// 创建商品属性
func (a *ProductsApi) CreateProductAttribute(productId string, body sdktypes.ProductAttributeCreateRequest) (sdktypes.PlusApiResultProductAttributeVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/products/%s/attributes", productId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProductAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductAttributeVO](raw)
}

// 获取商品分类列表
func (a *ProductsApi) ListProductCategories(query map[string]interface{}) (sdktypes.PlusApiResultListProductCategoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/products/categories"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListProductCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListProductCategoryVO](raw)
}

// 创建商品分类
func (a *ProductsApi) CreateProductCategory(body sdktypes.ProductCategoryCreateRequest) (sdktypes.PlusApiResultProductCategoryVO, error) {
    raw, err := a.client.Post(AppApiPath("/products/categories"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProductCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductCategoryVO](raw)
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

// 获取SPU详情
func (a *ProductsApi) GetSpuDetail(productId string) (sdktypes.PlusApiResultProductDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/%s/spu", productId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultProductDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProductDetailVO](raw)
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

// 获取分类属性
func (a *ProductsApi) ListCategoryAttributes(categoryId string) (sdktypes.PlusApiResultListProductAttributeVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/products/categories/%s/attributes", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListProductAttributeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListProductAttributeVO](raw)
}

// 获取商品分类树
func (a *ProductsApi) GetProductCategoryTree() (sdktypes.PlusApiResultListProductCategoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/products/categories/tree"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListProductCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListProductCategoryVO](raw)
}
