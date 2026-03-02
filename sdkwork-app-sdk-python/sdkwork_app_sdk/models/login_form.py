from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LoginForm:
    """登录表单"""
    username: str
    password: str
    captcha: str = None
