from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OAuthLoginForm:
    """OAuth登录请求"""
    provider: str
    code: str
    state: str = None
    device_id: str = None
    device_type: str = None
