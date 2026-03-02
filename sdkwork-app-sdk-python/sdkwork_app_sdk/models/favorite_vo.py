from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteVO:
    """收藏响应"""
    favorite_id: str = None
    favorite_type: str = None
    target_id: str = None
    favorite_name: str = None
    folder_id: str = None
    favorite_time: str = None
    update_time: str = None
