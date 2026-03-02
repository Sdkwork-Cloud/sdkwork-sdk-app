import Foundation

public class ProductsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取商品列表
    public func getProducts(params: [String: Any]? = nil) async throws -> PlusApiResultPageProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products"), params: params)
        return response as? PlusApiResultPageProductVO
    }

    /// 获取商品详情
    public func getProductDetail(productId: String) async throws -> PlusApiResultProductDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)"))
        return response as? PlusApiResultProductDetailVO
    }

    /// 获取商品库存
    public func getProductStock(productId: String) async throws -> PlusApiResultInteger? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/stock"))
        return response as? PlusApiResultInteger
    }

    /// 获取商品统计
    public func getProductStatistics(productId: String) async throws -> PlusApiResultProductStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/statistics"))
        return response as? PlusApiResultProductStatisticsVO
    }

    /// 获取商品SKU列表
    public func getProductSkus(productId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListSkuVO? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/skus"), params: params)
        return response as? PlusApiResultListSkuVO
    }

    /// 检查商品库存
    public func checkProductStock(productId: String, params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/products/\(productId)/check-stock"), params: params)
        return response as? PlusApiResultBoolean
    }

    /// 搜索商品
    public func search(params: [String: Any]? = nil) async throws -> PlusApiResultPageProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/search"), params: params)
        return response as? PlusApiResultPageProductVO
    }

    /// 获取最新商品
    public func getLatest(params: [String: Any]? = nil) async throws -> PlusApiResultListProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/latest"), params: params)
        return response as? PlusApiResultListProductVO
    }

    /// 获取热门商品
    public func getHot(params: [String: Any]? = nil) async throws -> PlusApiResultListProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/hot"), params: params)
        return response as? PlusApiResultListProductVO
    }

    /// 按编码获取商品
    public func getProductByCode(code: String) async throws -> PlusApiResultProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/code/\(code)"))
        return response as? PlusApiResultProductVO
    }

    /// 按分类获取商品
    public func getProductsByCategory(categoryId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageProductVO? {
        let response = try await client.get(ApiPaths.appPath("/products/category/\(categoryId)"), params: params)
        return response as? PlusApiResultPageProductVO
    }
}
