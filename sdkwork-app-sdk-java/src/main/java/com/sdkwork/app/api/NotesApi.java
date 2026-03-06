package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class NotesApi {
    private final HttpClient client;
    
    public NotesApi(HttpClient client) {
        this.client = client;
    }

    /** 获取笔记详情 */
    public PlusApiResultNoteVO getNoteDetail(String noteId) throws Exception {
        return (PlusApiResultNoteVO) client.get(ApiPaths.appPath("/notes/" + noteId + ""));
    }

    /** 更新笔记 */
    public PlusApiResultNoteOperationVO updateNote(String noteId, NoteUpdateRequest body) throws Exception {
        return (PlusApiResultNoteOperationVO) client.put(ApiPaths.appPath("/notes/" + noteId + ""), body);
    }

    /** 删除笔记 */
    public PlusApiResultVoid deleteNote(String noteId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notes/" + noteId + ""));
    }

    /** 恢复笔记 */
    public PlusApiResultNoteOperationVO restoreNote(String noteId) throws Exception {
        return (PlusApiResultNoteOperationVO) client.put(ApiPaths.appPath("/notes/" + noteId + "/restore"), null);
    }

    /** 移动笔记 */
    public PlusApiResultNoteOperationVO moveNote(String noteId, NoteMoveRequest body) throws Exception {
        return (PlusApiResultNoteOperationVO) client.put(ApiPaths.appPath("/notes/" + noteId + "/move"), body);
    }

    /** 获取笔记正文 */
    public PlusApiResultNoteContentVO getNoteContent(String noteId) throws Exception {
        return (PlusApiResultNoteContentVO) client.get(ApiPaths.appPath("/notes/" + noteId + "/content"));
    }

    /** 更新笔记正文 */
    public PlusApiResultNoteContentVO updateNoteContent(String noteId, NoteContentUpdateRequest body) throws Exception {
        return (PlusApiResultNoteContentVO) client.put(ApiPaths.appPath("/notes/" + noteId + "/content"), body);
    }

    /** 归档笔记 */
    public PlusApiResultNoteOperationVO archiveNote(String noteId) throws Exception {
        return (PlusApiResultNoteOperationVO) client.put(ApiPaths.appPath("/notes/" + noteId + "/archive"), null);
    }

    /** 重命名文件夹 */
    public PlusApiResultNoteFolderVO updateFolder(String folderId, NoteFolderUpdateRequest body) throws Exception {
        return (PlusApiResultNoteFolderVO) client.put(ApiPaths.appPath("/notes/folders/" + folderId + ""), body);
    }

    /** 删除文件夹 */
    public PlusApiResultNoteOperationVO deleteFolder(String folderId) throws Exception {
        return (PlusApiResultNoteOperationVO) client.delete(ApiPaths.appPath("/notes/folders/" + folderId + ""));
    }

    /** 获取笔记列表 */
    public PlusApiResultPageNoteVO listNotes(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNoteVO) client.get(ApiPaths.appPath("/notes"), params);
    }

    /** 创建笔记 */
    public PlusApiResultNoteOperationVO createNote(NoteCreateRequest body) throws Exception {
        return (PlusApiResultNoteOperationVO) client.post(ApiPaths.appPath("/notes"), body);
    }

    /** 收藏笔记 */
    public PlusApiResultNoteOperationVO favoriteNote(String noteId) throws Exception {
        return (PlusApiResultNoteOperationVO) client.post(ApiPaths.appPath("/notes/" + noteId + "/favorite"), null);
    }

    /** 取消收藏 */
    public PlusApiResultNoteOperationVO unfavoriteNote(String noteId) throws Exception {
        return (PlusApiResultNoteOperationVO) client.delete(ApiPaths.appPath("/notes/" + noteId + "/favorite"));
    }

    /** 复制笔记 */
    public PlusApiResultNoteOperationVO copyNote(String noteId, NoteCopyRequest body) throws Exception {
        return (PlusApiResultNoteOperationVO) client.post(ApiPaths.appPath("/notes/" + noteId + "/copy"), body);
    }

    /** 批量更新笔记正文 */
    public PlusApiResultNoteBatchUpdateResultVO batchUpdateNote(String noteId, NoteBatchUpdateRequest body) throws Exception {
        return (PlusApiResultNoteBatchUpdateResultVO) client.post(ApiPaths.appPath("/notes/" + noteId + "/batch-update"), body);
    }

    /** 批量更新笔记正文 */
    public PlusApiResultNoteBatchUpdateResultVO createBatchUpdateNote(String noteId, NoteBatchUpdateRequest body) throws Exception {
        return (PlusApiResultNoteBatchUpdateResultVO) client.post(ApiPaths.appPath("/notes/" + noteId + ":batchUpdate"), body);
    }

    /** 获取文件夹树 */
    public PlusApiResultListNoteFolderVO listFolders() throws Exception {
        return (PlusApiResultListNoteFolderVO) client.get(ApiPaths.appPath("/notes/folders"));
    }

    /** 创建文件夹 */
    public PlusApiResultNoteFolderVO createFolder(NoteFolderCreateRequest body) throws Exception {
        return (PlusApiResultNoteFolderVO) client.post(ApiPaths.appPath("/notes/folders"), body);
    }

    /** 获取笔记统计 */
    public PlusApiResultNoteStatisticsVO getNoteStatistics() throws Exception {
        return (PlusApiResultNoteStatisticsVO) client.get(ApiPaths.appPath("/notes/statistics"));
    }

    /** 批量删除笔记 */
    public PlusApiResultNoteOperationVO batchDelete() throws Exception {
        return (PlusApiResultNoteOperationVO) client.delete(ApiPaths.appPath("/notes/batch"));
    }

    /** 批量删除笔记 */
    public PlusApiResultNoteOperationVO deleteBatch() throws Exception {
        return (PlusApiResultNoteOperationVO) client.delete(ApiPaths.appPath("/notes/batch-delete"));
    }
}
