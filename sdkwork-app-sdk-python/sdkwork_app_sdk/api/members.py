from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultPageMemberVO

class MembersApi:
    """members API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_members_by_org(self, orgId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMemberVO:
        """获取组织成员"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/members", params=params)
