from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PasswordChangeForm:
    """密码修改请求"""
    old_password: str = None
    new_password: str = None
    confirm_password: str = None
    verify_code: str = None
