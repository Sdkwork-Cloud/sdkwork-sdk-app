from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PrizeClaimVO:
    """奖品领取结果"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    prize_name: str = None
    prize_type: str = None
    claim_time: str = None
    reward_details: Dict[str, Any] = None
    message: str = None
