package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type VoiceSpeakersApi struct {
    client *sdkhttp.Client
}

func NewVoiceSpeakersApi(client *sdkhttp.Client) *VoiceSpeakersApi {
    return &VoiceSpeakersApi{client: client}
}

// 获取发音人详情
func (a *VoiceSpeakersApi) GetSpeakerDetail(speakerId string) (sdktypes.PlusApiResultVoiceSpeakerDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/voice-speakers/%s", speakerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerDetailVO](raw)
}

// 更新发音人
func (a *VoiceSpeakersApi) UpdateSpeaker(speakerId string, body sdktypes.VoiceSpeakerCreateForm) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/voice-speakers/%s", speakerId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 删除发音人
func (a *VoiceSpeakersApi) DeleteSpeaker(speakerId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/voice-speakers/%s", speakerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取发音人列表
func (a *VoiceSpeakersApi) ListSpeakers(query map[string]interface{}) (sdktypes.PlusApiResultPageVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath("/voice-speakers"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVoiceSpeakerVO](raw)
}

// 创建发音人
func (a *VoiceSpeakersApi) CreateSpeaker(body sdktypes.VoiceSpeakerCreateForm) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Post(AppApiPath("/voice-speakers"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 更新发音人状态
func (a *VoiceSpeakersApi) UpdateStatus(speakerId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/voice-speakers/%s/status", speakerId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 设为默认发音人
func (a *VoiceSpeakersApi) SetAsDefault(speakerId string) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/voice-speakers/%s/set-default", speakerId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 获取发音人统计
func (a *VoiceSpeakersApi) GetStatistics() (sdktypes.PlusApiResultSpeakerStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/voice-speakers/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSpeakerStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSpeakerStatisticsVO](raw)
}

// 获取默认发音人
func (a *VoiceSpeakersApi) GetDefaultSpeaker() (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath("/voice-speakers/default"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 根据代码获取发音人
func (a *VoiceSpeakersApi) GetSpeakerByCode(code string) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/voice-speakers/code/%s", code)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 获取渠道发音人
func (a *VoiceSpeakersApi) ListSpeakersByChannel(channel string) (sdktypes.PlusApiResultListVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/voice-speakers/channel/%s", channel)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVoiceSpeakerVO](raw)
}
