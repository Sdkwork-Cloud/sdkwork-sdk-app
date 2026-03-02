from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultOrganizationDetailVO

class CodeApi:
    """code API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_organization_by(self, code: str) -> PlusApiResultOrganizationDetailVO:
        """根据编码获取组织"""
        return self._client.get(f"/app/v3/api/organization/code/{code}")
