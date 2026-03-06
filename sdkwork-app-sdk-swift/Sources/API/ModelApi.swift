import Foundation

public class ModelApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Batch get model prices
    public func getModelPrices(body: GetModelPricesRequest) async throws -> PlusApiResultListModelPriceVO? {
        let response = try await client.post(ApiPaths.appPath("/models/prices/batch"), body: body)
        return response as? PlusApiResultListModelPriceVO
    }

    /// Get model detail
    public func getModelById(modelId: String) async throws -> PlusApiResultModelInfoDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/models/\(modelId)"))
        return response as? PlusApiResultModelInfoDetailVO
    }

    /// Get model types
    public func getModelTypes() async throws -> PlusApiResultListModelTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/models/types"))
        return response as? PlusApiResultListModelTypeVO
    }

    /// Get models by type
    public func getModelsByType(modelType: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/type/\(modelType)"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// Get model statistics
    public func getModelStatistics() async throws -> PlusApiResultModelStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/models/statistics"))
        return response as? PlusApiResultModelStatisticsVO
    }

    /// Search models
    public func searchModels(params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/search"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// Get model default price
    public func getModelPrice(model: String) async throws -> PlusApiResultModelPriceVO? {
        let response = try await client.get(ApiPaths.appPath("/models/price/\(model)"))
        return response as? PlusApiResultModelPriceVO
    }

    /// Get model pricing rules
    public func getModelPriceRules(model: String, params: [String: Any]? = nil) async throws -> PlusApiResultListModelPriceVO? {
        let response = try await client.get(ApiPaths.appPath("/models/price-rules/\(model)"), params: params)
        return response as? PlusApiResultListModelPriceVO
    }

    /// Get popular models
    public func getPopularModels(params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/popular"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// Get models by family
    public func getModelsByFamily(family: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/family/\(family)"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// Get all families
    public func getAllFamilies() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.appPath("/models/families"))
        return response as? PlusApiResultListString
    }

    /// Get models by channel
    public func getModelsByChannel(channel: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/channel/\(channel)"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }

    /// Get model detail by alias
    public func getModelBy(model: String) async throws -> PlusApiResultModelInfoDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/models/by-model/\(model)"))
        return response as? PlusApiResultModelInfoDetailVO
    }

    /// Get active models
    public func getActiveModels(params: [String: Any]? = nil) async throws -> PlusApiResultPageModelInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/models/active"), params: params)
        return response as? PlusApiResultPageModelInfoVO
    }
}
