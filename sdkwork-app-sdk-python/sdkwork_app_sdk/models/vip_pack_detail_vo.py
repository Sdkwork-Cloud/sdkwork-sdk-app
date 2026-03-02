from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipPackDetailVO:
    """VIP套餐详情响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    description: str = None
    price: float = None
    original_price: float = None
    point_amount: int = None
    vip_duration_days: int = None
    level_id: int = None
    level_name: str = None
    group_id: int = None
    group_name: str = None
    valid_from: str = None
    valid_to: str = None
    sort_weight: int = None
    benefits: List[VipBenefitVO] = None
