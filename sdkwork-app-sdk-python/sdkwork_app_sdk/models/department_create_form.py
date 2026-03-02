from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DepartmentCreateForm:
    """创建部门表单"""
    name: str
    code: str = None
    description: str = None
    owner_id: int
    parent_id: int = None
    sort_order: int = None
    manager_id: int = None
    phone: str = None
    email: str = None
