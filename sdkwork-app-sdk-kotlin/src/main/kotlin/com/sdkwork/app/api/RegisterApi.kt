package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class RegisterApi(private val client: HttpClient) {

    /** 用户注册 */
    suspend fun register(body: RegisterForm): PlusApiResultUserInfoVO? {
        return client.post(ApiPaths.appPath("/auth/register"), body) as? PlusApiResultUserInfoVO
    }
}
