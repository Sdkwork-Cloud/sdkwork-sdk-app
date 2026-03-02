from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ProjectMember:
    """项目成员"""
    user_id: str = None
    role_id: str = None
    role_name: str = None
    permissions: List[str] = None
