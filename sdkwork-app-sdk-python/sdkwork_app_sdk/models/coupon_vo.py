from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponVO:
    """优惠券响应"""
    created_at: str = None
    updated_at: str = None
    coupon_id: str = None
    name: str = None
    type: str = None
    type_name: str = None
    description: str = None
    amount: int = None
    point_cost: int = None
    discount: float = None
    min_consume: int = None
    start_time: str = None
    end_time: str = None
    total: int = None
    get_limit: int = None
    received_count: int = None
    used_count: int = None
    status: str = None
    status_name: str = None
    stackable: bool = None
    scope_type: str = None
    scope_value: str = None
    remaining_count: int = None
    can_receive: bool = None
    points_exchange: bool = None
