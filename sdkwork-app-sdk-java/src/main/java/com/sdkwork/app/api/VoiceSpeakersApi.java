package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class VoiceSpeakersApi {
    private final HttpClient client;
    
    public VoiceSpeakersApi(HttpClient client) {
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
}
