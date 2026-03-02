from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProductAttributeVO:
    """产品属性"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    values: List[str] = None
    searchable: bool = None
    filterable: bool = None
    sort: int = None
