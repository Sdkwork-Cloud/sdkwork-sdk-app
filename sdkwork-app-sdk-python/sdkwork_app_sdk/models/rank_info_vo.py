from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RankInfoVO:
    """排名信息"""
    created_at: str = None
    updated_at: str = None
    rank: int = None
    user_id: str = None
    username: str = None
    score: int = None
    avatar: str = None
    is_current_user: bool = None
