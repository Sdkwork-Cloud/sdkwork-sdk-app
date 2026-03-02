package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type VideoApi struct {
    client *sdkhttp.Client
}

func NewVideoApi(client *sdkhttp.Client) *VideoApi {
    return &VideoApi{client: client}
}

// 获取视频详情
func (a *VideoApi) GetVideo(videoId string) (sdktypes.PlusApiResultVideoDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/video/%s", videoId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVideoDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVideoDetailVO](raw)
}

// 更新视频
func (a *VideoApi) UpdateVideo(videoId string, body sdktypes.VideoUpdateForm) (sdktypes.PlusApiResultVideoVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/video/%s", videoId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVideoVO](raw)
}

// 删除视频
func (a *VideoApi) DeleteVideo(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/video/%s", videoId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上传视频
func (a *VideoApi) CreateVideo(body sdktypes.VideoCreateForm) (sdktypes.PlusApiResultVideoVO, error) {
    raw, err := a.client.Post(AppApiPath("/video"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVideoVO](raw)
}

// 发布视频
func (a *VideoApi) Publish(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/video/%s/publish", videoId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消发布
func (a *VideoApi) Unpublish(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/video/%s/publish", videoId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 点赞视频
func (a *VideoApi) Like(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/video/%s/like", videoId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消点赞
func (a *VideoApi) Unlike(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/video/%s/like", videoId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 收藏视频
func (a *VideoApi) Favorite(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/video/%s/favorite", videoId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消收藏
func (a *VideoApi) Unfavorite(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/video/%s/favorite", videoId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 记录下载
func (a *VideoApi) RecordDownload(videoId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/video/%s/download", videoId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建视频生成任务
func (a *VideoApi) CreateGeneration(body sdktypes.VideoGenerationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/video"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 视频风格转换
func (a *VideoApi) StyleTransfer(body sdktypes.VideoStyleTransferForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/video/style-transfer"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 图生视频
func (a *VideoApi) ImageTo(body sdktypes.ImageToVideoForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/video/image-to-video"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 视频延长
func (a *VideoApi) Extend(body sdktypes.VideoExtendForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/video/extend"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 获取视频统计
func (a *VideoApi) GetVideoStatistics() (sdktypes.PlusApiResultVideoStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/video/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVideoStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVideoStatisticsVO](raw)
}

// 搜索视频
func (a *VideoApi) SearchVideos(query map[string]interface{}) (sdktypes.PlusApiResultPageVideoVO, error) {
    raw, err := a.client.Get(AppApiPath("/video/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVideoVO](raw)
}

// 获取公开视频
func (a *VideoApi) GetPublicVideos(query map[string]interface{}) (sdktypes.PlusApiResultPageVideoVO, error) {
    raw, err := a.client.Get(AppApiPath("/video/public"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVideoVO](raw)
}

// 获取热门视频
func (a *VideoApi) GetPopularVideos(query map[string]interface{}) (sdktypes.PlusApiResultPageVideoVO, error) {
    raw, err := a.client.Get(AppApiPath("/video/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVideoVO](raw)
}

// 获取最受喜爱视频
func (a *VideoApi) GetMostLikedVideos(query map[string]interface{}) (sdktypes.PlusApiResultPageVideoVO, error) {
    raw, err := a.client.Get(AppApiPath("/video/liked"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVideoVO](raw)
}

// 获取收藏视频
func (a *VideoApi) GetFavoriteVideos(query map[string]interface{}) (sdktypes.PlusApiResultPageVideoVO, error) {
    raw, err := a.client.Get(AppApiPath("/video/favorites"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageVideoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageVideoVO](raw)
}

// 获取任务列表
func (a *VideoApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/video/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationTaskVO](raw)
}

// 获取任务状态
func (a *VideoApi) GetTaskStatus(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/video/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 取消任务
func (a *VideoApi) CancelTask(taskId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/video/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
