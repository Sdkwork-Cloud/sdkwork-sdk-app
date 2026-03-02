from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LoginVO:
    """登录响应"""
    created_at: str = None
    updated_at: str = None
    access_token: str
    refresh_token: str = None
    token_type: str = None
    expires_in: int = None
    user_info: UserInfoVO = None
