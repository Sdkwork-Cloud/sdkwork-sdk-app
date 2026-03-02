from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CheckInReward:
    """签到奖励"""
    points: int = None
    extra_reward: str = None
