from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RefundApplyForm:
    """申请退款请求"""
    order_id: str = None
    refund_amount: str = None
    refund_reason: str = None
    reason: str = None
    refund_type: str = None
    proof_image: str = None
