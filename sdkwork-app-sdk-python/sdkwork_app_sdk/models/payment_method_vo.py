from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaymentMethodVO:
    """支付方式响应"""
    created_at: str = None
    updated_at: str = None
    code: str = None
    method_id: str = None
    method_name: str = None
    method_icon: str = None
    enabled: bool = None
    sort: int = None
    icon: str = None
    available: bool = None
    product_types: List[PaymentProductTypeVO] = None
