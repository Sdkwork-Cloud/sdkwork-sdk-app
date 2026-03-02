from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DepartmentCreateForm, PlusApiResultDepartmentDetailVO, PlusApiResultDepartmentVO, PlusApiResultListDepartmentVO

class DepartmentApi:
    """department API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_department(self, body: DepartmentCreateForm) -> PlusApiResultDepartmentVO:
        """创建部门"""
        return self._client.post(f"/app/v3/api/organization/department", json=body)

    def get_department(self, deptId: str) -> PlusApiResultDepartmentDetailVO:
        """获取部门详情"""
        return self._client.get(f"/app/v3/api/organization/department/{deptId}")

    def get_child_departments(self, deptId: str) -> PlusApiResultListDepartmentVO:
        """获取子部门"""
        return self._client.get(f"/app/v3/api/organization/department/{deptId}/children")
