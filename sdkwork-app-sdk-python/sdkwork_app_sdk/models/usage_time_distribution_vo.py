from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UsageTimeDistributionVO:
    """使用时段分布"""
    midnight: int = None
    morning: int = None
    afternoon: int = None
    evening: int = None
