from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteQueryForm:
    """查询收藏请求"""
    favorite_type: str = None
    type: str = None
    folder_id: str = None
    keyword: str = None
    sort_field: str = None
    sort_direction: str = None
    page: int = None
    size: int = None
