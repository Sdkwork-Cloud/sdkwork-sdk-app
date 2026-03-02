from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategoryTreeVO:
    """分类树响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    code: str = None
    icon: str = None
    parent_id: int = None
    sort: int = None
    status: int = None
    children: List[CategoryTreeVO] = None
