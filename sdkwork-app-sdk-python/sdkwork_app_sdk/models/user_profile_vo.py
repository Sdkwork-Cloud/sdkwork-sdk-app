from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserProfileVO:
    """用户资料响应"""
    created_at: str = None
    updated_at: str = None
    nickname: str = None
    avatar: str = None
    gender: str = None
    birthday: int = None
    region: str = None
    bio: str = None
    occupation: str = None
    interests: str = None
    phone: str = None
    email: str = None
