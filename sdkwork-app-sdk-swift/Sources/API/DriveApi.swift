import Foundation

public class DriveApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Restore drive item
    public func restoreItem(itemId: String) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.put(ApiPaths.appPath("/drive/items/\(itemId)/restore"), body: nil)
        return response as? PlusApiResultDriveItemVO
    }

    /// Rename drive item
    public func renameItem(itemId: String, body: DriveRenameForm) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.put(ApiPaths.appPath("/drive/items/\(itemId)/rename"), body: body)
        return response as? PlusApiResultDriveItemVO
    }

    /// Move drive item
    public func moveItem(itemId: String, body: DriveMoveForm) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.put(ApiPaths.appPath("/drive/items/\(itemId)/move"), body: body)
        return response as? PlusApiResultDriveItemVO
    }

    /// Get drive file content
    public func getItemContent(itemId: String) async throws -> PlusApiResultDriveContentVO? {
        let response = try await client.get(ApiPaths.appPath("/drive/items/\(itemId)/content"))
        return response as? PlusApiResultDriveContentVO
    }

    /// Update drive file content
    public func updateItemContent(itemId: String, body: DriveContentUpdateForm) async throws -> PlusApiResultDriveContentVO? {
        let response = try await client.put(ApiPaths.appPath("/drive/items/\(itemId)/content"), body: body)
        return response as? PlusApiResultDriveContentVO
    }

    /// Archive drive item
    public func archiveItem(itemId: String) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.put(ApiPaths.appPath("/drive/items/\(itemId)/archive"), body: nil)
        return response as? PlusApiResultDriveItemVO
    }

    /// Favorite drive item
    public func favoriteItem(itemId: String) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.post(ApiPaths.appPath("/drive/items/\(itemId)/favorite"), body: nil)
        return response as? PlusApiResultDriveItemVO
    }

    /// Unfavorite drive item
    public func unfavoriteItem(itemId: String) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.delete(ApiPaths.appPath("/drive/items/\(itemId)/favorite"))
        return response as? PlusApiResultDriveItemVO
    }

    /// Copy drive item
    public func copyItem(itemId: String, body: DriveCopyForm) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.post(ApiPaths.appPath("/drive/items/\(itemId)/copy"), body: body)
        return response as? PlusApiResultDriveItemVO
    }

    /// Batch delete drive items
    public func batchDeleteItems(body: DriveBatchDeleteForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/drive/items/batch-delete"), body: body)
        return response as? PlusApiResultVoid
    }

    /// Create drive folder
    public func createFolder(body: DriveFolderCreateForm) async throws -> PlusApiResultDriveItemVO? {
        let response = try await client.post(ApiPaths.appPath("/drive/folders"), body: body)
        return response as? PlusApiResultDriveItemVO
    }

    /// List drive items
    public func listItems(params: [String: Any]? = nil) async throws -> PlusApiResultPageDriveItemVO? {
        let response = try await client.get(ApiPaths.appPath("/drive/items"), params: params)
        return response as? PlusApiResultPageDriveItemVO
    }

    /// Get drive item detail
    public func getItemDetail(itemId: String) async throws -> PlusApiResultDriveItemDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/drive/items/\(itemId)"))
        return response as? PlusApiResultDriveItemDetailVO
    }

    /// Delete drive item
    public func deleteItem(itemId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/drive/items/\(itemId)"))
        return response as? PlusApiResultVoid
    }
}
