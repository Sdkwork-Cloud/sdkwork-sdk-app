package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type RefreshApi struct {
    client *sdkhttp.Client
}

func NewRefreshApi(client *sdkhttp.Client) *RefreshApi {
    return &RefreshApi{client: client}
}

// 刷新令牌
func (a *RefreshApi) Token(body sdktypes.TokenRefreshForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/refresh"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}
