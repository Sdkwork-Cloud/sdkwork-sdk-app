from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipInfoVO:
    """VIP信息响应"""
    created_at: str = None
    updated_at: str = None
    vip_level: int = None
    vip_level_name: str = None
    vip_status: str = None
    effective_time: str = None
    expire_time: str = None
    remaining_days: int = None
    total_days: int = None
    total_spent: int = None
    vip_points: int = None
    growth_value: int = None
    upgrade_growth_value: int = None
    customer_service: CustomerServiceInfo = None
    benefits: List[VipBenefitVO] = None
    coupons: List[VipCouponVO] = None
