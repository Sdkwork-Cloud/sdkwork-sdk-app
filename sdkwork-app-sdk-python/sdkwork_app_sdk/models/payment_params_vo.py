from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentParamsVO:
    order_id: str = None
    payment_id: str = None
    out_trade_no: str = None
    amount: str = None
    payment_method: str = None
    payment_params: Dict[str, Any] = None
