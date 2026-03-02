package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AssetsApi struct {
    client *sdkhttp.Client
}

func NewAssetsApi(client *sdkhttp.Client) *AssetsApi {
    return &AssetsApi{client: client}
}

// 重命名资产
func (a *AssetsApi) RenameAsset(assetId string, body sdktypes.AssetRenameForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/assets/%s/rename", assetId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 移动资产
func (a *AssetsApi) MoveAsset(assetId string, body sdktypes.AssetMoveForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/assets/%s/move", assetId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 收藏资产
func (a *AssetsApi) FavoriteAsset(assetId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/assets/%s/favorite", assetId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消收藏
func (a *AssetsApi) UnfavoriteAsset(assetId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/assets/%s/favorite", assetId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取文件夹列表
func (a *AssetsApi) ListFolders() (sdktypes.PlusApiResultListFolderVO, error) {
    raw, err := a.client.Get(AppApiPath("/assets/folders"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFolderVO](raw)
}

// 创建文件夹
func (a *AssetsApi) CreateFolder(body sdktypes.FolderCreateForm) (sdktypes.PlusApiResultFolderVO, error) {
    raw, err := a.client.Post(AppApiPath("/assets/folders"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFolderVO](raw)
}

// 获取资产列表
func (a *AssetsApi) ListAssets(query map[string]interface{}) (sdktypes.PlusApiResultPageAssetVO, error) {
    raw, err := a.client.Get(AppApiPath("/assets"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAssetVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAssetVO](raw)
}

// 获取资产详情
func (a *AssetsApi) GetAssetDetail(assetId string) (sdktypes.PlusApiResultAssetDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/assets/%s", assetId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAssetDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAssetDetailVO](raw)
}

// 删除资产
func (a *AssetsApi) DeleteAsset(assetId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/assets/%s", assetId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 下载资产
func (a *AssetsApi) GetDownloadUrl(assetId string, query map[string]interface{}) (sdktypes.PlusApiResultDownloadUrlVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/assets/%s/download", assetId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDownloadUrlVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDownloadUrlVO](raw)
}

// 获取资产统计
func (a *AssetsApi) GetStatistics() (sdktypes.PlusApiResultAssetStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/assets/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAssetStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAssetStatisticsVO](raw)
}

// 删除文件夹
func (a *AssetsApi) DeleteFolder(folderId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/assets/folders/%s", folderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量删除资产
func (a *AssetsApi) BatchDelete() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/assets/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
