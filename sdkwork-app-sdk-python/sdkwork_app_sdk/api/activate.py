from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultOrganizationVO

class ActivateApi:
    """activate API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def organization(self, orgId: str) -> PlusApiResultOrganizationVO:
        """激活组织"""
        return self._client.post(f"/app/v3/api/organization/{orgId}/activate")
