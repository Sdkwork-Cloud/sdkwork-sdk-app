from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentCreateForm:
    """创建支付请求"""
    order_id: str
    business_type: str = None
    business_order_id: str = None
    amount: str = None
    payment_method: str
    payment_scene: str = None
    client_ip: str = None
    payment_provider: str = None
    product_type: str = None
