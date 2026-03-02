import Foundation

public class FavoriteApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 移动收藏
    public func moveFavoriteToFolder(favoriteId: String, body: FavoriteMoveForm) async throws -> PlusApiResultFavoriteVO? {
        let response = try await client.put(ApiPaths.appPath("/favorite/\(favoriteId)/move"), body: body)
        return response as? PlusApiResultFavoriteVO
    }

    /// 更新收藏夹
    public func updateFavoriteFolder(folderId: String, body: FavoriteFolderUpdateForm) async throws -> PlusApiResultFavoriteFolderVO? {
        let response = try await client.put(ApiPaths.appPath("/favorite/folders/\(folderId)"), body: body)
        return response as? PlusApiResultFavoriteFolderVO
    }

    /// 删除收藏夹
    public func deleteFavoriteFolder(folderId: String, params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/favorite/folders/\(folderId)"), params: params)
        return response as? PlusApiResultVoid
    }

    /// 批量移动收藏
    public func batchMoveFavorites(body: FavoriteBatchMoveForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/favorite/batch/move"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 收藏列表
    public func listFavorites(params: [String: Any]? = nil) async throws -> PlusApiResultPageFavoriteItemVO? {
        let response = try await client.get(ApiPaths.appPath("/favorite"), params: params)
        return response as? PlusApiResultPageFavoriteItemVO
    }

    /// 添加收藏
    public func add(body: FavoriteAddForm) async throws -> PlusApiResultFavoriteVO? {
        let response = try await client.post(ApiPaths.appPath("/favorite"), body: body)
        return response as? PlusApiResultFavoriteVO
    }

    /// 收藏夹列表
    public func listFavoriteFolders() async throws -> PlusApiResultListFavoriteFolderVO? {
        let response = try await client.get(ApiPaths.appPath("/favorite/folders"))
        return response as? PlusApiResultListFavoriteFolderVO
    }

    /// 创建收藏夹
    public func createFavoriteFolder(body: FavoriteFolderCreateForm) async throws -> PlusApiResultFavoriteFolderVO? {
        let response = try await client.post(ApiPaths.appPath("/favorite/folders"), body: body)
        return response as? PlusApiResultFavoriteFolderVO
    }

    /// 批量检查收藏
    public func batchCheckFavorites(body: FavoriteBatchCheckForm) async throws -> PlusApiResultListFavoriteCheckVO? {
        let response = try await client.post(ApiPaths.appPath("/favorite/batch-check"), body: body)
        return response as? PlusApiResultListFavoriteCheckVO
    }

    /// 收藏详情
    public func getFavoriteDetail(favoriteId: String) async throws -> PlusApiResultFavoriteDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/favorite/\(favoriteId)"))
        return response as? PlusApiResultFavoriteDetailVO
    }

    /// 取消收藏
    public func remove(favoriteId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/favorite/\(favoriteId)"))
        return response as? PlusApiResultVoid
    }

    /// 收藏统计
    public func getFavoriteStatistics() async throws -> PlusApiResultFavoriteStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/favorite/statistics"))
        return response as? PlusApiResultFavoriteStatisticsVO
    }

    /// 最近收藏
    public func getRecentFavorites(params: [String: Any]? = nil) async throws -> PlusApiResultListFavoriteItemVO? {
        let response = try await client.get(ApiPaths.appPath("/favorite/recent"), params: params)
        return response as? PlusApiResultListFavoriteItemVO
    }

    /// 各类型收藏数
    public func getFavoriteCountByType() async throws -> PlusApiResultListFavoriteTypeCountVO? {
        let response = try await client.get(ApiPaths.appPath("/favorite/count/by-type"))
        return response as? PlusApiResultListFavoriteTypeCountVO
    }

    /// 检查收藏状态
    public func check(params: [String: Any]? = nil) async throws -> PlusApiResultFavoriteCheckVO? {
        let response = try await client.get(ApiPaths.appPath("/favorite/check"), params: params)
        return response as? PlusApiResultFavoriteCheckVO
    }

    /// 按目标取消收藏
    public func removeFavoriteByTarget(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/favorite/by-target"), params: params)
        return response as? PlusApiResultVoid
    }

    /// 批量取消收藏
    public func batchRemoveFavorites() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/favorite/batch"))
        return response as? PlusApiResultVoid
    }
}
