package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ModelApi struct {
    client *sdkhttp.Client
}

func NewModelApi(client *sdkhttp.Client) *ModelApi {
    return &ModelApi{client: client}
}

// Batch get model prices
func (a *ModelApi) GetModelPrices(body sdktypes.GetModelPricesRequest) (sdktypes.PlusApiResultListModelPriceVO, error) {
    raw, err := a.client.Post(AppApiPath("/models/prices/batch"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListModelPriceVO](raw)
}

// Get model detail
func (a *ModelApi) GetModelById(modelId string) (sdktypes.PlusApiResultModelInfoDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/%s", modelId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelInfoDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelInfoDetailVO](raw)
}

// Get model types
func (a *ModelApi) GetModelTypes() (sdktypes.PlusApiResultListModelTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListModelTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListModelTypeVO](raw)
}

// Get models by type
func (a *ModelApi) GetModelsByType(modelType string, query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/type/%s", modelType)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// Get model statistics
func (a *ModelApi) GetModelStatistics() (sdktypes.PlusApiResultModelStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelStatisticsVO](raw)
}

// Search models
func (a *ModelApi) SearchModels(query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// Get model default price
func (a *ModelApi) GetModelPrice(model string) (sdktypes.PlusApiResultModelPriceVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/price/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelPriceVO](raw)
}

// Get model pricing rules
func (a *ModelApi) GetModelPriceRules(model string, query map[string]interface{}) (sdktypes.PlusApiResultListModelPriceVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/price-rules/%s", model)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListModelPriceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListModelPriceVO](raw)
}

// Get popular models
func (a *ModelApi) GetPopularModels(query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// Get models by family
func (a *ModelApi) GetModelsByFamily(family string, query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/family/%s", family)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// Get all families
func (a *ModelApi) GetAllFamilies() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(AppApiPath("/models/families"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}

// Get models by channel
func (a *ModelApi) GetModelsByChannel(channel string, query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/channel/%s", channel)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}

// Get model detail by alias
func (a *ModelApi) GetModelBy(model string) (sdktypes.PlusApiResultModelInfoDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/models/by-model/%s", model)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultModelInfoDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultModelInfoDetailVO](raw)
}

// Get active models
func (a *ModelApi) GetActiveModels(query map[string]interface{}) (sdktypes.PlusApiResultPageModelInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/models/active"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageModelInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageModelInfoVO](raw)
}
