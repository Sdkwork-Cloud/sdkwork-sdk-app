from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TenantUpdateForm:
    """更新租户表单"""
    name: str = None
    description: str = None
    contact_person: str = None
    contact_phone: str = None
    expire_time: str = None
