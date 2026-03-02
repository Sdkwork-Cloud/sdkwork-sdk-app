from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CheckInStatusVO:
    """签到状态"""
    created_at: str = None
    updated_at: str = None
    checked_in_today: bool = None
    consecutive_days: int = None
    monthly_check_in_count: int = None
    monthly_check_in_dates: List[str] = None
    missed_dates: List[str] = None
    today_reward: CheckInReward = None
    tomorrow_reward: CheckInReward = None
    make_up_cost: int = None
    remaining_make_up_count: int = None
