from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RankingVO:
    """排行榜"""
    created_at: str = None
    updated_at: str = None
    ranking_type: str = None
    period: str = None
    rankings: List[RankInfoVO] = None
    my_rank: RankInfoVO = None
    total_users: int = None
