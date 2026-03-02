package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class SoundEffectApi {
    private final HttpClient client;
    
    public SoundEffectApi(HttpClient client) {
        this.client = client;
    }

    /** 创建音效生成任务 */
    public PlusApiResultGenerationTaskVO createGeneration(SoundEffectGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/sound-effect"), body);
    }

    /** 获取音效详情 */
    public PlusApiResultSoundEffectGenerationVO getEffectDetail(String effectId) throws Exception {
        return (PlusApiResultSoundEffectGenerationVO) client.get(ApiPaths.appPath("/generation/sound-effect/" + effectId + ""));
    }

    /** 获取任务列表 */
    public PlusApiResultPageGenerationTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationTaskVO) client.get(ApiPaths.appPath("/generation/sound-effect/tasks"), params);
    }

    /** 获取任务状态 */
    public PlusApiResultGenerationTaskVO getTaskStatus(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/sound-effect/tasks/" + taskId + ""));
    }

    /** 取消任务 */
    public PlusApiResultVoid cancelTask(String taskId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/sound-effect/tasks/" + taskId + ""));
    }

    /** 获取音效类别 */
    public PlusApiResultSoundEffectCategoriesVO getCategories(Map<String, Object> params) throws Exception {
        return (PlusApiResultSoundEffectCategoriesVO) client.get(ApiPaths.appPath("/generation/sound-effect/categories"), params);
    }
}
