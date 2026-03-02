package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class LoginApi(private val client: HttpClient) {

    /** 用户登录 */
    suspend fun login(body: LoginForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/login"), body) as? PlusApiResultLoginVO
    }
}
