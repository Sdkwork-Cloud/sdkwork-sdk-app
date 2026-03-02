package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class PositionsApi(private val client: HttpClient) {

    /** 获取组织的岗位列表 */
    suspend fun getPositionsByOrg(orgId: String): PlusApiResultListPositionVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/positions")) as? PlusApiResultListPositionVO
    }

    /** 获取岗位树 */
    suspend fun getPositionTree(orgId: String): PlusApiResultListPositionDetailVO? {
        return client.get(ApiPaths.appPath("/organization/$orgId/positions/tree")) as? PlusApiResultListPositionDetailVO
    }
}
