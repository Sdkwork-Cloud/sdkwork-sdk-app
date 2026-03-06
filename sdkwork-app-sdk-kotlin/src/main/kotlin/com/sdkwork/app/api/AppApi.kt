package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AppApi(private val client: HttpClient) {

    /** 获取应用详情 */
    suspend fun getApp(appId: String): PlusApiResultAppDetailVO? {
        return client.get(ApiPaths.appPath("/app/manage/$appId")) as? PlusApiResultAppDetailVO
    }

    /** 更新应用 */
    suspend fun updateApp(appId: String, body: AppUpdateForm): PlusApiResultAppVO? {
        return client.put(ApiPaths.appPath("/app/manage/$appId"), body) as? PlusApiResultAppVO
    }

    /** 删除应用 */
    suspend fun deleteApp(appId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/app/manage/$appId")) as? PlusApiResultVoid
    }

    /** 创建应用 */
    suspend fun createApp(body: AppCreateForm): PlusApiResultAppVO? {
        return client.post(ApiPaths.appPath("/app/manage"), body) as? PlusApiResultAppVO
    }

    /** 停用应用 */
    suspend fun deactivate(appId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/app/manage/$appId/deactivate"), null) as? PlusApiResultVoid
    }

    /** 激活应用 */
    suspend fun activate(appId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/app/manage/$appId/activate"), null) as? PlusApiResultVoid
    }

    /** 检查发布就绪状态 */
    suspend fun checkPublishReadiness(appId: String): PlusApiResultAppPublishReadinessVO? {
        return client.get(ApiPaths.appPath("/app/manage/$appId/publish/readiness")) as? PlusApiResultAppPublishReadinessVO
    }

    /** 获取应用统计 */
    suspend fun getAppStatistics(): PlusApiResultAppStatisticsVO? {
        return client.get(ApiPaths.appPath("/app/manage/statistics")) as? PlusApiResultAppStatisticsVO
    }

    /** 搜索应用 */
    suspend fun searchApps(params: Map<String, Any>? = null): PlusApiResultPageAppVO? {
        return client.get(ApiPaths.appPath("/app/manage/search"), params) as? PlusApiResultPageAppVO
    }

    /** 获取项目应用 */
    suspend fun getProjectApps(projectId: String, params: Map<String, Any>? = null): PlusApiResultPageAppVO? {
        return client.get(ApiPaths.appPath("/app/manage/project/$projectId"), params) as? PlusApiResultPageAppVO
    }

    /** 获取我的应用 */
    suspend fun getMyApps(params: Map<String, Any>? = null): PlusApiResultPageAppVO? {
        return client.get(ApiPaths.appPath("/app/manage/my"), params) as? PlusApiResultPageAppVO
    }

    /** 获取账户余额汇总 */
    suspend fun getAccountSummary(): PlusApiResultAccountSummaryVO? {
        return client.get(ApiPaths.appPath("/account/summary")) as? PlusApiResultAccountSummaryVO
    }
}
