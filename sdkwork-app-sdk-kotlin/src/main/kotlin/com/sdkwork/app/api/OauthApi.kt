package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class OauthApi(private val client: HttpClient) {

    /** OAuth授权URL */
    suspend fun getOauthUrl(body: OAuthAuthUrlForm): PlusApiResultOAuthUrlVO? {
        return client.post(ApiPaths.appPath("/auth/oauth/url"), body) as? PlusApiResultOAuthUrlVO
    }

    /** OAuth登录 */
    suspend fun login(body: OAuthLoginForm): PlusApiResultLoginVO? {
        return client.post(ApiPaths.appPath("/auth/oauth/login"), body) as? PlusApiResultLoginVO
    }
}
