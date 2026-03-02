package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class DisableApi(private val client: HttpClient) {

    /** 禁用组织 */
    suspend fun organization(orgId: String): PlusApiResultOrganizationVO? {
        return client.post(ApiPaths.appPath("/organization/$orgId/disable"), null) as? PlusApiResultOrganizationVO
    }
}
