import Foundation

public class DisableApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 禁用组织
    public func organization(orgId: String) async throws -> PlusApiResultOrganizationVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/\(orgId)/disable"), body: nil)
        return response as? PlusApiResultOrganizationVO
    }
}
