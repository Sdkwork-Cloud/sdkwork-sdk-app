from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordResetForm:
    """重置密码请求"""
    account: str
    code: str
    new_password: str
    confirm_password: str
