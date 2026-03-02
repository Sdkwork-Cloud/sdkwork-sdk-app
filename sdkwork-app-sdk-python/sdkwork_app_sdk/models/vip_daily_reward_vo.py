from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipDailyRewardVO:
    """VIP每日奖励响应"""
    created_at: str = None
    updated_at: str = None
    reward_points: int = None
    claimed_at: str = None
    message: str = None
    consecutive_days: int = None
