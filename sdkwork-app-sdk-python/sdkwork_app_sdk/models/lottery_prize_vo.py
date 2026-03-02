from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LotteryPrizeVO:
    """中奖奖品记录"""
    created_at: str = None
    updated_at: str = None
    record_id: str = None
    lottery_id: str = None
    lottery_title: str = None
    prize_id: str = None
    prize_name: str = None
    prize_image: str = None
    prize_type: str = None
    is_grand_prize: bool = None
    win_time: str = None
    claim_status: str = None
    claim_time: str = None
    expire_time: str = None
    can_claim: bool = None
