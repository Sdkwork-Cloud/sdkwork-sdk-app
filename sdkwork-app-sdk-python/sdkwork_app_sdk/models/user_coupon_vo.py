from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UserCouponVO:
    """用户优惠券响应"""
    created_at: str = None
    updated_at: str = None
    user_coupon_id: str = None
    coupon_id: str = None
    coupon_name: str = None
    coupon_code: str = None
    type: str = None
    type_name: str = None
    amount: int = None
    discount: float = None
    min_consume: int = None
    acquire_at: str = None
    use_at: str = None
    expire_at: str = None
    status: str = None
    status_name: str = None
    order_id: str = None
    can_shared: bool = None
    available: bool = None
    remaining_days: int = None
