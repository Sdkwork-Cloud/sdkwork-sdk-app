from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderAddressVO:
    """订单地址"""
    recipient: str = None
    phone: str = None
    address: str = None
