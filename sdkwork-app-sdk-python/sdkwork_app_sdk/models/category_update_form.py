from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategoryUpdateForm:
    """更新分类请求"""
    name: str = None
    icon: str = None
    description: str = None
    sort: int = None
    status: int = None
