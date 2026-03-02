from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AudioGenerationForm, AudioTranscriptionForm, AudioTranslationForm, PlusApiResultGenerationTaskVO, PlusApiResultPageGenerationTaskVO, PlusApiResultVoiceListVO, PlusApiResultVoid, VoiceCloneForm

class AudioApi:
    """audio API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def voice_clone(self, body: VoiceCloneForm) -> PlusApiResultGenerationTaskVO:
        """语音克隆"""
        return self._client.post(f"/app/v3/api/generation/audio/voice-clone", json=body)

    def text_to_speech(self, body: AudioGenerationForm) -> PlusApiResultGenerationTaskVO:
        """文本转语音"""
        return self._client.post(f"/app/v3/api/generation/audio/tts", json=body)

    def translation(self, body: AudioTranslationForm) -> PlusApiResultGenerationTaskVO:
        """语音翻译"""
        return self._client.post(f"/app/v3/api/generation/audio/translation", json=body)

    def transcription(self, body: AudioTranscriptionForm) -> PlusApiResultGenerationTaskVO:
        """语音转文本"""
        return self._client.post(f"/app/v3/api/generation/audio/transcription", json=body)

    def get_voice_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoiceListVO:
        """获取语音列表"""
        return self._client.get(f"/app/v3/api/generation/audio/voices", params=params)

    def get_transcription_result(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取转录结果"""
        return self._client.get(f"/app/v3/api/generation/audio/transcription/{taskId}")

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/generation/audio/tasks", params=params)

    def get_task_status(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取任务状态"""
        return self._client.get(f"/app/v3/api/generation/audio/tasks/{taskId}")

    def cancel_task(self, taskId: str) -> PlusApiResultVoid:
        """取消任务"""
        return self._client.delete(f"/app/v3/api/generation/audio/tasks/{taskId}")
