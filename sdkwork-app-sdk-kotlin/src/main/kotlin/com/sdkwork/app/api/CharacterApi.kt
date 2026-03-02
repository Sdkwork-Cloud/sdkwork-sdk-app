package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CharacterApi(private val client: HttpClient) {

    /** 获取角色详情 */
    suspend fun getCharacter(characterId: String): PlusApiResultCharacterDetailVO? {
        return client.get(ApiPaths.appPath("/character/$characterId")) as? PlusApiResultCharacterDetailVO
    }

    /** 更新角色 */
    suspend fun updateCharacter(characterId: String, body: CharacterUpdateForm): PlusApiResultCharacterVO? {
        return client.put(ApiPaths.appPath("/character/$characterId"), body) as? PlusApiResultCharacterVO
    }

    /** 删除角色 */
    suspend fun deleteCharacter(characterId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/character/$characterId")) as? PlusApiResultVoid
    }

    /** 创建角色生成任务 */
    suspend fun createGeneration(body: CharacterGenerationForm): PlusApiResultGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/character"), body) as? PlusApiResultGenerationTaskVO
    }

    /** 批量创建角色生成任务 */
    suspend fun batchCreateGeneration(body: CharacterBatchGenerationForm): PlusApiResultListGenerationTaskVO? {
        return client.post(ApiPaths.appPath("/generation/character/batch"), body) as? PlusApiResultListGenerationTaskVO
    }

    /** 创建角色 */
    suspend fun createCharacter(body: CharacterCreateForm): PlusApiResultCharacterVO? {
        return client.post(ApiPaths.appPath("/character"), body) as? PlusApiResultCharacterVO
    }

    /** 使用角色 */
    suspend fun use(characterId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/character/$characterId/use"), null) as? PlusApiResultVoid
    }

    /** 点赞角色 */
    suspend fun like(characterId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/character/$characterId/like"), null) as? PlusApiResultVoid
    }

    /** 取消点赞 */
    suspend fun unlike(characterId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/character/$characterId/like")) as? PlusApiResultVoid
    }

    /** 获取角色详情 */
    suspend fun getCharacterDetail(characterId: String): PlusApiResultCharacterGenerationVO? {
        return client.get(ApiPaths.appPath("/generation/character/$characterId")) as? PlusApiResultCharacterGenerationVO
    }

    /** 获取任务列表 */
    suspend fun listTasks(params: Map<String, Any>? = null): PlusApiResultPageGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/character/tasks"), params) as? PlusApiResultPageGenerationTaskVO
    }

    /** 获取任务状态 */
    suspend fun getTaskStatus(taskId: String): PlusApiResultGenerationTaskVO? {
        return client.get(ApiPaths.appPath("/generation/character/tasks/$taskId")) as? PlusApiResultGenerationTaskVO
    }

    /** 取消任务 */
    suspend fun cancelTask(taskId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/generation/character/tasks/$taskId")) as? PlusApiResultVoid
    }

    /** 获取角色列表 */
    suspend fun listCharacters(params: Map<String, Any>? = null): PlusApiResultPageCharacterListVO? {
        return client.get(ApiPaths.appPath("/generation/character/list"), params) as? PlusApiResultPageCharacterListVO
    }

    /** 搜索角色 */
    suspend fun searchCharacters(params: Map<String, Any>? = null): PlusApiResultPageCharacterVO? {
        return client.get(ApiPaths.appPath("/character/search"), params) as? PlusApiResultPageCharacterVO
    }

    /** 获取热门角色 */
    suspend fun getPopularCharacters(params: Map<String, Any>? = null): PlusApiResultPageCharacterVO? {
        return client.get(ApiPaths.appPath("/character/popular"), params) as? PlusApiResultPageCharacterVO
    }

    /** 获取我的角色 */
    suspend fun getMyCharacters(params: Map<String, Any>? = null): PlusApiResultPageCharacterVO? {
        return client.get(ApiPaths.appPath("/character/my"), params) as? PlusApiResultPageCharacterVO
    }

    /** 获取最受喜爱角色 */
    suspend fun getMostLikedCharacters(params: Map<String, Any>? = null): PlusApiResultPageCharacterVO? {
        return client.get(ApiPaths.appPath("/character/liked"), params) as? PlusApiResultPageCharacterVO
    }

    /** 获取智能体关联角色 */
    suspend fun getCharacterByAgent(agentId: String): PlusApiResultCharacterVO? {
        return client.get(ApiPaths.appPath("/character/agent/$agentId")) as? PlusApiResultCharacterVO
    }
}
