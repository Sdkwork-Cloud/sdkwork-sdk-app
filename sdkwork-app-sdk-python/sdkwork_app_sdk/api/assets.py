from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AssetMoveForm, AssetRenameForm, FolderCreateForm, PlusApiResultAssetDetailVO, PlusApiResultAssetStatisticsVO, PlusApiResultDownloadUrlVO, PlusApiResultFolderVO, PlusApiResultListFolderVO, PlusApiResultPageAssetVO, PlusApiResultVoid

class AssetsApi:
    """assets API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def rename_asset(self, assetId: str, body: AssetRenameForm) -> PlusApiResultVoid:
        """重命名资产"""
        return self._client.put(f"/app/v3/api/assets/{assetId}/rename", json=body)

    def move_asset(self, assetId: str, body: AssetMoveForm) -> PlusApiResultVoid:
        """移动资产"""
        return self._client.put(f"/app/v3/api/assets/{assetId}/move", json=body)

    def favorite_asset(self, assetId: str) -> PlusApiResultVoid:
        """收藏资产"""
        return self._client.post(f"/app/v3/api/assets/{assetId}/favorite")

    def unfavorite_asset(self, assetId: str) -> PlusApiResultVoid:
        """取消收藏"""
        return self._client.delete(f"/app/v3/api/assets/{assetId}/favorite")

    def list_folders(self) -> PlusApiResultListFolderVO:
        """获取文件夹列表"""
        return self._client.get(f"/app/v3/api/assets/folders")

    def create_folder(self, body: FolderCreateForm) -> PlusApiResultFolderVO:
        """创建文件夹"""
        return self._client.post(f"/app/v3/api/assets/folders", json=body)

    def list_assets(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAssetVO:
        """获取资产列表"""
        return self._client.get(f"/app/v3/api/assets", params=params)

    def get_asset_detail(self, assetId: str) -> PlusApiResultAssetDetailVO:
        """获取资产详情"""
        return self._client.get(f"/app/v3/api/assets/{assetId}")

    def delete_asset(self, assetId: str) -> PlusApiResultVoid:
        """删除资产"""
        return self._client.delete(f"/app/v3/api/assets/{assetId}")

    def get_download_url(self, assetId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultDownloadUrlVO:
        """下载资产"""
        return self._client.get(f"/app/v3/api/assets/{assetId}/download", params=params)

    def get_statistics(self) -> PlusApiResultAssetStatisticsVO:
        """获取资产统计"""
        return self._client.get(f"/app/v3/api/assets/statistics")

    def delete_folder(self, folderId: str) -> PlusApiResultVoid:
        """删除文件夹"""
        return self._client.delete(f"/app/v3/api/assets/folders/{folderId}")

    def batch_delete(self) -> PlusApiResultVoid:
        """批量删除资产"""
        return self._client.delete(f"/app/v3/api/assets/batch")
