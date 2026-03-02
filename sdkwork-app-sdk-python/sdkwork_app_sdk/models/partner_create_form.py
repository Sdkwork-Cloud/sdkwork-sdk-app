from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PartnerCreateForm:
    """创建合作伙伴表单"""
    name: str
    contact_name: str = None
    contact_phone: str = None
    contact_email: str = None
    level: str = None
    parent_id: int = None
