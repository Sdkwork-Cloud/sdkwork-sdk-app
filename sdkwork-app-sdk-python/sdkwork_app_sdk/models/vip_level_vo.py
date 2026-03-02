from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipLevelVO:
    """VIP等级响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    level_value: int = None
    required_points: int = None
    description: str = None
    icon: str = None
    badge: str = None
