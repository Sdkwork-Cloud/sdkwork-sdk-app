from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FileSystemNodeVO:
    """Filesystem node object"""
    created_at: str = None
    updated_at: str = None
    node_id: str = None
    node_uuid: str = None
    name: str = None
    type: str = None
    directory: bool = None
    disk_id: str = None
    parent_id: str = None
    path: str = None
    relative_path: str = None
    object_key: str = None
    size: int = None
    mime_type: str = None
    extension: str = None
    asset_type: str = None
    status: str = None
    description: str = None
    tags: List[str] = None
    version_id: str = None
    upload_status: str = None
