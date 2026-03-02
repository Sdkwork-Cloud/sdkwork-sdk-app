package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AppApi struct {
    client *sdkhttp.Client
}

func NewAppApi(client *sdkhttp.Client) *AppApi {
    return &AppApi{client: client}
}

// 获取笔记详情
func (a *AppApi) GetNoteDetail(noteId string) (sdktypes.PlusApiResultNoteVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/notes/%s", noteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteVO](raw)
}

// 更新笔记
func (a *AppApi) UpdateNote(noteId string, body sdktypes.NoteUpdateRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/%s", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 删除笔记
func (a *AppApi) DeleteNote(noteId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notes/%s", noteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 移动笔记
func (a *AppApi) MoveNote(noteId string, body sdktypes.NoteMoveRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/%s/move", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 更新文件夹
func (a *AppApi) UpdateFolder(folderId string, body sdktypes.NoteFolderUpdateRequest) (sdktypes.PlusApiResultNoteFolderVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notes/folders/%s", folderId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteFolderVO](raw)
}

// 删除文件夹
func (a *AppApi) DeleteFolder(folderId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notes/folders/%s", folderId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 获取应用详情
func (a *AppApi) GetApp(appId string) (sdktypes.PlusApiResultAppDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/app/manage/%s", appId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppDetailVO](raw)
}

// 更新应用
func (a *AppApi) UpdateApp(appId string, body sdktypes.AppUpdateForm) (sdktypes.PlusApiResultAppVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/app/manage/%s", appId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppVO](raw)
}

// 删除应用
func (a *AppApi) DeleteApp(appId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/app/manage/%s", appId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取笔记列表
func (a *AppApi) ListNotes(query map[string]interface{}) (sdktypes.PlusApiResultPageNoteVO, error) {
    raw, err := a.client.Get(AppApiPath("/notes"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNoteVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNoteVO](raw)
}

// 创建笔记
func (a *AppApi) CreateNote(body sdktypes.NoteCreateRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Post(AppApiPath("/notes"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 收藏笔记
func (a *AppApi) FavoriteNote(noteId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notes/%s/favorite", noteId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 取消收藏笔记
func (a *AppApi) UnfavoriteNote(noteId string) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notes/%s/favorite", noteId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 复制笔记
func (a *AppApi) CopyNote(noteId string, body sdktypes.NoteCopyRequest) (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notes/%s/copy", noteId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}

// 获取文件夹列表
func (a *AppApi) ListFolders() (sdktypes.PlusApiResultListNoteFolderVO, error) {
    raw, err := a.client.Get(AppApiPath("/notes/folders"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListNoteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListNoteFolderVO](raw)
}

// 创建文件夹
func (a *AppApi) CreateFolder(body sdktypes.NoteFolderCreateRequest) (sdktypes.PlusApiResultNoteFolderVO, error) {
    raw, err := a.client.Post(AppApiPath("/notes/folders"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNoteFolderVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteFolderVO](raw)
}

// 创建应用
func (a *AppApi) CreateApp(body sdktypes.AppCreateForm) (sdktypes.PlusApiResultAppVO, error) {
    raw, err := a.client.Post(AppApiPath("/app/manage"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppVO](raw)
}

// 停用应用
func (a *AppApi) Deactivate(appId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/app/manage/%s/deactivate", appId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 激活应用
func (a *AppApi) Activate(appId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/app/manage/%s/activate", appId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取笔记统计
func (a *AppApi) GetNoteStatistics() (sdktypes.PlusApiResultNoteStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/notes/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteStatisticsVO](raw)
}

// 获取应用统计
func (a *AppApi) GetAppStatistics() (sdktypes.PlusApiResultAppStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath("/app/manage/statistics"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAppStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAppStatisticsVO](raw)
}

// 搜索应用
func (a *AppApi) SearchApps(query map[string]interface{}) (sdktypes.PlusApiResultPageAppVO, error) {
    raw, err := a.client.Get(AppApiPath("/app/manage/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAppVO](raw)
}

// 获取项目应用
func (a *AppApi) GetProjectApps(projectId string, query map[string]interface{}) (sdktypes.PlusApiResultPageAppVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/app/manage/project/%s", projectId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAppVO](raw)
}

// 获取我的应用
func (a *AppApi) GetMyApps(query map[string]interface{}) (sdktypes.PlusApiResultPageAppVO, error) {
    raw, err := a.client.Get(AppApiPath("/app/manage/my"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAppVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAppVO](raw)
}

// 获取账户余额汇总
func (a *AppApi) GetAccountSummary() (sdktypes.PlusApiResultAccountSummaryVO, error) {
    raw, err := a.client.Get(AppApiPath("/account/summary"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAccountSummaryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAccountSummaryVO](raw)
}

// 批量删除笔记
func (a *AppApi) BatchDeleteNotes() (sdktypes.PlusApiResultNoteOperationVO, error) {
    raw, err := a.client.Delete(AppApiPath("/notes/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNoteOperationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNoteOperationVO](raw)
}
