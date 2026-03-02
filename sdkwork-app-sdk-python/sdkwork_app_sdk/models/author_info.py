from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AuthorInfo:
    """作者信息"""
    id: int = None
    name: str = None
    avatar: str = None
    bio: str = None
    is_following: bool = None
