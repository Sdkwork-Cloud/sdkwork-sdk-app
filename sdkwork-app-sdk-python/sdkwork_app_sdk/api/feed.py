from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultFeedItemVO, PlusApiResultListFeedItemVO

class FeedApi:
    """feed API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def unlike(self, id: str) -> PlusApiResultFeedItemVO:
        """取消点赞Feed"""
        return self._client.post(f"/app/v3/api/feeds/unlike/{id}")

    def uncollect(self, id: str) -> PlusApiResultFeedItemVO:
        """取消收藏Feed"""
        return self._client.post(f"/app/v3/api/feeds/uncollect/{id}")

    def share(self, id: str) -> PlusApiResultFeedItemVO:
        """分享Feed"""
        return self._client.post(f"/app/v3/api/feeds/share/{id}")

    def like(self, id: str) -> PlusApiResultFeedItemVO:
        """点赞Feed"""
        return self._client.post(f"/app/v3/api/feeds/like/{id}")

    def collect(self, id: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFeedItemVO:
        """收藏Feed"""
        return self._client.post(f"/app/v3/api/feeds/collect/{id}", params=params)

    def get_top_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """获取置顶Feed"""
        return self._client.get(f"/app/v3/api/feeds/top", params=params)

    def search_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """搜索Feed"""
        return self._client.get(f"/app/v3/api/feeds/search", params=params)

    def get_recommended_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """获取推荐Feed"""
        return self._client.get(f"/app/v3/api/feeds/recommend", params=params)

    def get_most_viewed_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """获取最多浏览Feed"""
        return self._client.get(f"/app/v3/api/feeds/most-viewed", params=params)

    def get_most_liked_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """获取最多点赞Feed"""
        return self._client.get(f"/app/v3/api/feeds/most-liked", params=params)

    def get_feed_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """获取Feed列表"""
        return self._client.get(f"/app/v3/api/feeds/list", params=params)

    def get_hot_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """获取热门Feed"""
        return self._client.get(f"/app/v3/api/feeds/hot", params=params)

    def get_feed_detail(self, id: str) -> PlusApiResultFeedItemVO:
        """获取Feed详情"""
        return self._client.get(f"/app/v3/api/feeds/detail/{id}")

    def check_collected(self, id: str) -> PlusApiResultBoolean:
        """检查收藏状态"""
        return self._client.get(f"/app/v3/api/feeds/check-collected/{id}")

    def get_feeds_by_category(self, categoryId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """获取分类Feed"""
        return self._client.get(f"/app/v3/api/feeds/category/{categoryId}", params=params)
