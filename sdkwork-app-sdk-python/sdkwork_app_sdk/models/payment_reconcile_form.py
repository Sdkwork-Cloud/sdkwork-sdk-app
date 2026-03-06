from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentReconcileForm:
    """支付补单请求"""
    order_id: str = None
    out_trade_no: str = None
    reconcile_type: str
