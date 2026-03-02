package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SmsApi(private val client: HttpClient) {

    /** 验证验证码 */
    suspend fun verifySmsCode(body: VerifyCodeCheckForm): PlusApiResultVerifyResultVO? {
        return client.post(ApiPaths.appPath("/auth/sms/verify"), body) as? PlusApiResultVerifyResultVO
    }

    /** 发送验证码 */
    suspend fun sendSmsCode(body: VerifyCodeSendForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/sms/send"), body) as? PlusApiResultVoid
    }
}
