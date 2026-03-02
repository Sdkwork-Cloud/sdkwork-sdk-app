package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ChildrenApi struct {
    client *sdkhttp.Client
}

func NewChildrenApi(client *sdkhttp.Client) *ChildrenApi {
    return &ChildrenApi{client: client}
}

// 获取子组织
func (a *ChildrenApi) GetChildOrganizations(orgId string) (sdktypes.PlusApiResultListOrganizationVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/children", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListOrganizationVO](raw)
}
