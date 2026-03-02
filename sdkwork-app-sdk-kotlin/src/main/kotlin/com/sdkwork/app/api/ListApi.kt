package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ListApi(private val client: HttpClient) {

    /** 获取组织列表 */
    suspend fun getOrganization(params: Map<String, Any>? = null): PlusApiResultPageOrganizationVO? {
        return client.get(ApiPaths.appPath("/organization/list"), params) as? PlusApiResultPageOrganizationVO
    }
}
