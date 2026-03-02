package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type MusicApi struct {
    client *sdkhttp.Client
}

func NewMusicApi(client *sdkhttp.Client) *MusicApi {
    return &MusicApi{client: client}
}

// 获取音乐详情
func (a *MusicApi) GetMusic(musicId string) (sdktypes.PlusApiResultMusicDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/music/%s", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMusicDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMusicDetailVO](raw)
}

// 更新音乐
func (a *MusicApi) UpdateMusic(musicId string, body sdktypes.MusicUpdateForm) (sdktypes.PlusApiResultMusicVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/music/%s", musicId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMusicVO](raw)
}

// 删除音乐
func (a *MusicApi) DeleteMusic(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/music/%s", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上传音乐
func (a *MusicApi) CreateMusic(body sdktypes.MusicCreateForm) (sdktypes.PlusApiResultMusicVO, error) {
    raw, err := a.client.Post(AppApiPath("/music"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMusicVO](raw)
}

// 发布音乐
func (a *MusicApi) Publish(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/music/%s/publish", musicId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消发布
func (a *MusicApi) Unpublish(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/music/%s/publish", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 点赞音乐
func (a *MusicApi) Like(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/music/%s/like", musicId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消点赞
func (a *MusicApi) Unlike(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/music/%s/like", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 收藏音乐
func (a *MusicApi) Favorite(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/music/%s/favorite", musicId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消收藏
func (a *MusicApi) Unfavorite(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/music/%s/favorite", musicId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 记录下载
func (a *MusicApi) RecordDownload(musicId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/music/%s/download", musicId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建音乐生成任务
func (a *MusicApi) CreateGeneration(body sdktypes.MusicGenerationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/music"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 相似音乐生成
func (a *MusicApi) GenerateSimilar(body sdktypes.MusicSimilarForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/music/similar"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 音乐混音
func (a *MusicApi) Remix(body sdktypes.MusicRemixForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/music/remix"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 音乐续写
func (a *MusicApi) Extend(body sdktypes.MusicExtendForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/music/extend"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 获取音乐统计
func (a *MusicApi) GetMusicStatistics() (sdktypes.PlusApiResultMusicStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/music/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMusicStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMusicStatisticsVO](raw)
}

// 搜索音乐
func (a *MusicApi) Search(query map[string]interface{}) (sdktypes.PlusApiResultPageMusicVO, error) {
    raw, err := a.client.Get(AppApiPath("/music/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMusicVO](raw)
}

// 获取公开音乐
func (a *MusicApi) GetPublic(query map[string]interface{}) (sdktypes.PlusApiResultPageMusicVO, error) {
    raw, err := a.client.Get(AppApiPath("/music/public"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMusicVO](raw)
}

// 获取热门音乐
func (a *MusicApi) GetPopular(query map[string]interface{}) (sdktypes.PlusApiResultPageMusicVO, error) {
    raw, err := a.client.Get(AppApiPath("/music/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMusicVO](raw)
}

// 获取最受喜爱音乐
func (a *MusicApi) GetMostLiked(query map[string]interface{}) (sdktypes.PlusApiResultPageMusicVO, error) {
    raw, err := a.client.Get(AppApiPath("/music/liked"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMusicVO](raw)
}

// 获取收藏音乐
func (a *MusicApi) GetFavorite(query map[string]interface{}) (sdktypes.PlusApiResultPageMusicVO, error) {
    raw, err := a.client.Get(AppApiPath("/music/favorites"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageMusicVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageMusicVO](raw)
}

// 获取任务列表
func (a *MusicApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/music/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationTaskVO](raw)
}

// 获取任务状态
func (a *MusicApi) GetTaskStatus(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/music/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 取消任务
func (a *MusicApi) CancelTask(taskId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/music/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取音乐风格列表
func (a *MusicApi) GetMusicStyles(query map[string]interface{}) (sdktypes.PlusApiResultMusicStylesVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/music/styles"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMusicStylesVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMusicStylesVO](raw)
}
