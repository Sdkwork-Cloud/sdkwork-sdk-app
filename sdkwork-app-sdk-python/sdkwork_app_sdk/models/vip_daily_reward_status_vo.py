from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipDailyRewardStatusVO:
    """VIP每日奖励状态响应"""
    created_at: str = None
    updated_at: str = None
    can_claim: bool = None
    claimed_today: bool = None
    consecutive_days: int = None
    total_days: int = None
