from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AchievementVO:
    """成就响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    description: str = None
    icon: str = None
    level: str = None
    status: str = None
    unlocked_at: str = None
    progress: int = None
    target: int = None
    type: str = None
    points: int = None
    sort: int = None
