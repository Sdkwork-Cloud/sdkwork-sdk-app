import Foundation

public class AvatarApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 上传头像
    public func upload(body: UploadAvatarRequest? = nil) async throws -> PlusApiResultMapStringString? {
        let response = try await client.post(ApiPaths.appPath("/user/avatar"), body: body)
        return response as? PlusApiResultMapStringString
    }
}
