from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareCreateVO:
    """创建分享响应"""
    created_at: str = None
    updated_at: str = None
    share_id: str = None
    share_url: str = None
    qr_code: str = None
    expire_time: str = None
    password: str = None
