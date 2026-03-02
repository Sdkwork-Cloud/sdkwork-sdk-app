from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AccountRiskCheckForm:
    """账号风险检测请求"""
    user_id: str = None
    device_id: str = None
    ip_address: str = None
    scene: str = None
    location: str = None
