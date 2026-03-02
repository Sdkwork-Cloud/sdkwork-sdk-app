from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DailyUsageVO:
    """每日使用统计"""
    generation_count: int = None
    usage_time: int = None
    storage_usage: int = None
