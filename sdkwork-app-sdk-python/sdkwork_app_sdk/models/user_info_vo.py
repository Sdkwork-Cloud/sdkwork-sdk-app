from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserInfoVO:
    """用户信息"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    username: str = None
    email: str = None
    phone: str = None
    nickname: str = None
    avatar: str = None
    role: str = None
    status: str = None
