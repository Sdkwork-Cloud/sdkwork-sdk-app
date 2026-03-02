import Foundation

public class DepartmentsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取组织的部门列表
    public func getDepartmentsByOrg(orgId: String) async throws -> PlusApiResultListDepartmentVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/departments"))
        return response as? PlusApiResultListDepartmentVO
    }

    /// 获取部门树
    public func getDepartmentTree(orgId: String) async throws -> PlusApiResultListDepartmentDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/departments/tree"))
        return response as? PlusApiResultListDepartmentDetailVO
    }
}
