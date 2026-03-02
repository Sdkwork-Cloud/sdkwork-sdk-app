from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultGenerationTaskVO, PlusApiResultPageGenerationTaskVO, PlusApiResultSoundEffectCategoriesVO, PlusApiResultSoundEffectGenerationVO, PlusApiResultVoid, SoundEffectGenerationForm

class SoundEffectApi:
    """sound_effect API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_generation(self, body: SoundEffectGenerationForm) -> PlusApiResultGenerationTaskVO:
        """创建音效生成任务"""
        return self._client.post(f"/app/v3/api/generation/sound-effect", json=body)

    def get_effect_detail(self, effectId: str) -> PlusApiResultSoundEffectGenerationVO:
        """获取音效详情"""
        return self._client.get(f"/app/v3/api/generation/sound-effect/{effectId}")

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/generation/sound-effect/tasks", params=params)

    def get_task_status(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取任务状态"""
        return self._client.get(f"/app/v3/api/generation/sound-effect/tasks/{taskId}")

    def cancel_task(self, taskId: str) -> PlusApiResultVoid:
        """取消任务"""
        return self._client.delete(f"/app/v3/api/generation/sound-effect/tasks/{taskId}")

    def get_categories(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultSoundEffectCategoriesVO:
        """获取音效类别"""
        return self._client.get(f"/app/v3/api/generation/sound-effect/categories", params=params)
