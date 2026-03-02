from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoteStatisticsVO:
    """投票统计响应"""
    created_at: str = None
    updated_at: str = None
    total_votes: int = None
    likes: int = None
    dislikes: int = None
    neutrals: int = None
    like_ratio: str = None
