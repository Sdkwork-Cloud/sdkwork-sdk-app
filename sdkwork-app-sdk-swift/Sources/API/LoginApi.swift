import Foundation

public class LoginApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 用户登录
    public func login(body: LoginForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/login"), body: body)
        return response as? PlusApiResultLoginVO
    }
}
