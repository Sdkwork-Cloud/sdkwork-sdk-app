import Foundation

public class PasswordApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 修改密码
    public func change(body: PasswordChangeForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/user/password"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 重置密码
    public func reset(body: PasswordResetForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/password/reset"), body: body)
        return response as? PlusApiResultVoid
    }
}
