package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type VoiceSpeakerApi struct {
    client *sdkhttp.Client
}

func NewVoiceSpeakerApi(client *sdkhttp.Client) *VoiceSpeakerApi {
    return &VoiceSpeakerApi{client: client}
}

// 创建语音生成任务
func (a *VoiceSpeakerApi) CreateGeneration(body sdktypes.VoiceSpeakerGenerationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/voice-speaker"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 克隆说话人
func (a *VoiceSpeakerApi) CloneSpeaker(body sdktypes.VoiceSpeakerCloneForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/voice-speaker/clone"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 获取说话人详情
func (a *VoiceSpeakerApi) GetSpeakerDetail(speakerId string) (sdktypes.PlusApiResultVoiceSpeakerGenerationVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/voice-speaker/%s", speakerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerGenerationVO](raw)
}

// 删除说话人
func (a *VoiceSpeakerApi) DeleteSpeaker(speakerId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/voice-speaker/%s", speakerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取任务列表
func (a *VoiceSpeakerApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/voice-speaker/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationTaskVO](raw)
}

// 获取任务状态
func (a *VoiceSpeakerApi) GetTaskStatus(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/voice-speaker/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 取消任务
func (a *VoiceSpeakerApi) CancelTask(taskId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/voice-speaker/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取说话人列表
func (a *VoiceSpeakerApi) ListSpeakers(query map[string]interface{}) (sdktypes.PlusApiResultPageVoiceSpeakerListVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/voice-speaker/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVoiceSpeakerListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVoiceSpeakerListVO](raw)
}
