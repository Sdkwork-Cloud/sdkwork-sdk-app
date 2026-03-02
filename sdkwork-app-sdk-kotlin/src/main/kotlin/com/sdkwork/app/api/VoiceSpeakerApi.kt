package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class VoiceSpeakerApi(private val client: HttpClient) {

    /** 创建语音生成任务 */
    suspend fun createGeneration(body: VoiceSpeakerGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/voice-speaker"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 克隆说话人 */
    suspend fun cloneSpeaker(body: VoiceSpeakerCloneForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/voice-speaker/clone"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 获取说话人详情 */
    suspend fun getSpeakerDetail(speakerId: String): PlusApiResultVoiceSpeakerGenerationVO? {
        return client.get(ApiPaths.appPath("/generation/voice-speaker/$speakerId")) as? PlusApiResultVoiceSpeakerGenerationVO
    }

    /** 删除说话人 */
    suspend fun deleteSpeaker(speakerId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/voice-speaker/$speakerId")) as? PlusApiResultVoid
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultPageGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/voice-speaker/tasks"), params) as? PlusApiResultPageGenerationTaskVO
    }

    /** 获取任务状态 */
    suspend fun getTaskStatus(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/voice-speaker/tasks/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 取消任务 */
    suspend fun cancelTask(taskId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/voice-speaker/tasks/$taskId")) as? PlusApiResultVoid
    }

    /** 获取说话人列表 */
    suspend fun listSpeakers(params: Map<String, Any>? = null): PlusApiResultPageVoiceSpeakerListVO? {
        return client.get(ApiPaths.appPath("/generation/voice-speaker/list"), params) as? PlusApiResultPageVoiceSpeakerListVO
    }
}
