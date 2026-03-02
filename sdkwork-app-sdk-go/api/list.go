package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ListApi struct {
    client *sdkhttp.Client
}

func NewListApi(client *sdkhttp.Client) *ListApi {
    return &ListApi{client: client}
}

// 获取组织列表
func (a *ListApi) GetOrganization(query map[string]interface{}) (sdktypes.PlusApiResultPageOrganizationVO, error) {
    raw, err := a.client.Get(AppApiPath("/organization/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageOrganizationVO](raw)
}
