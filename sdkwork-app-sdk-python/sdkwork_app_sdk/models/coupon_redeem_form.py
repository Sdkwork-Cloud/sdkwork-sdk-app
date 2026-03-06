from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponRedeemForm:
    """兑换优惠券请求"""
    redeem_code: str
    channel: str = None
