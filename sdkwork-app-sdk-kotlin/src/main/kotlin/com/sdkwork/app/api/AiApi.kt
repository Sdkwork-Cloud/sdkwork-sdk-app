package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AiApi(private val client: HttpClient) {

    /** 获取提示语详情 */
    suspend fun getPromptDetail(id: String): PlusApiResultPromptVO? {
        return client.get(ApiPaths.appPath("/prompt/$id")) as? PlusApiResultPromptVO
    }

    /** 更新提示语 */
    suspend fun updatePrompt(id: String, body: PromptUpdateForm): PlusApiResultPromptVO? {
        return client.put(ApiPaths.appPath("/prompt/$id"), body) as? PlusApiResultPromptVO
    }

    /** 删除提示语 */
    suspend fun deletePrompt(id: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/prompt/$id")) as? PlusApiResultVoid
    }

    /** 创建提示语 */
    suspend fun createPrompt(body: PromptCreateForm): PlusApiResultPromptVO? {
        return client.post(ApiPaths.appPath("/prompt"), body) as? PlusApiResultPromptVO
    }

    /** 使用提示语 */
    suspend fun usePrompt(id: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/prompt/$id/use"), null) as? PlusApiResultVoid
    }

    /** 收藏提示语 */
    suspend fun favoritePrompt(id: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/prompt/$id/favorite"), null) as? PlusApiResultVoid
    }

    /** 取消收藏提示语 */
    suspend fun unfavoritePrompt(id: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/prompt/$id/favorite")) as? PlusApiResultVoid
    }

    /** 获取热门提示语 */
    suspend fun getPopularPrompts(params: Map<String, Any>? = null): PlusApiResultPagePromptVO? {
        return client.get(ApiPaths.appPath("/prompt/popular"), params) as? PlusApiResultPagePromptVO
    }

    /** 获取最受欢迎提示语 */
    suspend fun getMostFavoritedPrompts(params: Map<String, Any>? = null): PlusApiResultPagePromptVO? {
        return client.get(ApiPaths.appPath("/prompt/most-favorited"), params) as? PlusApiResultPagePromptVO
    }

    /** 获取提示语列表 */
    suspend fun listPrompts(params: Map<String, Any>? = null): PlusApiResultPagePromptVO? {
        return client.get(ApiPaths.appPath("/prompt/list"), params) as? PlusApiResultPagePromptVO
    }

    /** 获取提示语历史详情 */
    suspend fun getPromptHistoryDetail(id: String): PlusApiResultPromptHistoryVO? {
        return client.get(ApiPaths.appPath("/prompt/history/$id")) as? PlusApiResultPromptHistoryVO
    }

    /** 删除提示语历史 */
    suspend fun deletePromptHistory(id: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/prompt/history/$id")) as? PlusApiResultVoid
    }

    /** 获取提示语使用历史 */
    suspend fun listPromptHistory(params: Map<String, Any>? = null): PlusApiResultPagePromptHistoryVO? {
        return client.get(ApiPaths.appPath("/prompt/history/list"), params) as? PlusApiResultPagePromptHistoryVO
    }
}
