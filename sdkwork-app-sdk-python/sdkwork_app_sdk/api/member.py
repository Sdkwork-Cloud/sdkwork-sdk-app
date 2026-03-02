from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultMemberVO

class MemberApi:
    """member API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_member(self, memberId: str) -> PlusApiResultMemberVO:
        """获取成员详情"""
        return self._client.get(f"/app/v3/api/organization/member/{memberId}")
