package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AppApi(private val client: HttpClient) {

    /** 获取笔记详情 */
    suspend fun getNoteDetail(noteId: String): PlusApiResultNoteVO? {
        return client.get(ApiPaths.appPath("/notes/$noteId")) as? PlusApiResultNoteVO
    }

    /** 更新笔记 */
    suspend fun updateNote(noteId: String, body: NoteUpdateRequest): PlusApiResultNoteOperationVO? {
        return client.put(ApiPaths.appPath("/notes/$noteId"), body) as? PlusApiResultNoteOperationVO
    }

    /** 删除笔记 */
    suspend fun deleteNote(noteId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notes/$noteId")) as? PlusApiResultVoid
    }

    /** 移动笔记 */
    suspend fun moveNote(noteId: String, body: NoteMoveRequest): PlusApiResultNoteOperationVO? {
        return client.put(ApiPaths.appPath("/notes/$noteId/move"), body) as? PlusApiResultNoteOperationVO
    }

    /** 更新文件夹 */
    suspend fun updateFolder(folderId: String, body: NoteFolderUpdateRequest): PlusApiResultNoteFolderVO? {
        return client.put(ApiPaths.appPath("/notes/folders/$folderId"), body) as? PlusApiResultNoteFolderVO
    }

    /** 删除文件夹 */
    suspend fun deleteFolder(folderId: String): PlusApiResultNoteOperationVO? {
        return client.delete(ApiPaths.appPath("/notes/folders/$folderId")) as? PlusApiResultNoteOperationVO
    }

    /** 获取应用详情 */
    suspend fun getApp(appId: String): PlusApiResultAppDetailVO? {
        return client.get(ApiPaths.appPath("/app/manage/$appId")) as? PlusApiResultAppDetailVO
    }

    /** 更新应用 */
    suspend fun updateApp(appId: String, body: AppUpdateForm): PlusApiResultAppVO? {
        return client.put(ApiPaths.appPath("/app/manage/$appId"), body) as? PlusApiResultAppVO
    }

    /** 删除应用 */
    suspend fun deleteApp(appId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/app/manage/$appId")) as? PlusApiResultVoid
    }

    /** 获取笔记列表 */
    suspend fun listNotes(params: Map<String, Any>? = null): PlusApiResultPageNoteVO? {
        return client.get(ApiPaths.appPath("/notes"), params) as? PlusApiResultPageNoteVO
    }

    /** 创建笔记 */
    suspend fun createNote(body: NoteCreateRequest): PlusApiResultNoteOperationVO? {
        return client.post(ApiPaths.appPath("/notes"), body) as? PlusApiResultNoteOperationVO
    }

    /** 收藏笔记 */
    suspend fun favoriteNote(noteId: String): PlusApiResultNoteOperationVO? {
        return client.post(ApiPaths.appPath("/notes/$noteId/favorite"), null) as? PlusApiResultNoteOperationVO
    }

    /** 取消收藏笔记 */
    suspend fun unfavoriteNote(noteId: String): PlusApiResultNoteOperationVO? {
        return client.delete(ApiPaths.appPath("/notes/$noteId/favorite")) as? PlusApiResultNoteOperationVO
    }

    /** 复制笔记 */
    suspend fun copyNote(noteId: String, body: NoteCopyRequest): PlusApiResultNoteOperationVO? {
        return client.post(ApiPaths.appPath("/notes/$noteId/copy"), body) as? PlusApiResultNoteOperationVO
    }

    /** 获取文件夹列表 */
    suspend fun listFolders(): PlusApiResultListNoteFolderVO? {
        return client.get(ApiPaths.appPath("/notes/folders")) as? PlusApiResultListNoteFolderVO
    }

    /** 创建文件夹 */
    suspend fun createFolder(body: NoteFolderCreateRequest): PlusApiResultNoteFolderVO? {
        return client.post(ApiPaths.appPath("/notes/folders"), body) as? PlusApiResultNoteFolderVO
    }

    /** 创建应用 */
    suspend fun createApp(body: AppCreateForm): PlusApiResultAppVO? {
        return client.post(ApiPaths.appPath("/app/manage"), body) as? PlusApiResultAppVO
    }

    /** 停用应用 */
    suspend fun deactivate(appId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/app/manage/$appId/deactivate"), null) as? PlusApiResultVoid
    }

    /** 激活应用 */
    suspend fun activate(appId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/app/manage/$appId/activate"), null) as? PlusApiResultVoid
    }

    /** 获取笔记统计 */
    suspend fun getNoteStatistics(): PlusApiResultNoteStatisticsVO? {
        return client.get(ApiPaths.appPath("/notes/statistics")) as? PlusApiResultNoteStatisticsVO
    }

    /** 获取应用统计 */
    suspend fun getAppStatistics(): PlusApiResultAppStatisticsVO? {
        return client.get(ApiPaths.appPath("/app/manage/statistics")) as? PlusApiResultAppStatisticsVO
    }

    /** 搜索应用 */
    suspend fun searchApps(params: Map<String, Any>? = null): PlusApiResultPageAppVO? {
        return client.get(ApiPaths.appPath("/app/manage/search"), params) as? PlusApiResultPageAppVO
    }

    /** 获取项目应用 */
    suspend fun getProjectApps(projectId: String, params: Map<String, Any>? = null): PlusApiResultPageAppVO? {
        return client.get(ApiPaths.appPath("/app/manage/project/$projectId"), params) as? PlusApiResultPageAppVO
    }

    /** 获取我的应用 */
    suspend fun getMyApps(params: Map<String, Any>? = null): PlusApiResultPageAppVO? {
        return client.get(ApiPaths.appPath("/app/manage/my"), params) as? PlusApiResultPageAppVO
    }

    /** 获取账户余额汇总 */
    suspend fun getAccountSummary(): PlusApiResultAccountSummaryVO? {
        return client.get(ApiPaths.appPath("/account/summary")) as? PlusApiResultAccountSummaryVO
    }

    /** 批量删除笔记 */
    suspend fun batchDeleteNotes(): PlusApiResultNoteOperationVO? {
        return client.delete(ApiPaths.appPath("/notes/batch")) as? PlusApiResultNoteOperationVO
    }
}
