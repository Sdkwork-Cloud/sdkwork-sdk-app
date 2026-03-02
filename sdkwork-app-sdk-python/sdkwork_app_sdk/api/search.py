from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AdvancedSearchRequest, PlusApiResultGlobalSearchVO, PlusApiResultListHotSearchVO, PlusApiResultListSearchHistoryVO, PlusApiResultListSearchSuggestionVO, PlusApiResultPageAssetSearchResult, PlusApiResultPageNoteSearchResult, PlusApiResultPageProjectSearchResult, PlusApiResultPageSearchResult, PlusApiResultPageUserSearchResult, PlusApiResultSearchFiltersVO, PlusApiResultSearchStatisticsVO, PlusApiResultVoid, SearchHistoryAddRequest

class SearchApi:
    """search API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_search_history(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListSearchHistoryVO:
        """搜索历史"""
        return self._client.get(f"/app/v3/api/search/history", params=params)

    def add_search_history(self, body: SearchHistoryAddRequest) -> PlusApiResultVoid:
        """添加搜索历史"""
        return self._client.post(f"/app/v3/api/search/history", json=body)

    def clear_search_history(self) -> PlusApiResultVoid:
        """清空搜索历史"""
        return self._client.delete(f"/app/v3/api/search/history")

    def advanced(self, body: AdvancedSearchRequest) -> PlusApiResultPageSearchResult:
        """高级搜索"""
        return self._client.post(f"/app/v3/api/search/advanced", json=body)

    def global(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultGlobalSearchVO:
        """全局搜索"""
        return self._client.get(f"/app/v3/api/search", params=params)

    def users(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageUserSearchResult:
        """搜索用户"""
        return self._client.get(f"/app/v3/api/search/users", params=params)

    def get_search_suggestions(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListSearchSuggestionVO:
        """搜索建议"""
        return self._client.get(f"/app/v3/api/search/suggestions", params=params)

    def get_search_statistics(self) -> PlusApiResultSearchStatisticsVO:
        """搜索统计"""
        return self._client.get(f"/app/v3/api/search/statistics")

    def projects(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageProjectSearchResult:
        """搜索项目"""
        return self._client.get(f"/app/v3/api/search/projects", params=params)

    def notes(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNoteSearchResult:
        """搜索笔记"""
        return self._client.get(f"/app/v3/api/search/notes", params=params)

    def get_hot_searches(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListHotSearchVO:
        """热门搜索"""
        return self._client.get(f"/app/v3/api/search/hot", params=params)

    def get_search_filters(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultSearchFiltersVO:
        """筛选条件"""
        return self._client.get(f"/app/v3/api/search/filters", params=params)

    def assets(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAssetSearchResult:
        """搜索资源"""
        return self._client.get(f"/app/v3/api/search/assets", params=params)

    def delete_search_history(self, keyword: str) -> PlusApiResultVoid:
        """删除搜索历史"""
        return self._client.delete(f"/app/v3/api/search/history/{keyword}")
