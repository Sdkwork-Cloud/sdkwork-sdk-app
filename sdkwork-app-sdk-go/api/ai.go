package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AiApi struct {
    client *sdkhttp.Client
}

func NewAiApi(client *sdkhttp.Client) *AiApi {
    return &AiApi{client: client}
}

// 获取提示语详情
func (a *AiApi) GetPromptDetail(id string) (sdktypes.PlusApiResultPromptVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/prompt/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPromptVO](raw)
}

// 更新提示语
func (a *AiApi) UpdatePrompt(id string, body sdktypes.PromptUpdateForm) (sdktypes.PlusApiResultPromptVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/prompt/%s", id)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPromptVO](raw)
}

// 删除提示语
func (a *AiApi) DeletePrompt(id string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/prompt/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建提示语
func (a *AiApi) CreatePrompt(body sdktypes.PromptCreateForm) (sdktypes.PlusApiResultPromptVO, error) {
    raw, err := a.client.Post(AppApiPath("/prompt"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPromptVO](raw)
}

// 使用提示语
func (a *AiApi) UsePrompt(id string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/prompt/%s/use", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 收藏提示语
func (a *AiApi) FavoritePrompt(id string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/prompt/%s/favorite", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消收藏提示语
func (a *AiApi) UnfavoritePrompt(id string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/prompt/%s/favorite", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取热门提示语
func (a *AiApi) GetPopularPrompts(query map[string]interface{}) (sdktypes.PlusApiResultPagePromptVO, error) {
    raw, err := a.client.Get(AppApiPath("/prompt/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePromptVO](raw)
}

// 获取最受欢迎提示语
func (a *AiApi) GetMostFavoritedPrompts(query map[string]interface{}) (sdktypes.PlusApiResultPagePromptVO, error) {
    raw, err := a.client.Get(AppApiPath("/prompt/most-favorited"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePromptVO](raw)
}

// 获取提示语列表
func (a *AiApi) ListPrompts(query map[string]interface{}) (sdktypes.PlusApiResultPagePromptVO, error) {
    raw, err := a.client.Get(AppApiPath("/prompt/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePromptVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePromptVO](raw)
}

// 获取提示语历史详情
func (a *AiApi) GetPromptHistoryDetail(id string) (sdktypes.PlusApiResultPromptHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/prompt/history/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPromptHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPromptHistoryVO](raw)
}

// 删除提示语历史
func (a *AiApi) DeletePromptHistory(id string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/prompt/history/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取提示语使用历史
func (a *AiApi) ListPromptHistory(query map[string]interface{}) (sdktypes.PlusApiResultPagePromptHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/prompt/history/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePromptHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePromptHistoryVO](raw)
}
