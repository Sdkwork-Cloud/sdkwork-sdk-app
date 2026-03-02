package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AbApi struct {
    client *sdkhttp.Client
}

func NewAbApi(client *sdkhttp.Client) *AbApi {
    return &AbApi{client: client}
}

// 实验反馈
func (a *AbApi) SubmitExperimentFeedback(experimentId string, body sdktypes.ExperimentFeedbackForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/abtest/%s/feedback", experimentId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 退出实验
func (a *AbApi) ExitExperiment(experimentId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/abtest/%s/exit", experimentId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 所有特性开关
func (a *AbApi) ListFeatureFlags() (sdktypes.PlusApiResultListFeatureFlagVO, error) {
    raw, err := a.client.Get(AppApiPath("/abtest/features"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeatureFlagVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeatureFlagVO](raw)
}

// 批量特性开关
func (a *AbApi) BatchCheckFeatures(body sdktypes.BatchFeatureCheckForm) (sdktypes.PlusApiResultMapStringFeatureFlagVO, error) {
    raw, err := a.client.Post(AppApiPath("/abtest/features"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringFeatureFlagVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringFeatureFlagVO](raw)
}

// 上报实验曝光
func (a *AbApi) TrackExperimentExposure(body sdktypes.ExperimentExposureForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/abtest/exposure"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报实验事件
func (a *AbApi) TrackExperimentEvent(body sdktypes.ExperimentEventForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/abtest/events"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上报实验转化
func (a *AbApi) TrackExperimentConversion(body sdktypes.ExperimentConversionForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/abtest/conversion"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量获取分组
func (a *AbApi) BatchGetAssignments(body sdktypes.BatchAssignmentForm) (sdktypes.PlusApiResultMapStringExperimentAssignmentVO, error) {
    raw, err := a.client.Post(AppApiPath("/abtest/assignments"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringExperimentAssignmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringExperimentAssignmentVO](raw)
}

// 实验结果
func (a *AbApi) GetExperimentResults(experimentId string) (sdktypes.PlusApiResultExperimentResultsVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/abtest/%s/results", experimentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultExperimentResultsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExperimentResultsVO](raw)
}

// 实验报告
func (a *AbApi) GetExperimentReport(experimentId string) (sdktypes.PlusApiResultExperimentReportVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/abtest/%s/report", experimentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultExperimentReportVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExperimentReportVO](raw)
}

// UI配置
func (a *AbApi) GetUiConfig() (sdktypes.PlusApiResultUiConfigVO, error) {
    raw, err := a.client.Get(AppApiPath("/abtest/ui-config"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUiConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUiConfigVO](raw)
}

// 灰度配置
func (a *AbApi) ListRolloutConfigs() (sdktypes.PlusApiResultListRolloutConfigVO, error) {
    raw, err := a.client.Get(AppApiPath("/abtest/rollouts"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListRolloutConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListRolloutConfigVO](raw)
}

// 灰度发布
func (a *AbApi) CheckRollout(rolloutKey string) (sdktypes.PlusApiResultRolloutCheckVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/abtest/rollout/%s", rolloutKey)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultRolloutCheckVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRolloutCheckVO](raw)
}

// 特性开关
func (a *AbApi) CheckFeatureFlag(featureKey string) (sdktypes.PlusApiResultFeatureFlagVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/abtest/features/%s", featureKey)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFeatureFlagVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeatureFlagVO](raw)
}

// 可用实验
func (a *AbApi) ListAvailableExperiments() (sdktypes.PlusApiResultListExperimentVO, error) {
    raw, err := a.client.Get(AppApiPath("/abtest/experiments"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListExperimentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListExperimentVO](raw)
}

// 实验详情
func (a *AbApi) GetExperimentDetail(experimentId string) (sdktypes.PlusApiResultExperimentDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/abtest/experiments/%s", experimentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultExperimentDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExperimentDetailVO](raw)
}

// 个性化配置
func (a *AbApi) GetPersonalizedConfig() (sdktypes.PlusApiResultMapStringObject, error) {
    raw, err := a.client.Get(AppApiPath("/abtest/config"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringObject
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringObject](raw)
}

// 获取实验分组
func (a *AbApi) GetExperimentAssignment(query map[string]interface{}) (sdktypes.PlusApiResultExperimentAssignmentVO, error) {
    raw, err := a.client.Get(AppApiPath("/abtest/assignment"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultExperimentAssignmentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultExperimentAssignmentVO](raw)
}

// 算法配置
func (a *AbApi) GetAlgorithmConfig() (sdktypes.PlusApiResultAlgorithmConfigVO, error) {
    raw, err := a.client.Get(AppApiPath("/abtest/algorithm-config"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAlgorithmConfigVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAlgorithmConfigVO](raw)
}
