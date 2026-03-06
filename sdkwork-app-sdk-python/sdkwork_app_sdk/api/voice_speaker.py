from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultGenerationTaskVO, PlusApiResultListVoiceSpeakerVO, PlusApiResultPageGenerationTaskVO, PlusApiResultPageVoiceSpeakerListVO, PlusApiResultPageVoiceSpeakerVO, PlusApiResultSpeakerStatisticsVO, PlusApiResultVoiceSpeakerDetailVO, PlusApiResultVoiceSpeakerGenerationVO, PlusApiResultVoiceSpeakerVO, PlusApiResultVoid, VoiceSpeakerCloneForm, VoiceSpeakerCreateForm, VoiceSpeakerGenerationForm

class VoiceSpeakerApi:
    """voice_speaker API client."""
    
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

    def create_generation(self, body: VoiceSpeakerGenerationForm) -> PlusApiResultGenerationTaskVO:
        """创建语音生成任务"""
        return self._client.post(f"/app/v3/api/generation/voice-speaker", json=body)

    def clone_speaker(self, body: VoiceSpeakerCloneForm) -> PlusApiResultGenerationTaskVO:
        """克隆说话人"""
        return self._client.post(f"/app/v3/api/generation/voice-speaker/clone", json=body)

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

    def get_speaker_detail_voice(self, speakerId: str) -> PlusApiResultVoiceSpeakerGenerationVO:
        """获取说话人详情"""
        return self._client.get(f"/app/v3/api/generation/voice-speaker/{speakerId}")

    def delete_speaker_voice(self, speakerId: str) -> PlusApiResultVoid:
        """删除说话人"""
        return self._client.delete(f"/app/v3/api/generation/voice-speaker/{speakerId}")

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/generation/voice-speaker/tasks", params=params)

    def get_task_status(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取任务状态"""
        return self._client.get(f"/app/v3/api/generation/voice-speaker/tasks/{taskId}")

    def cancel_task(self, taskId: str) -> PlusApiResultVoid:
        """取消任务"""
        return self._client.delete(f"/app/v3/api/generation/voice-speaker/tasks/{taskId}")

    def get_list_speakers(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVoiceSpeakerListVO:
        """获取说话人列表"""
        return self._client.get(f"/app/v3/api/generation/voice-speaker/list", params=params)
