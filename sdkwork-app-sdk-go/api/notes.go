package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type NotesApi struct {
    client *sdkhttp.Client
}

func NewNotesApi(client *sdkhttp.Client) *NotesApi {
    return &NotesApi{client: client}
}

// 获取笔记详情
func (a *NotesApi) GetNoteDetail(noteId string) (sdktypes.PlusApiResultNoteVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/notes/%s", noteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteVO](raw)
}

// 更新笔记
func (a *NotesApi) UpdateNote(noteId string, body sdktypes.NoteUpdateRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/%s", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 删除笔记
func (a *NotesApi) DeleteNote(noteId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notes/%s", noteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 恢复笔记
func (a *NotesApi) RestoreNote(noteId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/%s/restore", noteId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 移动笔记
func (a *NotesApi) MoveNote(noteId string, body sdktypes.NoteMoveRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/%s/move", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 获取笔记正文
func (a *NotesApi) GetNoteContent(noteId string) (sdktypes.PlusApiResultNoteContentVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/notes/%s/content", noteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteContentVO](raw)
}

// 更新笔记正文
func (a *NotesApi) UpdateNoteContent(noteId string, body sdktypes.NoteContentUpdateRequest) (sdktypes.PlusApiResultNoteContentVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/%s/content", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteContentVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteContentVO](raw)
}

// 归档笔记
func (a *NotesApi) ArchiveNote(noteId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/%s/archive", noteId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 重命名文件夹
func (a *NotesApi) UpdateFolder(folderId string, body sdktypes.NoteFolderUpdateRequest) (sdktypes.PlusApiResultNoteFolderVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/folders/%s", folderId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteFolderVO](raw)
}

// 删除文件夹
func (a *NotesApi) DeleteFolder(folderId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notes/folders/%s", folderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 获取笔记列表
func (a *NotesApi) ListNotes(query map[string]interface{}) (sdktypes.PlusApiResultPageNoteVO, error) {
    raw, err := a.client.Get(AppApiPath("/notes"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNoteVO](raw)
}

// 创建笔记
func (a *NotesApi) CreateNote(body sdktypes.NoteCreateRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Post(AppApiPath("/notes"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 收藏笔记
func (a *NotesApi) FavoriteNote(noteId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notes/%s/favorite", noteId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 取消收藏
func (a *NotesApi) UnfavoriteNote(noteId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notes/%s/favorite", noteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 复制笔记
func (a *NotesApi) CopyNote(noteId string, body sdktypes.NoteCopyRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notes/%s/copy", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 批量更新笔记正文
func (a *NotesApi) BatchUpdateNote(noteId string, body sdktypes.NoteBatchUpdateRequest) (sdktypes.PlusApiResultNoteBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notes/%s/batch-update", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteBatchUpdateResultVO](raw)
}

// 批量更新笔记正文
func (a *NotesApi) CreateBatchUpdateNote(noteId string, body sdktypes.NoteBatchUpdateRequest) (sdktypes.PlusApiResultNoteBatchUpdateResultVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notes/%s:batchUpdate", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteBatchUpdateResultVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteBatchUpdateResultVO](raw)
}

// 获取文件夹树
func (a *NotesApi) ListFolders() (sdktypes.PlusApiResultListNoteFolderVO, error) {
    raw, err := a.client.Get(AppApiPath("/notes/folders"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListNoteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListNoteFolderVO](raw)
}

// 创建文件夹
func (a *NotesApi) CreateFolder(body sdktypes.NoteFolderCreateRequest) (sdktypes.PlusApiResultNoteFolderVO, error) {
    raw, err := a.client.Post(AppApiPath("/notes/folders"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteFolderVO](raw)
}

// 获取笔记统计
func (a *NotesApi) GetNoteStatistics() (sdktypes.PlusApiResultNoteStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/notes/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteStatisticsVO](raw)
}

// 批量删除笔记
func (a *NotesApi) BatchDelete() (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath("/notes/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 批量删除笔记
func (a *NotesApi) DeleteBatch() (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath("/notes/batch-delete"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}
