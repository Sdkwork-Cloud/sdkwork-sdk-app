import Foundation

public class PositionApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 创建岗位
    public func createPosition(body: PositionCreateForm) async throws -> PlusApiResultPositionVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/position"), body: body)
        return response as? PlusApiResultPositionVO
    }

    /// 获取岗位详情
    public func getPosition(posId: String) async throws -> PlusApiResultPositionDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/position/\(posId)"))
        return response as? PlusApiResultPositionDetailVO
    }

    /// 获取子岗位
    public func getChildPositions(posId: String) async throws -> PlusApiResultListPositionVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/position/\(posId)/children"))
        return response as? PlusApiResultListPositionVO
    }
}
