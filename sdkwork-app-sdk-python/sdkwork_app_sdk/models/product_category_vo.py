from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProductCategoryVO:
    """产品分类"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    parent_id: str = None
    description: str = None
    icon: str = None
    sort: int = None
    enabled: bool = None
    children: List[ProductCategoryVO] = None
