import Foundation

public class OrganizationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 创建组织
    public func createOrganization(body: OrganizationCreateForm) async throws -> PlusApiResultOrganizationVO? {
        let response = try await client.post(ApiPaths.appPath("/organization"), body: body)
        return response as? PlusApiResultOrganizationVO
    }

    /// 获取组织详情
    public func getOrganization(orgId: String) async throws -> PlusApiResultOrganizationDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)"))
        return response as? PlusApiResultOrganizationDetailVO
    }
}
