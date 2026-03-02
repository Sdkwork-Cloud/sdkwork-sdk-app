package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type BindApi struct {
    client *sdkhttp.Client
}

func NewBindApi(client *sdkhttp.Client) *BindApi {
    return &BindApi{client: client}
}

// 绑定第三方账号
func (a *BindApi) ThirdPartyAccount(platform string, body sdktypes.ThirdPartyBindForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/user/bind/%s", platform)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 解绑第三方账号
func (a *BindApi) UnbindThirdPartyAccount(platform string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/user/bind/%s", platform)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
