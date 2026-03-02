from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PartnerVO:
    """合作伙伴响应"""
    created_at: str = None
    updated_at: str = None
    partner_id: str = None
    name: str = None
    level: str = None
    status: str = None
    promotion_code: str = None
    contact_name: str = None
    contact_phone: str = None
    total_commission: float = None
    withdrawable_commission: float = None
