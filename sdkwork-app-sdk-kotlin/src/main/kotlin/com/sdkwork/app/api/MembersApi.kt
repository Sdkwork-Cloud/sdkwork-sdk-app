package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class MembersApi(private val client: HttpClient) {

    /** 获取组织成员 */
    suspend fun getMembersByOrg(orgId: String, params: Map<String, Any>? = null): PlusApiResultPageMemberVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/members"), params) as? PlusApiResultPageMemberVO
    }
}
