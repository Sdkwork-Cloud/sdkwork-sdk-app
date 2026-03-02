package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AudioApi {
    private final HttpClient client;
    
    public AudioApi(HttpClient client) {
        this.client = client;
    }

    /** 语音克隆 */
    public PlusApiResultGenerationTaskVO voiceClone(VoiceCloneForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/audio/voice-clone"), body);
    }

    /** 文本转语音 */
    public PlusApiResultGenerationTaskVO textToSpeech(AudioGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/audio/tts"), body);
    }

    /** 语音翻译 */
    public PlusApiResultGenerationTaskVO translation(AudioTranslationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/audio/translation"), body);
    }

    /** 语音转文本 */
    public PlusApiResultGenerationTaskVO transcription(AudioTranscriptionForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/audio/transcription"), body);
    }

    /** 获取语音列表 */
    public PlusApiResultVoiceListVO getVoiceList(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoiceListVO) client.get(ApiPaths.appPath("/generation/audio/voices"), params);
    }

    /** 获取转录结果 */
    public PlusApiResultGenerationTaskVO getTranscriptionResult(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/audio/transcription/" + taskId + ""));
    }

    /** 获取任务列表 */
    public PlusApiResultPageGenerationTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationTaskVO) client.get(ApiPaths.appPath("/generation/audio/tasks"), params);
    }

    /** 获取任务状态 */
    public PlusApiResultGenerationTaskVO getTaskStatus(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/audio/tasks/" + taskId + ""));
    }

    /** 取消任务 */
    public PlusApiResultVoid cancelTask(String taskId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/audio/tasks/" + taskId + ""));
    }
}
