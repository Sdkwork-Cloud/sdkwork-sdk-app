from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentVO:
    """支付响应"""
    created_at: str = None
    updated_at: str = None
    payment_order_id: str = None
    merchant_order_id: str = None
    status: str = None
    amount: str = None
    payment_method: str = None
    payment_url: str = None
    qr_code: str = None
    payment_id: int = None
    payment_sn: str = None
    order_id: int = None
    subject: str = None
    payment_provider: str = None
    payment_provider_name: str = None
    product_type: str = None
    product_type_name: str = None
    status_name: str = None
    expire_time: str = None
    need_query: bool = None
    query_interval: int = None
    remark: str = None
    payment_params: Dict[str, Any] = None
    transaction_id: str = None
    out_trade_no: str = None
    success_time: str = None
