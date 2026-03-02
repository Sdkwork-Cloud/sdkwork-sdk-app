import Foundation

public class AppApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取笔记详情
    public func getNoteDetail(noteId: String) async throws -> PlusApiResultNoteVO? {
        let response = try await client.get(ApiPaths.appPath("/notes/\(noteId)"))
        return response as? PlusApiResultNoteVO
    }

    /// 更新笔记
    public func updateNote(noteId: String, body: NoteUpdateRequest) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/\(noteId)"), body: body)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 删除笔记
    public func deleteNote(noteId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notes/\(noteId)"))
        return response as? PlusApiResultVoid
    }

    /// 移动笔记
    public func moveNote(noteId: String, body: NoteMoveRequest) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/\(noteId)/move"), body: body)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 更新文件夹
    public func updateFolder(folderId: String, body: NoteFolderUpdateRequest) async throws -> PlusApiResultNoteFolderVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/folders/\(folderId)"), body: body)
        return response as? PlusApiResultNoteFolderVO
    }

    /// 删除文件夹
    public func deleteFolder(folderId: String) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/notes/folders/\(folderId)"))
        return response as? PlusApiResultNoteOperationVO
    }

    /// 获取应用详情
    public func getApp(appId: String) async throws -> PlusApiResultAppDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/\(appId)"))
        return response as? PlusApiResultAppDetailVO
    }

    /// 更新应用
    public func updateApp(appId: String, body: AppUpdateForm) async throws -> PlusApiResultAppVO? {
        let response = try await client.put(ApiPaths.appPath("/app/manage/\(appId)"), body: body)
        return response as? PlusApiResultAppVO
    }

    /// 删除应用
    public func deleteApp(appId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/app/manage/\(appId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取笔记列表
    public func listNotes(params: [String: Any]? = nil) async throws -> PlusApiResultPageNoteVO? {
        let response = try await client.get(ApiPaths.appPath("/notes"), params: params)
        return response as? PlusApiResultPageNoteVO
    }

    /// 创建笔记
    public func createNote(body: NoteCreateRequest) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/notes"), body: body)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 收藏笔记
    public func favoriteNote(noteId: String) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/notes/\(noteId)/favorite"), body: nil)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 取消收藏笔记
    public func unfavoriteNote(noteId: String) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/notes/\(noteId)/favorite"))
        return response as? PlusApiResultNoteOperationVO
    }

    /// 复制笔记
    public func copyNote(noteId: String, body: NoteCopyRequest) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/notes/\(noteId)/copy"), body: body)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 获取文件夹列表
    public func listFolders() async throws -> PlusApiResultListNoteFolderVO? {
        let response = try await client.get(ApiPaths.appPath("/notes/folders"))
        return response as? PlusApiResultListNoteFolderVO
    }

    /// 创建文件夹
    public func createFolder(body: NoteFolderCreateRequest) async throws -> PlusApiResultNoteFolderVO? {
        let response = try await client.post(ApiPaths.appPath("/notes/folders"), body: body)
        return response as? PlusApiResultNoteFolderVO
    }

    /// 创建应用
    public func createApp(body: AppCreateForm) async throws -> PlusApiResultAppVO? {
        let response = try await client.post(ApiPaths.appPath("/app/manage"), body: body)
        return response as? PlusApiResultAppVO
    }

    /// 停用应用
    public func deactivate(appId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/app/manage/\(appId)/deactivate"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 激活应用
    public func activate(appId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/app/manage/\(appId)/activate"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 获取笔记统计
    public func getNoteStatistics() async throws -> PlusApiResultNoteStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/notes/statistics"))
        return response as? PlusApiResultNoteStatisticsVO
    }

    /// 获取应用统计
    public func getAppStatistics() async throws -> PlusApiResultAppStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/statistics"))
        return response as? PlusApiResultAppStatisticsVO
    }

    /// 搜索应用
    public func searchApps(params: [String: Any]? = nil) async throws -> PlusApiResultPageAppVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/search"), params: params)
        return response as? PlusApiResultPageAppVO
    }

    /// 获取项目应用
    public func getProjectApps(projectId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageAppVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/project/\(projectId)"), params: params)
        return response as? PlusApiResultPageAppVO
    }

    /// 获取我的应用
    public func getMyApps(params: [String: Any]? = nil) async throws -> PlusApiResultPageAppVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/my"), params: params)
        return response as? PlusApiResultPageAppVO
    }

    /// 获取账户余额汇总
    public func getAccountSummary() async throws -> PlusApiResultAccountSummaryVO? {
        let response = try await client.get(ApiPaths.appPath("/account/summary"))
        return response as? PlusApiResultAccountSummaryVO
    }

    /// 批量删除笔记
    public func batchDeleteNotes() async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/notes/batch"))
        return response as? PlusApiResultNoteOperationVO
    }
}
