from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentProductTypeVO:
    """支付产品类型"""
    created_at: str = None
    updated_at: str = None
    code: str = None
    name: str = None
    available: bool = None
