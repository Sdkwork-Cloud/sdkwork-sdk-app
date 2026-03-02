from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoteStatusVO:
    """投票状态响应"""
    created_at: str = None
    updated_at: str = None
    has_voted: bool = None
    user_rating: str = None
