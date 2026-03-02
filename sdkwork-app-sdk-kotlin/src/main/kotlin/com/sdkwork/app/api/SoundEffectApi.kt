package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SoundEffectApi(private val client: HttpClient) {

    /** 创建音效生成任务 */
    suspend fun createGeneration(body: SoundEffectGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/sound-effect"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 获取音效详情 */
    suspend fun getEffectDetail(effectId: String): PlusApiResultSoundEffectGenerationVO? {
        return client.get(ApiPaths.appPath("/generation/sound-effect/$effectId")) as? PlusApiResultSoundEffectGenerationVO
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultPageGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/sound-effect/tasks"), params) as? PlusApiResultPageGenerationTaskVO
    }

    /** 获取任务状态 */
    suspend fun getTaskStatus(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/sound-effect/tasks/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 取消任务 */
    suspend fun cancelTask(taskId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/sound-effect/tasks/$taskId")) as? PlusApiResultVoid
    }

    /** 获取音效类别 */
    suspend fun getCategories(params: Map<String, Any>? = null): PlusApiResultSoundEffectCategoriesVO? {
        return client.get(ApiPaths.appPath("/generation/sound-effect/categories"), params) as? PlusApiResultSoundEffectCategoriesVO
    }
}
