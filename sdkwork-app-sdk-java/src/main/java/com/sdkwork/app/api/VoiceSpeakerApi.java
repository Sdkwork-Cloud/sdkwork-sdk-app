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

    /** 获取发音人详情 */
    public PlusApiResultVoiceSpeakerDetailVO getSpeakerDetail(String speakerId) throws Exception {
        return (PlusApiResultVoiceSpeakerDetailVO) client.get(ApiPaths.appPath("/voice-speakers/" + speakerId + ""));
    }

    /** 更新发音人 */
    public PlusApiResultVoiceSpeakerVO updateSpeaker(String speakerId, VoiceSpeakerCreateForm body) throws Exception {
        return (PlusApiResultVoiceSpeakerVO) client.put(ApiPaths.appPath("/voice-speakers/" + speakerId + ""), body);
    }

    /** 删除发音人 */
    public PlusApiResultVoid deleteSpeaker(String speakerId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/voice-speakers/" + speakerId + ""));
    }

    /** 获取发音人列表 */
    public PlusApiResultPageVoiceSpeakerVO listSpeakers(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVoiceSpeakerVO) client.get(ApiPaths.appPath("/voice-speakers"), params);
    }

    /** 创建发音人 */
    public PlusApiResultVoiceSpeakerVO createSpeaker(VoiceSpeakerCreateForm body) throws Exception {
        return (PlusApiResultVoiceSpeakerVO) client.post(ApiPaths.appPath("/voice-speakers"), body);
    }

    /** 更新发音人状态 */
    public PlusApiResultVoid updateStatus(String speakerId, Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/voice-speakers/" + speakerId + "/status"), null, params);
    }

    /** 设为默认发音人 */
    public PlusApiResultVoiceSpeakerVO setAsDefault(String speakerId) throws Exception {
        return (PlusApiResultVoiceSpeakerVO) client.post(ApiPaths.appPath("/voice-speakers/" + speakerId + "/set-default"), null);
    }

    /** 创建语音生成任务 */
    public PlusApiResultGenerationTaskVO createGeneration(VoiceSpeakerGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/voice-speaker"), body);
    }

    /** 克隆说话人 */
    public PlusApiResultGenerationTaskVO cloneSpeaker(VoiceSpeakerCloneForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/voice-speaker/clone"), body);
    }

    /** 获取发音人统计 */
    public PlusApiResultSpeakerStatisticsVO getStatistics() throws Exception {
        return (PlusApiResultSpeakerStatisticsVO) client.get(ApiPaths.appPath("/voice-speakers/statistics"));
    }

    /** 获取默认发音人 */
    public PlusApiResultVoiceSpeakerVO getDefaultSpeaker() throws Exception {
        return (PlusApiResultVoiceSpeakerVO) client.get(ApiPaths.appPath("/voice-speakers/default"));
    }

    /** 根据代码获取发音人 */
    public PlusApiResultVoiceSpeakerVO getSpeakerByCode(String code) throws Exception {
        return (PlusApiResultVoiceSpeakerVO) client.get(ApiPaths.appPath("/voice-speakers/code/" + code + ""));
    }

    /** 获取渠道发音人 */
    public PlusApiResultListVoiceSpeakerVO listSpeakersByChannel(String channel) throws Exception {
        return (PlusApiResultListVoiceSpeakerVO) client.get(ApiPaths.appPath("/voice-speakers/channel/" + channel + ""));
    }

    /** 获取说话人详情 */
    public PlusApiResultVoiceSpeakerGenerationVO getSpeakerDetailVoice(String speakerId) throws Exception {
        return (PlusApiResultVoiceSpeakerGenerationVO) client.get(ApiPaths.appPath("/generation/voice-speaker/" + speakerId + ""));
    }

    /** 删除说话人 */
    public PlusApiResultVoid deleteSpeakerVoice(String speakerId) throws Exception {
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
    public PlusApiResultPageVoiceSpeakerListVO getListSpeakers(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageVoiceSpeakerListVO) client.get(ApiPaths.appPath("/generation/voice-speaker/list"), params);
    }
}
