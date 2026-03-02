from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipRenewForm:
    """VIP续费请求"""
    duration: int = None
    pack_id: int = None
    coupon_id: str = None
    payment_method: str = None
