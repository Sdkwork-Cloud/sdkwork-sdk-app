from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class RegisterForm:
    """注册表单"""
    username: str
    password: str
    confirm_password: str
    email: str = None
    phone: str = None
    type: str = None
    verification_code: str = None
