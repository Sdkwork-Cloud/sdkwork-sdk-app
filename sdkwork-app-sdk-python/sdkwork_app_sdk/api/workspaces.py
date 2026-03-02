from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import MemberInviteForm, MemberRoleUpdateForm, PlusApiResultListMemberVO, PlusApiResultListWorkspaceVO, PlusApiResultPageProjectVO, PlusApiResultProjectDetailVO, PlusApiResultProjectVO, PlusApiResultVoid, PlusApiResultWorkspaceVO, ProjectCopyForm, ProjectCreateForm, ProjectMoveForm, ProjectUpdateForm, WorkspaceCreateForm, WorkspaceUpdateForm

class WorkspacesApi:
    """workspaces API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_workspace_detail(self, workspaceId: str) -> PlusApiResultWorkspaceVO:
        """获取工作空间详情"""
        return self._client.get(f"/app/v3/api/workspaces/{workspaceId}")

    def update_workspace(self, workspaceId: str, body: WorkspaceUpdateForm) -> PlusApiResultWorkspaceVO:
        """更新工作空间"""
        return self._client.put(f"/app/v3/api/workspaces/{workspaceId}", json=body)

    def delete_workspace(self, workspaceId: str) -> PlusApiResultVoid:
        """删除工作空间"""
        return self._client.delete(f"/app/v3/api/workspaces/{workspaceId}")

    def get_project_detail(self, workspaceId: str, projectId: str) -> PlusApiResultProjectDetailVO:
        """获取项目详情"""
        return self._client.get(f"/app/v3/api/workspaces/{workspaceId}/projects/{projectId}")

    def update_project(self, workspaceId: str, projectId: str, body: ProjectUpdateForm) -> PlusApiResultProjectVO:
        """更新项目"""
        return self._client.put(f"/app/v3/api/workspaces/{workspaceId}/projects/{projectId}", json=body)

    def delete_project(self, workspaceId: str, projectId: str) -> PlusApiResultVoid:
        """删除项目"""
        return self._client.delete(f"/app/v3/api/workspaces/{workspaceId}/projects/{projectId}")

    def unarchive_project(self, workspaceId: str, projectId: str) -> PlusApiResultVoid:
        """取消归档项目"""
        return self._client.put(f"/app/v3/api/workspaces/{workspaceId}/projects/{projectId}/unarchive")

    def move_project(self, workspaceId: str, projectId: str, body: ProjectMoveForm) -> PlusApiResultVoid:
        """移动项目"""
        return self._client.put(f"/app/v3/api/workspaces/{workspaceId}/projects/{projectId}/move", json=body)

    def archive_project(self, workspaceId: str, projectId: str) -> PlusApiResultVoid:
        """归档项目"""
        return self._client.put(f"/app/v3/api/workspaces/{workspaceId}/projects/{projectId}/archive")

    def update_member_role(self, workspaceId: str, userId: str, body: MemberRoleUpdateForm) -> PlusApiResultVoid:
        """更新成员角色"""
        return self._client.put(f"/app/v3/api/workspaces/{workspaceId}/members/{userId}/role", json=body)

    def list_workspaces(self) -> PlusApiResultListWorkspaceVO:
        """获取工作空间列表"""
        return self._client.get(f"/app/v3/api/workspaces")

    def create_workspace(self, body: WorkspaceCreateForm) -> PlusApiResultWorkspaceVO:
        """创建工作空间"""
        return self._client.post(f"/app/v3/api/workspaces", json=body)

    def list_projects(self, workspaceId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageProjectVO:
        """获取项目列表"""
        return self._client.get(f"/app/v3/api/workspaces/{workspaceId}/projects", params=params)

    def create_project(self, workspaceId: str, body: ProjectCreateForm) -> PlusApiResultProjectVO:
        """创建项目"""
        return self._client.post(f"/app/v3/api/workspaces/{workspaceId}/projects", json=body)

    def copy_project(self, workspaceId: str, projectId: str, body: ProjectCopyForm) -> PlusApiResultProjectVO:
        """复制项目"""
        return self._client.post(f"/app/v3/api/workspaces/{workspaceId}/projects/{projectId}/copy", json=body)

    def list_workspace_members(self, workspaceId: str) -> PlusApiResultListMemberVO:
        """获取工作空间成员"""
        return self._client.get(f"/app/v3/api/workspaces/{workspaceId}/members")

    def invite_member(self, workspaceId: str, body: MemberInviteForm) -> PlusApiResultVoid:
        """邀请成员"""
        return self._client.post(f"/app/v3/api/workspaces/{workspaceId}/members", json=body)

    def get_current_workspace(self) -> PlusApiResultWorkspaceVO:
        """获取当前工作空间"""
        return self._client.get(f"/app/v3/api/workspaces/current")

    def remove_member(self, workspaceId: str, userId: str) -> PlusApiResultVoid:
        """移除成员"""
        return self._client.delete(f"/app/v3/api/workspaces/{workspaceId}/members/{userId}")
