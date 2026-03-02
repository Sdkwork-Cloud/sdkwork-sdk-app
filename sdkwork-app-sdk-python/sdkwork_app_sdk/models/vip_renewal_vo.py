from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipRenewalVO:
    """VIP续费信息"""
    price: str = None
    period: str = None
    renewal_url: str = None
    auto_renew: bool = None
