package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type RegisterApi struct {
    client *sdkhttp.Client
}

func NewRegisterApi(client *sdkhttp.Client) *RegisterApi {
    return &RegisterApi{client: client}
}

// 用户注册
func (a *RegisterApi) Register(body sdktypes.RegisterForm) (sdktypes.PlusApiResultUserInfoVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/register"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserInfoVO](raw)
}
