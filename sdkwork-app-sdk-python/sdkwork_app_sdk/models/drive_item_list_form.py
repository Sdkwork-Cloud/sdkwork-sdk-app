from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveItemListForm:
    """Drive item list query form"""
    keyword: str = None
    asset_type: str = None
    folder_id: str = None
    disk_id: str = None
    include_archived: bool = None
    include_deleted: bool = None
    favorite_only: bool = None
    sort_field: str = None
    sort_direction: str = None
    page_num: int = None
    page_size: int = None
