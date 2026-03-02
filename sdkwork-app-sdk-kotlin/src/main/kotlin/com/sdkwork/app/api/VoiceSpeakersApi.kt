package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class VoiceSpeakersApi(private val client: HttpClient) {

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
}
