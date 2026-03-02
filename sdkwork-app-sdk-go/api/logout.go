package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type LogoutApi struct {
    client *sdkhttp.Client
}

func NewLogoutApi(client *sdkhttp.Client) *LogoutApi {
    return &LogoutApi{client: client}
}

// 用户登出
func (a *LogoutApi) Logout() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/logout"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
