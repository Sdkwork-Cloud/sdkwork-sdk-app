package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CharacterApi struct {
    client *sdkhttp.Client
}

func NewCharacterApi(client *sdkhttp.Client) *CharacterApi {
    return &CharacterApi{client: client}
}

// 获取角色详情
func (a *CharacterApi) GetCharacter(characterId string) (sdktypes.PlusApiResultCharacterDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/character/%s", characterId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCharacterDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCharacterDetailVO](raw)
}

// 更新角色
func (a *CharacterApi) UpdateCharacter(characterId string, body sdktypes.CharacterUpdateForm) (sdktypes.PlusApiResultCharacterVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/character/%s", characterId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCharacterVO](raw)
}

// 删除角色
func (a *CharacterApi) DeleteCharacter(characterId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/character/%s", characterId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建角色生成任务
func (a *CharacterApi) CreateGeneration(body sdktypes.CharacterGenerationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/character"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 批量创建角色生成任务
func (a *CharacterApi) BatchCreateGeneration(body sdktypes.CharacterBatchGenerationForm) (sdktypes.PlusApiResultListGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/character/batch"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListGenerationTaskVO](raw)
}

// 创建角色
func (a *CharacterApi) CreateCharacter(body sdktypes.CharacterCreateForm) (sdktypes.PlusApiResultCharacterVO, error) {
    raw, err := a.client.Post(AppApiPath("/character"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCharacterVO](raw)
}

// 使用角色
func (a *CharacterApi) Use(characterId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/character/%s/use", characterId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 点赞角色
func (a *CharacterApi) Like(characterId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/character/%s/like", characterId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消点赞
func (a *CharacterApi) Unlike(characterId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/character/%s/like", characterId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取角色详情
func (a *CharacterApi) GetCharacterDetail(characterId string) (sdktypes.PlusApiResultCharacterGenerationVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/character/%s", characterId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCharacterGenerationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCharacterGenerationVO](raw)
}

// 获取任务列表
func (a *CharacterApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/character/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationTaskVO](raw)
}

// 获取任务状态
func (a *CharacterApi) GetTaskStatus(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/character/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 取消任务
func (a *CharacterApi) CancelTask(taskId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/character/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取角色列表
func (a *CharacterApi) ListCharacters(query map[string]interface{}) (sdktypes.PlusApiResultPageCharacterListVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/character/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCharacterListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCharacterListVO](raw)
}

// 搜索角色
func (a *CharacterApi) SearchCharacters(query map[string]interface{}) (sdktypes.PlusApiResultPageCharacterVO, error) {
    raw, err := a.client.Get(AppApiPath("/character/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCharacterVO](raw)
}

// 获取热门角色
func (a *CharacterApi) GetPopularCharacters(query map[string]interface{}) (sdktypes.PlusApiResultPageCharacterVO, error) {
    raw, err := a.client.Get(AppApiPath("/character/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCharacterVO](raw)
}

// 获取我的角色
func (a *CharacterApi) GetMyCharacters(query map[string]interface{}) (sdktypes.PlusApiResultPageCharacterVO, error) {
    raw, err := a.client.Get(AppApiPath("/character/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCharacterVO](raw)
}

// 获取最受喜爱角色
func (a *CharacterApi) GetMostLikedCharacters(query map[string]interface{}) (sdktypes.PlusApiResultPageCharacterVO, error) {
    raw, err := a.client.Get(AppApiPath("/character/liked"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCharacterVO](raw)
}

// 获取智能体关联角色
func (a *CharacterApi) GetCharacterByAgent(agentId string) (sdktypes.PlusApiResultCharacterVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/character/agent/%s", agentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCharacterVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCharacterVO](raw)
}
