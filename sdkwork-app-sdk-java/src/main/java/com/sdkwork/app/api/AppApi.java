package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AppApi {
    private final HttpClient client;
    
    public AppApi(HttpClient client) {
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

    /** 移动笔记 */
    public PlusApiResultNoteOperationVO moveNote(String noteId, NoteMoveRequest body) throws Exception {
        return (PlusApiResultNoteOperationVO) client.put(ApiPaths.appPath("/notes/" + noteId + "/move"), body);
    }

    /** 更新文件夹 */
    public PlusApiResultNoteFolderVO updateFolder(String folderId, NoteFolderUpdateRequest body) throws Exception {
        return (PlusApiResultNoteFolderVO) client.put(ApiPaths.appPath("/notes/folders/" + folderId + ""), body);
    }

    /** 删除文件夹 */
    public PlusApiResultNoteOperationVO deleteFolder(String folderId) throws Exception {
        return (PlusApiResultNoteOperationVO) client.delete(ApiPaths.appPath("/notes/folders/" + folderId + ""));
    }

    /** 获取应用详情 */
    public PlusApiResultAppDetailVO getApp(String appId) throws Exception {
        return (PlusApiResultAppDetailVO) client.get(ApiPaths.appPath("/app/manage/" + appId + ""));
    }

    /** 更新应用 */
    public PlusApiResultAppVO updateApp(String appId, AppUpdateForm body) throws Exception {
        return (PlusApiResultAppVO) client.put(ApiPaths.appPath("/app/manage/" + appId + ""), body);
    }

    /** 删除应用 */
    public PlusApiResultVoid deleteApp(String appId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/app/manage/" + appId + ""));
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

    /** 取消收藏笔记 */
    public PlusApiResultNoteOperationVO unfavoriteNote(String noteId) throws Exception {
        return (PlusApiResultNoteOperationVO) client.delete(ApiPaths.appPath("/notes/" + noteId + "/favorite"));
    }

    /** 复制笔记 */
    public PlusApiResultNoteOperationVO copyNote(String noteId, NoteCopyRequest body) throws Exception {
        return (PlusApiResultNoteOperationVO) client.post(ApiPaths.appPath("/notes/" + noteId + "/copy"), body);
    }

    /** 获取文件夹列表 */
    public PlusApiResultListNoteFolderVO listFolders() throws Exception {
        return (PlusApiResultListNoteFolderVO) client.get(ApiPaths.appPath("/notes/folders"));
    }

    /** 创建文件夹 */
    public PlusApiResultNoteFolderVO createFolder(NoteFolderCreateRequest body) throws Exception {
        return (PlusApiResultNoteFolderVO) client.post(ApiPaths.appPath("/notes/folders"), body);
    }

    /** 创建应用 */
    public PlusApiResultAppVO createApp(AppCreateForm body) throws Exception {
        return (PlusApiResultAppVO) client.post(ApiPaths.appPath("/app/manage"), body);
    }

    /** 停用应用 */
    public PlusApiResultVoid deactivate(String appId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/app/manage/" + appId + "/deactivate"), null);
    }

    /** 激活应用 */
    public PlusApiResultVoid activate(String appId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/app/manage/" + appId + "/activate"), null);
    }

    /** 获取笔记统计 */
    public PlusApiResultNoteStatisticsVO getNoteStatistics() throws Exception {
        return (PlusApiResultNoteStatisticsVO) client.get(ApiPaths.appPath("/notes/statistics"));
    }

    /** 获取应用统计 */
    public PlusApiResultAppStatisticsVO getAppStatistics() throws Exception {
        return (PlusApiResultAppStatisticsVO) client.get(ApiPaths.appPath("/app/manage/statistics"));
    }

    /** 搜索应用 */
    public PlusApiResultPageAppVO searchApps(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAppVO) client.get(ApiPaths.appPath("/app/manage/search"), params);
    }

    /** 获取项目应用 */
    public PlusApiResultPageAppVO getProjectApps(String projectId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAppVO) client.get(ApiPaths.appPath("/app/manage/project/" + projectId + ""), params);
    }

    /** 获取我的应用 */
    public PlusApiResultPageAppVO getMyApps(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAppVO) client.get(ApiPaths.appPath("/app/manage/my"), params);
    }

    /** 获取账户余额汇总 */
    public PlusApiResultAccountSummaryVO getAccountSummary() throws Exception {
        return (PlusApiResultAccountSummaryVO) client.get(ApiPaths.appPath("/account/summary"));
    }

    /** 批量删除笔记 */
    public PlusApiResultNoteOperationVO batchDeleteNotes() throws Exception {
        return (PlusApiResultNoteOperationVO) client.delete(ApiPaths.appPath("/notes/batch"));
    }
}
