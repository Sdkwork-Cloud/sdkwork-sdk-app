package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class OrganizationApi(private val client: HttpClient) {

    /** 创建组织 */
    suspend fun createOrganization(body: OrganizationCreateForm): PlusApiResultOrganizationVO? {
        return client.post(ApiPaths.appPath("/organization"), body) as? PlusApiResultOrganizationVO
    }

    /** 禁用组织 */
    suspend fun disable(orgId: String): PlusApiResultOrganizationVO? {
        return client.post(ApiPaths.appPath("/organization/$orgId/disable"), null) as? PlusApiResultOrganizationVO
    }

    /** 激活组织 */
    suspend fun activate(orgId: String): PlusApiResultOrganizationVO? {
        return client.post(ApiPaths.appPath("/organization/$orgId/activate"), null) as? PlusApiResultOrganizationVO
    }

    /** 创建岗位 */
    suspend fun createPosition(body: PositionCreateForm): PlusApiResultPositionVO? {
        return client.post(ApiPaths.appPath("/organization/position"), body) as? PlusApiResultPositionVO
    }

    /** 创建部门 */
    suspend fun createDepartment(body: DepartmentCreateForm): PlusApiResultDepartmentVO? {
        return client.post(ApiPaths.appPath("/organization/department"), body) as? PlusApiResultDepartmentVO
    }

    /** 获取组织详情 */
    suspend fun getOrganization(orgId: String): PlusApiResultOrganizationDetailVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId")) as? PlusApiResultOrganizationDetailVO
    }

    /** 获取组织的岗位列表 */
    suspend fun getPositionsByOrg(orgId: String): PlusApiResultListPositionVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/positions")) as? PlusApiResultListPositionVO
    }

    /** 获取岗位树 */
    suspend fun getPositionTree(orgId: String): PlusApiResultListPositionDetailVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/positions/tree")) as? PlusApiResultListPositionDetailVO
    }

    /** 获取组织成员 */
    suspend fun getMembersByOrg(orgId: String, params: Map<String, Any>? = null): PlusApiResultPageMemberVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/members"), params) as? PlusApiResultPageMemberVO
    }

    /** 获取组织的部门列表 */
    suspend fun getDepartmentsByOrg(orgId: String): PlusApiResultListDepartmentVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/departments")) as? PlusApiResultListDepartmentVO
    }

    /** 获取部门树 */
    suspend fun getDepartmentTree(orgId: String): PlusApiResultListDepartmentDetailVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/departments/tree")) as? PlusApiResultListDepartmentDetailVO
    }

    /** 获取子组织 */
    suspend fun getChildOrganizations(orgId: String): PlusApiResultListOrganizationVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/children")) as? PlusApiResultListOrganizationVO
    }

    /** 获取组织统计 */
    suspend fun getOrganizationStatistics(): PlusApiResultOrganizationStatisticsVO? {
        return client.get(ApiPaths.appPath("/organization/statistics")) as? PlusApiResultOrganizationStatisticsVO
    }

    /** 获取岗位详情 */
    suspend fun getPosition(posId: String): PlusApiResultPositionDetailVO? {
        return client.get(ApiPaths.appPath("/organization/position/$posId")) as? PlusApiResultPositionDetailVO
    }

    /** 获取子岗位 */
    suspend fun getChildPositions(posId: String): PlusApiResultListPositionVO? {
        return client.get(ApiPaths.appPath("/organization/position/$posId/children")) as? PlusApiResultListPositionVO
    }

    /** 获取成员详情 */
    suspend fun getMember(memberId: String): PlusApiResultMemberVO? {
        return client.get(ApiPaths.appPath("/organization/member/$memberId")) as? PlusApiResultMemberVO
    }

    /** 获取组织列表 */
    suspend fun getOrganizationList(params: Map<String, Any>? = null): PlusApiResultPageOrganizationVO? {
        return client.get(ApiPaths.appPath("/organization/list"), params) as? PlusApiResultPageOrganizationVO
    }

    /** 获取部门详情 */
    suspend fun getDepartment(deptId: String): PlusApiResultDepartmentDetailVO? {
        return client.get(ApiPaths.appPath("/organization/department/$deptId")) as? PlusApiResultDepartmentDetailVO
    }

    /** 获取子部门 */
    suspend fun getChildDepartments(deptId: String): PlusApiResultListDepartmentVO? {
        return client.get(ApiPaths.appPath("/organization/department/$deptId/children")) as? PlusApiResultListDepartmentVO
    }

    /** 根据编码获取组织 */
    suspend fun getOrganizationByCode(code: String): PlusApiResultOrganizationDetailVO? {
        return client.get(ApiPaths.appPath("/organization/code/$code")) as? PlusApiResultOrganizationDetailVO
    }
}
