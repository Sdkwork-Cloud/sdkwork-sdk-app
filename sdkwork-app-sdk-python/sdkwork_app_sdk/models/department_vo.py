from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DepartmentVO:
    """部门响应"""
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
    full_path_name: str = None
