from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import FavoriteAddForm, FavoriteBatchCheckForm, FavoriteBatchMoveForm, FavoriteFolderCreateForm, FavoriteFolderUpdateForm, FavoriteMoveForm, PlusApiResultFavoriteCheckVO, PlusApiResultFavoriteDetailVO, PlusApiResultFavoriteFolderVO, PlusApiResultFavoriteStatisticsVO, PlusApiResultFavoriteVO, PlusApiResultListFavoriteCheckVO, PlusApiResultListFavoriteFolderVO, PlusApiResultListFavoriteItemVO, PlusApiResultListFavoriteTypeCountVO, PlusApiResultPageFavoriteItemVO, PlusApiResultVoid

class FavoriteApi:
    """favorite API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def move_favorite_to_folder(self, favoriteId: str, body: FavoriteMoveForm) -> PlusApiResultFavoriteVO:
        """移动收藏"""
        return self._client.put(f"/app/v3/api/favorite/{favoriteId}/move", json=body)

    def update_favorite_folder(self, folderId: str, body: FavoriteFolderUpdateForm) -> PlusApiResultFavoriteFolderVO:
        """更新收藏夹"""
        return self._client.put(f"/app/v3/api/favorite/folders/{folderId}", json=body)

    def delete_favorite_folder(self, folderId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """删除收藏夹"""
        return self._client.delete(f"/app/v3/api/favorite/folders/{folderId}", params=params)

    def batch_move_favorites(self, body: FavoriteBatchMoveForm) -> PlusApiResultVoid:
        """批量移动收藏"""
        return self._client.put(f"/app/v3/api/favorite/batch/move", json=body)

    def list_favorites(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageFavoriteItemVO:
        """收藏列表"""
        return self._client.get(f"/app/v3/api/favorite", params=params)

    def add(self, body: FavoriteAddForm) -> PlusApiResultFavoriteVO:
        """添加收藏"""
        return self._client.post(f"/app/v3/api/favorite", json=body)

    def list_favorite_folders(self) -> PlusApiResultListFavoriteFolderVO:
        """收藏夹列表"""
        return self._client.get(f"/app/v3/api/favorite/folders")

    def create_favorite_folder(self, body: FavoriteFolderCreateForm) -> PlusApiResultFavoriteFolderVO:
        """创建收藏夹"""
        return self._client.post(f"/app/v3/api/favorite/folders", json=body)

    def batch_check_favorites(self, body: FavoriteBatchCheckForm) -> PlusApiResultListFavoriteCheckVO:
        """批量检查收藏"""
        return self._client.post(f"/app/v3/api/favorite/batch-check", json=body)

    def get_favorite_detail(self, favoriteId: str) -> PlusApiResultFavoriteDetailVO:
        """收藏详情"""
        return self._client.get(f"/app/v3/api/favorite/{favoriteId}")

    def remove(self, favoriteId: str) -> PlusApiResultVoid:
        """取消收藏"""
        return self._client.delete(f"/app/v3/api/favorite/{favoriteId}")

    def get_favorite_statistics(self) -> PlusApiResultFavoriteStatisticsVO:
        """收藏统计"""
        return self._client.get(f"/app/v3/api/favorite/statistics")

    def get_recent_favorites(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFavoriteItemVO:
        """最近收藏"""
        return self._client.get(f"/app/v3/api/favorite/recent", params=params)

    def get_favorite_count_by_type(self) -> PlusApiResultListFavoriteTypeCountVO:
        """各类型收藏数"""
        return self._client.get(f"/app/v3/api/favorite/count/by-type")

    def check(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFavoriteCheckVO:
        """检查收藏状态"""
        return self._client.get(f"/app/v3/api/favorite/check", params=params)

    def remove_favorite_by_target(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """按目标取消收藏"""
        return self._client.delete(f"/app/v3/api/favorite/by-target", params=params)

    def batch_remove_favorites(self) -> PlusApiResultVoid:
        """批量取消收藏"""
        return self._client.delete(f"/app/v3/api/favorite/batch")
