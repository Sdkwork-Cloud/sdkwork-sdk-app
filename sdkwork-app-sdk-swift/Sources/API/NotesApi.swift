import Foundation

public class NotesApi {
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

    /// 恢复笔记
    public func restoreNote(noteId: String) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/\(noteId)/restore"), body: nil)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 移动笔记
    public func moveNote(noteId: String, body: NoteMoveRequest) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/\(noteId)/move"), body: body)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 获取笔记正文
    public func getNoteContent(noteId: String) async throws -> PlusApiResultNoteContentVO? {
        let response = try await client.get(ApiPaths.appPath("/notes/\(noteId)/content"))
        return response as? PlusApiResultNoteContentVO
    }

    /// 更新笔记正文
    public func updateNoteContent(noteId: String, body: NoteContentUpdateRequest) async throws -> PlusApiResultNoteContentVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/\(noteId)/content"), body: body)
        return response as? PlusApiResultNoteContentVO
    }

    /// 归档笔记
    public func archiveNote(noteId: String) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/\(noteId)/archive"), body: nil)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 重命名文件夹
    public func updateFolder(folderId: String, body: NoteFolderUpdateRequest) async throws -> PlusApiResultNoteFolderVO? {
        let response = try await client.put(ApiPaths.appPath("/notes/folders/\(folderId)"), body: body)
        return response as? PlusApiResultNoteFolderVO
    }

    /// 删除文件夹
    public func deleteFolder(folderId: String) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/notes/folders/\(folderId)"))
        return response as? PlusApiResultNoteOperationVO
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

    /// 取消收藏
    public func unfavoriteNote(noteId: String) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/notes/\(noteId)/favorite"))
        return response as? PlusApiResultNoteOperationVO
    }

    /// 复制笔记
    public func copyNote(noteId: String, body: NoteCopyRequest) async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.post(ApiPaths.appPath("/notes/\(noteId)/copy"), body: body)
        return response as? PlusApiResultNoteOperationVO
    }

    /// 批量更新笔记正文
    public func batchUpdateNote(noteId: String, body: NoteBatchUpdateRequest) async throws -> PlusApiResultNoteBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/notes/\(noteId)/batch-update"), body: body)
        return response as? PlusApiResultNoteBatchUpdateResultVO
    }

    /// 批量更新笔记正文
    public func createBatchUpdateNote(noteId: String, body: NoteBatchUpdateRequest) async throws -> PlusApiResultNoteBatchUpdateResultVO? {
        let response = try await client.post(ApiPaths.appPath("/notes/\(noteId):batchUpdate"), body: body)
        return response as? PlusApiResultNoteBatchUpdateResultVO
    }

    /// 获取文件夹树
    public func listFolders() async throws -> PlusApiResultListNoteFolderVO? {
        let response = try await client.get(ApiPaths.appPath("/notes/folders"))
        return response as? PlusApiResultListNoteFolderVO
    }

    /// 创建文件夹
    public func createFolder(body: NoteFolderCreateRequest) async throws -> PlusApiResultNoteFolderVO? {
        let response = try await client.post(ApiPaths.appPath("/notes/folders"), body: body)
        return response as? PlusApiResultNoteFolderVO
    }

    /// 获取笔记统计
    public func getNoteStatistics() async throws -> PlusApiResultNoteStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/notes/statistics"))
        return response as? PlusApiResultNoteStatisticsVO
    }

    /// 批量删除笔记
    public func batchDelete() async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/notes/batch"))
        return response as? PlusApiResultNoteOperationVO
    }

    /// 批量删除笔记
    public func deleteBatch() async throws -> PlusApiResultNoteOperationVO? {
        let response = try await client.delete(ApiPaths.appPath("/notes/batch-delete"))
        return response as? PlusApiResultNoteOperationVO
    }
}
