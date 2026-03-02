package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AudioApi struct {
    client *sdkhttp.Client
}

func NewAudioApi(client *sdkhttp.Client) *AudioApi {
    return &AudioApi{client: client}
}

// 语音克隆
func (a *AudioApi) VoiceClone(body sdktypes.VoiceCloneForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/audio/voice-clone"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 文本转语音
func (a *AudioApi) TextToSpeech(body sdktypes.AudioGenerationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/audio/tts"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 语音翻译
func (a *AudioApi) Translation(body sdktypes.AudioTranslationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/audio/translation"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 语音转文本
func (a *AudioApi) Transcription(body sdktypes.AudioTranscriptionForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/audio/transcription"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 获取语音列表
func (a *AudioApi) GetVoiceList(query map[string]interface{}) (sdktypes.PlusApiResultVoiceListVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/audio/voices"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoiceListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoiceListVO](raw)
}

// 获取转录结果
func (a *AudioApi) GetTranscriptionResult(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/audio/transcription/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 获取任务列表
func (a *AudioApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/audio/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationTaskVO](raw)
}

// 获取任务状态
func (a *AudioApi) GetTaskStatus(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/audio/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 取消任务
func (a *AudioApi) CancelTask(taskId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/audio/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
