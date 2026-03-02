package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class VoiceSpeakerApi {
    private final HttpClient client;
    
    public VoiceSpeakerApi(HttpClient client) {
        this.client = client;
    }

    /** 创建语音生成任务 */
    public PlusApiResultGenerationTaskVO createGeneration(VoiceSpeakerGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/voice-speaker"), body);
    }

    /** 克隆说话人 */
    public PlusApiResultGenerationTaskVO cloneSpeaker(VoiceSpeakerCloneForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/voice-speaker/clone"), body);
    }

    /** 获取说话人详情 */
    public PlusApiResultVoiceSpeakerGenerationVO getSpeakerDetail(String speakerId) throws Exception {
        return (PlusApiResultVoiceSpeakerGenerationVO) client.get(ApiPaths.appPath("/generation/voice-speaker/" + speakerId + ""));
    }

    /** 删除说话人 */
    public PlusApiResultVoid deleteSpeaker(String speakerId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/voice-speaker/" + speakerId + ""));
    }

    /** 获取任务列表 */
    public PlusApiResultPageGenerationTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationTaskVO) client.get(ApiPaths.appPath("/generation/voice-speaker/tasks"), params);
    }

    /** 获取任务状态 */
    public PlusApiResultGenerationTaskVO getTaskStatus(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/voice-speaker/tasks/" + taskId + ""));
    }

    /** 取消任务 */
    public PlusApiResultVoid cancelTask(String taskId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/voice-speaker/tasks/" + taskId + ""));
    }

    /** 获取说话人列表 */
    public PlusApiResultPageVoiceSpeakerListVO listSpeakers(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVoiceSpeakerListVO) client.get(ApiPaths.appPath("/generation/voice-speaker/list"), params);
    }
}
