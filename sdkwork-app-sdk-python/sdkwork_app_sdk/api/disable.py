from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultOrganizationVO

class DisableApi:
    """disable API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def organization(self, orgId: str) -> PlusApiResultOrganizationVO:
        """禁用组织"""
        return self._client.post(f"/app/v3/api/organization/{orgId}/disable")
