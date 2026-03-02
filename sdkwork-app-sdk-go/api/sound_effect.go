package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SoundEffectApi struct {
    client *sdkhttp.Client
}

func NewSoundEffectApi(client *sdkhttp.Client) *SoundEffectApi {
    return &SoundEffectApi{client: client}
}

// 创建音效生成任务
func (a *SoundEffectApi) CreateGeneration(body sdktypes.SoundEffectGenerationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/sound-effect"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 获取音效详情
func (a *SoundEffectApi) GetEffectDetail(effectId string) (sdktypes.PlusApiResultSoundEffectGenerationVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/sound-effect/%s", effectId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSoundEffectGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSoundEffectGenerationVO](raw)
}

// 获取任务列表
func (a *SoundEffectApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/sound-effect/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationTaskVO](raw)
}

// 获取任务状态
func (a *SoundEffectApi) GetTaskStatus(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/sound-effect/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 取消任务
func (a *SoundEffectApi) CancelTask(taskId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/sound-effect/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取音效类别
func (a *SoundEffectApi) GetCategories(query map[string]interface{}) (sdktypes.PlusApiResultSoundEffectCategoriesVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/sound-effect/categories"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSoundEffectCategoriesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSoundEffectCategoriesVO](raw)
}
