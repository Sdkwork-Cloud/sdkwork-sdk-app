package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class StatisticsApi(private val client: HttpClient) {

    /** 获取组织统计 */
    suspend fun getOrganization(): PlusApiResultOrganizationStatisticsVO? {
        return client.get(ApiPaths.appPath("/organization/statistics")) as? PlusApiResultOrganizationStatisticsVO
    }
}
