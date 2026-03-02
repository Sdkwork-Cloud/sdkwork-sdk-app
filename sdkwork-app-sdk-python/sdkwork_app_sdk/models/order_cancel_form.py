from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderCancelForm:
    """取消订单请求"""
    order_id: str = None
    cancel_reason: str = None
    reason: str = None
    cancel_type: str = None
