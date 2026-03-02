from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListVoiceSpeakerVO, PlusApiResultPageVoiceSpeakerVO, PlusApiResultSpeakerStatisticsVO, PlusApiResultVoiceSpeakerDetailVO, PlusApiResultVoiceSpeakerVO, PlusApiResultVoid, VoiceSpeakerCreateForm

class VoiceSpeakersApi:
    """voice_speakers API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_speaker_detail(self, speakerId: str) -> PlusApiResultVoiceSpeakerDetailVO:
        """获取发音人详情"""
        return self._client.get(f"/app/v3/api/voice-speakers/{speakerId}")

    def update_speaker(self, speakerId: str, body: VoiceSpeakerCreateForm) -> PlusApiResultVoiceSpeakerVO:
        """更新发音人"""
        return self._client.put(f"/app/v3/api/voice-speakers/{speakerId}", json=body)

    def delete_speaker(self, speakerId: str) -> PlusApiResultVoid:
        """删除发音人"""
        return self._client.delete(f"/app/v3/api/voice-speakers/{speakerId}")

    def list_speakers(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVoiceSpeakerVO:
        """获取发音人列表"""
        return self._client.get(f"/app/v3/api/voice-speakers", params=params)

    def create_speaker(self, body: VoiceSpeakerCreateForm) -> PlusApiResultVoiceSpeakerVO:
        """创建发音人"""
        return self._client.post(f"/app/v3/api/voice-speakers", json=body)

    def update_status(self, speakerId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """更新发音人状态"""
        return self._client.post(f"/app/v3/api/voice-speakers/{speakerId}/status", params=params)

    def set_as_default(self, speakerId: str) -> PlusApiResultVoiceSpeakerVO:
        """设为默认发音人"""
        return self._client.post(f"/app/v3/api/voice-speakers/{speakerId}/set-default")

    def get_statistics(self) -> PlusApiResultSpeakerStatisticsVO:
        """获取发音人统计"""
        return self._client.get(f"/app/v3/api/voice-speakers/statistics")

    def get_default_speaker(self) -> PlusApiResultVoiceSpeakerVO:
        """获取默认发音人"""
        return self._client.get(f"/app/v3/api/voice-speakers/default")

    def get_speaker_by_code(self, code: str) -> PlusApiResultVoiceSpeakerVO:
        """根据代码获取发音人"""
        return self._client.get(f"/app/v3/api/voice-speakers/code/{code}")

    def list_speakers_by_channel(self, channel: str) -> PlusApiResultListVoiceSpeakerVO:
        """获取渠道发音人"""
        return self._client.get(f"/app/v3/api/voice-speakers/channel/{channel}")
