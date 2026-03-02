import Foundation

public class ShopsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取店铺详情
    public func getShopDetail(shopId: String) async throws -> PlusApiResultShopDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/shops/\(shopId)"))
        return response as? PlusApiResultShopDetailVO
    }

    /// 更新店铺
    public func updateShop(shopId: String, body: ShopUpdateForm) async throws -> PlusApiResultShopVO? {
        let response = try await client.put(ApiPaths.appPath("/shops/\(shopId)"), body: body)
        return response as? PlusApiResultShopVO
    }

    /// 删除店铺
    public func deleteShop(shopId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/shops/\(shopId)"))
        return response as? PlusApiResultVoid
    }

    /// 更新店铺状态
    public func updateStatus(shopId: String, params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/shops/\(shopId)/status"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 开店营业
    public func openShop(shopId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/shops/\(shopId)/open"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 关店休息
    public func closeShop(shopId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/shops/\(shopId)/close"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 获取店铺列表
    public func listShops(params: [String: Any]? = nil) async throws -> PlusApiResultPageShopVO? {
        let response = try await client.get(ApiPaths.appPath("/shops"), params: params)
        return response as? PlusApiResultPageShopVO
    }

    /// 创建店铺
    public func createShop(body: ShopCreateForm) async throws -> PlusApiResultShopVO? {
        let response = try await client.post(ApiPaths.appPath("/shops"), body: body)
        return response as? PlusApiResultShopVO
    }

    /// 获取店铺统计
    public func getStatistics() async throws -> PlusApiResultShopStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/shops/statistics"))
        return response as? PlusApiResultShopStatisticsVO
    }

    /// 获取所有激活店铺
    public func listAllActive() async throws -> PlusApiResultListShopVO? {
        let response = try await client.get(ApiPaths.appPath("/shops/all"))
        return response as? PlusApiResultListShopVO
    }
}
