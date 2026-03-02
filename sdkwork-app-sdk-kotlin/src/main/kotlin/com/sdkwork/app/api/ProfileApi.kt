package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ProfileApi(private val client: HttpClient) {

    /** 获取用户信息 */
    suspend fun getUser(): PlusApiResultUserProfileVO? {
        return client.get(ApiPaths.appPath("/user/profile")) as? PlusApiResultUserProfileVO
    }

    /** 更新用户信息 */
    suspend fun updateUser(body: UserProfileUpdateForm): PlusApiResultUserProfileVO? {
        return client.put(ApiPaths.appPath("/user/profile"), body) as? PlusApiResultUserProfileVO
    }
}
