from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import FileSystemContentUpdateForm, FileSystemCopyForm, FileSystemFileCreateForm, FileSystemFolderCreateForm, FileSystemMoveForm, FileSystemRenameForm, PlusApiResultFileSystemContentVO, PlusApiResultFileSystemDiskVO, PlusApiResultFileSystemNodeVO, PlusApiResultListFileSystemDiskVO, PlusApiResultPageFileSystemNodeVO, PlusApiResultVoid

class FileSystemApi:
    """file_system API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def rename_node(self, nodeId: str, body: FileSystemRenameForm) -> PlusApiResultFileSystemNodeVO:
        """Rename node"""
        return self._client.put(f"/app/v3/api/filesystem/nodes/{nodeId}/rename", json=body)

    def move_node(self, nodeId: str, body: FileSystemMoveForm) -> PlusApiResultFileSystemNodeVO:
        """Move node"""
        return self._client.put(f"/app/v3/api/filesystem/nodes/{nodeId}/move", json=body)

    def get_file_content(self, fileId: str) -> PlusApiResultFileSystemContentVO:
        """Get file content"""
        return self._client.get(f"/app/v3/api/filesystem/files/{fileId}/content")

    def update_file_content(self, fileId: str, body: FileSystemContentUpdateForm) -> PlusApiResultFileSystemContentVO:
        """Update file content"""
        return self._client.put(f"/app/v3/api/filesystem/files/{fileId}/content", json=body)

    def copy_node(self, nodeId: str, body: FileSystemCopyForm) -> PlusApiResultFileSystemNodeVO:
        """Copy node"""
        return self._client.post(f"/app/v3/api/filesystem/nodes/{nodeId}/copy", json=body)

    def create_folder(self, body: FileSystemFolderCreateForm) -> PlusApiResultFileSystemNodeVO:
        """Create folder"""
        return self._client.post(f"/app/v3/api/filesystem/folders", json=body)

    def create_file(self, body: FileSystemFileCreateForm) -> PlusApiResultFileSystemNodeVO:
        """Create file"""
        return self._client.post(f"/app/v3/api/filesystem/files", json=body)

    def list_nodes(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageFileSystemNodeVO:
        """List nodes"""
        return self._client.get(f"/app/v3/api/filesystem/nodes", params=params)

    def get_node_detail(self, nodeId: str) -> PlusApiResultFileSystemNodeVO:
        """Get node detail"""
        return self._client.get(f"/app/v3/api/filesystem/nodes/{nodeId}")

    def delete_node(self, nodeId: str) -> PlusApiResultVoid:
        """Delete node"""
        return self._client.delete(f"/app/v3/api/filesystem/nodes/{nodeId}")

    def list_disks(self) -> PlusApiResultListFileSystemDiskVO:
        """List disks"""
        return self._client.get(f"/app/v3/api/filesystem/disks")

    def get_primary_disk(self) -> PlusApiResultFileSystemDiskVO:
        """Get primary disk"""
        return self._client.get(f"/app/v3/api/filesystem/disks/default")
