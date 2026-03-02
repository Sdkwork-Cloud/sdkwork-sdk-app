package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class DepartmentsApi(private val client: HttpClient) {

    /** 获取组织的部门列表 */
    suspend fun getDepartmentsByOrg(orgId: String): PlusApiResultListDepartmentVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/departments")) as? PlusApiResultListDepartmentVO
    }

    /** 获取部门树 */
    suspend fun getDepartmentTree(orgId: String): PlusApiResultListDepartmentDetailVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/departments/tree")) as? PlusApiResultListDepartmentDetailVO
    }
}
