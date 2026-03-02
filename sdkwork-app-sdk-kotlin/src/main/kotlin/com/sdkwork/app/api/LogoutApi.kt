package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class LogoutApi(private val client: HttpClient) {

    /** 用户登出 */
    suspend fun logout(): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/logout"), null) as? PlusApiResultVoid
    }
}
