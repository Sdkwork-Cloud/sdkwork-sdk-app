from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PhoneLoginForm:
    """手机号验证码登录请求"""
    phone: str
    code: str
    device_id: str = None
    device_type: str = None
    device_name: str = None
    app_version: str = None
