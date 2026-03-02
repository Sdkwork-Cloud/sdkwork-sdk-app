import Foundation

public class StyleApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取风格详情
    public func getStyle(styleId: String) async throws -> PlusApiResultGenerationStyleDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/style/\(styleId)"))
        return response as? PlusApiResultGenerationStyleDetailVO
    }

    /// 更新风格
    public func updateStyle(styleId: String, body: GenerationStyleUpdateForm) async throws -> PlusApiResultGenerationStyleVO? {
        let response = try await client.put(ApiPaths.appPath("/generation/style/\(styleId)"), body: body)
        return response as? PlusApiResultGenerationStyleVO
    }

    /// 删除风格
    public func deleteStyle(styleId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/style/\(styleId)"))
        return response as? PlusApiResultVoid
    }

    /// 创建风格
    public func createStyle(body: GenerationStyleCreateForm) async throws -> PlusApiResultGenerationStyleVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/style"), body: body)
        return response as? PlusApiResultGenerationStyleVO
    }

    /// 发布风格
    public func publish(styleId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/generation/style/\(styleId)/publish"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消发布
    public func unpublish(styleId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/style/\(styleId)/publish"))
        return response as? PlusApiResultVoid
    }

    /// 停用风格
    public func deactivate(styleId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/generation/style/\(styleId)/deactivate"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 激活风格
    public func activate(styleId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/generation/style/\(styleId)/activate"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 获取风格类型列表
    public func getStyleTypes() async throws -> PlusApiResultListStyleTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/style/types"))
        return response as? PlusApiResultListStyleTypeVO
    }

    /// 获取风格统计
    public func getStyleStatistics() async throws -> PlusApiResultStyleStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/style/statistics"))
        return response as? PlusApiResultStyleStatisticsVO
    }

    /// 搜索风格
    public func searchStyles(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationStyleVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/style/search"), params: params)
        return response as? PlusApiResultPageGenerationStyleVO
    }

    /// 获取公开风格
    public func getPublicStyles(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationStyleVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/style/public"), params: params)
        return response as? PlusApiResultPageGenerationStyleVO
    }

    /// 获取热门风格
    public func getPopularStyles(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationStyleVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/style/popular"), params: params)
        return response as? PlusApiResultPageGenerationStyleVO
    }

    /// 获取我的风格
    public func getMyStyles(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationStyleVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/style/my"), params: params)
        return response as? PlusApiResultPageGenerationStyleVO
    }
}
