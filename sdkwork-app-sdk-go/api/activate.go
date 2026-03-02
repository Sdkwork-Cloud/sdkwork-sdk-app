package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ActivateApi struct {
    client *sdkhttp.Client
}

func NewActivateApi(client *sdkhttp.Client) *ActivateApi {
    return &ActivateApi{client: client}
}

// 激活组织
func (a *ActivateApi) Organization(orgId string) (sdktypes.PlusApiResultOrganizationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/organization/%s/activate", orgId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationVO](raw)
}
