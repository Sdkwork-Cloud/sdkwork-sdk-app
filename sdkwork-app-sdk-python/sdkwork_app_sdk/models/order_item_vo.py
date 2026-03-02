from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderItemVO:
    """订单商品项"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    order_id: str = None
    category_id: str = None
    product_type: str = None
    product_id: str = None
    sku_id: str = None
    product_name: str = None
    product_image: str = None
    quantity: int = None
    unit_price: str = None
    total_amount: str = None
    discount_amount: str = None
    paid_amount: str = None
    refunded_amount: str = None
    sku_spec: str = None
    currency: str = None
    refund_status: str = None
    review_status: str = None
    payment_provider: str = None
    payment_product_type: str = None
    expire_time: str = None
