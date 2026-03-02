package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AudioApi(private val client: HttpClient) {

    /** 语音克隆 */
    suspend fun voiceClone(body: VoiceCloneForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/audio/voice-clone"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 文本转语音 */
    suspend fun textToSpeech(body: AudioGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/audio/tts"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 语音翻译 */
    suspend fun translation(body: AudioTranslationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/audio/translation"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 语音转文本 */
    suspend fun transcription(body: AudioTranscriptionForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/audio/transcription"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 获取语音列表 */
    suspend fun getVoiceList(params: Map<String, Any>? = null): PlusApiResultVoiceListVO? {
        return client.get(ApiPaths.appPath("/generation/audio/voices"), params) as? PlusApiResultVoiceListVO
    }

    /** 获取转录结果 */
    suspend fun getTranscriptionResult(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/audio/transcription/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultPageGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/audio/tasks"), params) as? PlusApiResultPageGenerationTaskVO
    }

    /** 获取任务状态 */
    suspend fun getTaskStatus(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/audio/tasks/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 取消任务 */
    suspend fun cancelTask(taskId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/audio/tasks/$taskId")) as? PlusApiResultVoid
    }
}
