from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrganizationVO:
    """组织响应"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    code: str = None
    status: str = None
    description: str = None
    contact_person: str = None
    contact_phone: str = None
    contact_email: str = None
    logo_url: str = None
