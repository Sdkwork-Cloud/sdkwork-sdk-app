from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PointsExchangeForm:
    """积分兑换请求"""
    quantity: int
    address_id: str = None
    remark: str = None
