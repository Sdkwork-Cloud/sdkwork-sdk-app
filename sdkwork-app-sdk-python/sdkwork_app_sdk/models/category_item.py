from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategoryItem:
    """类别项"""
    id: str = None
    name: str = None
    description: str = None
    parent_id: str = None
    subcategories: List[CategoryItem] = None
    tags: List[str] = None
