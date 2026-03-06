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

// 获取发音人详情
func (a *VoiceSpeakerApi) GetSpeakerDetail(speakerId string) (sdktypes.PlusApiResultVoiceSpeakerDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/voice-speakers/%s", speakerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerDetailVO](raw)
}

// 更新发音人
func (a *VoiceSpeakerApi) UpdateSpeaker(speakerId string, body sdktypes.VoiceSpeakerCreateForm) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/voice-speakers/%s", speakerId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 删除发音人
func (a *VoiceSpeakerApi) DeleteSpeaker(speakerId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/voice-speakers/%s", speakerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取发音人列表
func (a *VoiceSpeakerApi) ListSpeakers(query map[string]interface{}) (sdktypes.PlusApiResultPageVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath("/voice-speakers"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVoiceSpeakerVO](raw)
}

// 创建发音人
func (a *VoiceSpeakerApi) CreateSpeaker(body sdktypes.VoiceSpeakerCreateForm) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Post(AppApiPath("/voice-speakers"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 更新发音人状态
func (a *VoiceSpeakerApi) UpdateStatus(speakerId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/voice-speakers/%s/status", speakerId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 设为默认发音人
func (a *VoiceSpeakerApi) SetAsDefault(speakerId string) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/voice-speakers/%s/set-default", speakerId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
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

// 获取发音人统计
func (a *VoiceSpeakerApi) GetStatistics() (sdktypes.PlusApiResultSpeakerStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/voice-speakers/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSpeakerStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSpeakerStatisticsVO](raw)
}

// 获取默认发音人
func (a *VoiceSpeakerApi) GetDefaultSpeaker() (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath("/voice-speakers/default"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 根据代码获取发音人
func (a *VoiceSpeakerApi) GetSpeakerByCode(code string) (sdktypes.PlusApiResultVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/voice-speakers/code/%s", code)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerVO](raw)
}

// 获取渠道发音人
func (a *VoiceSpeakerApi) ListSpeakersByChannel(channel string) (sdktypes.PlusApiResultListVoiceSpeakerVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/voice-speakers/channel/%s", channel)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListVoiceSpeakerVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListVoiceSpeakerVO](raw)
}

// 获取说话人详情
func (a *VoiceSpeakerApi) GetSpeakerDetailVoice(speakerId string) (sdktypes.PlusApiResultVoiceSpeakerGenerationVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/voice-speaker/%s", speakerId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceSpeakerGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceSpeakerGenerationVO](raw)
}

// 删除说话人
func (a *VoiceSpeakerApi) DeleteSpeakerVoice(speakerId string) (sdktypes.PlusApiResultVoid, error) {
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
func (a *VoiceSpeakerApi) GetListSpeakers(query map[string]interface{}) (sdktypes.PlusApiResultPageVoiceSpeakerListVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/voice-speaker/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVoiceSpeakerListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVoiceSpeakerListVO](raw)
}
