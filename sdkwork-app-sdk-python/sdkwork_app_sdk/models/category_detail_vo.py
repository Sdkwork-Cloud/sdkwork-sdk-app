from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CategoryDetailVO:
    """分类详情响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    code: str = None
    icon: str = None
    description: str = None
    parent_id: int = None
    parent_name: str = None
    sort: int = None
    status: int = None
    type: str = None
    group_name: str = None
    visible: int = None
