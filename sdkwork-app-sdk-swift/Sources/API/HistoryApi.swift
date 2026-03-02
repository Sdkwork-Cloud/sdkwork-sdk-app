import Foundation

public class HistoryApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 浏览历史
    public func listBrowse(params: [String: Any]? = nil) async throws -> PlusApiResultPageBrowseHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/history/browse"), params: params)
        return response as? PlusApiResultPageBrowseHistoryVO
    }

    /// 添加浏览记录
    public func addBrowse(body: BrowseHistoryAddForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/history/browse"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 清空浏览历史
    public func clearBrowse(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/history/browse"), params: params)
        return response as? PlusApiResultVoid
    }

    /// 获取登录历史
    public func getLogin(params: [String: Any]? = nil) async throws -> PlusApiResultPageMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/user/history/login"), params: params)
        return response as? PlusApiResultPageMapStringObject
    }

    /// 获取生成历史
    public func getGeneration(params: [String: Any]? = nil) async throws -> PlusApiResultPageMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/user/history/generations"), params: params)
        return response as? PlusApiResultPageMapStringObject
    }

    /// 历史统计
    public func getHistoryStatistics() async throws -> PlusApiResultHistoryStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/history/statistics"))
        return response as? PlusApiResultHistoryStatisticsVO
    }

    /// 浏览统计
    public func getBrowseStatistics() async throws -> PlusApiResultBrowseStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/history/statistics/browse"))
        return response as? PlusApiResultBrowseStatisticsVO
    }

    /// 所有会话
    public func listSessions() async throws -> PlusApiResultListSessionInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/history/sessions"))
        return response as? PlusApiResultListSessionInfoVO
    }

    /// 当前会话
    public func getCurrentSession() async throws -> PlusApiResultSessionInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/history/sessions/current"))
        return response as? PlusApiResultSessionInfoVO
    }

    /// 操作历史
    public func listOperation(params: [String: Any]? = nil) async throws -> PlusApiResultPageOperationHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/history/operations"), params: params)
        return response as? PlusApiResultPageOperationHistoryVO
    }

    /// 最近操作
    public func getRecentOperations(params: [String: Any]? = nil) async throws -> PlusApiResultListOperationHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/history/operations/recent"), params: params)
        return response as? PlusApiResultListOperationHistoryVO
    }

    /// 登录历史
    public func listLogin(params: [String: Any]? = nil) async throws -> PlusApiResultPageLoginHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/history/logins"), params: params)
        return response as? PlusApiResultPageLoginHistoryVO
    }

    /// 生成历史
    public func listGeneration(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/history/generations"), params: params)
        return response as? PlusApiResultPageGenerationHistoryVO
    }

    /// 清空生成历史
    public func clearGeneration() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/history/generations"))
        return response as? PlusApiResultVoid
    }

    /// 最近生成
    public func getRecentGenerations(params: [String: Any]? = nil) async throws -> PlusApiResultListGenerationHistoryVO? {
        let response = try await client.get(ApiPaths.appPath("/history/generations/recent"), params: params)
        return response as? PlusApiResultListGenerationHistoryVO
    }

    /// 终止会话
    public func terminateSession(sessionId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/history/sessions/\(sessionId)"))
        return response as? PlusApiResultVoid
    }

    /// 终止其他会话
    public func terminateOtherSessions() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/history/sessions/others"))
        return response as? PlusApiResultVoid
    }

    /// 删除生成历史
    public func deleteGeneration(historyId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/history/generations/\(historyId)"))
        return response as? PlusApiResultVoid
    }

    /// 删除浏览记录
    public func deleteBrowse(historyId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/history/browse/\(historyId)"))
        return response as? PlusApiResultVoid
    }

    /// 批量删除浏览记录
    public func batchDeleteBrowse() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/history/browse/batch"))
        return response as? PlusApiResultVoid
    }
}
