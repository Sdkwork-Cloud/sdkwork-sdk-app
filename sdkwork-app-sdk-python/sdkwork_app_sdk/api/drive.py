from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DriveBatchDeleteForm, DriveContentUpdateForm, DriveCopyForm, DriveFolderCreateForm, DriveMoveForm, DriveRenameForm, PlusApiResultDriveContentVO, PlusApiResultDriveItemDetailVO, PlusApiResultDriveItemVO, PlusApiResultPageDriveItemVO, PlusApiResultVoid

class DriveApi:
    """drive API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def rename_item(self, itemId: str, body: DriveRenameForm) -> PlusApiResultDriveItemVO:
        """Rename drive item"""
        return self._client.put(f"/app/v3/api/drive/items/{itemId}/rename", json=body)

    def move_item(self, itemId: str, body: DriveMoveForm) -> PlusApiResultDriveItemVO:
        """Move drive item"""
        return self._client.put(f"/app/v3/api/drive/items/{itemId}/move", json=body)

    def get_item_content(self, itemId: str) -> PlusApiResultDriveContentVO:
        """Get drive file content"""
        return self._client.get(f"/app/v3/api/drive/items/{itemId}/content")

    def update_item_content(self, itemId: str, body: DriveContentUpdateForm) -> PlusApiResultDriveContentVO:
        """Update drive file content"""
        return self._client.put(f"/app/v3/api/drive/items/{itemId}/content", json=body)

    def copy_item(self, itemId: str, body: DriveCopyForm) -> PlusApiResultDriveItemVO:
        """Copy drive item"""
        return self._client.post(f"/app/v3/api/drive/items/{itemId}/copy", json=body)

    def batch_delete_items(self, body: DriveBatchDeleteForm) -> PlusApiResultVoid:
        """Batch delete drive items"""
        return self._client.post(f"/app/v3/api/drive/items/batch-delete", json=body)

    def create_folder(self, body: DriveFolderCreateForm) -> PlusApiResultDriveItemVO:
        """Create drive folder"""
        return self._client.post(f"/app/v3/api/drive/folders", json=body)

    def list_items(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageDriveItemVO:
        """List drive items"""
        return self._client.get(f"/app/v3/api/drive/items", params=params)

    def get_item_detail(self, itemId: str) -> PlusApiResultDriveItemDetailVO:
        """Get drive item detail"""
        return self._client.get(f"/app/v3/api/drive/items/{itemId}")

    def delete_item(self, itemId: str) -> PlusApiResultVoid:
        """Delete drive item"""
        return self._client.delete(f"/app/v3/api/drive/items/{itemId}")
