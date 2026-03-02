from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MemberVO:
    """成员响应"""
    created_at: str = None
    updated_at: str = None
    member_id: str = None
    user_id: str = None
    username: str = None
    nickname: str = None
    avatar: str = None
    email: str = None
    role_id: str = None
    role_name: str = None
    permissions: List[str] = None
    join_time: str = None
    last_active_time: str = None
    status: str = None
    is_creator: bool = None
    is_admin: bool = None
