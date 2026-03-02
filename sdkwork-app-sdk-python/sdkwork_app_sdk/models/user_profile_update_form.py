from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserProfileUpdateForm:
    """用户资料更新请求"""
    nickname: str = None
    avatar: str = None
    gender: str = None
    birthday: str = None
    region: str = None
    bio: str = None
    occupation: str = None
    interests: str = None
    phone: str = None
    email: str = None
    verify_code: str = None
