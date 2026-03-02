from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TenantVO:
    """租户响应"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    code: str = None
    type: str = None
    biz_type: str = None
    status: str = None
    description: str = None
    contact_person: str = None
    contact_phone: str = None
    expire_time: str = None
