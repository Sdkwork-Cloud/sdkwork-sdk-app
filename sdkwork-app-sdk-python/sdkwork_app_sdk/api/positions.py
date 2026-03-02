from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListPositionDetailVO, PlusApiResultListPositionVO

class PositionsApi:
    """positions API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_positions_by_org(self, orgId: str) -> PlusApiResultListPositionVO:
        """获取组织的岗位列表"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/positions")

    def get_position_tree(self, orgId: str) -> PlusApiResultListPositionDetailVO:
        """获取岗位树"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/positions/tree")
