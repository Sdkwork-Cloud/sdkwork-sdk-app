package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type PositionsApi struct {
    client *sdkhttp.Client
}

func NewPositionsApi(client *sdkhttp.Client) *PositionsApi {
    return &PositionsApi{client: client}
}

// 获取组织的岗位列表
func (a *PositionsApi) GetPositionsByOrg(orgId string) (sdktypes.PlusApiResultListPositionVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/positions", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPositionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPositionVO](raw)
}

// 获取岗位树
func (a *PositionsApi) GetPositionTree(orgId string) (sdktypes.PlusApiResultListPositionDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/organization/%s/positions/tree", orgId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPositionDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPositionDetailVO](raw)
}
