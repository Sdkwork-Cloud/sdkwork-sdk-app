import Foundation

public class DepartmentApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 创建部门
    public func createDepartment(body: DepartmentCreateForm) async throws -> PlusApiResultDepartmentVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/department"), body: body)
        return response as? PlusApiResultDepartmentVO
    }

    /// 获取部门详情
    public func getDepartment(deptId: String) async throws -> PlusApiResultDepartmentDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/department/\(deptId)"))
        return response as? PlusApiResultDepartmentDetailVO
    }

    /// 获取子部门
    public func getChildDepartments(deptId: String) async throws -> PlusApiResultListDepartmentVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/department/\(deptId)/children"))
        return response as? PlusApiResultListDepartmentVO
    }
}
