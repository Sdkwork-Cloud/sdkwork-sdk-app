import Foundation

public class ListApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取组织列表
    public func getOrganization(params: [String: Any]? = nil) async throws -> PlusApiResultPageOrganizationVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/list"), params: params)
        return response as? PlusApiResultPageOrganizationVO
    }
}
