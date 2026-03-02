import Foundation

public class MemberApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取成员详情
    public func getMember(memberId: String) async throws -> PlusApiResultMemberVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/member/\(memberId)"))
        return response as? PlusApiResultMemberVO
    }
}
