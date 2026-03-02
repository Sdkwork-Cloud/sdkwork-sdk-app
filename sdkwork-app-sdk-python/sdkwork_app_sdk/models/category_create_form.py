from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategoryCreateForm:
    """创建分类请求"""
    name: str
    type: str
    code: str
    icon: str = None
    description: str = None
    parent_id: int = None
    sort: int = None
    status: int = None
