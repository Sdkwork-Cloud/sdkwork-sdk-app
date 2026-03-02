import Foundation

public class ModelsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 批量获取模型价格
    public func getModelPrices(body: GetModelPricesRequest) async throws -> PlusApiResultListModelPriceVO? {
        let response = try await client.post(ApiPaths.appPath("/models/prices/batch"), body: body)
        return response as? PlusApiResultListModelPriceVO
    }

    /// 获取模型详情
    public func getModelById(modelId: String) async throws -> PlusApiResultModelInfoDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/models/\(modelId)"))
        return response as? PlusApiResultModelInfoDetailVO
    }

    /// 获取模型类型列表
    public func getModelTypes() async throws -> PlusApiResultListModelTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/models/types"))
        return response as? PlusApiResultListModelTypeVO
    }

    /// 获取类型模型列表
    public func getModelsByType(modelType: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/type/\(modelType)"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// 获取模型统计
    public func getModelStatistics() async throws -> PlusApiResultModelStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/models/statistics"))
        return response as? PlusApiResultModelStatisticsVO
    }

    /// 搜索模型
    public func search(params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/search"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// 获取模型价格
    public func getModelPrice(model: String) async throws -> PlusApiResultModelPriceVO? {
        let response = try await client.get(ApiPaths.appPath("/models/price/\(model)"))
        return response as? PlusApiResultModelPriceVO
    }

    /// 获取热门模型
    public func getPopular(params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/popular"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// 获取系列模型列表
    public func getModelsByFamily(family: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/family/\(family)"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// 获取所有模型系列
    public func getAllFamilies() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.appPath("/models/families"))
        return response as? PlusApiResultListString
    }

    /// 获取渠道模型列表
    public func getModelsByChannel(channel: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/channel/\(channel)"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// 根据模型标识获取详情
    public func getModelBy(model: String) async throws -> PlusApiResultModelInfoDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/models/by-model/\(model)"))
        return response as? PlusApiResultModelInfoDetailVO
    }

    /// 获取活跃模型列表
    public func getActive(params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/active"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }
}
