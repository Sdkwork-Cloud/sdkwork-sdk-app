from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StorageTrendVO:
    """存储增长趋势"""
    last7days: int = None
    last30days: int = None
    last90days: int = None
    avg_daily_growth: int = None
