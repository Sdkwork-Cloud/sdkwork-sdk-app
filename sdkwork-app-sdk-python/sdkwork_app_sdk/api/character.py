from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CharacterBatchGenerationForm, CharacterCreateForm, CharacterGenerationForm, CharacterUpdateForm, PlusApiResultCharacterDetailVO, PlusApiResultCharacterGenerationVO, PlusApiResultCharacterVO, PlusApiResultGenerationTaskVO, PlusApiResultListGenerationTaskVO, PlusApiResultPageCharacterListVO, PlusApiResultPageCharacterVO, PlusApiResultPageGenerationTaskVO, PlusApiResultVoid

class CharacterApi:
    """character API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_character(self, characterId: str) -> PlusApiResultCharacterDetailVO:
        """获取角色详情"""
        return self._client.get(f"/app/v3/api/character/{characterId}")

    def update_character(self, characterId: str, body: CharacterUpdateForm) -> PlusApiResultCharacterVO:
        """更新角色"""
        return self._client.put(f"/app/v3/api/character/{characterId}", json=body)

    def delete_character(self, characterId: str) -> PlusApiResultVoid:
        """删除角色"""
        return self._client.delete(f"/app/v3/api/character/{characterId}")

    def create_generation(self, body: CharacterGenerationForm) -> PlusApiResultGenerationTaskVO:
        """创建角色生成任务"""
        return self._client.post(f"/app/v3/api/generation/character", json=body)

    def batch_create_generation(self, body: CharacterBatchGenerationForm) -> PlusApiResultListGenerationTaskVO:
        """批量创建角色生成任务"""
        return self._client.post(f"/app/v3/api/generation/character/batch", json=body)

    def create_character(self, body: CharacterCreateForm) -> PlusApiResultCharacterVO:
        """创建角色"""
        return self._client.post(f"/app/v3/api/character", json=body)

    def use(self, characterId: str) -> PlusApiResultVoid:
        """使用角色"""
        return self._client.post(f"/app/v3/api/character/{characterId}/use")

    def like(self, characterId: str) -> PlusApiResultVoid:
        """点赞角色"""
        return self._client.post(f"/app/v3/api/character/{characterId}/like")

    def unlike(self, characterId: str) -> PlusApiResultVoid:
        """取消点赞"""
        return self._client.delete(f"/app/v3/api/character/{characterId}/like")

    def get_character_detail(self, characterId: str) -> PlusApiResultCharacterGenerationVO:
        """获取角色详情"""
        return self._client.get(f"/app/v3/api/generation/character/{characterId}")

    def list_tasks(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationTaskVO:
        """获取任务列表"""
        return self._client.get(f"/app/v3/api/generation/character/tasks", params=params)

    def get_task_status(self, taskId: str) -> PlusApiResultGenerationTaskVO:
        """获取任务状态"""
        return self._client.get(f"/app/v3/api/generation/character/tasks/{taskId}")

    def cancel_task(self, taskId: str) -> PlusApiResultVoid:
        """取消任务"""
        return self._client.delete(f"/app/v3/api/generation/character/tasks/{taskId}")

    def list_characters(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCharacterListVO:
        """获取角色列表"""
        return self._client.get(f"/app/v3/api/generation/character/list", params=params)

    def search_characters(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCharacterVO:
        """搜索角色"""
        return self._client.get(f"/app/v3/api/character/search", params=params)

    def get_popular_characters(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCharacterVO:
        """获取热门角色"""
        return self._client.get(f"/app/v3/api/character/popular", params=params)

    def get_my_characters(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCharacterVO:
        """获取我的角色"""
        return self._client.get(f"/app/v3/api/character/my", params=params)

    def get_most_liked_characters(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCharacterVO:
        """获取最受喜爱角色"""
        return self._client.get(f"/app/v3/api/character/liked", params=params)

    def get_character_by_agent(self, agentId: str) -> PlusApiResultCharacterVO:
        """获取智能体关联角色"""
        return self._client.get(f"/app/v3/api/character/agent/{agentId}")
