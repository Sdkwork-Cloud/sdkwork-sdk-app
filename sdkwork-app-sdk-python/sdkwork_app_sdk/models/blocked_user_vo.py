from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BlockedUserVO:
    """黑名单用户响应"""
    created_at: str = None
    updated_at: str = None
    user_id: str = None
    username: str = None
    nickname: str = None
    avatar: str = None
    block_time: str = None
    block_reason: str = None
