package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type WorkspacesApi struct {
    client *sdkhttp.Client
}

func NewWorkspacesApi(client *sdkhttp.Client) *WorkspacesApi {
    return &WorkspacesApi{client: client}
}

// 获取工作空间详情
func (a *WorkspacesApi) GetWorkspaceDetail(workspaceId string) (sdktypes.PlusApiResultWorkspaceVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/workspaces/%s", workspaceId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWorkspaceVO](raw)
}

// 更新工作空间
func (a *WorkspacesApi) UpdateWorkspace(workspaceId string, body sdktypes.WorkspaceUpdateForm) (sdktypes.PlusApiResultWorkspaceVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/workspaces/%s", workspaceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWorkspaceVO](raw)
}

// 删除工作空间
func (a *WorkspacesApi) DeleteWorkspace(workspaceId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/workspaces/%s", workspaceId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取项目详情
func (a *WorkspacesApi) GetProjectDetail(workspaceId string, projectId string) (sdktypes.PlusApiResultProjectDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/workspaces/%s/projects/%s", workspaceId, projectId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultProjectDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectDetailVO](raw)
}

// 更新项目
func (a *WorkspacesApi) UpdateProject(workspaceId string, projectId string, body sdktypes.ProjectUpdateForm) (sdktypes.PlusApiResultProjectVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/workspaces/%s/projects/%s", workspaceId, projectId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectVO](raw)
}

// 删除项目
func (a *WorkspacesApi) DeleteProject(workspaceId string, projectId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/workspaces/%s/projects/%s", workspaceId, projectId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消归档项目
func (a *WorkspacesApi) UnarchiveProject(workspaceId string, projectId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/workspaces/%s/projects/%s/unarchive", workspaceId, projectId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 移动项目
func (a *WorkspacesApi) MoveProject(workspaceId string, projectId string, body sdktypes.ProjectMoveForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/workspaces/%s/projects/%s/move", workspaceId, projectId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 归档项目
func (a *WorkspacesApi) ArchiveProject(workspaceId string, projectId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/workspaces/%s/projects/%s/archive", workspaceId, projectId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 更新成员角色
func (a *WorkspacesApi) UpdateMemberRole(workspaceId string, userId string, body sdktypes.MemberRoleUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/workspaces/%s/members/%s/role", workspaceId, userId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取工作空间列表
func (a *WorkspacesApi) ListWorkspaces() (sdktypes.PlusApiResultListWorkspaceVO, error) {
    raw, err := a.client.Get(AppApiPath("/workspaces"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListWorkspaceVO](raw)
}

// 创建工作空间
func (a *WorkspacesApi) CreateWorkspace(body sdktypes.WorkspaceCreateForm) (sdktypes.PlusApiResultWorkspaceVO, error) {
    raw, err := a.client.Post(AppApiPath("/workspaces"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWorkspaceVO](raw)
}

// 获取项目列表
func (a *WorkspacesApi) ListProjects(workspaceId string, query map[string]interface{}) (sdktypes.PlusApiResultPageProjectVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/workspaces/%s/projects", workspaceId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageProjectVO](raw)
}

// 创建项目
func (a *WorkspacesApi) CreateProject(workspaceId string, body sdktypes.ProjectCreateForm) (sdktypes.PlusApiResultProjectVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/workspaces/%s/projects", workspaceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectVO](raw)
}

// 复制项目
func (a *WorkspacesApi) CopyProject(workspaceId string, projectId string, body sdktypes.ProjectCopyForm) (sdktypes.PlusApiResultProjectVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/workspaces/%s/projects/%s/copy", workspaceId, projectId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultProjectVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultProjectVO](raw)
}

// 获取工作空间成员
func (a *WorkspacesApi) ListWorkspaceMembers(workspaceId string) (sdktypes.PlusApiResultListMemberVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/workspaces/%s/members", workspaceId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListMemberVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListMemberVO](raw)
}

// 邀请成员
func (a *WorkspacesApi) InviteMember(workspaceId string, body sdktypes.MemberInviteForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/workspaces/%s/members", workspaceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取当前工作空间
func (a *WorkspacesApi) GetCurrentWorkspace() (sdktypes.PlusApiResultWorkspaceVO, error) {
    raw, err := a.client.Get(AppApiPath("/workspaces/current"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultWorkspaceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultWorkspaceVO](raw)
}

// 移除成员
func (a *WorkspacesApi) RemoveMember(workspaceId string, userId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/workspaces/%s/members/%s", workspaceId, userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
