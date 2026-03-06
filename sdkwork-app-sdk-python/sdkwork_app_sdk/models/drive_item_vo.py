from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveItemVO:
    """Drive item"""
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
