from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PartnerUpdateForm:
    """更新合作伙伴表单"""
    name: str = None
    contact_name: str = None
    contact_phone: str = None
    contact_email: str = None
