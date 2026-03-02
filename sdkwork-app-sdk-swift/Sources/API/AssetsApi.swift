import Foundation

public class AssetsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 重命名资产
    public func renameAsset(assetId: String, body: AssetRenameForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/assets/\(assetId)/rename"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 移动资产
    public func moveAsset(assetId: String, body: AssetMoveForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/assets/\(assetId)/move"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 收藏资产
    public func favoriteAsset(assetId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/assets/\(assetId)/favorite"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消收藏
    public func unfavoriteAsset(assetId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/assets/\(assetId)/favorite"))
        return response as? PlusApiResultVoid
    }

    /// 获取文件夹列表
    public func listFolders() async throws -> PlusApiResultListFolderVO? {
        let response = try await client.get(ApiPaths.appPath("/assets/folders"))
        return response as? PlusApiResultListFolderVO
    }

    /// 创建文件夹
    public func createFolder(body: FolderCreateForm) async throws -> PlusApiResultFolderVO? {
        let response = try await client.post(ApiPaths.appPath("/assets/folders"), body: body)
        return response as? PlusApiResultFolderVO
    }

    /// 获取资产列表
    public func listAssets(params: [String: Any]? = nil) async throws -> PlusApiResultPageAssetVO? {
        let response = try await client.get(ApiPaths.appPath("/assets"), params: params)
        return response as? PlusApiResultPageAssetVO
    }

    /// 获取资产详情
    public func getAssetDetail(assetId: String) async throws -> PlusApiResultAssetDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/assets/\(assetId)"))
        return response as? PlusApiResultAssetDetailVO
    }

    /// 删除资产
    public func deleteAsset(assetId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/assets/\(assetId)"))
        return response as? PlusApiResultVoid
    }

    /// 下载资产
    public func getDownloadUrl(assetId: String, params: [String: Any]? = nil) async throws -> PlusApiResultDownloadUrlVO? {
        let response = try await client.get(ApiPaths.appPath("/assets/\(assetId)/download"), params: params)
        return response as? PlusApiResultDownloadUrlVO
    }

    /// 获取资产统计
    public func getStatistics() async throws -> PlusApiResultAssetStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/assets/statistics"))
        return response as? PlusApiResultAssetStatisticsVO
    }

    /// 删除文件夹
    public func deleteFolder(folderId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/assets/folders/\(folderId)"))
        return response as? PlusApiResultVoid
    }

    /// 批量删除资产
    public func batchDelete() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/assets/batch"))
        return response as? PlusApiResultVoid
    }
}
