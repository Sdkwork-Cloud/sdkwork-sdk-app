import Foundation

public class AuditApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 审核申诉
    public func submitAppeal(recordId: String, body: AuditAppealForm) async throws -> PlusApiResultAuditAppealVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/\(recordId)/appeal"), body: body)
        return response as? PlusApiResultAuditAppealVO
    }

    /// 视频审核
    public func video(body: VideoAuditForm) async throws -> PlusApiResultVideoAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/video"), body: body)
        return response as? PlusApiResultVideoAuditVO
    }

    /// 文本审核
    public func text(body: TextAuditForm) async throws -> PlusApiResultTextAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/text"), body: body)
        return response as? PlusApiResultTextAuditVO
    }

    /// 文本替换建议
    public func suggestTextReplacement(body: TextSuggestForm) async throws -> PlusApiResultTextSuggestVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/text/suggest"), body: body)
        return response as? PlusApiResultTextSuggestVO
    }

    /// 批量文本审核
    public func batchAuditText(body: BatchTextAuditForm) async throws -> PlusApiResultBatchTextAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/text/batch"), body: body)
        return response as? PlusApiResultBatchTextAuditVO
    }

    /// 敏感词检测
    public func detectSensitiveWords(body: SensitiveWordsForm) async throws -> PlusApiResultSensitiveWordsVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/sensitive-words"), body: body)
        return response as? PlusApiResultSensitiveWordsVO
    }

    /// 行为风险检测
    public func checkBehaviorRisk(body: BehaviorRiskCheckForm) async throws -> PlusApiResultBehaviorRiskVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/risk/behavior"), body: body)
        return response as? PlusApiResultBehaviorRiskVO
    }

    /// 账号风险检测
    public func checkAccountRisk(body: AccountRiskCheckForm) async throws -> PlusApiResultAccountRiskVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/risk/account"), body: body)
        return response as? PlusApiResultAccountRiskVO
    }

    /// 实时内容审核
    public func realtime(body: RealtimeAuditForm) async throws -> PlusApiResultRealtimeAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/realtime"), body: body)
        return response as? PlusApiResultRealtimeAuditVO
    }

    /// 图片审核
    public func image(body: ImageAuditForm) async throws -> PlusApiResultImageAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/image"), body: body)
        return response as? PlusApiResultImageAuditVO
    }

    /// 图片OCR审核
    public func imageOcr(body: ImageOcrAuditForm) async throws -> PlusApiResultImageOcrAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/image/ocr"), body: body)
        return response as? PlusApiResultImageOcrAuditVO
    }

    /// 批量图片审核
    public func batchAuditImage(body: BatchImageAuditForm) async throws -> PlusApiResultBatchImageAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/image/batch"), body: body)
        return response as? PlusApiResultBatchImageAuditVO
    }

    /// 综合内容审核
    public func content(body: ContentAuditForm) async throws -> PlusApiResultContentAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/content"), body: body)
        return response as? PlusApiResultContentAuditVO
    }

    /// 音频审核
    public func audio(body: AudioAuditForm) async throws -> PlusApiResultAudioAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/audio"), body: body)
        return response as? PlusApiResultAudioAuditVO
    }

    /// 语音审核
    public func audioAsr(body: AudioAsrAuditForm) async throws -> PlusApiResultAudioAsrAuditVO? {
        let response = try await client.post(ApiPaths.appPath("/audit/audio/asr"), body: body)
        return response as? PlusApiResultAudioAsrAuditVO
    }

    /// 敏感词库
    public func listSensitiveWord() async throws -> PlusApiResultListSensitiveWordListVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/word-lists"))
        return response as? PlusApiResultListSensitiveWordListVO
    }

    /// 视频审核状态
    public func getVideoAuditStatus(taskId: String) async throws -> PlusApiResultVideoAuditStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/video/\(taskId)"))
        return response as? PlusApiResultVideoAuditStatusVO
    }

    /// 审核记录
    public func listAuditRecords(params: [String: Any]? = nil) async throws -> PlusApiResultPageAuditRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/records"), params: params)
        return response as? PlusApiResultPageAuditRecordVO
    }

    /// 审核记录详情
    public func getAuditRecord(recordId: String) async throws -> PlusApiResultAuditRecordDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/records/\(recordId)"))
        return response as? PlusApiResultAuditRecordDetailVO
    }

    /// 审核策略
    public func listAuditPolicies() async throws -> PlusApiResultListAuditPolicyVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/policies"))
        return response as? PlusApiResultListAuditPolicyVO
    }

    /// 我的审核记录
    public func listMyAuditRecords(params: [String: Any]? = nil) async throws -> PlusApiResultPageAuditRecordVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/my-records"), params: params)
        return response as? PlusApiResultPageAuditRecordVO
    }

    /// 申诉记录
    public func listAppeals() async throws -> PlusApiResultPageAuditAppealVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/appeals"))
        return response as? PlusApiResultPageAuditAppealVO
    }

    /// 申诉状态
    public func getAppealStatus(appealId: String) async throws -> PlusApiResultAuditAppealStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/audit/appeals/\(appealId)"))
        return response as? PlusApiResultAuditAppealStatusVO
    }
}
