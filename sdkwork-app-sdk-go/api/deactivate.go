package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type DeactivateApi struct {
    client *sdkhttp.Client
}

func NewDeactivateApi(client *sdkhttp.Client) *DeactivateApi {
    return &DeactivateApi{client: client}
}

// 注销账号
func (a *DeactivateApi) Account(body sdktypes.AccountDeactivateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/user/deactivate"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
