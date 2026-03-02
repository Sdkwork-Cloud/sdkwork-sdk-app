from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentQueryForm:
    """查询支付请求"""
    payment_order_id: str = None
    merchant_order_id: str = None
    query_type: str = None
    status: str = None
    page: int = None
    size: int = None
