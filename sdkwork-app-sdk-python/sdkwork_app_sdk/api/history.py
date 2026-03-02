from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import BrowseHistoryAddForm, PlusApiResultBrowseStatisticsVO, PlusApiResultHistoryStatisticsVO, PlusApiResultListGenerationHistoryVO, PlusApiResultListOperationHistoryVO, PlusApiResultListSessionInfoVO, PlusApiResultPageBrowseHistoryVO, PlusApiResultPageGenerationHistoryVO, PlusApiResultPageLoginHistoryVO, PlusApiResultPageMapStringObject, PlusApiResultPageOperationHistoryVO, PlusApiResultSessionInfoVO, PlusApiResultVoid

class HistoryApi:
    """history API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list_browse(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageBrowseHistoryVO:
        """浏览历史"""
        return self._client.get(f"/app/v3/api/history/browse", params=params)

    def add_browse(self, body: BrowseHistoryAddForm) -> PlusApiResultVoid:
        """添加浏览记录"""
        return self._client.post(f"/app/v3/api/history/browse", json=body)

    def clear_browse(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """清空浏览历史"""
        return self._client.delete(f"/app/v3/api/history/browse", params=params)

    def get_login(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMapStringObject:
        """获取登录历史"""
        return self._client.get(f"/app/v3/api/user/history/login", params=params)

    def get_generation(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageMapStringObject:
        """获取生成历史"""
        return self._client.get(f"/app/v3/api/user/history/generations", params=params)

    def get_history_statistics(self) -> PlusApiResultHistoryStatisticsVO:
        """历史统计"""
        return self._client.get(f"/app/v3/api/history/statistics")

    def get_browse_statistics(self) -> PlusApiResultBrowseStatisticsVO:
        """浏览统计"""
        return self._client.get(f"/app/v3/api/history/statistics/browse")

    def list_sessions(self) -> PlusApiResultListSessionInfoVO:
        """所有会话"""
        return self._client.get(f"/app/v3/api/history/sessions")

    def get_current_session(self) -> PlusApiResultSessionInfoVO:
        """当前会话"""
        return self._client.get(f"/app/v3/api/history/sessions/current")

    def list_operation(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageOperationHistoryVO:
        """操作历史"""
        return self._client.get(f"/app/v3/api/history/operations", params=params)

    def get_recent_operations(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListOperationHistoryVO:
        """最近操作"""
        return self._client.get(f"/app/v3/api/history/operations/recent", params=params)

    def list_login(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageLoginHistoryVO:
        """登录历史"""
        return self._client.get(f"/app/v3/api/history/logins", params=params)

    def list_generation(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageGenerationHistoryVO:
        """生成历史"""
        return self._client.get(f"/app/v3/api/history/generations", params=params)

    def clear_generation(self) -> PlusApiResultVoid:
        """清空生成历史"""
        return self._client.delete(f"/app/v3/api/history/generations")

    def get_recent_generations(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListGenerationHistoryVO:
        """最近生成"""
        return self._client.get(f"/app/v3/api/history/generations/recent", params=params)

    def terminate_session(self, sessionId: str) -> PlusApiResultVoid:
        """终止会话"""
        return self._client.delete(f"/app/v3/api/history/sessions/{sessionId}")

    def terminate_other_sessions(self) -> PlusApiResultVoid:
        """终止其他会话"""
        return self._client.delete(f"/app/v3/api/history/sessions/others")

    def delete_generation(self, historyId: str) -> PlusApiResultVoid:
        """删除生成历史"""
        return self._client.delete(f"/app/v3/api/history/generations/{historyId}")

    def delete_browse(self, historyId: str) -> PlusApiResultVoid:
        """删除浏览记录"""
        return self._client.delete(f"/app/v3/api/history/browse/{historyId}")

    def batch_delete_browse(self) -> PlusApiResultVoid:
        """批量删除浏览记录"""
        return self._client.delete(f"/app/v3/api/history/browse/batch")
