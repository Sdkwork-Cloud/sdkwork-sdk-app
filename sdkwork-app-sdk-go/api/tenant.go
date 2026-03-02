package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type TenantApi struct {
    client *sdkhttp.Client
}

func NewTenantApi(client *sdkhttp.Client) *TenantApi {
    return &TenantApi{client: client}
}

// 获取租户详情
func (a *TenantApi) GetTenant(tenantId string) (sdktypes.PlusApiResultTenantDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/tenant/%s", tenantId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultTenantDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantDetailVO](raw)
}

// 更新租户
func (a *TenantApi) UpdateTenant(tenantId string, body sdktypes.TenantUpdateForm) (sdktypes.PlusApiResultTenantVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/tenant/%s", tenantId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantVO](raw)
}

// 创建租户
func (a *TenantApi) CreateTenant(body sdktypes.TenantCreateForm) (sdktypes.PlusApiResultTenantVO, error) {
    raw, err := a.client.Post(AppApiPath("/tenant"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantVO](raw)
}

// 冻结租户
func (a *TenantApi) Freeze(tenantId string) (sdktypes.PlusApiResultTenantVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/tenant/%s/freeze", tenantId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantVO](raw)
}

// 注销租户
func (a *TenantApi) Close(tenantId string) (sdktypes.PlusApiResultTenantVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/tenant/%s/close", tenantId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantVO](raw)
}

// 激活租户
func (a *TenantApi) Activate(tenantId string) (sdktypes.PlusApiResultTenantVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/tenant/%s/activate", tenantId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantVO](raw)
}

// 获取租户类型列表
func (a *TenantApi) GetTenantTypes() (sdktypes.PlusApiResultListTenantTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/tenant/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListTenantTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTenantTypeVO](raw)
}

// 获取租户统计
func (a *TenantApi) GetTenantStatistics() (sdktypes.PlusApiResultTenantStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/tenant/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultTenantStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantStatisticsVO](raw)
}

// 获取根租户
func (a *TenantApi) GetRoot() (sdktypes.PlusApiResultTenantDetailVO, error) {
    raw, err := a.client.Get(AppApiPath("/tenant/root"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultTenantDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantDetailVO](raw)
}

// 获取租户列表
func (a *TenantApi) GetTenantList(query map[string]interface{}) (sdktypes.PlusApiResultPageTenantVO, error) {
    raw, err := a.client.Get(AppApiPath("/tenant/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageTenantVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageTenantVO](raw)
}

// 根据编码获取租户
func (a *TenantApi) GetTenantByCode(code string) (sdktypes.PlusApiResultTenantDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/tenant/code/%s", code)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultTenantDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantDetailVO](raw)
}

// 获取云租户
func (a *TenantApi) GetCloud() (sdktypes.PlusApiResultTenantDetailVO, error) {
    raw, err := a.client.Get(AppApiPath("/tenant/cloud"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultTenantDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTenantDetailVO](raw)
}
