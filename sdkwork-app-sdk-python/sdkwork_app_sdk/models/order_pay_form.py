from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderPayForm:
    """订单支付请求"""
    order_id: str = None
    payment_method: str = None
    amount: str = None
    payment_password: str = None
    client_ip: str = None
