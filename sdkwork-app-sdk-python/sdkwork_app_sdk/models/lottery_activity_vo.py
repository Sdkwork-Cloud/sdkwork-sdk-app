from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LotteryActivityVO:
    """抽奖活动"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    cover_image: str = None
    start_time: str = None
    end_time: str = None
    free_draw_count: int = None
    points_cost: int = None
    prize_preview: List[PrizePreview] = None
    can_draw: bool = None
