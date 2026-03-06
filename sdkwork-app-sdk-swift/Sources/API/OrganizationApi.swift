import Foundation

public class OrganizationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 创建组织
    public func createOrganization(body: OrganizationCreateForm) async throws -> PlusApiResultOrganizationVO? {
        let response = try await client.post(ApiPaths.appPath("/organization"), body: body)
        return response as? PlusApiResultOrganizationVO
    }

    /// 禁用组织
    public func disable(orgId: String) async throws -> PlusApiResultOrganizationVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/\(orgId)/disable"), body: nil)
        return response as? PlusApiResultOrganizationVO
    }

    /// 激活组织
    public func activate(orgId: String) async throws -> PlusApiResultOrganizationVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/\(orgId)/activate"), body: nil)
        return response as? PlusApiResultOrganizationVO
    }

    /// 创建岗位
    public func createPosition(body: PositionCreateForm) async throws -> PlusApiResultPositionVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/position"), body: body)
        return response as? PlusApiResultPositionVO
    }

    /// 创建部门
    public func createDepartment(body: DepartmentCreateForm) async throws -> PlusApiResultDepartmentVO? {
        let response = try await client.post(ApiPaths.appPath("/organization/department"), body: body)
        return response as? PlusApiResultDepartmentVO
    }

    /// 获取组织详情
    public func getOrganization(orgId: String) async throws -> PlusApiResultOrganizationDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)"))
        return response as? PlusApiResultOrganizationDetailVO
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

    /// 获取组织成员
    public func getMembersByOrg(orgId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageMemberVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/members"), params: params)
        return response as? PlusApiResultPageMemberVO
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

    /// 获取子组织
    public func getChildOrganizations(orgId: String) async throws -> PlusApiResultListOrganizationVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/\(orgId)/children"))
        return response as? PlusApiResultListOrganizationVO
    }

    /// 获取组织统计
    public func getOrganizationStatistics() async throws -> PlusApiResultOrganizationStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/statistics"))
        return response as? PlusApiResultOrganizationStatisticsVO
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

    /// 获取成员详情
    public func getMember(memberId: String) async throws -> PlusApiResultMemberVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/member/\(memberId)"))
        return response as? PlusApiResultMemberVO
    }

    /// 获取组织列表
    public func getOrganizationList(params: [String: Any]? = nil) async throws -> PlusApiResultPageOrganizationVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/list"), params: params)
        return response as? PlusApiResultPageOrganizationVO
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

    /// 根据编码获取组织
    public func getOrganizationByCode(code: String) async throws -> PlusApiResultOrganizationDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/organization/code/\(code)"))
        return response as? PlusApiResultOrganizationDetailVO
    }
}
