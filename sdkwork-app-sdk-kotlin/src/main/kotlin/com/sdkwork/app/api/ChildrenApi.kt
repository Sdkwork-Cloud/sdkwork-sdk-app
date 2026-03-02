package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ChildrenApi(private val client: HttpClient) {

    /** 获取子组织 */
    suspend fun getChildOrganizations(orgId: String): PlusApiResultListOrganizationVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/children")) as? PlusApiResultListOrganizationVO
    }
}
