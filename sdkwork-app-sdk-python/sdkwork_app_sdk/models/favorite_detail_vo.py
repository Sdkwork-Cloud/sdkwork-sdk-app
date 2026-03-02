from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteDetailVO:
    """收藏详情响应"""
    created_at: str = None
    updated_at: str = None
    favorite_id: str = None
    favorite_type: str = None
    target_id: str = None
    favorite_name: str = None
    favorite_description: str = None
    folder_id: str = None
    folder_name: str = None
    tags: str = None
    favorite_time: str = None
    update_time: str = None
    target_info: Any = None
