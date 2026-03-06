package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AppApi struct {
    client *sdkhttp.Client
}

func NewAppApi(client *sdkhttp.Client) *AppApi {
    return &AppApi{client: client}
}

// 获取应用详情
func (a *AppApi) GetApp(appId string) (sdktypes.PlusApiResultAppDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/app/manage/%s", appId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppDetailVO](raw)
}

// 更新应用
func (a *AppApi) UpdateApp(appId string, body sdktypes.AppUpdateForm) (sdktypes.PlusApiResultAppVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/app/manage/%s", appId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppVO](raw)
}

// 删除应用
func (a *AppApi) DeleteApp(appId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/app/manage/%s", appId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建应用
func (a *AppApi) CreateApp(body sdktypes.AppCreateForm) (sdktypes.PlusApiResultAppVO, error) {
    raw, err := a.client.Post(AppApiPath("/app/manage"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppVO](raw)
}

// 停用应用
func (a *AppApi) Deactivate(appId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/app/manage/%s/deactivate", appId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 激活应用
func (a *AppApi) Activate(appId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/app/manage/%s/activate", appId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 检查发布就绪状态
func (a *AppApi) CheckPublishReadiness(appId string) (sdktypes.PlusApiResultAppPublishReadinessVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/app/manage/%s/publish/readiness", appId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppPublishReadinessVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppPublishReadinessVO](raw)
}

// 获取应用统计
func (a *AppApi) GetAppStatistics() (sdktypes.PlusApiResultAppStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/app/manage/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppStatisticsVO](raw)
}

// 搜索应用
func (a *AppApi) SearchApps(query map[string]interface{}) (sdktypes.PlusApiResultPageAppVO, error) {
    raw, err := a.client.Get(AppApiPath("/app/manage/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAppVO](raw)
}

// 获取项目应用
func (a *AppApi) GetProjectApps(projectId string, query map[string]interface{}) (sdktypes.PlusApiResultPageAppVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/app/manage/project/%s", projectId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAppVO](raw)
}

// 获取我的应用
func (a *AppApi) GetMyApps(query map[string]interface{}) (sdktypes.PlusApiResultPageAppVO, error) {
    raw, err := a.client.Get(AppApiPath("/app/manage/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAppVO](raw)
}

// 获取账户余额汇总
func (a *AppApi) GetAccountSummary() (sdktypes.PlusApiResultAccountSummaryVO, error) {
    raw, err := a.client.Get(AppApiPath("/account/summary"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAccountSummaryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAccountSummaryVO](raw)
}
