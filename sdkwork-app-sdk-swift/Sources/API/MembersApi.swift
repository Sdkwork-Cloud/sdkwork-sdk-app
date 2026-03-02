import Foundation

public class MembersApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取组织成员
    public func getMembersByOrg(orgId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageMemberVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/members"), params: params)
        return response as? PlusApiResultPageMemberVO
    }
}
