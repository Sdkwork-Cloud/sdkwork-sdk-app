import Foundation

public class CodeApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 根据编码获取组织
    public func getOrganizationBy(code: String) async throws -> PlusApiResultOrganizationDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/code/\(code)"))
        return response as? PlusApiResultOrganizationDetailVO
    }
}
