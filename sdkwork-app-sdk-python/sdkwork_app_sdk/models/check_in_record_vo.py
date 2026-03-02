from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CheckInRecordVO:
    """签到记录"""
    created_at: str = None
    updated_at: str = None
    date: str = None
    checked_in: bool = None
    is_make_up: bool = None
    points: int = None
    consecutive_days: int = None
    extra_rewards: Dict[str, Any] = None
