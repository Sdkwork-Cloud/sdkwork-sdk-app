package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class MemberApi(private val client: HttpClient) {

    /** 获取成员详情 */
    suspend fun getMember(memberId: String): PlusApiResultMemberVO? {
        return client.get(ApiPaths.appPath("/organization/member/$memberId")) as? PlusApiResultMemberVO
    }
}
