from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrganizationCreateForm:
    """创建组织表单"""
    name: str
    code: str = None
    description: str = None
    parent_id: int = None
    contact_person: str = None
    contact_phone: str = None
    contact_email: str = None
    address: str = None
    website: str = None
    logo_url: str = None
