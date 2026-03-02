import Foundation

public class PositionsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取组织的岗位列表
    public func getPositionsByOrg(orgId: String) async throws -> PlusApiResultListPositionVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/positions"))
        return response as? PlusApiResultListPositionVO
    }

    /// 获取岗位树
    public func getPositionTree(orgId: String) async throws -> PlusApiResultListPositionDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/positions/tree"))
        return response as? PlusApiResultListPositionDetailVO
    }
}
