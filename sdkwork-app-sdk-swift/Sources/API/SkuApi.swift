import Foundation

public class SkuApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取SKU详情
    public func getSkuDetail(skuId: String) async throws -> PlusApiResultSkuDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/skus/\(skuId)"))
        return response as? PlusApiResultSkuDetailVO
    }

    /// 获取SKU库存
    public func getSkuStock(skuId: String) async throws -> PlusApiResultSkuStockVO? {
        let response = try await client.get(ApiPaths.appPath("/skus/\(skuId)/stock"))
        return response as? PlusApiResultSkuStockVO
    }

    /// 检查SKU库存
    public func checkSkuStock(skuId: String, params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/skus/\(skuId)/check-stock"), params: params)
        return response as? PlusApiResultBoolean
    }

    /// 获取产品的SKU列表
    public func getSkuByProduct(productId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageSkuVO? {
        let response = try await client.get(ApiPaths.appPath("/skus/product/\(productId)"), params: params)
        return response as? PlusApiResultPageSkuVO
    }

    /// 获取产品SKU统计
    public func getSkuStatistics(productId: String) async throws -> PlusApiResultSkuStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/skus/product/\(productId)/statistics"))
        return response as? PlusApiResultSkuStatisticsVO
    }

    /// 检查SKU编码是否存在
    public func checkSkuCodeExists(params: [String: Any]? = nil) async throws -> PlusApiResultBoolean? {
        let response = try await client.get(ApiPaths.appPath("/skus/exists"), params: params)
        return response as? PlusApiResultBoolean
    }

    /// 按编码获取SKU
    public func getSkuByCode(skuCode: String) async throws -> PlusApiResultSkuVO? {
        let response = try await client.get(ApiPaths.appPath("/skus/code/\(skuCode)"))
        return response as? PlusApiResultSkuVO
    }

    /// 批量获取SKU
    public func batchGetSkus(params: [String: Any]? = nil) async throws -> PlusApiResultListSkuVO? {
        let response = try await client.get(ApiPaths.appPath("/skus/batch"), params: params)
        return response as? PlusApiResultListSkuVO
    }
}
