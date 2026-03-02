package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type FeedApi struct {
    client *sdkhttp.Client
}

func NewFeedApi(client *sdkhttp.Client) *FeedApi {
    return &FeedApi{client: client}
}

// 取消点赞Feed
func (a *FeedApi) Unlike(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/unlike/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// 取消收藏Feed
func (a *FeedApi) Uncollect(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/uncollect/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// 分享Feed
func (a *FeedApi) Share(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/share/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// 点赞Feed
func (a *FeedApi) Like(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/like/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// 收藏Feed
func (a *FeedApi) Collect(id string, query map[string]interface{}) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/collect/%s", id)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// 获取置顶Feed
func (a *FeedApi) GetTopFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/top"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// 搜索Feed
func (a *FeedApi) SearchFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// 获取推荐Feed
func (a *FeedApi) GetRecommendedFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/recommend"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// 获取最多浏览Feed
func (a *FeedApi) GetMostViewedFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/most-viewed"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// 获取最多点赞Feed
func (a *FeedApi) GetMostLikedFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/most-liked"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// 获取Feed列表
func (a *FeedApi) GetFeedList(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// 获取热门Feed
func (a *FeedApi) GetHotFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/hot"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// 获取Feed详情
func (a *FeedApi) GetFeedDetail(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feeds/detail/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// 检查收藏状态
func (a *FeedApi) CheckCollected(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feeds/check-collected/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// 获取分类Feed
func (a *FeedApi) GetFeedsByCategory(categoryId string, query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feeds/category/%s", categoryId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}
