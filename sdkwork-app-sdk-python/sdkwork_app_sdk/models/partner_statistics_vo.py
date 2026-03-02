from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PartnerStatisticsVO:
    """合作伙伴统计响应"""
    created_at: str = None
    updated_at: str = None
    total_partners: int = None
    active_partners: int = None
    pending_partners: int = None
    total_commission: float = None
    withdrawable_commission: float = None
