import Foundation

public class AiApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取提示语详情
    public func getPromptDetail(id: String) async throws -> PlusApiResultPromptVO? {
        let response = try await client.get(ApiPaths.appPath("/prompt/\(id)"))
        return response as? PlusApiResultPromptVO
    }

    /// 更新提示语
    public func updatePrompt(id: String, body: PromptUpdateForm) async throws -> PlusApiResultPromptVO? {
        let response = try await client.put(ApiPaths.appPath("/prompt/\(id)"), body: body)
        return response as? PlusApiResultPromptVO
    }

    /// 删除提示语
    public func deletePrompt(id: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/prompt/\(id)"))
        return response as? PlusApiResultVoid
    }

    /// 创建提示语
    public func createPrompt(body: PromptCreateForm) async throws -> PlusApiResultPromptVO? {
        let response = try await client.post(ApiPaths.appPath("/prompt"), body: body)
        return response as? PlusApiResultPromptVO
    }

    /// 使用提示语
    public func usePrompt(id: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/prompt/\(id)/use"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 收藏提示语
    public func favoritePrompt(id: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/prompt/\(id)/favorite"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消收藏提示语
    public func unfavoritePrompt(id: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/prompt/\(id)/favorite"))
        return response as? PlusApiResultVoid
    }

    /// 获取热门提示语
    public func getPopularPrompts(params: [String: Any]? = nil) async throws -> PlusApiResultPagePromptVO? {
        let response = try await client.get(ApiPaths.appPath("/prompt/popular"), params: params)
        return response as? PlusApiResultPagePromptVO
    }

    /// 获取最受欢迎提示语
    public func getMostFavoritedPrompts(params: [String: Any]? = nil) async throws -> PlusApiResultPagePromptVO? {
        let response = try await client.get(ApiPaths.appPath("/prompt/most-favorited"), params: params)
        return response as? PlusApiResultPagePromptVO
    }

    /// 获取提示语列表
    public func listPrompts(params: [String: Any]? = nil) async throws -> PlusApiResultPagePromptVO? {
        let response = try await client.get(ApiPaths.appPath("/prompt/list"), params: params)
        return response as? PlusApiResultPagePromptVO
    }

    /// 获取提示语历史详情
    public func getPromptHistoryDetail(id: String) async throws -> PlusApiResultPromptHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/prompt/history/\(id)"))
        return response as? PlusApiResultPromptHistoryVO
    }

    /// 删除提示语历史
    public func deletePromptHistory(id: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/prompt/history/\(id)"))
        return response as? PlusApiResultVoid
    }

    /// 获取提示语使用历史
    public func listPromptHistory(params: [String: Any]? = nil) async throws -> PlusApiResultPagePromptHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/prompt/history/list"), params: params)
        return response as? PlusApiResultPagePromptHistoryVO
    }
}
