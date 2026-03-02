package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ProfileApi struct {
    client *sdkhttp.Client
}

func NewProfileApi(client *sdkhttp.Client) *ProfileApi {
    return &ProfileApi{client: client}
}

// 获取用户信息
func (a *ProfileApi) GetUser() (sdktypes.PlusApiResultUserProfileVO, error) {
    raw, err := a.client.Get(AppApiPath("/user/profile"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUserProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserProfileVO](raw)
}

// 更新用户信息
func (a *ProfileApi) UpdateUser(body sdktypes.UserProfileUpdateForm) (sdktypes.PlusApiResultUserProfileVO, error) {
    raw, err := a.client.Put(AppApiPath("/user/profile"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserProfileVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserProfileVO](raw)
}
