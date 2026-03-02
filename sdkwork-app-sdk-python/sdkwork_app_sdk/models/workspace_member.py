from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WorkspaceMember:
    """工作空间成员"""
    user_id: str = None
    role_id: str = None
    role_name: str = None
    permissions: List[str] = None
