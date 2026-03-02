from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GenerationStyleCreateForm, GenerationStyleUpdateForm, PlusApiResultGenerationStyleDetailVO, PlusApiResultGenerationStyleVO, PlusApiResultListStyleTypeVO, PlusApiResultPageGenerationStyleVO, PlusApiResultStyleStatisticsVO, PlusApiResultVoid

class StyleApi:
    """style API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_style(self, styleId: str) -> PlusApiResultGenerationStyleDetailVO:
        """获取风格详情"""
        return self._client.get(f"/app/v3/api/generation/style/{styleId}")

    def update_style(self, styleId: str, body: GenerationStyleUpdateForm) -> PlusApiResultGenerationStyleVO:
        """更新风格"""
        return self._client.put(f"/app/v3/api/generation/style/{styleId}", json=body)

    def delete_style(self, styleId: str) -> PlusApiResultVoid:
        """删除风格"""
        return self._client.delete(f"/app/v3/api/generation/style/{styleId}")

    def create_style(self, body: GenerationStyleCreateForm) -> PlusApiResultGenerationStyleVO:
        """创建风格"""
        return self._client.post(f"/app/v3/api/generation/style", json=body)

    def publish(self, styleId: str) -> PlusApiResultVoid:
        """发布风格"""
        return self._client.post(f"/app/v3/api/generation/style/{styleId}/publish")

    def unpublish(self, styleId: str) -> PlusApiResultVoid:
        """取消发布"""
        return self._client.delete(f"/app/v3/api/generation/style/{styleId}/publish")

    def deactivate(self, styleId: str) -> PlusApiResultVoid:
        """停用风格"""
        return self._client.post(f"/app/v3/api/generation/style/{styleId}/deactivate")

    def activate(self, styleId: str) -> PlusApiResultVoid:
        """激活风格"""
        return self._client.post(f"/app/v3/api/generation/style/{styleId}/activate")

    def get_style_types(self) -> PlusApiResultListStyleTypeVO:
        """获取风格类型列表"""
        return self._client.get(f"/app/v3/api/generation/style/types")

    def get_style_statistics(self) -> PlusApiResultStyleStatisticsVO:
        """获取风格统计"""
        return self._client.get(f"/app/v3/api/generation/style/statistics")

    def search_styles(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationStyleVO:
        """搜索风格"""
        return self._client.get(f"/app/v3/api/generation/style/search", params=params)

    def get_public_styles(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationStyleVO:
        """获取公开风格"""
        return self._client.get(f"/app/v3/api/generation/style/public", params=params)

    def get_popular_styles(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationStyleVO:
        """获取热门风格"""
        return self._client.get(f"/app/v3/api/generation/style/popular", params=params)

    def get_my_styles(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationStyleVO:
        """获取我的风格"""
        return self._client.get(f"/app/v3/api/generation/style/my", params=params)
