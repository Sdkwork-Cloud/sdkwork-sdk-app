package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type NewsApi struct {
    client *sdkhttp.Client
}

func NewNewsApi(client *sdkhttp.Client) *NewsApi {
    return &NewsApi{client: client}
}

// 获取新闻详情
func (a *NewsApi) GetNews(newsId string) (sdktypes.PlusApiResultNewsDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/news/%s", newsId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNewsDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNewsDetailVO](raw)
}

// 更新新闻
func (a *NewsApi) UpdateNews(newsId string, body sdktypes.NewsUpdateForm) (sdktypes.PlusApiResultNewsVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/news/%s", newsId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNewsVO](raw)
}

// 删除新闻
func (a *NewsApi) DeleteNews(newsId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/news/%s", newsId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建新闻
func (a *NewsApi) CreateNews(body sdktypes.NewsCreateForm) (sdktypes.PlusApiResultNewsVO, error) {
    raw, err := a.client.Post(AppApiPath("/news"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNewsVO](raw)
}

// 搜索新闻
func (a *NewsApi) Search(query map[string]interface{}) (sdktypes.PlusApiResultPageNewsVO, error) {
    raw, err := a.client.Get(AppApiPath("/news/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNewsVO](raw)
}

// 获取我的新闻
func (a *NewsApi) GetMy(query map[string]interface{}) (sdktypes.PlusApiResultPageNewsVO, error) {
    raw, err := a.client.Get(AppApiPath("/news/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNewsVO](raw)
}

// 获取最新新闻
func (a *NewsApi) GetLatest(query map[string]interface{}) (sdktypes.PlusApiResultPageNewsVO, error) {
    raw, err := a.client.Get(AppApiPath("/news/latest"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNewsVO](raw)
}

// 获取分类新闻
func (a *NewsApi) GetCategory(categoryId string, query map[string]interface{}) (sdktypes.PlusApiResultPageNewsVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/news/category/%s", categoryId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNewsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNewsVO](raw)
}
