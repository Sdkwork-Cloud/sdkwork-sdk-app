package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class DepartmentApi(private val client: HttpClient) {

    /** 创建部门 */
    suspend fun createDepartment(body: DepartmentCreateForm): PlusApiResultDepartmentVO? {
        return client.post(ApiPaths.appPath("/organization/department"), body) as? PlusApiResultDepartmentVO
    }

    /** 获取部门详情 */
    suspend fun getDepartment(deptId: String): PlusApiResultDepartmentDetailVO? {
        return client.get(ApiPaths.appPath("/organization/department/$deptId")) as? PlusApiResultDepartmentDetailVO
    }

    /** 获取子部门 */
    suspend fun getChildDepartments(deptId: String): PlusApiResultListDepartmentVO? {
        return client.get(ApiPaths.appPath("/organization/department/$deptId/children")) as? PlusApiResultListDepartmentVO
    }
}
