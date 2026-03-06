package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class HistoryApi(private val client: HttpClient) {

    /** 浏览历史 */
    suspend fun listBrowse(params: Map<String, Any>? = null): PlusApiResultPageBrowseHistoryVO? {
        return client.get(ApiPaths.appPath("/history/browse"), params) as? PlusApiResultPageBrowseHistoryVO
    }

    /** 添加浏览记录 */
    suspend fun addBrowse(body: BrowseHistoryAddForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/history/browse"), body) as? PlusApiResultVoid
    }

    /** 清空浏览历史 */
    suspend fun clearBrowse(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/history/browse"), params) as? PlusApiResultVoid
    }

    /** 历史统计 */
    suspend fun getHistoryStatistics(): PlusApiResultHistoryStatisticsVO? {
        return client.get(ApiPaths.appPath("/history/statistics")) as? PlusApiResultHistoryStatisticsVO
    }

    /** 浏览统计 */
    suspend fun getBrowseStatistics(): PlusApiResultBrowseStatisticsVO? {
        return client.get(ApiPaths.appPath("/history/statistics/browse")) as? PlusApiResultBrowseStatisticsVO
    }

    /** 所有会话 */
    suspend fun listSessions(): PlusApiResultListSessionInfoVO? {
        return client.get(ApiPaths.appPath("/history/sessions")) as? PlusApiResultListSessionInfoVO
    }

    /** 当前会话 */
    suspend fun getCurrentSession(): PlusApiResultSessionInfoVO? {
        return client.get(ApiPaths.appPath("/history/sessions/current")) as? PlusApiResultSessionInfoVO
    }

    /** 操作历史 */
    suspend fun listOperation(params: Map<String, Any>? = null): PlusApiResultPageOperationHistoryVO? {
        return client.get(ApiPaths.appPath("/history/operations"), params) as? PlusApiResultPageOperationHistoryVO
    }

    /** 最近操作 */
    suspend fun getRecentOperations(params: Map<String, Any>? = null): PlusApiResultListOperationHistoryVO? {
        return client.get(ApiPaths.appPath("/history/operations/recent"), params) as? PlusApiResultListOperationHistoryVO
    }

    /** 登录历史 */
    suspend fun listLogin(params: Map<String, Any>? = null): PlusApiResultPageLoginHistoryVO? {
        return client.get(ApiPaths.appPath("/history/logins"), params) as? PlusApiResultPageLoginHistoryVO
    }

    /** 生成历史 */
    suspend fun listGeneration(params: Map<String, Any>? = null): PlusApiResultPageGenerationHistoryVO? {
        return client.get(ApiPaths.appPath("/history/generations"), params) as? PlusApiResultPageGenerationHistoryVO
    }

    /** 清空生成历史 */
    suspend fun clearGeneration(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/history/generations")) as? PlusApiResultVoid
    }

    /** 最近生成 */
    suspend fun getRecentGenerations(params: Map<String, Any>? = null): PlusApiResultListGenerationHistoryVO? {
        return client.get(ApiPaths.appPath("/history/generations/recent"), params) as? PlusApiResultListGenerationHistoryVO
    }

    /** 终止会话 */
    suspend fun terminateSession(sessionId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/history/sessions/$sessionId")) as? PlusApiResultVoid
    }

    /** 终止其他会话 */
    suspend fun terminateOtherSessions(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/history/sessions/others")) as? PlusApiResultVoid
    }

    /** 删除生成历史 */
    suspend fun deleteGeneration(historyId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/history/generations/$historyId")) as? PlusApiResultVoid
    }

    /** 删除浏览记录 */
    suspend fun deleteBrowse(historyId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/history/browse/$historyId")) as? PlusApiResultVoid
    }

    /** 批量删除浏览记录 */
    suspend fun batchDeleteBrowse(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/history/browse/batch")) as? PlusApiResultVoid
    }
}
