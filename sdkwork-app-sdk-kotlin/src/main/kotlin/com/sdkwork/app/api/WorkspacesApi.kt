package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class WorkspacesApi(private val client: HttpClient) {

    /** 获取工作空间详情 */
    suspend fun getWorkspaceDetail(workspaceId: String): PlusApiResultWorkspaceVO? {
        return client.get(ApiPaths.appPath("/workspaces/$workspaceId")) as? PlusApiResultWorkspaceVO
    }

    /** 更新工作空间 */
    suspend fun updateWorkspace(workspaceId: String, body: WorkspaceUpdateForm): PlusApiResultWorkspaceVO? {
        return client.put(ApiPaths.appPath("/workspaces/$workspaceId"), body) as? PlusApiResultWorkspaceVO
    }

    /** 删除工作空间 */
    suspend fun deleteWorkspace(workspaceId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/workspaces/$workspaceId")) as? PlusApiResultVoid
    }

    /** 获取项目详情 */
    suspend fun getProjectDetail(workspaceId: String, projectId: String): PlusApiResultProjectDetailVO? {
        return client.get(ApiPaths.appPath("/workspaces/$workspaceId/projects/$projectId")) as? PlusApiResultProjectDetailVO
    }

    /** 更新项目 */
    suspend fun updateProject(workspaceId: String, projectId: String, body: ProjectUpdateForm): PlusApiResultProjectVO? {
        return client.put(ApiPaths.appPath("/workspaces/$workspaceId/projects/$projectId"), body) as? PlusApiResultProjectVO
    }

    /** 删除项目 */
    suspend fun deleteProject(workspaceId: String, projectId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/workspaces/$workspaceId/projects/$projectId")) as? PlusApiResultVoid
    }

    /** 取消归档项目 */
    suspend fun unarchiveProject(workspaceId: String, projectId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/workspaces/$workspaceId/projects/$projectId/unarchive"), null) as? PlusApiResultVoid
    }

    /** 移动项目 */
    suspend fun moveProject(workspaceId: String, projectId: String, body: ProjectMoveForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/workspaces/$workspaceId/projects/$projectId/move"), body) as? PlusApiResultVoid
    }

    /** 归档项目 */
    suspend fun archiveProject(workspaceId: String, projectId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/workspaces/$workspaceId/projects/$projectId/archive"), null) as? PlusApiResultVoid
    }

    /** 更新成员角色 */
    suspend fun updateMemberRole(workspaceId: String, userId: String, body: MemberRoleUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/workspaces/$workspaceId/members/$userId/role"), body) as? PlusApiResultVoid
    }

    /** 获取工作空间列表 */
    suspend fun listWorkspaces(): PlusApiResultListWorkspaceVO? {
        return client.get(ApiPaths.appPath("/workspaces")) as? PlusApiResultListWorkspaceVO
    }

    /** 创建工作空间 */
    suspend fun createWorkspace(body: WorkspaceCreateForm): PlusApiResultWorkspaceVO? {
        return client.post(ApiPaths.appPath("/workspaces"), body) as? PlusApiResultWorkspaceVO
    }

    /** 获取项目列表 */
    suspend fun listProjects(workspaceId: String, params: Map<String, Any>? = null): PlusApiResultPageProjectVO? {
        return client.get(ApiPaths.appPath("/workspaces/$workspaceId/projects"), params) as? PlusApiResultPageProjectVO
    }

    /** 创建项目 */
    suspend fun createProject(workspaceId: String, body: ProjectCreateForm): PlusApiResultProjectVO? {
        return client.post(ApiPaths.appPath("/workspaces/$workspaceId/projects"), body) as? PlusApiResultProjectVO
    }

    /** 复制项目 */
    suspend fun copyProject(workspaceId: String, projectId: String, body: ProjectCopyForm): PlusApiResultProjectVO? {
        return client.post(ApiPaths.appPath("/workspaces/$workspaceId/projects/$projectId/copy"), body) as? PlusApiResultProjectVO
    }

    /** 获取工作空间成员 */
    suspend fun listWorkspaceMembers(workspaceId: String): PlusApiResultListMemberVO? {
        return client.get(ApiPaths.appPath("/workspaces/$workspaceId/members")) as? PlusApiResultListMemberVO
    }

    /** 邀请成员 */
    suspend fun inviteMember(workspaceId: String, body: MemberInviteForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/workspaces/$workspaceId/members"), body) as? PlusApiResultVoid
    }

    /** 获取当前工作空间 */
    suspend fun getCurrentWorkspace(): PlusApiResultWorkspaceVO? {
        return client.get(ApiPaths.appPath("/workspaces/current")) as? PlusApiResultWorkspaceVO
    }

    /** 移除成员 */
    suspend fun removeMember(workspaceId: String, userId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/workspaces/$workspaceId/members/$userId")) as? PlusApiResultVoid
    }
}
