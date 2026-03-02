package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CharacterApi {
    private final HttpClient client;
    
    public CharacterApi(HttpClient client) {
        this.client = client;
    }

    /** 获取角色详情 */
    public PlusApiResultCharacterDetailVO getCharacter(String characterId) throws Exception {
        return (PlusApiResultCharacterDetailVO) client.get(ApiPaths.appPath("/character/" + characterId + ""));
    }

    /** 更新角色 */
    public PlusApiResultCharacterVO updateCharacter(String characterId, CharacterUpdateForm body) throws Exception {
        return (PlusApiResultCharacterVO) client.put(ApiPaths.appPath("/character/" + characterId + ""), body);
    }

    /** 删除角色 */
    public PlusApiResultVoid deleteCharacter(String characterId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/character/" + characterId + ""));
    }

    /** 创建角色生成任务 */
    public PlusApiResultGenerationTaskVO createGeneration(CharacterGenerationForm body) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.post(ApiPaths.appPath("/generation/character"), body);
    }

    /** 批量创建角色生成任务 */
    public PlusApiResultListGenerationTaskVO batchCreateGeneration(CharacterBatchGenerationForm body) throws Exception {
        return (PlusApiResultListGenerationTaskVO) client.post(ApiPaths.appPath("/generation/character/batch"), body);
    }

    /** 创建角色 */
    public PlusApiResultCharacterVO createCharacter(CharacterCreateForm body) throws Exception {
        return (PlusApiResultCharacterVO) client.post(ApiPaths.appPath("/character"), body);
    }

    /** 使用角色 */
    public PlusApiResultVoid use(String characterId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/character/" + characterId + "/use"), null);
    }

    /** 点赞角色 */
    public PlusApiResultVoid like(String characterId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/character/" + characterId + "/like"), null);
    }

    /** 取消点赞 */
    public PlusApiResultVoid unlike(String characterId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/character/" + characterId + "/like"));
    }

    /** 获取角色详情 */
    public PlusApiResultCharacterGenerationVO getCharacterDetail(String characterId) throws Exception {
        return (PlusApiResultCharacterGenerationVO) client.get(ApiPaths.appPath("/generation/character/" + characterId + ""));
    }

    /** 获取任务列表 */
    public PlusApiResultPageGenerationTaskVO listTasks(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationTaskVO) client.get(ApiPaths.appPath("/generation/character/tasks"), params);
    }

    /** 获取任务状态 */
    public PlusApiResultGenerationTaskVO getTaskStatus(String taskId) throws Exception {
        return (PlusApiResultGenerationTaskVO) client.get(ApiPaths.appPath("/generation/character/tasks/" + taskId + ""));
    }

    /** 取消任务 */
    public PlusApiResultVoid cancelTask(String taskId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/character/tasks/" + taskId + ""));
    }

    /** 获取角色列表 */
    public PlusApiResultPageCharacterListVO listCharacters(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCharacterListVO) client.get(ApiPaths.appPath("/generation/character/list"), params);
    }

    /** 搜索角色 */
    public PlusApiResultPageCharacterVO searchCharacters(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCharacterVO) client.get(ApiPaths.appPath("/character/search"), params);
    }

    /** 获取热门角色 */
    public PlusApiResultPageCharacterVO getPopularCharacters(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCharacterVO) client.get(ApiPaths.appPath("/character/popular"), params);
    }

    /** 获取我的角色 */
    public PlusApiResultPageCharacterVO getMyCharacters(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCharacterVO) client.get(ApiPaths.appPath("/character/my"), params);
    }

    /** 获取最受喜爱角色 */
    public PlusApiResultPageCharacterVO getMostLikedCharacters(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCharacterVO) client.get(ApiPaths.appPath("/character/liked"), params);
    }

    /** 获取智能体关联角色 */
    public PlusApiResultCharacterVO getCharacterByAgent(String agentId) throws Exception {
        return (PlusApiResultCharacterVO) client.get(ApiPaths.appPath("/character/agent/" + agentId + ""));
    }
}
