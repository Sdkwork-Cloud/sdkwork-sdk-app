package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type StyleApi struct {
    client *sdkhttp.Client
}

func NewStyleApi(client *sdkhttp.Client) *StyleApi {
    return &StyleApi{client: client}
}

// 获取风格详情
func (a *StyleApi) GetStyle(styleId string) (sdktypes.PlusApiResultGenerationStyleDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/style/%s", styleId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationStyleDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationStyleDetailVO](raw)
}

// 更新风格
func (a *StyleApi) UpdateStyle(styleId string, body sdktypes.GenerationStyleUpdateForm) (sdktypes.PlusApiResultGenerationStyleVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/generation/style/%s", styleId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationStyleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationStyleVO](raw)
}

// 删除风格
func (a *StyleApi) DeleteStyle(styleId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/style/%s", styleId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建风格
func (a *StyleApi) CreateStyle(body sdktypes.GenerationStyleCreateForm) (sdktypes.PlusApiResultGenerationStyleVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/style"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationStyleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationStyleVO](raw)
}

// 发布风格
func (a *StyleApi) Publish(styleId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/generation/style/%s/publish", styleId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消发布
func (a *StyleApi) Unpublish(styleId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/style/%s/publish", styleId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 停用风格
func (a *StyleApi) Deactivate(styleId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/generation/style/%s/deactivate", styleId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 激活风格
func (a *StyleApi) Activate(styleId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/generation/style/%s/activate", styleId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取风格类型列表
func (a *StyleApi) GetStyleTypes() (sdktypes.PlusApiResultListStyleTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/style/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListStyleTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListStyleTypeVO](raw)
}

// 获取风格统计
func (a *StyleApi) GetStyleStatistics() (sdktypes.PlusApiResultStyleStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/style/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultStyleStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultStyleStatisticsVO](raw)
}

// 搜索风格
func (a *StyleApi) SearchStyles(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationStyleVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/style/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationStyleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationStyleVO](raw)
}

// 获取公开风格
func (a *StyleApi) GetPublicStyles(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationStyleVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/style/public"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationStyleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationStyleVO](raw)
}

// 获取热门风格
func (a *StyleApi) GetPopularStyles(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationStyleVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/style/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationStyleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationStyleVO](raw)
}

// 获取我的风格
func (a *StyleApi) GetMyStyles(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationStyleVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/style/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationStyleVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationStyleVO](raw)
}
