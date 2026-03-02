from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultPageOrganizationVO

class ListApi:
    """list API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_organization(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageOrganizationVO:
        """获取组织列表"""
        return self._client.get(f"/app/v3/api/organization/list", params=params)
