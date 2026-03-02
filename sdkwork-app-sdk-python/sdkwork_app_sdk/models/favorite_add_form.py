from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteAddForm:
    """添加收藏请求"""
    favorite_type: str = None
    type: str = None
    target_id: str = None
    favorite_name: str = None
    favorite_description: str = None
    folder_id: str = None
    tags: str = None
