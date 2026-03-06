from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveItemDetailVO:
    """Drive item detail"""
    created_at: str = None
    updated_at: str = None
    item_id: str = None
    item_uuid: str = None
    item_name: str = None
    file_type: str = None
    directory: bool = None
    asset_type: str = None
    mime_type: str = None
    extension: str = None
    size: int = None
    parent_id: str = None
    path: str = None
    object_key: str = None
    status: str = None
    favorited: bool = None
    resource: FileMediaResource = None
    cover_image: ImageMediaResource = None
    disk_id: str = None
    upload_status: str = None
    description: str = None
    author: str = None
    version_id: str = None
    reference_file_id: str = None
    workspace_id: str = None
    project_id: str = None
    etag: str = None
