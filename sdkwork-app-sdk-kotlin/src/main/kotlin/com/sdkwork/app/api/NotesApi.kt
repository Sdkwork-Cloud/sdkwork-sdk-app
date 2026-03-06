package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class NotesApi(private val client: HttpClient) {

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

    /** 恢复笔记 */
    suspend fun restoreNote(noteId: String): PlusApiResultNoteOperationVO? {
        return client.put(ApiPaths.appPath("/notes/$noteId/restore"), null) as? PlusApiResultNoteOperationVO
    }

    /** 移动笔记 */
    suspend fun moveNote(noteId: String, body: NoteMoveRequest): PlusApiResultNoteOperationVO? {
        return client.put(ApiPaths.appPath("/notes/$noteId/move"), body) as? PlusApiResultNoteOperationVO
    }

    /** 获取笔记正文 */
    suspend fun getNoteContent(noteId: String): PlusApiResultNoteContentVO? {
        return client.get(ApiPaths.appPath("/notes/$noteId/content")) as? PlusApiResultNoteContentVO
    }

    /** 更新笔记正文 */
    suspend fun updateNoteContent(noteId: String, body: NoteContentUpdateRequest): PlusApiResultNoteContentVO? {
        return client.put(ApiPaths.appPath("/notes/$noteId/content"), body) as? PlusApiResultNoteContentVO
    }

    /** 归档笔记 */
    suspend fun archiveNote(noteId: String): PlusApiResultNoteOperationVO? {
        return client.put(ApiPaths.appPath("/notes/$noteId/archive"), null) as? PlusApiResultNoteOperationVO
    }

    /** 重命名文件夹 */
    suspend fun updateFolder(folderId: String, body: NoteFolderUpdateRequest): PlusApiResultNoteFolderVO? {
        return client.put(ApiPaths.appPath("/notes/folders/$folderId"), body) as? PlusApiResultNoteFolderVO
    }

    /** 删除文件夹 */
    suspend fun deleteFolder(folderId: String): PlusApiResultNoteOperationVO? {
        return client.delete(ApiPaths.appPath("/notes/folders/$folderId")) as? PlusApiResultNoteOperationVO
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

    /** 取消收藏 */
    suspend fun unfavoriteNote(noteId: String): PlusApiResultNoteOperationVO? {
        return client.delete(ApiPaths.appPath("/notes/$noteId/favorite")) as? PlusApiResultNoteOperationVO
    }

    /** 复制笔记 */
    suspend fun copyNote(noteId: String, body: NoteCopyRequest): PlusApiResultNoteOperationVO? {
        return client.post(ApiPaths.appPath("/notes/$noteId/copy"), body) as? PlusApiResultNoteOperationVO
    }

    /** 批量更新笔记正文 */
    suspend fun batchUpdateNote(noteId: String, body: NoteBatchUpdateRequest): PlusApiResultNoteBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/notes/$noteId/batch-update"), body) as? PlusApiResultNoteBatchUpdateResultVO
    }

    /** 批量更新笔记正文 */
    suspend fun createBatchUpdateNote(noteId: String, body: NoteBatchUpdateRequest): PlusApiResultNoteBatchUpdateResultVO? {
        return client.post(ApiPaths.appPath("/notes/$noteId:batchUpdate"), body) as? PlusApiResultNoteBatchUpdateResultVO
    }

    /** 获取文件夹树 */
    suspend fun listFolders(): PlusApiResultListNoteFolderVO? {
        return client.get(ApiPaths.appPath("/notes/folders")) as? PlusApiResultListNoteFolderVO
    }

    /** 创建文件夹 */
    suspend fun createFolder(body: NoteFolderCreateRequest): PlusApiResultNoteFolderVO? {
        return client.post(ApiPaths.appPath("/notes/folders"), body) as? PlusApiResultNoteFolderVO
    }

    /** 获取笔记统计 */
    suspend fun getNoteStatistics(): PlusApiResultNoteStatisticsVO? {
        return client.get(ApiPaths.appPath("/notes/statistics")) as? PlusApiResultNoteStatisticsVO
    }

    /** 批量删除笔记 */
    suspend fun batchDelete(): PlusApiResultNoteOperationVO? {
        return client.delete(ApiPaths.appPath("/notes/batch")) as? PlusApiResultNoteOperationVO
    }

    /** 批量删除笔记 */
    suspend fun deleteBatch(): PlusApiResultNoteOperationVO? {
        return client.delete(ApiPaths.appPath("/notes/batch-delete")) as? PlusApiResultNoteOperationVO
    }
}
