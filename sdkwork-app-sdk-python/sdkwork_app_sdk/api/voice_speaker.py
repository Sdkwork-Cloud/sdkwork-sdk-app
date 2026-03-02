from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultGenerationTaskVO, PlusApiResultPageGenerationTaskVO, PlusApiResultPageVoiceSpeakerListVO, PlusApiResultVoiceSpeakerGenerationVO, PlusApiResultVoid, VoiceSpeakerCloneForm, VoiceSpeakerGenerationForm

class VoiceSpeakerApi:
    """voice_speaker API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_generation(self, body: VoiceSpeakerGenerationForm) -> PlusApiResultGenerationTaskVO:
        """创建语音生成任务"""
        return self._client.post(f"/app/v3/api/generation/voice-speaker", json=body)

    def clone_speaker(self, body: VoiceSpeakerCloneForm) -> PlusApiResultGenerationTaskVO:
        """克隆说话人"""
        return self._client.post(f"/app/v3/api/generation/voice-speaker/clone", json=body)

    def get_speaker_detail(self, speakerId: str) -> PlusApiResultVoiceSpeakerGenerationVO:
        """获取说话人详情"""
        return self._client.get(f"/app/v3/api/generation/voice-speaker/{speakerId}")

    def delete_speaker(self, speakerId: str) -> PlusApiResultVoid:
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

    def list_speakers(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageVoiceSpeakerListVO:
        """获取说话人列表"""
        return self._client.get(f"/app/v3/api/generation/voice-speaker/list", params=params)
