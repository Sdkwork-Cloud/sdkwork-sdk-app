package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class PasswordApi(private val client: HttpClient) {

    /** 修改密码 */
    suspend fun change(body: PasswordChangeForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/user/password"), body) as? PlusApiResultVoid
    }

    /** 重置密码 */
    suspend fun reset(body: PasswordResetForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/password/reset"), body) as? PlusApiResultVoid
    }
}
