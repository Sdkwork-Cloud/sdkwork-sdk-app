import Foundation

public class AppApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取应用详情
    public func getApp(appId: String) async throws -> PlusApiResultAppDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/\(appId)"))
        return response as? PlusApiResultAppDetailVO
    }

    /// 更新应用
    public func updateApp(appId: String, body: AppUpdateForm) async throws -> PlusApiResultAppVO? {
        let response = try await client.put(ApiPaths.appPath("/app/manage/\(appId)"), body: body)
        return response as? PlusApiResultAppVO
    }

    /// 删除应用
    public func deleteApp(appId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/app/manage/\(appId)"))
        return response as? PlusApiResultVoid
    }

    /// 创建应用
    public func createApp(body: AppCreateForm) async throws -> PlusApiResultAppVO? {
        let response = try await client.post(ApiPaths.appPath("/app/manage"), body: body)
        return response as? PlusApiResultAppVO
    }

    /// 停用应用
    public func deactivate(appId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/app/manage/\(appId)/deactivate"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 激活应用
    public func activate(appId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/app/manage/\(appId)/activate"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 检查发布就绪状态
    public func checkPublishReadiness(appId: String) async throws -> PlusApiResultAppPublishReadinessVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/\(appId)/publish/readiness"))
        return response as? PlusApiResultAppPublishReadinessVO
    }

    /// 获取应用统计
    public func getAppStatistics() async throws -> PlusApiResultAppStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/statistics"))
        return response as? PlusApiResultAppStatisticsVO
    }

    /// 搜索应用
    public func searchApps(params: [String: Any]? = nil) async throws -> PlusApiResultPageAppVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/search"), params: params)
        return response as? PlusApiResultPageAppVO
    }

    /// 获取项目应用
    public func getProjectApps(projectId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageAppVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/project/\(projectId)"), params: params)
        return response as? PlusApiResultPageAppVO
    }

    /// 获取我的应用
    public func getMyApps(params: [String: Any]? = nil) async throws -> PlusApiResultPageAppVO? {
        let response = try await client.get(ApiPaths.appPath("/app/manage/my"), params: params)
        return response as? PlusApiResultPageAppVO
    }

    /// 获取账户余额汇总
    public func getAccountSummary() async throws -> PlusApiResultAccountSummaryVO? {
        let response = try await client.get(ApiPaths.appPath("/account/summary"))
        return response as? PlusApiResultAccountSummaryVO
    }
}
