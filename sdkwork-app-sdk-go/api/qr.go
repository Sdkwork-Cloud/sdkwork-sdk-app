package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type QrApi struct {
    client *sdkhttp.Client
}

func NewQrApi(client *sdkhttp.Client) *QrApi {
    return &QrApi{client: client}
}

// 生成登录二维码
func (a *QrApi) GenerateQrCode() (sdktypes.PlusApiResultQrCodeVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/qr/generate"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultQrCodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultQrCodeVO](raw)
}

// 确认二维码登录
func (a *QrApi) ConfirmQrCodeLogin(body sdktypes.QrCodeConfirmForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/qr/confirm"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 检查二维码状态
func (a *QrApi) CheckQrCodeStatus(qrKey string) (sdktypes.PlusApiResultQrCodeStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/auth/qr/status/%s", qrKey)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultQrCodeStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultQrCodeStatusVO](raw)
}
