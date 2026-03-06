from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProductAttributeCreateRequest:
    """创建产品属性请求"""
    name: str = None
    values: List[str] = None
    searchable: bool = None
    filterable: bool = None
    sort: int = None
