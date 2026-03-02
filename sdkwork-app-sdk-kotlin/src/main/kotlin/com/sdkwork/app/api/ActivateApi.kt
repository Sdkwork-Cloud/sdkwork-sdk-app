package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ActivateApi(private val client: HttpClient) {

    /** 激活组织 */
    suspend fun organization(orgId: String): PlusApiResultOrganizationVO? {
        return client.post(ApiPaths.appPath("/organization/$orgId/activate"), null) as? PlusApiResultOrganizationVO
    }
}
