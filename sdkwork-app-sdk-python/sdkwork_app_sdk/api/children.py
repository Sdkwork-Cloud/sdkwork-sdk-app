from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListOrganizationVO

class ChildrenApi:
    """children API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_child_organizations(self, orgId: str) -> PlusApiResultListOrganizationVO:
        """获取子组织"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/children")
