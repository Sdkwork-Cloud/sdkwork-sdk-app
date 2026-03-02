from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteCheckVO:
    """收藏检查响应"""
    created_at: str = None
    updated_at: str = None
    target_id: str = None
    is_favorite: bool = None
    favorite_id: str = None
    favorite_time: str = None
