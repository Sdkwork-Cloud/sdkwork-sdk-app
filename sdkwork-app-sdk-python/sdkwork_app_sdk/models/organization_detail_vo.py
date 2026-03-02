from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrganizationDetailVO:
    """组织详情响应"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    code: str = None
    status: str = None
    description: str = None
    parent_id: int = None
    contact_person: str = None
    contact_phone: str = None
    contact_email: str = None
    address: str = None
    website: str = None
    logo_url: str = None
    metadata: OrganizationMetadata = None
    install_app_list: InstallAppList = None
    member_count: int = None
    department_count: int = None
    position_count: int = None
