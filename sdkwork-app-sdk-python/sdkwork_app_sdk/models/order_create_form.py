from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderCreateForm:
    """创建订单请求"""
    order_type: str
    product_id: str
    quantity: int
    items: List[OrderItemForm] = None
    address_id: str = None
    payment_method: str = None
    coupon_id: str = None
    remark: str = None
    source_channel: str = None
    recharge_points: int = None
