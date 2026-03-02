from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CollectionItemVO:
    """合集内容项响应"""
    created_at: str = None
    updated_at: str = None
    item_id: str = None
    collection_id: str = None
    content_type: str = None
    content_id: int = None
    title: str = None
    description: str = None
    cover_image: str = None
    position: int = None
    is_pinned: bool = None
    tags: str = None
    added_at: str = None
