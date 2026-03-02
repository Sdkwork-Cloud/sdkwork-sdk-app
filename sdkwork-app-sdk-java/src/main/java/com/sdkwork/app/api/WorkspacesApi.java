package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class WorkspacesApi {
    private final HttpClient client;
    
    public WorkspacesApi(HttpClient client) {
        this.client = client;
    }

    /** 获取工作空间详情 */
    public PlusApiResultWorkspaceVO getWorkspaceDetail(String workspaceId) throws Exception {
        return (PlusApiResultWorkspaceVO) client.get(ApiPaths.appPath("/workspaces/" + workspaceId + ""));
    }

    /** 更新工作空间 */
    public PlusApiResultWorkspaceVO updateWorkspace(String workspaceId, WorkspaceUpdateForm body) throws Exception {
        return (PlusApiResultWorkspaceVO) client.put(ApiPaths.appPath("/workspaces/" + workspaceId + ""), body);
    }

    /** 删除工作空间 */
    public PlusApiResultVoid deleteWorkspace(String workspaceId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/workspaces/" + workspaceId + ""));
    }

    /** 获取项目详情 */
    public PlusApiResultProjectDetailVO getProjectDetail(String workspaceId, String projectId) throws Exception {
        return (PlusApiResultProjectDetailVO) client.get(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects/" + projectId + ""));
    }

    /** 更新项目 */
    public PlusApiResultProjectVO updateProject(String workspaceId, String projectId, ProjectUpdateForm body) throws Exception {
        return (PlusApiResultProjectVO) client.put(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects/" + projectId + ""), body);
    }

    /** 删除项目 */
    public PlusApiResultVoid deleteProject(String workspaceId, String projectId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects/" + projectId + ""));
    }

    /** 取消归档项目 */
    public PlusApiResultVoid unarchiveProject(String workspaceId, String projectId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects/" + projectId + "/unarchive"), null);
    }

    /** 移动项目 */
    public PlusApiResultVoid moveProject(String workspaceId, String projectId, ProjectMoveForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects/" + projectId + "/move"), body);
    }

    /** 归档项目 */
    public PlusApiResultVoid archiveProject(String workspaceId, String projectId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects/" + projectId + "/archive"), null);
    }

    /** 更新成员角色 */
    public PlusApiResultVoid updateMemberRole(String workspaceId, String userId, MemberRoleUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/workspaces/" + workspaceId + "/members/" + userId + "/role"), body);
    }

    /** 获取工作空间列表 */
    public PlusApiResultListWorkspaceVO listWorkspaces() throws Exception {
        return (PlusApiResultListWorkspaceVO) client.get(ApiPaths.appPath("/workspaces"));
    }

    /** 创建工作空间 */
    public PlusApiResultWorkspaceVO createWorkspace(WorkspaceCreateForm body) throws Exception {
        return (PlusApiResultWorkspaceVO) client.post(ApiPaths.appPath("/workspaces"), body);
    }

    /** 获取项目列表 */
    public PlusApiResultPageProjectVO listProjects(String workspaceId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageProjectVO) client.get(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects"), params);
    }

    /** 创建项目 */
    public PlusApiResultProjectVO createProject(String workspaceId, ProjectCreateForm body) throws Exception {
        return (PlusApiResultProjectVO) client.post(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects"), body);
    }

    /** 复制项目 */
    public PlusApiResultProjectVO copyProject(String workspaceId, String projectId, ProjectCopyForm body) throws Exception {
        return (PlusApiResultProjectVO) client.post(ApiPaths.appPath("/workspaces/" + workspaceId + "/projects/" + projectId + "/copy"), body);
    }

    /** 获取工作空间成员 */
    public PlusApiResultListMemberVO listWorkspaceMembers(String workspaceId) throws Exception {
        return (PlusApiResultListMemberVO) client.get(ApiPaths.appPath("/workspaces/" + workspaceId + "/members"));
    }

    /** 邀请成员 */
    public PlusApiResultVoid inviteMember(String workspaceId, MemberInviteForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/workspaces/" + workspaceId + "/members"), body);
    }

    /** 获取当前工作空间 */
    public PlusApiResultWorkspaceVO getCurrentWorkspace() throws Exception {
        return (PlusApiResultWorkspaceVO) client.get(ApiPaths.appPath("/workspaces/current"));
    }

    /** 移除成员 */
    public PlusApiResultVoid removeMember(String workspaceId, String userId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/workspaces/" + workspaceId + "/members/" + userId + ""));
    }
}
