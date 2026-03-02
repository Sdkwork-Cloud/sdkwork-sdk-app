package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CodeApi(private val client: HttpClient) {

    /** 根据编码获取组织 */
    suspend fun getOrganizationBy(code: String): PlusApiResultOrganizationDetailVO? {
        return client.get(ApiPaths.appPath("/organization/code/$code")) as? PlusApiResultOrganizationDetailVO
    }
}
