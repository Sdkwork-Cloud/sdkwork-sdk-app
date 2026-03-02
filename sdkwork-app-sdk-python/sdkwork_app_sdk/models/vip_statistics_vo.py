from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipStatisticsVO:
    """VIP统计响应"""
    created_at: str = None
    updated_at: str = None
    status: str = None
    level: str = None
    started_at: str = None
    expired_at: str = None
    remaining_days: int = None
    total_days: int = None
    privileges: List[VipPrivilegeVO] = None
    renewal_info: VipRenewalVO = None
    upgrade_info: VipUpgradeVO = None
