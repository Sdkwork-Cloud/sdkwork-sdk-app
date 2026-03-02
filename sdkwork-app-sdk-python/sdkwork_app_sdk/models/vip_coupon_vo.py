from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipCouponVO:
    """VIP优惠券响应"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    name: str = None
    discount: float = None
    min_amount: float = None
    reduce_amount: float = None
    valid_from: str = None
    valid_to: str = None
    status: str = None
    used: bool = None
