from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VipBenefitVO:
    """VIP权益响应"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    name: str = None
    benefit_key: str = None
    type: str = None
    description: str = None
    icon: str = None
    claimed: bool = None
    usage_limit: int = None
    used_count: int = None
