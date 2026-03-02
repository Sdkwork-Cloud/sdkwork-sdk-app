import Foundation

public class CharacterApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取角色详情
    public func getCharacter(characterId: String) async throws -> PlusApiResultCharacterDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/character/\(characterId)"))
        return response as? PlusApiResultCharacterDetailVO
    }

    /// 更新角色
    public func updateCharacter(characterId: String, body: CharacterUpdateForm) async throws -> PlusApiResultCharacterVO? {
        let response = try await client.put(ApiPaths.appPath("/character/\(characterId)"), body: body)
        return response as? PlusApiResultCharacterVO
    }

    /// 删除角色
    public func deleteCharacter(characterId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/character/\(characterId)"))
        return response as? PlusApiResultVoid
    }

    /// 创建角色生成任务
    public func createGeneration(body: CharacterGenerationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/character"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 批量创建角色生成任务
    public func batchCreateGeneration(body: CharacterBatchGenerationForm) async throws -> PlusApiResultListGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/character/batch"), body: body)
        return response as? PlusApiResultListGenerationTaskVO
    }

    /// 创建角色
    public func createCharacter(body: CharacterCreateForm) async throws -> PlusApiResultCharacterVO? {
        let response = try await client.post(ApiPaths.appPath("/character"), body: body)
        return response as? PlusApiResultCharacterVO
    }

    /// 使用角色
    public func use(characterId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/character/\(characterId)/use"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 点赞角色
    public func like(characterId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/character/\(characterId)/like"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消点赞
    public func unlike(characterId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/character/\(characterId)/like"))
        return response as? PlusApiResultVoid
    }

    /// 获取角色详情
    public func getCharacterDetail(characterId: String) async throws -> PlusApiResultCharacterGenerationVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/character/\(characterId)"))
        return response as? PlusApiResultCharacterGenerationVO
    }

    /// 获取任务列表
    public func listTasks(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/character/tasks"), params: params)
        return response as? PlusApiResultPageGenerationTaskVO
    }

    /// 获取任务状态
    public func getTaskStatus(taskId: String) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/character/tasks/\(taskId)"))
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 取消任务
    public func cancelTask(taskId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/character/tasks/\(taskId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取角色列表
    public func listCharacters(params: [String: Any]? = nil) async throws -> PlusApiResultPageCharacterListVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/character/list"), params: params)
        return response as? PlusApiResultPageCharacterListVO
    }

    /// 搜索角色
    public func searchCharacters(params: [String: Any]? = nil) async throws -> PlusApiResultPageCharacterVO? {
        let response = try await client.get(ApiPaths.appPath("/character/search"), params: params)
        return response as? PlusApiResultPageCharacterVO
    }

    /// 获取热门角色
    public func getPopularCharacters(params: [String: Any]? = nil) async throws -> PlusApiResultPageCharacterVO? {
        let response = try await client.get(ApiPaths.appPath("/character/popular"), params: params)
        return response as? PlusApiResultPageCharacterVO
    }

    /// 获取我的角色
    public func getMyCharacters(params: [String: Any]? = nil) async throws -> PlusApiResultPageCharacterVO? {
        let response = try await client.get(ApiPaths.appPath("/character/my"), params: params)
        return response as? PlusApiResultPageCharacterVO
    }

    /// 获取最受喜爱角色
    public func getMostLikedCharacters(params: [String: Any]? = nil) async throws -> PlusApiResultPageCharacterVO? {
        let response = try await client.get(ApiPaths.appPath("/character/liked"), params: params)
        return response as? PlusApiResultPageCharacterVO
    }

    /// 获取智能体关联角色
    public func getCharacterByAgent(agentId: String) async throws -> PlusApiResultCharacterVO? {
        let response = try await client.get(ApiPaths.appPath("/character/agent/\(agentId)"))
        return response as? PlusApiResultCharacterVO
    }
}
