import Foundation

public class BindApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 绑定第三方账号
    public func thirdPartyAccount(platform: String, body: ThirdPartyBindForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/user/bind/\(platform)"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 解绑第三方账号
    public func unbindThirdPartyAccount(platform: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/user/bind/\(platform)"))
        return response as? PlusApiResultVoid
    }
}
