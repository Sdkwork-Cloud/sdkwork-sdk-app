import Foundation

public class RefreshApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 刷新令牌
    public func token(body: TokenRefreshForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/refresh"), body: body)
        return response as? PlusApiResultLoginVO
    }
}
