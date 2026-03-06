package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class VoiceSpeakerApi(private val client: HttpClient) {

    /** 获取发音人详情 */
    suspend fun getSpeakerDetail(speakerId: String): PlusApiResultVoiceSpeakerDetailVO? {
        return client.get(ApiPaths.appPath("/voice-speakers/$speakerId")) as? PlusApiResultVoiceSpeakerDetailVO
    }

    /** 更新发音人 */
    suspend fun updateSpeaker(speakerId: String, body: VoiceSpeakerCreateForm): PlusApiResultVoiceSpeakerVO? {
        return client.put(ApiPaths.appPath("/voice-speakers/$speakerId"), body) as? PlusApiResultVoiceSpeakerVO
    }

    /** 删除发音人 */
    suspend fun deleteSpeaker(speakerId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/voice-speakers/$speakerId")) as? PlusApiResultVoid
    }

    /** 获取发音人列表 */
    suspend fun listSpeakers(params: Map<String, Any>? = null): PlusApiResultPageVoiceSpeakerVO? {
        return client.get(ApiPaths.appPath("/voice-speakers"), params) as? PlusApiResultPageVoiceSpeakerVO
    }

    /** 创建发音人 */
    suspend fun createSpeaker(body: VoiceSpeakerCreateForm): PlusApiResultVoiceSpeakerVO? {
        return client.post(ApiPaths.appPath("/voice-speakers"), body) as? PlusApiResultVoiceSpeakerVO
    }

    /** 更新发音人状态 */
    suspend fun updateStatus(speakerId: String, params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/voice-speakers/$speakerId/status"), null, params) as? PlusApiResultVoid
    }

    /** 设为默认发音人 */
    suspend fun setAsDefault(speakerId: String): PlusApiResultVoiceSpeakerVO? {
        return client.post(ApiPaths.appPath("/voice-speakers/$speakerId/set-default"), null) as? PlusApiResultVoiceSpeakerVO
    }

    /** 创建语音生成任务 */
    suspend fun createGeneration(body: VoiceSpeakerGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/voice-speaker"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 克隆说话人 */
    suspend fun cloneSpeaker(body: VoiceSpeakerCloneForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/voice-speaker/clone"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 获取发音人统计 */
    suspend fun getStatistics(): PlusApiResultSpeakerStatisticsVO? {
        return client.get(ApiPaths.appPath("/voice-speakers/statistics")) as? PlusApiResultSpeakerStatisticsVO
    }

    /** 获取默认发音人 */
    suspend fun getDefaultSpeaker(): PlusApiResultVoiceSpeakerVO? {
        return client.get(ApiPaths.appPath("/voice-speakers/default")) as? PlusApiResultVoiceSpeakerVO
    }

    /** 根据代码获取发音人 */
    suspend fun getSpeakerByCode(code: String): PlusApiResultVoiceSpeakerVO? {
        return client.get(ApiPaths.appPath("/voice-speakers/code/$code")) as? PlusApiResultVoiceSpeakerVO
    }

    /** 获取渠道发音人 */
    suspend fun listSpeakersByChannel(channel: String): PlusApiResultListVoiceSpeakerVO? {
        return client.get(ApiPaths.appPath("/voice-speakers/channel/$channel")) as? PlusApiResultListVoiceSpeakerVO
    }

    /** 获取说话人详情 */
    suspend fun getSpeakerDetailVoice(speakerId: String): PlusApiResultVoiceSpeakerGenerationVO? {
        return client.get(ApiPaths.appPath("/generation/voice-speaker/$speakerId")) as? PlusApiResultVoiceSpeakerGenerationVO
    }

    /** 删除说话人 */
    suspend fun deleteSpeakerVoice(speakerId: String): PlusApiResultVoid? {
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
    suspend fun getListSpeakers(params: Map<String, Any>? = null): PlusApiResultPageVoiceSpeakerListVO? {
        return client.get(ApiPaths.appPath("/generation/voice-speaker/list"), params) as? PlusApiResultPageVoiceSpeakerListVO
    }
}
