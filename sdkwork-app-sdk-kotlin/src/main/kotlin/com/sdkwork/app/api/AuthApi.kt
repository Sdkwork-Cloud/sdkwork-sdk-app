package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AuthApi(private val client: HttpClient) {

    /** Request password reset challenge */
    suspend fun requestPasswordResetChallenge(body: PasswordResetRequestForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/password/reset/request"), body) as? PlusApiResultVoid
    }
}
