from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareCreateForm:
    """创建分享请求"""
    share_type: str = None
    content_id: str = None
    title: str = None
    description: str = None
    image_url: str = None
    expire_seconds: int = None
    password_required: bool = None
    password: str = None
    channel: str = None
