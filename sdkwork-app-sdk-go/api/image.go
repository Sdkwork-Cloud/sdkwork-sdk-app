package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ImageApi struct {
    client *sdkhttp.Client
}

func NewImageApi(client *sdkhttp.Client) *ImageApi {
    return &ImageApi{client: client}
}

// 获取图片详情
func (a *ImageApi) GetImage(imageId string) (sdktypes.PlusApiResultImageDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/image/%s", imageId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultImageDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImageDetailVO](raw)
}

// 更新图片
func (a *ImageApi) UpdateImage(imageId string, body sdktypes.ImageUpdateForm) (sdktypes.PlusApiResultImageVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/image/%s", imageId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImageVO](raw)
}

// 删除图片
func (a *ImageApi) DeleteImage(imageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/image/%s", imageId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 上传图片
func (a *ImageApi) CreateImage(body sdktypes.ImageCreateForm) (sdktypes.PlusApiResultImageVO, error) {
    raw, err := a.client.Post(AppApiPath("/image"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImageVO](raw)
}

// 点赞图片
func (a *ImageApi) Like(imageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/image/%s/like", imageId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消点赞
func (a *ImageApi) Unlike(imageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/image/%s/like", imageId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 收藏图片
func (a *ImageApi) Favorite(imageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/image/%s/favorite", imageId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消收藏
func (a *ImageApi) Unfavorite(imageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/image/%s/favorite", imageId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 记录下载
func (a *ImageApi) RecordDownload(imageId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/image/%s/download", imageId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建图片生成任务
func (a *ImageApi) CreateGeneration(body sdktypes.ImageGenerationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/image"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 生成变体
func (a *ImageApi) CreateVariation(body sdktypes.ImageVariationForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/image/variations"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 图片放大
func (a *ImageApi) Upscale(body sdktypes.ImageUpscaleForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/image/upscale"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 图片编辑
func (a *ImageApi) Edit(body sdktypes.ImageEditForm) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Post(AppApiPath("/generation/image/edits"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 获取图片统计
func (a *ImageApi) GetImageStatistics() (sdktypes.PlusApiResultImageStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/image/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultImageStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImageStatisticsVO](raw)
}

// 搜索图片
func (a *ImageApi) SearchImages(query map[string]interface{}) (sdktypes.PlusApiResultPageImageVO, error) {
    raw, err := a.client.Get(AppApiPath("/image/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageImageVO](raw)
}

// 获取公开图片
func (a *ImageApi) GetPublicImages(query map[string]interface{}) (sdktypes.PlusApiResultPageImageVO, error) {
    raw, err := a.client.Get(AppApiPath("/image/public"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageImageVO](raw)
}

// 获取热门图片
func (a *ImageApi) GetPopularImages(query map[string]interface{}) (sdktypes.PlusApiResultPageImageVO, error) {
    raw, err := a.client.Get(AppApiPath("/image/popular"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageImageVO](raw)
}

// 获取最受喜爱图片
func (a *ImageApi) GetMostLikedImages(query map[string]interface{}) (sdktypes.PlusApiResultPageImageVO, error) {
    raw, err := a.client.Get(AppApiPath("/image/liked"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageImageVO](raw)
}

// 获取收藏图片
func (a *ImageApi) GetFavoriteImages(query map[string]interface{}) (sdktypes.PlusApiResultPageImageVO, error) {
    raw, err := a.client.Get(AppApiPath("/image/favorites"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageImageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageImageVO](raw)
}

// 获取任务列表
func (a *ImageApi) ListTasks(query map[string]interface{}) (sdktypes.PlusApiResultPageGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath("/generation/image/tasks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageGenerationTaskVO](raw)
}

// 获取任务状态
func (a *ImageApi) GetTaskStatus(taskId string) (sdktypes.PlusApiResultGenerationTaskVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/generation/image/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultGenerationTaskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultGenerationTaskVO](raw)
}

// 取消任务
func (a *ImageApi) CancelTask(taskId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/generation/image/tasks/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
