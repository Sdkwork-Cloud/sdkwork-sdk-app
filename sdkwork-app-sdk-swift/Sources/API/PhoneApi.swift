import Foundation

public class PhoneApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 手机号验证码登录
    public func login(body: PhoneLoginForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/phone/login"), body: body)
        return response as? PlusApiResultLoginVO
    }
}
