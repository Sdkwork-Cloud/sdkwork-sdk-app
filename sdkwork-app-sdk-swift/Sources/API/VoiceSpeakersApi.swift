import Foundation

public class VoiceSpeakersApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取发音人详情
    public func getSpeakerDetail(speakerId: String) async throws -> PlusApiResultVoiceSpeakerDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/voice-speakers/\(speakerId)"))
        return response as? PlusApiResultVoiceSpeakerDetailVO
    }

    /// 更新发音人
    public func updateSpeaker(speakerId: String, body: VoiceSpeakerCreateForm) async throws -> PlusApiResultVoiceSpeakerVO? {
        let response = try await client.put(ApiPaths.appPath("/voice-speakers/\(speakerId)"), body: body)
        return response as? PlusApiResultVoiceSpeakerVO
    }

    /// 删除发音人
    public func deleteSpeaker(speakerId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/voice-speakers/\(speakerId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取发音人列表
    public func listSpeakers(params: [String: Any]? = nil) async throws -> PlusApiResultPageVoiceSpeakerVO? {
        let response = try await client.get(ApiPaths.appPath("/voice-speakers"), params: params)
        return response as? PlusApiResultPageVoiceSpeakerVO
    }

    /// 创建发音人
    public func createSpeaker(body: VoiceSpeakerCreateForm) async throws -> PlusApiResultVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.appPath("/voice-speakers"), body: body)
        return response as? PlusApiResultVoiceSpeakerVO
    }

    /// 更新发音人状态
    public func updateStatus(speakerId: String, params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/voice-speakers/\(speakerId)/status"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 设为默认发音人
    public func setAsDefault(speakerId: String) async throws -> PlusApiResultVoiceSpeakerVO? {
        let response = try await client.post(ApiPaths.appPath("/voice-speakers/\(speakerId)/set-default"), body: nil)
        return response as? PlusApiResultVoiceSpeakerVO
    }

    /// 获取发音人统计
    public func getStatistics() async throws -> PlusApiResultSpeakerStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/voice-speakers/statistics"))
        return response as? PlusApiResultSpeakerStatisticsVO
    }

    /// 获取默认发音人
    public func getDefaultSpeaker() async throws -> PlusApiResultVoiceSpeakerVO? {
        let response = try await client.get(ApiPaths.appPath("/voice-speakers/default"))
        return response as? PlusApiResultVoiceSpeakerVO
    }

    /// 根据代码获取发音人
    public func getSpeakerByCode(code: String) async throws -> PlusApiResultVoiceSpeakerVO? {
        let response = try await client.get(ApiPaths.appPath("/voice-speakers/code/\(code)"))
        return response as? PlusApiResultVoiceSpeakerVO
    }

    /// 获取渠道发音人
    public func listSpeakersByChannel(channel: String) async throws -> PlusApiResultListVoiceSpeakerVO? {
        let response = try await client.get(ApiPaths.appPath("/voice-speakers/channel/\(channel)"))
        return response as? PlusApiResultListVoiceSpeakerVO
    }
}
