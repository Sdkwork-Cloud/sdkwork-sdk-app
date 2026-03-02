from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponStatisticsVO:
    total_coupons: int = None
    unused_count: int = None
    used_count: int = None
    expired_count: int = None
