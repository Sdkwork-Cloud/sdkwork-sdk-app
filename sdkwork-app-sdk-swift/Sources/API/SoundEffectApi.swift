import Foundation

public class SoundEffectApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 创建音效生成任务
    public func createGeneration(body: SoundEffectGenerationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/sound-effect"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 获取音效详情
    public func getEffectDetail(effectId: String) async throws -> PlusApiResultSoundEffectGenerationVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/sound-effect/\(effectId)"))
        return response as? PlusApiResultSoundEffectGenerationVO
    }

    /// 获取任务列表
    public func listTasks(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/sound-effect/tasks"), params: params)
        return response as? PlusApiResultPageGenerationTaskVO
    }

    /// 获取任务状态
    public func getTaskStatus(taskId: String) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/sound-effect/tasks/\(taskId)"))
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 取消任务
    public func cancelTask(taskId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/sound-effect/tasks/\(taskId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取音效类别
    public func getCategories(params: [String: Any]? = nil) async throws -> PlusApiResultSoundEffectCategoriesVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/sound-effect/categories"), params: params)
        return response as? PlusApiResultSoundEffectCategoriesVO
    }
}
