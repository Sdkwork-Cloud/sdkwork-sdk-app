package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ProjectsApi(private val client: HttpClient) {

    /** 获取项目详情 */
    suspend fun getProjectDetail(projectId: String): PlusApiResultProjectDetailVO? {
        return client.get(ApiPaths.appPath("/projects/$projectId")) as? PlusApiResultProjectDetailVO
    }

    /** 更新项目 */
    suspend fun updateProject(projectId: String, body: ProjectUpdateRequest): PlusApiResultProjectVO? {
        return client.put(ApiPaths.appPath("/projects/$projectId"), body) as? PlusApiResultProjectVO
    }

    /** 删除项目 */
    suspend fun deleteProject(projectId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/projects/$projectId")) as? PlusApiResultVoid
    }

    /** 取消归档项目 */
    suspend fun unarchiveProject(projectId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/projects/$projectId/unarchive"), null) as? PlusApiResultVoid
    }

    /** 移动项目 */
    suspend fun moveProject(projectId: String, body: ProjectMoveRequest): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/projects/$projectId/move"), body) as? PlusApiResultVoid
    }

    /** 归档项目 */
    suspend fun archiveProject(projectId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/projects/$projectId/archive"), null) as? PlusApiResultVoid
    }

    /** 获取项目列表 */
    suspend fun listProjects(params: Map<String, Any>? = null): PlusApiResultPageProjectVO? {
        return client.get(ApiPaths.appPath("/projects"), params) as? PlusApiResultPageProjectVO
    }

    /** 创建项目 */
    suspend fun createProject(body: ProjectCreateRequest): PlusApiResultProjectVO? {
        return client.post(ApiPaths.appPath("/projects"), body) as? PlusApiResultProjectVO
    }

    /** 复制项目 */
    suspend fun copyProject(projectId: String, body: ProjectCopyRequest): PlusApiResultProjectVO? {
        return client.post(ApiPaths.appPath("/projects/$projectId/copy"), body) as? PlusApiResultProjectVO
    }

    /** 项目统计 */
    suspend fun getProjectStatistics(projectId: String): PlusApiResultProjectStatisticsVO? {
        return client.get(ApiPaths.appPath("/projects/$projectId/statistics")) as? PlusApiResultProjectStatisticsVO
    }

    /** 搜索项目 */
    suspend fun search(params: Map<String, Any>? = null): PlusApiResultPageProjectVO? {
        return client.get(ApiPaths.appPath("/projects/search"), params) as? PlusApiResultPageProjectVO
    }

    /** 最近访问项目 */
    suspend fun listRecent(params: Map<String, Any>? = null): PlusApiResultListProjectVO? {
        return client.get(ApiPaths.appPath("/projects/recent"), params) as? PlusApiResultListProjectVO
    }
}
