from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CollectionTreeVO:
    """合集树响应"""
    created_at: str = None
    updated_at: str = None
    collection_id: str = None
    name: str = None
    type: str = None
    item_count: int = None
    parent_id: int = None
