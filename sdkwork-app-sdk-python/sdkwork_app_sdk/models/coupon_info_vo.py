from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponInfoVO:
    """优惠券信息"""
    coupon_id: str = None
    coupon_name: str = None
    discount_amount: str = None
    coupon_type: str = None
