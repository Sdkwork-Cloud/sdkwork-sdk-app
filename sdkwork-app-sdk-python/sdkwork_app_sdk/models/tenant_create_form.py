from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TenantCreateForm:
    """创建租户表单"""
    name: str
    code: str = None
    type: str
    biz_type: str = None
    biz_id: int = None
    description: str = None
    admin_user_id: int = None
    contact_person: str = None
    contact_phone: str = None
    expire_time: str = None
