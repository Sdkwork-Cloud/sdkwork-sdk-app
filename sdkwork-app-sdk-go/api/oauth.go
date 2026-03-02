package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type OauthApi struct {
    client *sdkhttp.Client
}

func NewOauthApi(client *sdkhttp.Client) *OauthApi {
    return &OauthApi{client: client}
}

// OAuth授权URL
func (a *OauthApi) GetOauthUrl(body sdktypes.OAuthAuthUrlForm) (sdktypes.PlusApiResultOAuthUrlVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/oauth/url"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultOAuthUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOAuthUrlVO](raw)
}

// OAuth登录
func (a *OauthApi) Login(body sdktypes.OAuthLoginForm) (sdktypes.PlusApiResultLoginVO, error) {
    raw, err := a.client.Post(AppApiPath("/auth/oauth/login"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultLoginVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultLoginVO](raw)
}
