import Foundation

public class LogoutApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 用户登出
    public func logout() async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/logout"), body: nil)
        return response as? PlusApiResultVoid
    }
}
