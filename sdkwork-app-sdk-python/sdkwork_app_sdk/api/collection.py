from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CollectionCreateForm, CollectionItemAddForm, CollectionItemPositionForm, CollectionUpdateForm, PlusApiResultCollectionDetailVO, PlusApiResultCollectionItemVO, PlusApiResultCollectionVO, PlusApiResultListCollectionItemVO, PlusApiResultListCollectionTreeVO, PlusApiResultListCollectionVO, PlusApiResultPageCollectionVO, PlusApiResultVoid

class CollectionApi:
    """collection API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_collection(self, collectionId: str) -> PlusApiResultCollectionDetailVO:
        """获取合集详情"""
        return self._client.get(f"/app/v3/api/collection/{collectionId}")

    def update_collection(self, collectionId: str, body: CollectionUpdateForm) -> PlusApiResultCollectionVO:
        """更新合集"""
        return self._client.put(f"/app/v3/api/collection/{collectionId}", json=body)

    def delete_collection(self, collectionId: str) -> PlusApiResultVoid:
        """删除合集"""
        return self._client.delete(f"/app/v3/api/collection/{collectionId}")

    def update_item_positions(self, collectionId: str, body: CollectionItemPositionForm) -> PlusApiResultVoid:
        """更新内容排序"""
        return self._client.put(f"/app/v3/api/collection/{collectionId}/items/positions", json=body)

    def create_collection(self, body: CollectionCreateForm) -> PlusApiResultCollectionVO:
        """创建合集"""
        return self._client.post(f"/app/v3/api/collection", json=body)

    def get_collection_items(self, collectionId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListCollectionItemVO:
        """获取合集内容列表"""
        return self._client.get(f"/app/v3/api/collection/{collectionId}/items", params=params)

    def add_item(self, collectionId: str, body: CollectionItemAddForm) -> PlusApiResultCollectionItemVO:
        """添加内容到合集"""
        return self._client.post(f"/app/v3/api/collection/{collectionId}/items", json=body)

    def pin_item(self, collectionId: str, itemId: str) -> PlusApiResultVoid:
        """置顶内容"""
        return self._client.post(f"/app/v3/api/collection/{collectionId}/items/{itemId}/pin")

    def unpin_item(self, collectionId: str, itemId: str) -> PlusApiResultVoid:
        """取消置顶"""
        return self._client.delete(f"/app/v3/api/collection/{collectionId}/items/{itemId}/pin")

    def get_collection_path(self, collectionId: str) -> PlusApiResultListCollectionVO:
        """获取合集路径"""
        return self._client.get(f"/app/v3/api/collection/{collectionId}/path")

    def get_collection_tree(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListCollectionTreeVO:
        """获取合集树"""
        return self._client.get(f"/app/v3/api/collection/tree", params=params)

    def search_collections(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCollectionVO:
        """搜索合集"""
        return self._client.get(f"/app/v3/api/collection/search", params=params)

    def get_my_collections(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageCollectionVO:
        """获取我的合集"""
        return self._client.get(f"/app/v3/api/collection/my", params=params)

    def remove_item(self, collectionId: str, contentId: str) -> PlusApiResultVoid:
        """从合集移除内容"""
        return self._client.delete(f"/app/v3/api/collection/{collectionId}/items/{contentId}")
