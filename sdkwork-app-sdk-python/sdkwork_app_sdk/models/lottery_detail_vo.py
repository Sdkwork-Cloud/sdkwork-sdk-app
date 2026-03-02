from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LotteryDetailVO:
    """抽奖详情"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    description: str = None
    rules: str = None
    start_time: str = None
    end_time: str = None
    free_draw_count: int = None
    remaining_free_count: int = None
    points_cost: int = None
    my_points: int = None
    prizes: List[LotteryPrize] = None
    recent_winners: List[RecentWinner] = None
