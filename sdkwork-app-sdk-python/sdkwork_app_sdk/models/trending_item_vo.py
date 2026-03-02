from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TrendingItemVO:
    """热门项目响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    description: str = None
    icon: str = None
    cover: str = None
    type: str = None
    url: str = None
    hot_score: int = None
    rating: float = None
    downloads: int = None
    favorites: int = None
    comments: int = None
    author: str = None
    tags: List[str] = None
    price: str = None
    is_free: bool = None
    update_time: str = None
