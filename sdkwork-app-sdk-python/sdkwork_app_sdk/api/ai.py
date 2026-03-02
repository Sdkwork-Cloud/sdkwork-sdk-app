from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultPagePromptHistoryVO, PlusApiResultPagePromptVO, PlusApiResultPromptHistoryVO, PlusApiResultPromptVO, PlusApiResultVoid, PromptCreateForm, PromptUpdateForm

class AiApi:
    """ai API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_prompt_detail(self, id: str) -> PlusApiResultPromptVO:
        """获取提示语详情"""
        return self._client.get(f"/app/v3/api/prompt/{id}")

    def update_prompt(self, id: str, body: PromptUpdateForm) -> PlusApiResultPromptVO:
        """更新提示语"""
        return self._client.put(f"/app/v3/api/prompt/{id}", json=body)

    def delete_prompt(self, id: str) -> PlusApiResultVoid:
        """删除提示语"""
        return self._client.delete(f"/app/v3/api/prompt/{id}")

    def create_prompt(self, body: PromptCreateForm) -> PlusApiResultPromptVO:
        """创建提示语"""
        return self._client.post(f"/app/v3/api/prompt", json=body)

    def use_prompt(self, id: str) -> PlusApiResultVoid:
        """使用提示语"""
        return self._client.post(f"/app/v3/api/prompt/{id}/use")

    def favorite_prompt(self, id: str) -> PlusApiResultVoid:
        """收藏提示语"""
        return self._client.post(f"/app/v3/api/prompt/{id}/favorite")

    def unfavorite_prompt(self, id: str) -> PlusApiResultVoid:
        """取消收藏提示语"""
        return self._client.delete(f"/app/v3/api/prompt/{id}/favorite")

    def get_popular_prompts(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePromptVO:
        """获取热门提示语"""
        return self._client.get(f"/app/v3/api/prompt/popular", params=params)

    def get_most_favorited_prompts(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePromptVO:
        """获取最受欢迎提示语"""
        return self._client.get(f"/app/v3/api/prompt/most-favorited", params=params)

    def list_prompts(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePromptVO:
        """获取提示语列表"""
        return self._client.get(f"/app/v3/api/prompt/list", params=params)

    def get_prompt_history_detail(self, id: str) -> PlusApiResultPromptHistoryVO:
        """获取提示语历史详情"""
        return self._client.get(f"/app/v3/api/prompt/history/{id}")

    def delete_prompt_history(self, id: str) -> PlusApiResultVoid:
        """删除提示语历史"""
        return self._client.delete(f"/app/v3/api/prompt/history/{id}")

    def list_prompt_history(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePromptHistoryVO:
        """获取提示语使用历史"""
        return self._client.get(f"/app/v3/api/prompt/history/list", params=params)
