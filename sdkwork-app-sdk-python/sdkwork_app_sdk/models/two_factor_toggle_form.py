from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class TwoFactorToggleForm:
    """两步验证设置请求"""
    enable: bool = None
    method: str = None
    verification_code: str = None
