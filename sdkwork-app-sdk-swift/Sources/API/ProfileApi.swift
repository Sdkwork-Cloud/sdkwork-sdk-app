import Foundation

public class ProfileApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取用户信息
    public func getUser() async throws -> PlusApiResultUserProfileVO? {
        let response = try await client.get(ApiPaths.appPath("/user/profile"))
        return response as? PlusApiResultUserProfileVO
    }

    /// 更新用户信息
    public func updateUser(body: UserProfileUpdateForm) async throws -> PlusApiResultUserProfileVO? {
        let response = try await client.put(ApiPaths.appPath("/user/profile"), body: body)
        return response as? PlusApiResultUserProfileVO
    }
}
