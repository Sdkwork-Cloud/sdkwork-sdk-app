from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PositionCreateForm:
    """创建岗位表单"""
    name: str
    code: str = None
    description: str = None
    owner_id: int
    parent_id: int = None
    level: int
    sort_order: int = None
    category: str = None
    required_experience_years: int = None
    required_education: str = None
    max_member_count: int = None
