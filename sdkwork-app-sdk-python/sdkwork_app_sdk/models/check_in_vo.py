from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CheckInVO:
    """签到结果"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    check_in_date: str = None
    consecutive_days: int = None
    points: int = None
    extra_rewards: Dict[str, Any] = None
    checked_in_today: bool = None
    message: str = None
