import Foundation

public class AudioApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 语音克隆
    public func voiceClone(body: VoiceCloneForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/audio/voice-clone"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 文本转语音
    public func textToSpeech(body: AudioGenerationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/audio/tts"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 语音翻译
    public func translation(body: AudioTranslationForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/audio/translation"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 语音转文本
    public func transcription(body: AudioTranscriptionForm) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.post(ApiPaths.appPath("/generation/audio/transcription"), body: body)
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 获取语音列表
    public func getVoiceList(params: [String: Any]? = nil) async throws -> PlusApiResultVoiceListVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/audio/voices"), params: params)
        return response as? PlusApiResultVoiceListVO
    }

    /// 获取转录结果
    public func getTranscriptionResult(taskId: String) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/audio/transcription/\(taskId)"))
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 获取任务列表
    public func listTasks(params: [String: Any]? = nil) async throws -> PlusApiResultPageGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/audio/tasks"), params: params)
        return response as? PlusApiResultPageGenerationTaskVO
    }

    /// 获取任务状态
    public func getTaskStatus(taskId: String) async throws -> PlusApiResultGenerationTaskVO? {
        let response = try await client.get(ApiPaths.appPath("/generation/audio/tasks/\(taskId)"))
        return response as? PlusApiResultGenerationTaskVO
    }

    /// 取消任务
    public func cancelTask(taskId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/generation/audio/tasks/\(taskId)"))
        return response as? PlusApiResultVoid
    }
}
