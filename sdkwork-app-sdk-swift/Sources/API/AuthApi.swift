import Foundation

public class AuthApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Request password reset challenge
    public func requestPasswordResetChallenge(body: PasswordResetRequestForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/auth/password/reset/request"), body: body)
        return response as? PlusApiResultVoid
    }
}
