from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentStatusVO:
    """支付状态响应"""
    created_at: str = None
    updated_at: str = None
    payment_order_id: str = None
    merchant_order_id: str = None
    status: str = None
    status_name: str = None
    amount: str = None
    pay_time: int = None
    payment_method: str = None
    payment_id: int = None
    payment_sn: str = None
    order_id: int = None
    payment_provider: str = None
    transaction_id: str = None
    out_trade_no: str = None
    success_time: str = None
