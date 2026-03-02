package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CollectionApi struct {
    client *sdkhttp.Client
}

func NewCollectionApi(client *sdkhttp.Client) *CollectionApi {
    return &CollectionApi{client: client}
}

// 获取合集详情
func (a *CollectionApi) GetCollection(collectionId string) (sdktypes.PlusApiResultCollectionDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/collection/%s", collectionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCollectionDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCollectionDetailVO](raw)
}

// 更新合集
func (a *CollectionApi) UpdateCollection(collectionId string, body sdktypes.CollectionUpdateForm) (sdktypes.PlusApiResultCollectionVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/collection/%s", collectionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCollectionVO](raw)
}

// 删除合集
func (a *CollectionApi) DeleteCollection(collectionId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/collection/%s", collectionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 更新内容排序
func (a *CollectionApi) UpdateItemPositions(collectionId string, body sdktypes.CollectionItemPositionForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/collection/%s/items/positions", collectionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 创建合集
func (a *CollectionApi) CreateCollection(body sdktypes.CollectionCreateForm) (sdktypes.PlusApiResultCollectionVO, error) {
    raw, err := a.client.Post(AppApiPath("/collection"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCollectionVO](raw)
}

// 获取合集内容列表
func (a *CollectionApi) GetCollectionItems(collectionId string, query map[string]interface{}) (sdktypes.PlusApiResultListCollectionItemVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/collection/%s/items", collectionId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCollectionItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCollectionItemVO](raw)
}

// 添加内容到合集
func (a *CollectionApi) AddItem(collectionId string, body sdktypes.CollectionItemAddForm) (sdktypes.PlusApiResultCollectionItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/collection/%s/items", collectionId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCollectionItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCollectionItemVO](raw)
}

// 置顶内容
func (a *CollectionApi) PinItem(collectionId string, itemId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/collection/%s/items/%s/pin", collectionId, itemId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消置顶
func (a *CollectionApi) UnpinItem(collectionId string, itemId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/collection/%s/items/%s/pin", collectionId, itemId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取合集路径
func (a *CollectionApi) GetCollectionPath(collectionId string) (sdktypes.PlusApiResultListCollectionVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/collection/%s/path", collectionId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCollectionVO](raw)
}

// 获取合集树
func (a *CollectionApi) GetCollectionTree(query map[string]interface{}) (sdktypes.PlusApiResultListCollectionTreeVO, error) {
    raw, err := a.client.Get(AppApiPath("/collection/tree"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCollectionTreeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCollectionTreeVO](raw)
}

// 搜索合集
func (a *CollectionApi) SearchCollections(query map[string]interface{}) (sdktypes.PlusApiResultPageCollectionVO, error) {
    raw, err := a.client.Get(AppApiPath("/collection/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCollectionVO](raw)
}

// 获取我的合集
func (a *CollectionApi) GetMyCollections(query map[string]interface{}) (sdktypes.PlusApiResultPageCollectionVO, error) {
    raw, err := a.client.Get(AppApiPath("/collection/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageCollectionVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageCollectionVO](raw)
}

// 从合集移除内容
func (a *CollectionApi) RemoveItem(collectionId string, contentId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/collection/%s/items/%s", collectionId, contentId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
