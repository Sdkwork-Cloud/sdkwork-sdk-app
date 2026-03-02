from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ShareVerifyForm:
    """验证分享请求"""
    share_id: str = None
    password: str = None
    verification_code: str = None
