import Foundation

public class CartApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 更新购物车商品数量
    public func updateItemQuantity(itemId: String, body: UpdateCartItemForm) async throws -> PlusApiResultCartItemVO? {
        let response = try await client.put(ApiPaths.appPath("/cart/items/\(itemId)"), body: body)
        return response as? PlusApiResultCartItemVO
    }

    /// 删除购物车商品
    public func removeItem(itemId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/cart/items/\(itemId)"))
        return response as? PlusApiResultVoid
    }

    /// 更新商品选中状态
    public func updateItemSelection(itemId: String, params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/cart/items/\(itemId)/select"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 批量更新选中状态
    public func batchUpdateSelection(body: BatchSelectForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/cart/items/select"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取购物车商品列表
    public func getCartItems() async throws -> PlusApiResultListCartItemVO? {
        let response = try await client.get(ApiPaths.appPath("/cart/items"))
        return response as? PlusApiResultListCartItemVO
    }

    /// 添加商品到购物车
    public func addItem(body: AddCartItemForm) async throws -> PlusApiResultCartItemVO? {
        let response = try await client.post(ApiPaths.appPath("/cart/items"), body: body)
        return response as? PlusApiResultCartItemVO
    }

    /// 批量删除购物车商品
    public func removeItems(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/cart/items"), params: params)
        return response as? PlusApiResultVoid
    }

    /// 获取当前用户购物车
    public func getMy() async throws -> PlusApiResultShoppingCartVO? {
        let response = try await client.get(ApiPaths.appPath("/cart"))
        return response as? PlusApiResultShoppingCartVO
    }

    /// 清空购物车
    public func clear() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/cart"))
        return response as? PlusApiResultVoid
    }

    /// 获取购物车统计
    public func getCartStatistics() async throws -> PlusApiResultCartStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/cart/statistics"))
        return response as? PlusApiResultCartStatisticsVO
    }

    /// 获取选中的商品列表
    public func getSelectedItems() async throws -> PlusApiResultListCartItemVO? {
        let response = try await client.get(ApiPaths.appPath("/cart/items/selected"))
        return response as? PlusApiResultListCartItemVO
    }

    /// 检查商品是否在购物车中
    public func checkItemIn(params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/cart/check"), params: params)
        return response as? PlusApiResultBoolean
    }
}
