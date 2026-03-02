from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareUpdateForm:
    """更新分享请求"""
    share_id: str = None
    title: str = None
    description: str = None
    image_url: str = None
    expire_seconds: int = None
    password_required: bool = None
    password: str = None
    status: str = None
