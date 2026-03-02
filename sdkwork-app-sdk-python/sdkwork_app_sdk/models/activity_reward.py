from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ActivityReward:
    """活动奖励"""
    type: str = None
    name: str = None
    quantity: int = None
    icon: str = None
