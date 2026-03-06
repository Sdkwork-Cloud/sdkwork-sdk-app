from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AppCreateForm, AppUpdateForm, PlusApiResultAccountSummaryVO, PlusApiResultAppDetailVO, PlusApiResultAppPublishReadinessVO, PlusApiResultAppStatisticsVO, PlusApiResultAppVO, PlusApiResultPageAppVO, PlusApiResultVoid

class AppApi:
    """app API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_app(self, appId: str) -> PlusApiResultAppDetailVO:
        """获取应用详情"""
        return self._client.get(f"/app/v3/api/app/manage/{appId}")

    def update_app(self, appId: str, body: AppUpdateForm) -> PlusApiResultAppVO:
        """更新应用"""
        return self._client.put(f"/app/v3/api/app/manage/{appId}", json=body)

    def delete_app(self, appId: str) -> PlusApiResultVoid:
        """删除应用"""
        return self._client.delete(f"/app/v3/api/app/manage/{appId}")

    def create_app(self, body: AppCreateForm) -> PlusApiResultAppVO:
        """创建应用"""
        return self._client.post(f"/app/v3/api/app/manage", json=body)

    def deactivate(self, appId: str) -> PlusApiResultVoid:
        """停用应用"""
        return self._client.post(f"/app/v3/api/app/manage/{appId}/deactivate")

    def activate(self, appId: str) -> PlusApiResultVoid:
        """激活应用"""
        return self._client.post(f"/app/v3/api/app/manage/{appId}/activate")

    def check_publish_readiness(self, appId: str) -> PlusApiResultAppPublishReadinessVO:
        """检查发布就绪状态"""
        return self._client.get(f"/app/v3/api/app/manage/{appId}/publish/readiness")

    def get_app_statistics(self) -> PlusApiResultAppStatisticsVO:
        """获取应用统计"""
        return self._client.get(f"/app/v3/api/app/manage/statistics")

    def search_apps(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAppVO:
        """搜索应用"""
        return self._client.get(f"/app/v3/api/app/manage/search", params=params)

    def get_project_apps(self, projectId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAppVO:
        """获取项目应用"""
        return self._client.get(f"/app/v3/api/app/manage/project/{projectId}", params=params)

    def get_my_apps(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAppVO:
        """获取我的应用"""
        return self._client.get(f"/app/v3/api/app/manage/my", params=params)

    def get_account_summary(self) -> PlusApiResultAccountSummaryVO:
        """获取账户余额汇总"""
        return self._client.get(f"/app/v3/api/account/summary")
