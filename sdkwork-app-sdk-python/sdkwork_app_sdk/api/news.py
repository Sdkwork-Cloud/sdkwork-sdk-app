from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import NewsCreateForm, NewsUpdateForm, PlusApiResultNewsDetailVO, PlusApiResultNewsVO, PlusApiResultPageNewsVO, PlusApiResultVoid

class NewsApi:
    """news API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_news(self, newsId: str) -> PlusApiResultNewsDetailVO:
        """获取新闻详情"""
        return self._client.get(f"/app/v3/api/news/{newsId}")

    def update_news(self, newsId: str, body: NewsUpdateForm) -> PlusApiResultNewsVO:
        """更新新闻"""
        return self._client.put(f"/app/v3/api/news/{newsId}", json=body)

    def delete_news(self, newsId: str) -> PlusApiResultVoid:
        """删除新闻"""
        return self._client.delete(f"/app/v3/api/news/{newsId}")

    def create_news(self, body: NewsCreateForm) -> PlusApiResultNewsVO:
        """创建新闻"""
        return self._client.post(f"/app/v3/api/news", json=body)

    def search(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNewsVO:
        """搜索新闻"""
        return self._client.get(f"/app/v3/api/news/search", params=params)

    def get_my(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNewsVO:
        """获取我的新闻"""
        return self._client.get(f"/app/v3/api/news/my", params=params)

    def get_latest(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNewsVO:
        """获取最新新闻"""
        return self._client.get(f"/app/v3/api/news/latest", params=params)

    def get_category(self, categoryId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNewsVO:
        """获取分类新闻"""
        return self._client.get(f"/app/v3/api/news/category/{categoryId}", params=params)
