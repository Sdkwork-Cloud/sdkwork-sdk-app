package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type PhoneApi struct {
    client *sdkhttp.Client
}

func NewPhoneApi(client *sdkhttp.Client) *PhoneApi {
    return &PhoneApi{client: client}
}

// 手机号验证码登录
func (a *PhoneApi) Login(body sdktypes.PhoneLoginForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/phone/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}
