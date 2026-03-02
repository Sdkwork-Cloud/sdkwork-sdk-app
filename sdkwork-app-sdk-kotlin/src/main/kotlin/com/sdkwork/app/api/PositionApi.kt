package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class PositionApi(private val client: HttpClient) {

    /** 创建岗位 */
    suspend fun createPosition(body: PositionCreateForm): PlusApiResultPositionVO? {
        return client.post(ApiPaths.appPath("/organization/position"), body) as? PlusApiResultPositionVO
    }

    /** 获取岗位详情 */
    suspend fun getPosition(posId: String): PlusApiResultPositionDetailVO? {
        return client.get(ApiPaths.appPath("/organization/position/$posId")) as? PlusApiResultPositionDetailVO
    }

    /** 获取子岗位 */
    suspend fun getChildPositions(posId: String): PlusApiResultListPositionVO? {
        return client.get(ApiPaths.appPath("/organization/position/$posId/children")) as? PlusApiResultListPositionVO
    }
}
