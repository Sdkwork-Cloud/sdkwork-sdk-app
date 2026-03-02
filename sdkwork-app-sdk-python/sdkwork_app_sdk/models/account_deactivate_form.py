from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountDeactivateForm:
    """账户注销请求"""
    reason: str = None
    verify_code: str = None
    password: str = None
    confirm: bool = None
    remark: str = None
