from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareStatisticsVO:
    """分享统计响应"""
    created_at: str = None
    updated_at: str = None
    total_shares: int = None
    total_visits: int = None
    today_shares: int = None
    today_visits: int = None
    success_rate: str = None
