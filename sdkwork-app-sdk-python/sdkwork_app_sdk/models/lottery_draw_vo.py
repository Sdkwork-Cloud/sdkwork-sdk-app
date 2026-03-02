from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LotteryDrawVO:
    """抽奖结果"""
    created_at: str = None
    updated_at: str = None
    is_win: bool = None
    prize_id: str = None
    prize_name: str = None
    prize_image: str = None
    prize_type: str = None
    is_grand_prize: bool = None
    win_time: str = None
    record_id: str = None
    remaining_free_count: int = None
    points_cost: int = None
    message: str = None
