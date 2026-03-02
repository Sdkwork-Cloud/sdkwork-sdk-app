package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class BindApi(private val client: HttpClient) {

    /** 绑定第三方账号 */
    suspend fun thirdPartyAccount(platform: String, body: ThirdPartyBindForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/user/bind/$platform"), body) as? PlusApiResultVoid
    }

    /** 解绑第三方账号 */
    suspend fun unbindThirdPartyAccount(platform: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/user/bind/$platform")) as? PlusApiResultVoid
    }
}
