package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type DisableApi struct {
    client *sdkhttp.Client
}

func NewDisableApi(client *sdkhttp.Client) *DisableApi {
    return &DisableApi{client: client}
}

// 禁用组织
func (a *DisableApi) Organization(orgId string) (sdktypes.PlusApiResultOrganizationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/organization/%s/disable", orgId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationVO](raw)
}
