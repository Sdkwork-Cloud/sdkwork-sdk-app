package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type DriveApi struct {
    client *sdkhttp.Client
}

func NewDriveApi(client *sdkhttp.Client) *DriveApi {
    return &DriveApi{client: client}
}

// Restore drive item
func (a *DriveApi) RestoreItem(itemId string) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/drive/items/%s/restore", itemId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// Rename drive item
func (a *DriveApi) RenameItem(itemId string, body sdktypes.DriveRenameForm) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/drive/items/%s/rename", itemId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// Move drive item
func (a *DriveApi) MoveItem(itemId string, body sdktypes.DriveMoveForm) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/drive/items/%s/move", itemId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// Get drive file content
func (a *DriveApi) GetItemContent(itemId string) (sdktypes.PlusApiResultDriveContentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/drive/items/%s/content", itemId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDriveContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveContentVO](raw)
}

// Update drive file content
func (a *DriveApi) UpdateItemContent(itemId string, body sdktypes.DriveContentUpdateForm) (sdktypes.PlusApiResultDriveContentVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/drive/items/%s/content", itemId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveContentVO](raw)
}

// Archive drive item
func (a *DriveApi) ArchiveItem(itemId string) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/drive/items/%s/archive", itemId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// Favorite drive item
func (a *DriveApi) FavoriteItem(itemId string) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/drive/items/%s/favorite", itemId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// Unfavorite drive item
func (a *DriveApi) UnfavoriteItem(itemId string) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/drive/items/%s/favorite", itemId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// Copy drive item
func (a *DriveApi) CopyItem(itemId string, body sdktypes.DriveCopyForm) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/drive/items/%s/copy", itemId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// Batch delete drive items
func (a *DriveApi) BatchDeleteItems(body sdktypes.DriveBatchDeleteForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/drive/items/batch-delete"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Create drive folder
func (a *DriveApi) CreateFolder(body sdktypes.DriveFolderCreateForm) (sdktypes.PlusApiResultDriveItemVO, error) {
    raw, err := a.client.Post(AppApiPath("/drive/folders"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemVO](raw)
}

// List drive items
func (a *DriveApi) ListItems(query map[string]interface{}) (sdktypes.PlusApiResultPageDriveItemVO, error) {
    raw, err := a.client.Get(AppApiPath("/drive/items"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageDriveItemVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageDriveItemVO](raw)
}

// Get drive item detail
func (a *DriveApi) GetItemDetail(itemId string) (sdktypes.PlusApiResultDriveItemDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/drive/items/%s", itemId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultDriveItemDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDriveItemDetailVO](raw)
}

// Delete drive item
func (a *DriveApi) DeleteItem(itemId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/drive/items/%s", itemId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
