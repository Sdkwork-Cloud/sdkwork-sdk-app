from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DepartmentCreateForm, OrganizationCreateForm, PlusApiResultDepartmentDetailVO, PlusApiResultDepartmentVO, PlusApiResultListDepartmentDetailVO, PlusApiResultListDepartmentVO, PlusApiResultListOrganizationVO, PlusApiResultListPositionDetailVO, PlusApiResultListPositionVO, PlusApiResultMemberVO, PlusApiResultOrganizationDetailVO, PlusApiResultOrganizationStatisticsVO, PlusApiResultOrganizationVO, PlusApiResultPageMemberVO, PlusApiResultPageOrganizationVO, PlusApiResultPositionDetailVO, PlusApiResultPositionVO, PositionCreateForm

class OrganizationApi:
    """organization API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_organization(self, body: OrganizationCreateForm) -> PlusApiResultOrganizationVO:
        """创建组织"""
        return self._client.post(f"/app/v3/api/organization", json=body)

    def disable(self, orgId: str) -> PlusApiResultOrganizationVO:
        """禁用组织"""
        return self._client.post(f"/app/v3/api/organization/{orgId}/disable")

    def activate(self, orgId: str) -> PlusApiResultOrganizationVO:
        """激活组织"""
        return self._client.post(f"/app/v3/api/organization/{orgId}/activate")

    def create_position(self, body: PositionCreateForm) -> PlusApiResultPositionVO:
        """创建岗位"""
        return self._client.post(f"/app/v3/api/organization/position", json=body)

    def create_department(self, body: DepartmentCreateForm) -> PlusApiResultDepartmentVO:
        """创建部门"""
        return self._client.post(f"/app/v3/api/organization/department", json=body)

    def get_organization(self, orgId: str) -> PlusApiResultOrganizationDetailVO:
        """获取组织详情"""
        return self._client.get(f"/app/v3/api/organization/{orgId}")

    def get_positions_by_org(self, orgId: str) -> PlusApiResultListPositionVO:
        """获取组织的岗位列表"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/positions")

    def get_position_tree(self, orgId: str) -> PlusApiResultListPositionDetailVO:
        """获取岗位树"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/positions/tree")

    def get_members_by_org(self, orgId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMemberVO:
        """获取组织成员"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/members", params=params)

    def get_departments_by_org(self, orgId: str) -> PlusApiResultListDepartmentVO:
        """获取组织的部门列表"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/departments")

    def get_department_tree(self, orgId: str) -> PlusApiResultListDepartmentDetailVO:
        """获取部门树"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/departments/tree")

    def get_child_organizations(self, orgId: str) -> PlusApiResultListOrganizationVO:
        """获取子组织"""
        return self._client.get(f"/app/v3/api/organization/{orgId}/children")

    def get_organization_statistics(self) -> PlusApiResultOrganizationStatisticsVO:
        """获取组织统计"""
        return self._client.get(f"/app/v3/api/organization/statistics")

    def get_position(self, posId: str) -> PlusApiResultPositionDetailVO:
        """获取岗位详情"""
        return self._client.get(f"/app/v3/api/organization/position/{posId}")

    def get_child_positions(self, posId: str) -> PlusApiResultListPositionVO:
        """获取子岗位"""
        return self._client.get(f"/app/v3/api/organization/position/{posId}/children")

    def get_member(self, memberId: str) -> PlusApiResultMemberVO:
        """获取成员详情"""
        return self._client.get(f"/app/v3/api/organization/member/{memberId}")

    def get_organization_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageOrganizationVO:
        """获取组织列表"""
        return self._client.get(f"/app/v3/api/organization/list", params=params)

    def get_department(self, deptId: str) -> PlusApiResultDepartmentDetailVO:
        """获取部门详情"""
        return self._client.get(f"/app/v3/api/organization/department/{deptId}")

    def get_child_departments(self, deptId: str) -> PlusApiResultListDepartmentVO:
        """获取子部门"""
        return self._client.get(f"/app/v3/api/organization/department/{deptId}/children")

    def get_organization_by_code(self, code: str) -> PlusApiResultOrganizationDetailVO:
        """根据编码获取组织"""
        return self._client.get(f"/app/v3/api/organization/code/{code}")
