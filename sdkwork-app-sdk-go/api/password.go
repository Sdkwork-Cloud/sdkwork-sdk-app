package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type PasswordApi struct {
    client *sdkhttp.Client
}

func NewPasswordApi(client *sdkhttp.Client) *PasswordApi {
    return &PasswordApi{client: client}
}

// 修改密码
func (a *PasswordApi) Change(body sdktypes.PasswordChangeForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/user/password"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 重置密码
func (a *PasswordApi) Reset(body sdktypes.PasswordResetForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/password/reset"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
