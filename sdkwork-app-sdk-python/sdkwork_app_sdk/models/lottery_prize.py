from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LotteryPrize:
    """抽奖奖品"""
    prize_id: str = None
    name: str = None
    image: str = None
    probability: str = None
    is_grand_prize: bool = None
    remaining_count: int = None
