from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VerifyCodeSendForm:
    """发送验证码请求"""
    target: str
    type: str
    verify_type: str = None
    device_id: str = None
