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

// Create feed
func (a *FeedApi) Create(body sdktypes.FeedCreateForm) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath("/feeds"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// Unlike feed
func (a *FeedApi) Unlike(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/unlike/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// Uncollect feed
func (a *FeedApi) Uncollect(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/uncollect/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// Share feed
func (a *FeedApi) Share(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/share/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// Like feed
func (a *FeedApi) Like(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/like/%s", id)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// Collect feed
func (a *FeedApi) Collect(id string, query map[string]interface{}) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feeds/collect/%s", id)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// Get top feeds
func (a *FeedApi) GetTopFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/top"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Search feeds
func (a *FeedApi) SearchFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Get recommended feeds
func (a *FeedApi) GetRecommendedFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/recommend"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Get most viewed feeds
func (a *FeedApi) GetMostViewedFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/most-viewed"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Get most liked feeds
func (a *FeedApi) GetMostLikedFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/most-liked"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Get feed list
func (a *FeedApi) GetFeedList(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/list"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Get hot feeds
func (a *FeedApi) GetHotFeeds(query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/feeds/hot"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Get feed detail
func (a *FeedApi) GetFeedDetail(id string) (sdktypes.PlusApiResultFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feeds/detail/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedItemVO](raw)
}

// Check collected status
func (a *FeedApi) CheckCollected(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feeds/check-collected/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// Get feeds by category
func (a *FeedApi) GetFeedsByCategory(categoryId string, query map[string]interface{}) (sdktypes.PlusApiResultListFeedItemVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feeds/category/%s", categoryId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFeedItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFeedItemVO](raw)
}

// Delete feed
func (a *FeedApi) Delete(id string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/feeds/%s", id)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}
