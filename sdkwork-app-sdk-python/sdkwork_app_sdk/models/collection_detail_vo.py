from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CollectionDetailVO:
    """合集详情响应"""
    created_at: str = None
    updated_at: str = None
    collection_id: str = None
    name: str = None
    description: str = None
    type: str = None
    cover_image: str = None
    is_public: bool = None
    is_pinned: bool = None
    item_count: int = None
    view_count: int = None
    favorite_count: int = None
    parent_id: int = None
    items: List[CollectionItemVO] = None
