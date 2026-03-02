import Foundation

public class DeactivateApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 注销账号
    public func account(body: AccountDeactivateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/user/deactivate"), body: body)
        return response as? PlusApiResultVoid
    }
}
