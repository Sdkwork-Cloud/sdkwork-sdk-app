from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderPaymentSuccessVO:
    order_id: str = None
    out_trade_no: str = None
    paid: bool = None
    status: str = None
    status_name: str = None
