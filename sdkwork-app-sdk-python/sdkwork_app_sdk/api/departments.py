from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListDepartmentDetailVO, PlusApiResultListDepartmentVO

class DepartmentsApi:
    """departments API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_departments_by_org(self, orgId: str) -> PlusApiResultListDepartmentVO:
        """获取组织的部门列表"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/departments")

    def get_department_tree(self, orgId: str) -> PlusApiResultListDepartmentDetailVO:
        """获取部门树"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/departments/tree")
