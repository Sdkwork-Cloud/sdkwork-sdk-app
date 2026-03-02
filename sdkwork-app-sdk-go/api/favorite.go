package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type FavoriteApi struct {
    client *sdkhttp.Client
}

func NewFavoriteApi(client *sdkhttp.Client) *FavoriteApi {
    return &FavoriteApi{client: client}
}

// 移动收藏
func (a *FavoriteApi) MoveFavoriteToFolder(favoriteId string, body sdktypes.FavoriteMoveForm) (sdktypes.PlusApiResultFavoriteVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/favorite/%s/move", favoriteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFavoriteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFavoriteVO](raw)
}

// 更新收藏夹
func (a *FavoriteApi) UpdateFavoriteFolder(folderId string, body sdktypes.FavoriteFolderUpdateForm) (sdktypes.PlusApiResultFavoriteFolderVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/favorite/folders/%s", folderId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFavoriteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFavoriteFolderVO](raw)
}

// 删除收藏夹
func (a *FavoriteApi) DeleteFavoriteFolder(folderId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/favorite/folders/%s", folderId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量移动收藏
func (a *FavoriteApi) BatchMoveFavorites(body sdktypes.FavoriteBatchMoveForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/favorite/batch/move"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 收藏列表
func (a *FavoriteApi) ListFavorites(query map[string]interface{}) (sdktypes.PlusApiResultPageFavoriteItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/favorite"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageFavoriteItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageFavoriteItemVO](raw)
}

// 添加收藏
func (a *FavoriteApi) Add(body sdktypes.FavoriteAddForm) (sdktypes.PlusApiResultFavoriteVO, error) {
    raw, err := a.client.Post(AppApiPath("/favorite"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFavoriteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFavoriteVO](raw)
}

// 收藏夹列表
func (a *FavoriteApi) ListFavoriteFolders() (sdktypes.PlusApiResultListFavoriteFolderVO, error) {
    raw, err := a.client.Get(AppApiPath("/favorite/folders"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFavoriteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFavoriteFolderVO](raw)
}

// 创建收藏夹
func (a *FavoriteApi) CreateFavoriteFolder(body sdktypes.FavoriteFolderCreateForm) (sdktypes.PlusApiResultFavoriteFolderVO, error) {
    raw, err := a.client.Post(AppApiPath("/favorite/folders"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFavoriteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFavoriteFolderVO](raw)
}

// 批量检查收藏
func (a *FavoriteApi) BatchCheckFavorites(body sdktypes.FavoriteBatchCheckForm) (sdktypes.PlusApiResultListFavoriteCheckVO, error) {
    raw, err := a.client.Post(AppApiPath("/favorite/batch-check"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListFavoriteCheckVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFavoriteCheckVO](raw)
}

// 收藏详情
func (a *FavoriteApi) GetFavoriteDetail(favoriteId string) (sdktypes.PlusApiResultFavoriteDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/favorite/%s", favoriteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFavoriteDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFavoriteDetailVO](raw)
}

// 取消收藏
func (a *FavoriteApi) Remove(favoriteId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/favorite/%s", favoriteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 收藏统计
func (a *FavoriteApi) GetFavoriteStatistics() (sdktypes.PlusApiResultFavoriteStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/favorite/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFavoriteStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFavoriteStatisticsVO](raw)
}

// 最近收藏
func (a *FavoriteApi) GetRecentFavorites(query map[string]interface{}) (sdktypes.PlusApiResultListFavoriteItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/favorite/recent"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFavoriteItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFavoriteItemVO](raw)
}

// 各类型收藏数
func (a *FavoriteApi) GetFavoriteCountByType() (sdktypes.PlusApiResultListFavoriteTypeCountVO, error) {
    raw, err := a.client.Get(AppApiPath("/favorite/count/by-type"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFavoriteTypeCountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFavoriteTypeCountVO](raw)
}

// 检查收藏状态
func (a *FavoriteApi) Check(query map[string]interface{}) (sdktypes.PlusApiResultFavoriteCheckVO, error) {
    raw, err := a.client.Get(AppApiPath("/favorite/check"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFavoriteCheckVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFavoriteCheckVO](raw)
}

// 按目标取消收藏
func (a *FavoriteApi) RemoveFavoriteByTarget(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/favorite/by-target"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量取消收藏
func (a *FavoriteApi) BatchRemoveFavorites() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/favorite/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
