package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type OrganizationApi struct {
    client *sdkhttp.Client
}

func NewOrganizationApi(client *sdkhttp.Client) *OrganizationApi {
    return &OrganizationApi{client: client}
}

// 创建组织
func (a *OrganizationApi) CreateOrganization(body sdktypes.OrganizationCreateForm) (sdktypes.PlusApiResultOrganizationVO, error) {
    raw, err := a.client.Post(AppApiPath("/organization"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationVO](raw)
}

// 获取组织详情
func (a *OrganizationApi) GetOrganization(orgId string) (sdktypes.PlusApiResultOrganizationDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationDetailVO](raw)
}
