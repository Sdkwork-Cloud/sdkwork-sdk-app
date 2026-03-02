import Foundation

public class TenantApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取租户详情
    public func getTenant(tenantId: String) async throws -> PlusApiResultTenantDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/tenant/\(tenantId)"))
        return response as? PlusApiResultTenantDetailVO
    }

    /// 更新租户
    public func updateTenant(tenantId: String, body: TenantUpdateForm) async throws -> PlusApiResultTenantVO? {
        let response = try await client.put(ApiPaths.appPath("/tenant/\(tenantId)"), body: body)
        return response as? PlusApiResultTenantVO
    }

    /// 创建租户
    public func createTenant(body: TenantCreateForm) async throws -> PlusApiResultTenantVO? {
        let response = try await client.post(ApiPaths.appPath("/tenant"), body: body)
        return response as? PlusApiResultTenantVO
    }

    /// 冻结租户
    public func freeze(tenantId: String) async throws -> PlusApiResultTenantVO? {
        let response = try await client.post(ApiPaths.appPath("/tenant/\(tenantId)/freeze"), body: nil)
        return response as? PlusApiResultTenantVO
    }

    /// 注销租户
    public func close(tenantId: String) async throws -> PlusApiResultTenantVO? {
        let response = try await client.post(ApiPaths.appPath("/tenant/\(tenantId)/close"), body: nil)
        return response as? PlusApiResultTenantVO
    }

    /// 激活租户
    public func activate(tenantId: String) async throws -> PlusApiResultTenantVO? {
        let response = try await client.post(ApiPaths.appPath("/tenant/\(tenantId)/activate"), body: nil)
        return response as? PlusApiResultTenantVO
    }

    /// 获取租户类型列表
    public func getTenantTypes() async throws -> PlusApiResultListTenantTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/tenant/types"))
        return response as? PlusApiResultListTenantTypeVO
    }

    /// 获取租户统计
    public func getTenantStatistics() async throws -> PlusApiResultTenantStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/tenant/statistics"))
        return response as? PlusApiResultTenantStatisticsVO
    }

    /// 获取根租户
    public func getRoot() async throws -> PlusApiResultTenantDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/tenant/root"))
        return response as? PlusApiResultTenantDetailVO
    }

    /// 获取租户列表
    public func getTenantList(params: [String: Any]? = nil) async throws -> PlusApiResultPageTenantVO? {
        let response = try await client.get(ApiPaths.appPath("/tenant/list"), params: params)
        return response as? PlusApiResultPageTenantVO
    }

    /// 根据编码获取租户
    public func getTenantByCode(code: String) async throws -> PlusApiResultTenantDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/tenant/code/\(code)"))
        return response as? PlusApiResultTenantDetailVO
    }

    /// 获取云租户
    public func getCloud() async throws -> PlusApiResultTenantDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/tenant/cloud"))
        return response as? PlusApiResultTenantDetailVO
    }
}
