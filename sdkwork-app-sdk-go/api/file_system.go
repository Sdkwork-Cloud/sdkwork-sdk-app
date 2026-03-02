package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type FileSystemApi struct {
    client *sdkhttp.Client
}

func NewFileSystemApi(client *sdkhttp.Client) *FileSystemApi {
    return &FileSystemApi{client: client}
}

// Rename node
func (a *FileSystemApi) RenameNode(nodeId string, body sdktypes.FileSystemRenameForm) (sdktypes.PlusApiResultFileSystemNodeVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/filesystem/nodes/%s/rename", nodeId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemNodeVO](raw)
}

// Move node
func (a *FileSystemApi) MoveNode(nodeId string, body sdktypes.FileSystemMoveForm) (sdktypes.PlusApiResultFileSystemNodeVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/filesystem/nodes/%s/move", nodeId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemNodeVO](raw)
}

// Get file content
func (a *FileSystemApi) GetFileContent(fileId string) (sdktypes.PlusApiResultFileSystemContentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/filesystem/files/%s/content", fileId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemContentVO](raw)
}

// Update file content
func (a *FileSystemApi) UpdateFileContent(fileId string, body sdktypes.FileSystemContentUpdateForm) (sdktypes.PlusApiResultFileSystemContentVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/filesystem/files/%s/content", fileId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemContentVO](raw)
}

// Copy node
func (a *FileSystemApi) CopyNode(nodeId string, body sdktypes.FileSystemCopyForm) (sdktypes.PlusApiResultFileSystemNodeVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/filesystem/nodes/%s/copy", nodeId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemNodeVO](raw)
}

// Create folder
func (a *FileSystemApi) CreateFolder(body sdktypes.FileSystemFolderCreateForm) (sdktypes.PlusApiResultFileSystemNodeVO, error) {
    raw, err := a.client.Post(AppApiPath("/filesystem/folders"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemNodeVO](raw)
}

// Create file
func (a *FileSystemApi) CreateFile(body sdktypes.FileSystemFileCreateForm) (sdktypes.PlusApiResultFileSystemNodeVO, error) {
    raw, err := a.client.Post(AppApiPath("/filesystem/files"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemNodeVO](raw)
}

// List nodes
func (a *FileSystemApi) ListNodes(query map[string]interface{}) (sdktypes.PlusApiResultPageFileSystemNodeVO, error) {
    raw, err := a.client.Get(AppApiPath("/filesystem/nodes"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageFileSystemNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageFileSystemNodeVO](raw)
}

// Get node detail
func (a *FileSystemApi) GetNodeDetail(nodeId string) (sdktypes.PlusApiResultFileSystemNodeVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/filesystem/nodes/%s", nodeId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemNodeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemNodeVO](raw)
}

// Delete node
func (a *FileSystemApi) DeleteNode(nodeId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/filesystem/nodes/%s", nodeId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// List disks
func (a *FileSystemApi) ListDisks() (sdktypes.PlusApiResultListFileSystemDiskVO, error) {
    raw, err := a.client.Get(AppApiPath("/filesystem/disks"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFileSystemDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFileSystemDiskVO](raw)
}

// Get primary disk
func (a *FileSystemApi) GetPrimaryDisk() (sdktypes.PlusApiResultFileSystemDiskVO, error) {
    raw, err := a.client.Get(AppApiPath("/filesystem/disks/default"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFileSystemDiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFileSystemDiskVO](raw)
}
