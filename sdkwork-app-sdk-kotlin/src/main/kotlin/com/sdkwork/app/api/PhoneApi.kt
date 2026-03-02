package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class PhoneApi(private val client: HttpClient) {

    /** 手机号验证码登录 */
    suspend fun login(body: PhoneLoginForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/phone/login"), body) as? PlusApiResultLoginVO
    }
}
