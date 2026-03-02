package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AuditApi(private val client: HttpClient) {

    /** 审核申诉 */
    suspend fun submitAppeal(recordId: String, body: AuditAppealForm): PlusApiResultAuditAppealVO? {
        return client.post(ApiPaths.appPath("/audit/$recordId/appeal"), body) as? PlusApiResultAuditAppealVO
    }

    /** 视频审核 */
    suspend fun video(body: VideoAuditForm): PlusApiResultVideoAuditVO? {
        return client.post(ApiPaths.appPath("/audit/video"), body) as? PlusApiResultVideoAuditVO
    }

    /** 文本审核 */
    suspend fun text(body: TextAuditForm): PlusApiResultTextAuditVO? {
        return client.post(ApiPaths.appPath("/audit/text"), body) as? PlusApiResultTextAuditVO
    }

    /** 文本替换建议 */
    suspend fun suggestTextReplacement(body: TextSuggestForm): PlusApiResultTextSuggestVO? {
        return client.post(ApiPaths.appPath("/audit/text/suggest"), body) as? PlusApiResultTextSuggestVO
    }

    /** 批量文本审核 */
    suspend fun batchAuditText(body: BatchTextAuditForm): PlusApiResultBatchTextAuditVO? {
        return client.post(ApiPaths.appPath("/audit/text/batch"), body) as? PlusApiResultBatchTextAuditVO
    }

    /** 敏感词检测 */
    suspend fun detectSensitiveWords(body: SensitiveWordsForm): PlusApiResultSensitiveWordsVO? {
        return client.post(ApiPaths.appPath("/audit/sensitive-words"), body) as? PlusApiResultSensitiveWordsVO
    }

    /** 行为风险检测 */
    suspend fun checkBehaviorRisk(body: BehaviorRiskCheckForm): PlusApiResultBehaviorRiskVO? {
        return client.post(ApiPaths.appPath("/audit/risk/behavior"), body) as? PlusApiResultBehaviorRiskVO
    }

    /** 账号风险检测 */
    suspend fun checkAccountRisk(body: AccountRiskCheckForm): PlusApiResultAccountRiskVO? {
        return client.post(ApiPaths.appPath("/audit/risk/account"), body) as? PlusApiResultAccountRiskVO
    }

    /** 实时内容审核 */
    suspend fun realtime(body: RealtimeAuditForm): PlusApiResultRealtimeAuditVO? {
        return client.post(ApiPaths.appPath("/audit/realtime"), body) as? PlusApiResultRealtimeAuditVO
    }

    /** 图片审核 */
    suspend fun image(body: ImageAuditForm): PlusApiResultImageAuditVO? {
        return client.post(ApiPaths.appPath("/audit/image"), body) as? PlusApiResultImageAuditVO
    }

    /** 图片OCR审核 */
    suspend fun imageOcr(body: ImageOcrAuditForm): PlusApiResultImageOcrAuditVO? {
        return client.post(ApiPaths.appPath("/audit/image/ocr"), body) as? PlusApiResultImageOcrAuditVO
    }

    /** 批量图片审核 */
    suspend fun batchAuditImage(body: BatchImageAuditForm): PlusApiResultBatchImageAuditVO? {
        return client.post(ApiPaths.appPath("/audit/image/batch"), body) as? PlusApiResultBatchImageAuditVO
    }

    /** 综合内容审核 */
    suspend fun content(body: ContentAuditForm): PlusApiResultContentAuditVO? {
        return client.post(ApiPaths.appPath("/audit/content"), body) as? PlusApiResultContentAuditVO
    }

    /** 音频审核 */
    suspend fun audio(body: AudioAuditForm): PlusApiResultAudioAuditVO? {
        return client.post(ApiPaths.appPath("/audit/audio"), body) as? PlusApiResultAudioAuditVO
    }

    /** 语音审核 */
    suspend fun audioAsr(body: AudioAsrAuditForm): PlusApiResultAudioAsrAuditVO? {
        return client.post(ApiPaths.appPath("/audit/audio/asr"), body) as? PlusApiResultAudioAsrAuditVO
    }

    /** 敏感词库 */
    suspend fun listSensitiveWord(): PlusApiResultListSensitiveWordListVO? {
        return client.get(ApiPaths.appPath("/audit/word-lists")) as? PlusApiResultListSensitiveWordListVO
    }

    /** 视频审核状态 */
    suspend fun getVideoAuditStatus(taskId: String): PlusApiResultVideoAuditStatusVO? {
        return client.get(ApiPaths.appPath("/audit/video/$taskId")) as? PlusApiResultVideoAuditStatusVO
    }

    /** 审核记录 */
    suspend fun listAuditRecords(params: Map<String, Any>? = null): PlusApiResultPageAuditRecordVO? {
        return client.get(ApiPaths.appPath("/audit/records"), params) as? PlusApiResultPageAuditRecordVO
    }

    /** 审核记录详情 */
    suspend fun getAuditRecord(recordId: String): PlusApiResultAuditRecordDetailVO? {
        return client.get(ApiPaths.appPath("/audit/records/$recordId")) as? PlusApiResultAuditRecordDetailVO
    }

    /** 审核策略 */
    suspend fun listAuditPolicies(): PlusApiResultListAuditPolicyVO? {
        return client.get(ApiPaths.appPath("/audit/policies")) as? PlusApiResultListAuditPolicyVO
    }

    /** 我的审核记录 */
    suspend fun listMyAuditRecords(params: Map<String, Any>? = null): PlusApiResultPageAuditRecordVO? {
        return client.get(ApiPaths.appPath("/audit/my-records"), params) as? PlusApiResultPageAuditRecordVO
    }

    /** 申诉记录 */
    suspend fun listAppeals(): PlusApiResultPageAuditAppealVO? {
        return client.get(ApiPaths.appPath("/audit/appeals")) as? PlusApiResultPageAuditAppealVO
    }

    /** 申诉状态 */
    suspend fun getAppealStatus(appealId: String): PlusApiResultAuditAppealStatusVO? {
        return client.get(ApiPaths.appPath("/audit/appeals/$appealId")) as? PlusApiResultAuditAppealStatusVO
    }
}
