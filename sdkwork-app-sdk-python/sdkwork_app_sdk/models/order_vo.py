from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderVO:
    """订单响应"""
    created_at: str = None
    updated_at: str = None
    order_id: str = None
    order_sn: str = None
    order_type: str = None
    subject: str = None
    product_image: str = None
    quantity: int = None
    total_amount: str = None
    paid_amount: str = None
    paid_points_amount: str = None
    discount_amount: str = None
    shipping_amount: str = None
    status: str = None
    status_name: str = None
    refund_status: str = None
    payment_method: str = None
    payment_provider: str = None
    pay_time: str = None
    expire_time: str = None
    remark: str = None
