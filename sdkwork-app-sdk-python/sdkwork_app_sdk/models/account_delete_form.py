from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountDeleteForm:
    """删除账户请求"""
    password: str
    reason: str = None
    confirm: bool = None
    timestamp: int = None
