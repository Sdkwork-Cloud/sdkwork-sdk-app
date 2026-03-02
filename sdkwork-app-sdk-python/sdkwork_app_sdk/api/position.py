from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListPositionVO, PlusApiResultPositionDetailVO, PlusApiResultPositionVO, PositionCreateForm

class PositionApi:
    """position API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_position(self, body: PositionCreateForm) -> PlusApiResultPositionVO:
        """创建岗位"""
        return self._client.post(f"/app/v3/api/organization/position", json=body)

    def get_position(self, posId: str) -> PlusApiResultPositionDetailVO:
        """获取岗位详情"""
        return self._client.get(f"/app/v3/api/organization/position/{posId}")

    def get_child_positions(self, posId: str) -> PlusApiResultListPositionVO:
        """获取子岗位"""
        return self._client.get(f"/app/v3/api/organization/position/{posId}/children")
