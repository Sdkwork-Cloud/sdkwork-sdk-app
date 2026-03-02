from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CheckInMakeUpVO:
    """补签结果"""
    created_at: str = None
    updated_at: str = None
    success: bool = None
    date: str = None
    cost_points: int = None
    remaining_points: int = None
    consecutive_days: int = None
    message: str = None
