from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AccountRiskCheckForm, AudioAsrAuditForm, AudioAuditForm, AuditAppealForm, BatchImageAuditForm, BatchTextAuditForm, BehaviorRiskCheckForm, ContentAuditForm, ImageAuditForm, ImageOcrAuditForm, PlusApiResultAccountRiskVO, PlusApiResultAudioAsrAuditVO, PlusApiResultAudioAuditVO, PlusApiResultAuditAppealStatusVO, PlusApiResultAuditAppealVO, PlusApiResultAuditRecordDetailVO, PlusApiResultBatchImageAuditVO, PlusApiResultBatchTextAuditVO, PlusApiResultBehaviorRiskVO, PlusApiResultContentAuditVO, PlusApiResultImageAuditVO, PlusApiResultImageOcrAuditVO, PlusApiResultListAuditPolicyVO, PlusApiResultListSensitiveWordListVO, PlusApiResultPageAuditAppealVO, PlusApiResultPageAuditRecordVO, PlusApiResultRealtimeAuditVO, PlusApiResultSensitiveWordsVO, PlusApiResultTextAuditVO, PlusApiResultTextSuggestVO, PlusApiResultVideoAuditStatusVO, PlusApiResultVideoAuditVO, RealtimeAuditForm, SensitiveWordsForm, TextAuditForm, TextSuggestForm, VideoAuditForm

class AuditApi:
    """audit API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def submit_appeal(self, recordId: str, body: AuditAppealForm) -> PlusApiResultAuditAppealVO:
        """审核申诉"""
        return self._client.post(f"/app/v3/api/audit/{recordId}/appeal", json=body)

    def video(self, body: VideoAuditForm) -> PlusApiResultVideoAuditVO:
        """视频审核"""
        return self._client.post(f"/app/v3/api/audit/video", json=body)

    def text(self, body: TextAuditForm) -> PlusApiResultTextAuditVO:
        """文本审核"""
        return self._client.post(f"/app/v3/api/audit/text", json=body)

    def suggest_text_replacement(self, body: TextSuggestForm) -> PlusApiResultTextSuggestVO:
        """文本替换建议"""
        return self._client.post(f"/app/v3/api/audit/text/suggest", json=body)

    def batch_audit_text(self, body: BatchTextAuditForm) -> PlusApiResultBatchTextAuditVO:
        """批量文本审核"""
        return self._client.post(f"/app/v3/api/audit/text/batch", json=body)

    def detect_sensitive_words(self, body: SensitiveWordsForm) -> PlusApiResultSensitiveWordsVO:
        """敏感词检测"""
        return self._client.post(f"/app/v3/api/audit/sensitive-words", json=body)

    def check_behavior_risk(self, body: BehaviorRiskCheckForm) -> PlusApiResultBehaviorRiskVO:
        """行为风险检测"""
        return self._client.post(f"/app/v3/api/audit/risk/behavior", json=body)

    def check_account_risk(self, body: AccountRiskCheckForm) -> PlusApiResultAccountRiskVO:
        """账号风险检测"""
        return self._client.post(f"/app/v3/api/audit/risk/account", json=body)

    def realtime(self, body: RealtimeAuditForm) -> PlusApiResultRealtimeAuditVO:
        """实时内容审核"""
        return self._client.post(f"/app/v3/api/audit/realtime", json=body)

    def image(self, body: ImageAuditForm) -> PlusApiResultImageAuditVO:
        """图片审核"""
        return self._client.post(f"/app/v3/api/audit/image", json=body)

    def image_ocr(self, body: ImageOcrAuditForm) -> PlusApiResultImageOcrAuditVO:
        """图片OCR审核"""
        return self._client.post(f"/app/v3/api/audit/image/ocr", json=body)

    def batch_audit_image(self, body: BatchImageAuditForm) -> PlusApiResultBatchImageAuditVO:
        """批量图片审核"""
        return self._client.post(f"/app/v3/api/audit/image/batch", json=body)

    def content(self, body: ContentAuditForm) -> PlusApiResultContentAuditVO:
        """综合内容审核"""
        return self._client.post(f"/app/v3/api/audit/content", json=body)

    def audio(self, body: AudioAuditForm) -> PlusApiResultAudioAuditVO:
        """音频审核"""
        return self._client.post(f"/app/v3/api/audit/audio", json=body)

    def audio_asr(self, body: AudioAsrAuditForm) -> PlusApiResultAudioAsrAuditVO:
        """语音审核"""
        return self._client.post(f"/app/v3/api/audit/audio/asr", json=body)

    def list_sensitive_word(self) -> PlusApiResultListSensitiveWordListVO:
        """敏感词库"""
        return self._client.get(f"/app/v3/api/audit/word-lists")

    def get_video_audit_status(self, taskId: str) -> PlusApiResultVideoAuditStatusVO:
        """视频审核状态"""
        return self._client.get(f"/app/v3/api/audit/video/{taskId}")

    def list_audit_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAuditRecordVO:
        """审核记录"""
        return self._client.get(f"/app/v3/api/audit/records", params=params)

    def get_audit_record(self, recordId: str) -> PlusApiResultAuditRecordDetailVO:
        """审核记录详情"""
        return self._client.get(f"/app/v3/api/audit/records/{recordId}")

    def list_audit_policies(self) -> PlusApiResultListAuditPolicyVO:
        """审核策略"""
        return self._client.get(f"/app/v3/api/audit/policies")

    def list_my_audit_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAuditRecordVO:
        """我的审核记录"""
        return self._client.get(f"/app/v3/api/audit/my-records", params=params)

    def list_appeals(self) -> PlusApiResultPageAuditAppealVO:
        """申诉记录"""
        return self._client.get(f"/app/v3/api/audit/appeals")

    def get_appeal_status(self, appealId: str) -> PlusApiResultAuditAppealStatusVO:
        """申诉状态"""
        return self._client.get(f"/app/v3/api/audit/appeals/{appealId}")
