package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ModelsApi struct {
    client *sdkhttp.Client
}

func NewModelsApi(client *sdkhttp.Client) *ModelsApi {
    return &ModelsApi{client: client}
}

// 批量获取模型价格
func (a *ModelsApi) GetModelPrices(body sdktypes.GetModelPricesRequest) (sdktypes.PlusApiResultListModelPriceVO, error) {
    raw, err := a.client.Post(AppApiPath("/models/prices/batch"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListModelPriceVO](raw)
}

// 获取模型详情
func (a *ModelsApi) GetModelById(modelId string) (sdktypes.PlusApiResultModelInfoDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/%s", modelId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelInfoDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelInfoDetailVO](raw)
}

// 获取模型类型列表
func (a *ModelsApi) GetModelTypes() (sdktypes.PlusApiResultListModelTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListModelTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListModelTypeVO](raw)
}

// 获取类型模型列表
func (a *ModelsApi) GetModelsByType(modelType string, query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/type/%s", modelType)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// 获取模型统计
func (a *ModelsApi) GetModelStatistics() (sdktypes.PlusApiResultModelStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelStatisticsVO](raw)
}

// 搜索模型
func (a *ModelsApi) Search(query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// 获取模型价格
func (a *ModelsApi) GetModelPrice(model string) (sdktypes.PlusApiResultModelPriceVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/price/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelPriceVO](raw)
}

// 获取热门模型
func (a *ModelsApi) GetPopular(query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// 获取系列模型列表
func (a *ModelsApi) GetModelsByFamily(family string, query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/family/%s", family)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// 获取所有模型系列
func (a *ModelsApi) GetAllFamilies() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(AppApiPath("/models/families"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}

// 获取渠道模型列表
func (a *ModelsApi) GetModelsByChannel(channel string, query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/channel/%s", channel)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// 根据模型标识获取详情
func (a *ModelsApi) GetModelBy(model string) (sdktypes.PlusApiResultModelInfoDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/by-model/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelInfoDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelInfoDetailVO](raw)
}

// 获取活跃模型列表
func (a *ModelsApi) GetActive(query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/active"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}
