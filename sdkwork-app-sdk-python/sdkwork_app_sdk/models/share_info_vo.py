from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareInfoVO:
    """分享信息响应"""
    created_at: str = None
    updated_at: str = None
    share_id: str = None
    share_type: str = None
    title: str = None
    description: str = None
    image_url: str = None
    share_url: str = None
    create_time: str = None
    expire_time: str = None
    status: str = None
    visit_count: int = None
