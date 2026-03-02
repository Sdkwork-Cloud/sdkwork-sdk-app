from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ActivityJoinVO:
    """活动参与结果"""
    created_at: str = None
    updated_at: str = None
    record_id: str = None
    success: bool = None
    result: str = None
    rewards: Dict[str, Any] = None
    remaining_count: int = None
    message: str = None
