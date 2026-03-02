package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AvatarApi struct {
    client *sdkhttp.Client
}

func NewAvatarApi(client *sdkhttp.Client) *AvatarApi {
    return &AvatarApi{client: client}
}

// 上传头像
func (a *AvatarApi) Upload(body *sdktypes.UploadAvatarRequest) (sdktypes.PlusApiResultMapStringString, error) {
    raw, err := a.client.Post(AppApiPath("/user/avatar"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringString](raw)
}
