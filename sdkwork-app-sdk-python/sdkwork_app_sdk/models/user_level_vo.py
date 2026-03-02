from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserLevelVO:
    """用户等级响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    icon: str = None
    description: str = None
    level: int = None
    current_exp: int = None
    required_exp: int = None
    exp_progress: float = None
    privileges: List[PrivilegeVO] = None
    valid_until: str = None
    status: str = None
