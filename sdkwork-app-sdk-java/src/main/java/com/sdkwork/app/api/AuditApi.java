package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AuditApi {
    private final HttpClient client;
    
    public AuditApi(HttpClient client) {
        this.client = client;
    }

    /** 审核申诉 */
    public PlusApiResultAuditAppealVO submitAppeal(String recordId, AuditAppealForm body) throws Exception {
        return (PlusApiResultAuditAppealVO) client.post(ApiPaths.appPath("/audit/" + recordId + "/appeal"), body);
    }

    /** 视频审核 */
    public PlusApiResultVideoAuditVO video(VideoAuditForm body) throws Exception {
        return (PlusApiResultVideoAuditVO) client.post(ApiPaths.appPath("/audit/video"), body);
    }

    /** 文本审核 */
    public PlusApiResultTextAuditVO text(TextAuditForm body) throws Exception {
        return (PlusApiResultTextAuditVO) client.post(ApiPaths.appPath("/audit/text"), body);
    }

    /** 文本替换建议 */
    public PlusApiResultTextSuggestVO suggestTextReplacement(TextSuggestForm body) throws Exception {
        return (PlusApiResultTextSuggestVO) client.post(ApiPaths.appPath("/audit/text/suggest"), body);
    }

    /** 批量文本审核 */
    public PlusApiResultBatchTextAuditVO batchAuditText(BatchTextAuditForm body) throws Exception {
        return (PlusApiResultBatchTextAuditVO) client.post(ApiPaths.appPath("/audit/text/batch"), body);
    }

    /** 敏感词检测 */
    public PlusApiResultSensitiveWordsVO detectSensitiveWords(SensitiveWordsForm body) throws Exception {
        return (PlusApiResultSensitiveWordsVO) client.post(ApiPaths.appPath("/audit/sensitive-words"), body);
    }

    /** 行为风险检测 */
    public PlusApiResultBehaviorRiskVO checkBehaviorRisk(BehaviorRiskCheckForm body) throws Exception {
        return (PlusApiResultBehaviorRiskVO) client.post(ApiPaths.appPath("/audit/risk/behavior"), body);
    }

    /** 账号风险检测 */
    public PlusApiResultAccountRiskVO checkAccountRisk(AccountRiskCheckForm body) throws Exception {
        return (PlusApiResultAccountRiskVO) client.post(ApiPaths.appPath("/audit/risk/account"), body);
    }

    /** 实时内容审核 */
    public PlusApiResultRealtimeAuditVO realtime(RealtimeAuditForm body) throws Exception {
        return (PlusApiResultRealtimeAuditVO) client.post(ApiPaths.appPath("/audit/realtime"), body);
    }

    /** 图片审核 */
    public PlusApiResultImageAuditVO image(ImageAuditForm body) throws Exception {
        return (PlusApiResultImageAuditVO) client.post(ApiPaths.appPath("/audit/image"), body);
    }

    /** 图片OCR审核 */
    public PlusApiResultImageOcrAuditVO imageOcr(ImageOcrAuditForm body) throws Exception {
        return (PlusApiResultImageOcrAuditVO) client.post(ApiPaths.appPath("/audit/image/ocr"), body);
    }

    /** 批量图片审核 */
    public PlusApiResultBatchImageAuditVO batchAuditImage(BatchImageAuditForm body) throws Exception {
        return (PlusApiResultBatchImageAuditVO) client.post(ApiPaths.appPath("/audit/image/batch"), body);
    }

    /** 综合内容审核 */
    public PlusApiResultContentAuditVO content(ContentAuditForm body) throws Exception {
        return (PlusApiResultContentAuditVO) client.post(ApiPaths.appPath("/audit/content"), body);
    }

    /** 音频审核 */
    public PlusApiResultAudioAuditVO audio(AudioAuditForm body) throws Exception {
        return (PlusApiResultAudioAuditVO) client.post(ApiPaths.appPath("/audit/audio"), body);
    }

    /** 语音审核 */
    public PlusApiResultAudioAsrAuditVO audioAsr(AudioAsrAuditForm body) throws Exception {
        return (PlusApiResultAudioAsrAuditVO) client.post(ApiPaths.appPath("/audit/audio/asr"), body);
    }

    /** 敏感词库 */
    public PlusApiResultListSensitiveWordListVO listSensitiveWord() throws Exception {
        return (PlusApiResultListSensitiveWordListVO) client.get(ApiPaths.appPath("/audit/word-lists"));
    }

    /** 视频审核状态 */
    public PlusApiResultVideoAuditStatusVO getVideoAuditStatus(String taskId) throws Exception {
        return (PlusApiResultVideoAuditStatusVO) client.get(ApiPaths.appPath("/audit/video/" + taskId + ""));
    }

    /** 审核记录 */
    public PlusApiResultPageAuditRecordVO listAuditRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAuditRecordVO) client.get(ApiPaths.appPath("/audit/records"), params);
    }

    /** 审核记录详情 */
    public PlusApiResultAuditRecordDetailVO getAuditRecord(String recordId) throws Exception {
        return (PlusApiResultAuditRecordDetailVO) client.get(ApiPaths.appPath("/audit/records/" + recordId + ""));
    }

    /** 审核策略 */
    public PlusApiResultListAuditPolicyVO listAuditPolicies() throws Exception {
        return (PlusApiResultListAuditPolicyVO) client.get(ApiPaths.appPath("/audit/policies"));
    }

    /** 我的审核记录 */
    public PlusApiResultPageAuditRecordVO listMyAuditRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAuditRecordVO) client.get(ApiPaths.appPath("/audit/my-records"), params);
    }

    /** 申诉记录 */
    public PlusApiResultPageAuditAppealVO listAppeals() throws Exception {
        return (PlusApiResultPageAuditAppealVO) client.get(ApiPaths.appPath("/audit/appeals"));
    }

    /** 申诉状态 */
    public PlusApiResultAuditAppealStatusVO getAppealStatus(String appealId) throws Exception {
        return (PlusApiResultAuditAppealStatusVO) client.get(ApiPaths.appPath("/audit/appeals/" + appealId + ""));
    }
}
