package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class RefreshApi(private val client: HttpClient) {

    /** 刷新令牌 */
    suspend fun token(body: TokenRefreshForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/refresh"), body) as? PlusApiResultLoginVO
    }
}
