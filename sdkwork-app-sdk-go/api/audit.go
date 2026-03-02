package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AuditApi struct {
    client *sdkhttp.Client
}

func NewAuditApi(client *sdkhttp.Client) *AuditApi {
    return &AuditApi{client: client}
}

// 审核申诉
func (a *AuditApi) SubmitAppeal(recordId string, body sdktypes.AuditAppealForm) (sdktypes.PlusApiResultAuditAppealVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/audit/%s/appeal", recordId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAuditAppealVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAuditAppealVO](raw)
}

// 视频审核
func (a *AuditApi) Video(body sdktypes.VideoAuditForm) (sdktypes.PlusApiResultVideoAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/video"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVideoAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVideoAuditVO](raw)
}

// 文本审核
func (a *AuditApi) Text(body sdktypes.TextAuditForm) (sdktypes.PlusApiResultTextAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/text"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTextAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTextAuditVO](raw)
}

// 文本替换建议
func (a *AuditApi) SuggestTextReplacement(body sdktypes.TextSuggestForm) (sdktypes.PlusApiResultTextSuggestVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/text/suggest"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTextSuggestVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTextSuggestVO](raw)
}

// 批量文本审核
func (a *AuditApi) BatchAuditText(body sdktypes.BatchTextAuditForm) (sdktypes.PlusApiResultBatchTextAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/text/batch"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBatchTextAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBatchTextAuditVO](raw)
}

// 敏感词检测
func (a *AuditApi) DetectSensitiveWords(body sdktypes.SensitiveWordsForm) (sdktypes.PlusApiResultSensitiveWordsVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/sensitive-words"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSensitiveWordsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSensitiveWordsVO](raw)
}

// 行为风险检测
func (a *AuditApi) CheckBehaviorRisk(body sdktypes.BehaviorRiskCheckForm) (sdktypes.PlusApiResultBehaviorRiskVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/risk/behavior"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBehaviorRiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBehaviorRiskVO](raw)
}

// 账号风险检测
func (a *AuditApi) CheckAccountRisk(body sdktypes.AccountRiskCheckForm) (sdktypes.PlusApiResultAccountRiskVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/risk/account"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAccountRiskVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAccountRiskVO](raw)
}

// 实时内容审核
func (a *AuditApi) Realtime(body sdktypes.RealtimeAuditForm) (sdktypes.PlusApiResultRealtimeAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/realtime"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultRealtimeAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultRealtimeAuditVO](raw)
}

// 图片审核
func (a *AuditApi) Image(body sdktypes.ImageAuditForm) (sdktypes.PlusApiResultImageAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/image"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultImageAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImageAuditVO](raw)
}

// 图片OCR审核
func (a *AuditApi) ImageOcr(body sdktypes.ImageOcrAuditForm) (sdktypes.PlusApiResultImageOcrAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/image/ocr"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultImageOcrAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultImageOcrAuditVO](raw)
}

// 批量图片审核
func (a *AuditApi) BatchAuditImage(body sdktypes.BatchImageAuditForm) (sdktypes.PlusApiResultBatchImageAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/image/batch"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBatchImageAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBatchImageAuditVO](raw)
}

// 综合内容审核
func (a *AuditApi) Content(body sdktypes.ContentAuditForm) (sdktypes.PlusApiResultContentAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/content"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultContentAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContentAuditVO](raw)
}

// 音频审核
func (a *AuditApi) Audio(body sdktypes.AudioAuditForm) (sdktypes.PlusApiResultAudioAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/audio"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAudioAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAudioAuditVO](raw)
}

// 语音审核
func (a *AuditApi) AudioAsr(body sdktypes.AudioAsrAuditForm) (sdktypes.PlusApiResultAudioAsrAuditVO, error) {
    raw, err := a.client.Post(AppApiPath("/audit/audio/asr"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultAudioAsrAuditVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAudioAsrAuditVO](raw)
}

// 敏感词库
func (a *AuditApi) ListSensitiveWord() (sdktypes.PlusApiResultListSensitiveWordListVO, error) {
    raw, err := a.client.Get(AppApiPath("/audit/word-lists"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSensitiveWordListVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSensitiveWordListVO](raw)
}

// 视频审核状态
func (a *AuditApi) GetVideoAuditStatus(taskId string) (sdktypes.PlusApiResultVideoAuditStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/audit/video/%s", taskId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVideoAuditStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVideoAuditStatusVO](raw)
}

// 审核记录
func (a *AuditApi) ListAuditRecords(query map[string]interface{}) (sdktypes.PlusApiResultPageAuditRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/audit/records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAuditRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAuditRecordVO](raw)
}

// 审核记录详情
func (a *AuditApi) GetAuditRecord(recordId string) (sdktypes.PlusApiResultAuditRecordDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/audit/records/%s", recordId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAuditRecordDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAuditRecordDetailVO](raw)
}

// 审核策略
func (a *AuditApi) ListAuditPolicies() (sdktypes.PlusApiResultListAuditPolicyVO, error) {
    raw, err := a.client.Get(AppApiPath("/audit/policies"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListAuditPolicyVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListAuditPolicyVO](raw)
}

// 我的审核记录
func (a *AuditApi) ListMyAuditRecords(query map[string]interface{}) (sdktypes.PlusApiResultPageAuditRecordVO, error) {
    raw, err := a.client.Get(AppApiPath("/audit/my-records"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAuditRecordVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAuditRecordVO](raw)
}

// 申诉记录
func (a *AuditApi) ListAppeals() (sdktypes.PlusApiResultPageAuditAppealVO, error) {
    raw, err := a.client.Get(AppApiPath("/audit/appeals"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAuditAppealVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAuditAppealVO](raw)
}

// 申诉状态
func (a *AuditApi) GetAppealStatus(appealId string) (sdktypes.PlusApiResultAuditAppealStatusVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/audit/appeals/%s", appealId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAuditAppealStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAuditAppealStatusVO](raw)
}
