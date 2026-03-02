package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CodeApi struct {
    client *sdkhttp.Client
}

func NewCodeApi(client *sdkhttp.Client) *CodeApi {
    return &CodeApi{client: client}
}

// 根据编码获取组织
func (a *CodeApi) GetOrganizationBy(code string) (sdktypes.PlusApiResultOrganizationDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/code/%s", code)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationDetailVO](raw)
}
