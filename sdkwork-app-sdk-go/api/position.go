package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type PositionApi struct {
    client *sdkhttp.Client
}

func NewPositionApi(client *sdkhttp.Client) *PositionApi {
    return &PositionApi{client: client}
}

// 创建岗位
func (a *PositionApi) CreatePosition(body sdktypes.PositionCreateForm) (sdktypes.PlusApiResultPositionVO, error) {
    raw, err := a.client.Post(AppApiPath("/organization/position"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPositionVO](raw)
}

// 获取岗位详情
func (a *PositionApi) GetPosition(posId string) (sdktypes.PlusApiResultPositionDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/position/%s", posId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPositionDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPositionDetailVO](raw)
}

// 获取子岗位
func (a *PositionApi) GetChildPositions(posId string) (sdktypes.PlusApiResultListPositionVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/position/%s/children", posId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPositionVO](raw)
}
