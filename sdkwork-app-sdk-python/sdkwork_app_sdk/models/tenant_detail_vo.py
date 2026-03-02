from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TenantDetailVO:
    """租户详情响应"""
    created_at: str = None
    updated_at: str = None
    name: str = None
    code: str = None
    type: str = None
    biz_type: str = None
    biz_id: int = None
    status: str = None
    description: str = None
    admin_user_id: int = None
    install_app_list: InstallAppList = None
    metadata: TenantMetadata = None
    contact_person: str = None
    contact_phone: str = None
    token_expiration_ms: int = None
    refresh_token_expiration_ms: int = None
    expire_time: str = None
