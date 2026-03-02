from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultListProjectVO, PlusApiResultPageProjectVO, PlusApiResultProjectDetailVO, PlusApiResultProjectStatisticsVO, PlusApiResultProjectVO, PlusApiResultVoid, ProjectCopyRequest, ProjectCreateRequest, ProjectMoveRequest, ProjectUpdateRequest

class ProjectsApi:
    """projects API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_project_detail(self, projectId: str) -> PlusApiResultProjectDetailVO:
        """获取项目详情"""
        return self._client.get(f"/app/v3/api/projects/{projectId}")

    def update_project(self, projectId: str, body: ProjectUpdateRequest) -> PlusApiResultProjectVO:
        """更新项目"""
        return self._client.put(f"/app/v3/api/projects/{projectId}", json=body)

    def delete_project(self, projectId: str) -> PlusApiResultVoid:
        """删除项目"""
        return self._client.delete(f"/app/v3/api/projects/{projectId}")

    def unarchive_project(self, projectId: str) -> PlusApiResultVoid:
        """取消归档项目"""
        return self._client.put(f"/app/v3/api/projects/{projectId}/unarchive")

    def move_project(self, projectId: str, body: ProjectMoveRequest) -> PlusApiResultVoid:
        """移动项目"""
        return self._client.put(f"/app/v3/api/projects/{projectId}/move", json=body)

    def archive_project(self, projectId: str) -> PlusApiResultVoid:
        """归档项目"""
        return self._client.put(f"/app/v3/api/projects/{projectId}/archive")

    def list_projects(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageProjectVO:
        """获取项目列表"""
        return self._client.get(f"/app/v3/api/projects", params=params)

    def create_project(self, body: ProjectCreateRequest) -> PlusApiResultProjectVO:
        """创建项目"""
        return self._client.post(f"/app/v3/api/projects", json=body)

    def copy_project(self, projectId: str, body: ProjectCopyRequest) -> PlusApiResultProjectVO:
        """复制项目"""
        return self._client.post(f"/app/v3/api/projects/{projectId}/copy", json=body)

    def get_project_statistics(self, projectId: str) -> PlusApiResultProjectStatisticsVO:
        """项目统计"""
        return self._client.get(f"/app/v3/api/projects/{projectId}/statistics")

    def search(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageProjectVO:
        """搜索项目"""
        return self._client.get(f"/app/v3/api/projects/search", params=params)

    def list_recent(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListProjectVO:
        """最近访问项目"""
        return self._client.get(f"/app/v3/api/projects/recent", params=params)
