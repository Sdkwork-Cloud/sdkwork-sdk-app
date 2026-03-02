package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AuthApi struct {
    client *sdkhttp.Client
}

func NewAuthApi(client *sdkhttp.Client) *AuthApi {
    return &AuthApi{client: client}
}

// Request password reset challenge
func (a *AuthApi) RequestPasswordResetChallenge(body sdktypes.PasswordResetRequestForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/auth/password/reset/request"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
