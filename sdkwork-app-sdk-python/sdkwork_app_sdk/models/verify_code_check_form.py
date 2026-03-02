from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VerifyCodeCheckForm:
    """校验验证码请求"""
    target: str
    type: str
    verify_type: str = None
    code: str
