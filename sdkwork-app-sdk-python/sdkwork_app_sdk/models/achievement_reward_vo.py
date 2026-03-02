from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AchievementRewardVO:
    """成就奖励响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    type: str = None
    amount: int = None
    description: str = None
    icon: str = None
    status: str = None
    claimed_at: str = None
