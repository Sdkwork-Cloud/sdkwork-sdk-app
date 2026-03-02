package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type ProjectsApi struct {
    client *sdkhttp.Client
}

func NewProjectsApi(client *sdkhttp.Client) *ProjectsApi {
    return &ProjectsApi{client: client}
}

// 获取项目详情
func (a *ProjectsApi) GetProjectDetail(projectId string) (sdktypes.PlusApiResultProjectDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/projects/%s", projectId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultProjectDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectDetailVO](raw)
}

// 更新项目
func (a *ProjectsApi) UpdateProject(projectId string, body sdktypes.ProjectUpdateRequest) (sdktypes.PlusApiResultProjectVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/projects/%s", projectId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectVO](raw)
}

// 删除项目
func (a *ProjectsApi) DeleteProject(projectId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/projects/%s", projectId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消归档项目
func (a *ProjectsApi) UnarchiveProject(projectId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/projects/%s/unarchive", projectId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 移动项目
func (a *ProjectsApi) MoveProject(projectId string, body sdktypes.ProjectMoveRequest) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/projects/%s/move", projectId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 归档项目
func (a *ProjectsApi) ArchiveProject(projectId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/projects/%s/archive", projectId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取项目列表
func (a *ProjectsApi) ListProjects(query map[string]interface{}) (sdktypes.PlusApiResultPageProjectVO, error) {
    raw, err := a.client.Get(AppApiPath("/projects"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageProjectVO](raw)
}

// 创建项目
func (a *ProjectsApi) CreateProject(body sdktypes.ProjectCreateRequest) (sdktypes.PlusApiResultProjectVO, error) {
    raw, err := a.client.Post(AppApiPath("/projects"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectVO](raw)
}

// 复制项目
func (a *ProjectsApi) CopyProject(projectId string, body sdktypes.ProjectCopyRequest) (sdktypes.PlusApiResultProjectVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/projects/%s/copy", projectId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectVO](raw)
}

// 项目统计
func (a *ProjectsApi) GetProjectStatistics(projectId string) (sdktypes.PlusApiResultProjectStatisticsVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/projects/%s/statistics", projectId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultProjectStatisticsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectStatisticsVO](raw)
}

// 搜索项目
func (a *ProjectsApi) Search(query map[string]interface{}) (sdktypes.PlusApiResultPageProjectVO, error) {
    raw, err := a.client.Get(AppApiPath("/projects/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageProjectVO](raw)
}

// 最近访问项目
func (a *ProjectsApi) ListRecent(query map[string]interface{}) (sdktypes.PlusApiResultListProjectVO, error) {
    raw, err := a.client.Get(AppApiPath("/projects/recent"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListProjectVO](raw)
}
