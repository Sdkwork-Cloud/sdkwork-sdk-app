package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AvatarApi(private val client: HttpClient) {

    /** 上传头像 */
    suspend fun upload(body: UploadAvatarRequest? = null): PlusApiResultMapStringString? {
        return client.post(ApiPaths.appPath("/user/avatar"), body) as? PlusApiResultMapStringString
    }
}
