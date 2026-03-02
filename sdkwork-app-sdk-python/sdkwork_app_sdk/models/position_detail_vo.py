from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PositionDetailVO:
    """岗位详情响应"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    code: str = None
    description: str = None
    owner_id: int = None
    parent_id: int = None
    level: int = None
    is_active: bool = None
    sort_order: int = None
    tree_path: TreeNodePath = None
    full_path_name: str = None
    category: str = None
    level_name: str = None
    required_experience_years: int = None
    required_education: str = None
    max_member_count: int = None
    current_member_count: int = None
    is_full: bool = None
