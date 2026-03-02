from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentParamsVO:
    order_id: str = None
    amount: str = None
    payment_method: str = None
