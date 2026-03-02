package api

import (
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type StatisticsApi struct {
    client *sdkhttp.Client
}

func NewStatisticsApi(client *sdkhttp.Client) *StatisticsApi {
    return &StatisticsApi{client: client}
}

// 获取组织统计
func (a *StatisticsApi) GetOrganization() (sdktypes.PlusApiResultOrganizationStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/organization/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultOrganizationStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultOrganizationStatisticsVO](raw)
}
