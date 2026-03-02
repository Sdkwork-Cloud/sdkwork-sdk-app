import Foundation

public class CollectionApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取合集详情
    public func getCollection(collectionId: String) async throws -> PlusApiResultCollectionDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/collection/\(collectionId)"))
        return response as? PlusApiResultCollectionDetailVO
    }

    /// 更新合集
    public func updateCollection(collectionId: String, body: CollectionUpdateForm) async throws -> PlusApiResultCollectionVO? {
        let response = try await client.put(ApiPaths.appPath("/collection/\(collectionId)"), body: body)
        return response as? PlusApiResultCollectionVO
    }

    /// 删除合集
    public func deleteCollection(collectionId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/collection/\(collectionId)"))
        return response as? PlusApiResultVoid
    }

    /// 更新内容排序
    public func updateItemPositions(collectionId: String, body: CollectionItemPositionForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/collection/\(collectionId)/items/positions"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 创建合集
    public func createCollection(body: CollectionCreateForm) async throws -> PlusApiResultCollectionVO? {
        let response = try await client.post(ApiPaths.appPath("/collection"), body: body)
        return response as? PlusApiResultCollectionVO
    }

    /// 获取合集内容列表
    public func getCollectionItems(collectionId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListCollectionItemVO? {
        let response = try await client.get(ApiPaths.appPath("/collection/\(collectionId)/items"), params: params)
        return response as? PlusApiResultListCollectionItemVO
    }

    /// 添加内容到合集
    public func addItem(collectionId: String, body: CollectionItemAddForm) async throws -> PlusApiResultCollectionItemVO? {
        let response = try await client.post(ApiPaths.appPath("/collection/\(collectionId)/items"), body: body)
        return response as? PlusApiResultCollectionItemVO
    }

    /// 置顶内容
    public func pinItem(collectionId: String, itemId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/collection/\(collectionId)/items/\(itemId)/pin"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消置顶
    public func unpinItem(collectionId: String, itemId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/collection/\(collectionId)/items/\(itemId)/pin"))
        return response as? PlusApiResultVoid
    }

    /// 获取合集路径
    public func getCollectionPath(collectionId: String) async throws -> PlusApiResultListCollectionVO? {
        let response = try await client.get(ApiPaths.appPath("/collection/\(collectionId)/path"))
        return response as? PlusApiResultListCollectionVO
    }

    /// 获取合集树
    public func getCollectionTree(params: [String: Any]? = nil) async throws -> PlusApiResultListCollectionTreeVO? {
        let response = try await client.get(ApiPaths.appPath("/collection/tree"), params: params)
        return response as? PlusApiResultListCollectionTreeVO
    }

    /// 搜索合集
    public func searchCollections(params: [String: Any]? = nil) async throws -> PlusApiResultPageCollectionVO? {
        let response = try await client.get(ApiPaths.appPath("/collection/search"), params: params)
        return response as? PlusApiResultPageCollectionVO
    }

    /// 获取我的合集
    public func getMyCollections(params: [String: Any]? = nil) async throws -> PlusApiResultPageCollectionVO? {
        let response = try await client.get(ApiPaths.appPath("/collection/my"), params: params)
        return response as? PlusApiResultPageCollectionVO
    }

    /// 从合集移除内容
    public func removeItem(collectionId: String, contentId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/collection/\(collectionId)/items/\(contentId)"))
        return response as? PlusApiResultVoid
    }
}
