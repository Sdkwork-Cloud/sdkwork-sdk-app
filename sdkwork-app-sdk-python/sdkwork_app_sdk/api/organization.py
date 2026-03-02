from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import OrganizationCreateForm, PlusApiResultOrganizationDetailVO, PlusApiResultOrganizationVO

class OrganizationApi:
    """organization API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_organization(self, body: OrganizationCreateForm) -> PlusApiResultOrganizationVO:
        """创建组织"""
        return self._client.post(f"/app/v3/api/organization", json=body)

    def get_organization(self, orgId: str) -> PlusApiResultOrganizationDetailVO:
        """获取组织详情"""
        return self._client.get(f"/app/v3/api/organization/{orgId}")
