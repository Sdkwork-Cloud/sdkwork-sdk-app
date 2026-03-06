from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import FeedCreateForm, PlusApiResultBoolean, PlusApiResultFeedItemVO, PlusApiResultListFeedItemVO

class FeedApi:
    """feed API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create(self, body: FeedCreateForm) -> PlusApiResultFeedItemVO:
        """Create feed"""
        return self._client.post(f"/app/v3/api/feeds", json=body)

    def unlike(self, id: str) -> PlusApiResultFeedItemVO:
        """Unlike feed"""
        return self._client.post(f"/app/v3/api/feeds/unlike/{id}")

    def uncollect(self, id: str) -> PlusApiResultFeedItemVO:
        """Uncollect feed"""
        return self._client.post(f"/app/v3/api/feeds/uncollect/{id}")

    def share(self, id: str) -> PlusApiResultFeedItemVO:
        """Share feed"""
        return self._client.post(f"/app/v3/api/feeds/share/{id}")

    def like(self, id: str) -> PlusApiResultFeedItemVO:
        """Like feed"""
        return self._client.post(f"/app/v3/api/feeds/like/{id}")

    def collect(self, id: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFeedItemVO:
        """Collect feed"""
        return self._client.post(f"/app/v3/api/feeds/collect/{id}", params=params)

    def get_top_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Get top feeds"""
        return self._client.get(f"/app/v3/api/feeds/top", params=params)

    def search_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Search feeds"""
        return self._client.get(f"/app/v3/api/feeds/search", params=params)

    def get_recommended_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Get recommended feeds"""
        return self._client.get(f"/app/v3/api/feeds/recommend", params=params)

    def get_most_viewed_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Get most viewed feeds"""
        return self._client.get(f"/app/v3/api/feeds/most-viewed", params=params)

    def get_most_liked_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Get most liked feeds"""
        return self._client.get(f"/app/v3/api/feeds/most-liked", params=params)

    def get_feed_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Get feed list"""
        return self._client.get(f"/app/v3/api/feeds/list", params=params)

    def get_hot_feeds(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Get hot feeds"""
        return self._client.get(f"/app/v3/api/feeds/hot", params=params)

    def get_feed_detail(self, id: str) -> PlusApiResultFeedItemVO:
        """Get feed detail"""
        return self._client.get(f"/app/v3/api/feeds/detail/{id}")

    def check_collected(self, id: str) -> PlusApiResultBoolean:
        """Check collected status"""
        return self._client.get(f"/app/v3/api/feeds/check-collected/{id}")

    def get_feeds_by_category(self, categoryId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFeedItemVO:
        """Get feeds by category"""
        return self._client.get(f"/app/v3/api/feeds/category/{categoryId}", params=params)

    def delete(self, id: str) -> PlusApiResultBoolean:
        """Delete feed"""
        return self._client.delete(f"/app/v3/api/feeds/{id}")
