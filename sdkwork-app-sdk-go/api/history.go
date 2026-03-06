package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type HistoryApi struct {
    client *sdkhttp.Client
}

func NewHistoryApi(client *sdkhttp.Client) *HistoryApi {
    return &HistoryApi{client: client}
}

// 浏览历史
func (a *HistoryApi) ListBrowse(query map[string]interface{}) (sdktypes.PlusApiResultPageBrowseHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/browse"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageBrowseHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageBrowseHistoryVO](raw)
}

// 添加浏览记录
func (a *HistoryApi) AddBrowse(body sdktypes.BrowseHistoryAddForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/history/browse"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 清空浏览历史
func (a *HistoryApi) ClearBrowse(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/history/browse"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 历史统计
func (a *HistoryApi) GetHistoryStatistics() (sdktypes.PlusApiResultHistoryStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultHistoryStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultHistoryStatisticsVO](raw)
}

// 浏览统计
func (a *HistoryApi) GetBrowseStatistics() (sdktypes.PlusApiResultBrowseStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/statistics/browse"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBrowseStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBrowseStatisticsVO](raw)
}

// 所有会话
func (a *HistoryApi) ListSessions() (sdktypes.PlusApiResultListSessionInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/sessions"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSessionInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSessionInfoVO](raw)
}

// 当前会话
func (a *HistoryApi) GetCurrentSession() (sdktypes.PlusApiResultSessionInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/sessions/current"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSessionInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSessionInfoVO](raw)
}

// 操作历史
func (a *HistoryApi) ListOperation(query map[string]interface{}) (sdktypes.PlusApiResultPageOperationHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/operations"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageOperationHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageOperationHistoryVO](raw)
}

// 最近操作
func (a *HistoryApi) GetRecentOperations(query map[string]interface{}) (sdktypes.PlusApiResultListOperationHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/operations/recent"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListOperationHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListOperationHistoryVO](raw)
}

// 登录历史
func (a *HistoryApi) ListLogin(query map[string]interface{}) (sdktypes.PlusApiResultPageLoginHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/logins"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageLoginHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageLoginHistoryVO](raw)
}

// 生成历史
func (a *HistoryApi) ListGeneration(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/generations"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationHistoryVO](raw)
}

// 清空生成历史
func (a *HistoryApi) ClearGeneration() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/history/generations"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 最近生成
func (a *HistoryApi) GetRecentGenerations(query map[string]interface{}) (sdktypes.PlusApiResultListGenerationHistoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/history/generations/recent"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListGenerationHistoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListGenerationHistoryVO](raw)
}

// 终止会话
func (a *HistoryApi) TerminateSession(sessionId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/history/sessions/%s", sessionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 终止其他会话
func (a *HistoryApi) TerminateOtherSessions() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/history/sessions/others"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 删除生成历史
func (a *HistoryApi) DeleteGeneration(historyId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/history/generations/%s", historyId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 删除浏览记录
func (a *HistoryApi) DeleteBrowse(historyId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/history/browse/%s", historyId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量删除浏览记录
func (a *HistoryApi) BatchDeleteBrowse() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/history/browse/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
