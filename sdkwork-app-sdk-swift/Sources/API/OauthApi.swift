import Foundation

public class OauthApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// OAuth授权URL
    public func getOauthUrl(body: OAuthAuthUrlForm) async throws -> PlusApiResultOAuthUrlVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/oauth/url"), body: body)
        return response as? PlusApiResultOAuthUrlVO
    }

    /// OAuth登录
    public func login(body: OAuthLoginForm) async throws -> PlusApiResultLoginVO? {
        let response = try await client.post(ApiPaths.appPath("/auth/oauth/login"), body: body)
        return response as? PlusApiResultLoginVO
    }
}
