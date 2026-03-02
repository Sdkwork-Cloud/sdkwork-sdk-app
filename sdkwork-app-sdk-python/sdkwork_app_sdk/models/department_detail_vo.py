from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DepartmentDetailVO:
    """部门详情响应"""
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
    manager_id: int = None
    phone: str = None
    email: str = None
    member_count: int = None
    children_count: int = None
