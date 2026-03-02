package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SmsApi struct {
    client *sdkhttp.Client
}

func NewSmsApi(client *sdkhttp.Client) *SmsApi {
    return &SmsApi{client: client}
}

// 验证验证码
func (a *SmsApi) VerifySmsCode(body sdktypes.VerifyCodeCheckForm) (sdktypes.PlusApiResultVerifyResultVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/sms/verify"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVerifyResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVerifyResultVO](raw)
}

// 发送验证码
func (a *SmsApi) SendSmsCode(body sdktypes.VerifyCodeSendForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/sms/send"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
