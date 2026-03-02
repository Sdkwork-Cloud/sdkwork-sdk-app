package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type LoginApi struct {
    client *sdkhttp.Client
}

func NewLoginApi(client *sdkhttp.Client) *LoginApi {
    return &LoginApi{client: client}
}

// 用户登录
func (a *LoginApi) Login(body sdktypes.LoginForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}
