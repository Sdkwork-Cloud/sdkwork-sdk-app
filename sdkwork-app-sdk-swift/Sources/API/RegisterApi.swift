import Foundation

public class RegisterApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 用户注册
    public func register(body: RegisterForm) async throws -> PlusApiResultUserInfoVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/register"), body: body)
        return response as? PlusApiResultUserInfoVO
    }
}
