from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UsageFrequencyVO:
    """使用频率分布"""
    monday: int = None
    tuesday: int = None
    wednesday: int = None
    thursday: int = None
    friday: int = None
    saturday: int = None
    sunday: int = None
