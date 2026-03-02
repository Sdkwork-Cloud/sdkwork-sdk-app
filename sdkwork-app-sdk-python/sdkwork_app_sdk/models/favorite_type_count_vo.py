from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FavoriteTypeCountVO:
    """各类型收藏数量VO"""
    created_at: str = None
    updated_at: str = None
    type: str = None
    count: int = None
    type_name: str = None
