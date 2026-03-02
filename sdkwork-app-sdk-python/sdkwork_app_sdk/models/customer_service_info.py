from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CustomerServiceInfo:
    """专属客服信息"""
    service_id: str = None
    service_name: str = None
    service_phone: str = None
    service_wechat: str = None
    online: bool = None
