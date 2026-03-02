from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultOrganizationStatisticsVO

class StatisticsApi:
    """statistics API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_organization(self) -> PlusApiResultOrganizationStatisticsVO:
        """获取组织统计"""
        return self._client.get(f"/app/v3/api/organization/statistics")
