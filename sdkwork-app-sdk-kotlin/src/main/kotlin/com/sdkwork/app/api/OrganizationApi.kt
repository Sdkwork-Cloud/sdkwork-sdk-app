package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class OrganizationApi(private val client: HttpClient) {

    /** 创建组织 */
    suspend fun createOrganization(body: OrganizationCreateForm): PlusApiResultOrganizationVO? {
        return client.post(ApiPaths.appPath("/organization"), body) as? PlusApiResultOrganizationVO
    }

    /** 获取组织详情 */
    suspend fun getOrganization(orgId: String): PlusApiResultOrganizationDetailVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId")) as? PlusApiResultOrganizationDetailVO
    }
}
