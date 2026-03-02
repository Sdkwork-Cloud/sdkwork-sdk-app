import Foundation

public class ChildrenApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取子组织
    public func getChildOrganizations(orgId: String) async throws -> PlusApiResultListOrganizationVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/children"))
        return response as? PlusApiResultListOrganizationVO
    }
}
