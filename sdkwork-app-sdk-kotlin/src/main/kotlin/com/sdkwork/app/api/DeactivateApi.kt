package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class DeactivateApi(private val client: HttpClient) {

    /** 注销账号 */
    suspend fun account(body: AccountDeactivateForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/user/deactivate"), body) as? PlusApiResultVoid
    }
}
