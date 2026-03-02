from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AssetDetailVO:
    """资产详情响应"""
    created_at: str = None
    updated_at: str = None
    asset_id: str = None
    asset_name: str = None
    asset_type: str = None
    file_type: str = None
    file_type_name: str = None
    mime_type: str = None
    size: int = None
    description: str = None
    tags: List[str] = None
    folder_id: str = None
    status: str = None
    status_name: str = None
    cover_image: ImageMediaResource = None
    assets: List[AssetMediaResource] = None
    primary_url: str = None
    thumbnail_url: str = None
    disk_id: str = None
    path: str = None
    version_id: str = None
    download_count: int = None
    favorited: bool = None
    author: str = None
    extension: str = None
