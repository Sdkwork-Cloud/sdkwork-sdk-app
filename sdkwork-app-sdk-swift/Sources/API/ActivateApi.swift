import Foundation

public class ActivateApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 激活组织
    public func organization(orgId: String) async throws -> PlusApiResultOrganizationVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/\(orgId)/activate"), body: nil)
        return response as? PlusApiResultOrganizationVO
    }
}
