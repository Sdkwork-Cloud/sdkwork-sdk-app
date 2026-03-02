from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class FollowUserVO:
    """关注用户响应"""
    created_at: str = None
    updated_at: str = None
    user_id: str = None
    username: str = None
    nickname: str = None
    avatar: str = None
    follow_time: str = None
    is_mutual: bool = None
